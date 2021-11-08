package top.duyunjian.blog;


import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.util.Iterator;
import java.util.List;


@Slf4j
public class Checkimpl implements Check{
    private static final int MAX_LENGTH = 20;
    private static final String[] FORBIDDEN = {"暴力","赌博","诈骗","色情","毒品","爸爸","妈妈","死","你妈","傻逼","爷爷","奶奶","毒","泻药","DK"};



    @Override
    public boolean checkArticle(Blog blog) throws MyDemoException {

        if(blog.getTitle().isEmpty()){
            throw new MyDemoException("标题不能为空");
        }
        if (blog.getTitle().length() > MAX_LENGTH){
            throw new MyDemoException("标题不得超过20字符");
        }
        for(int i = 0,len = FORBIDDEN.length; i < len;i++){
            if (blog.getText().contains(FORBIDDEN[i])){
                throw new MyDemoException("违禁词");
            }
        }



        List<Photos> photos = blog.getPhotos();
        if (photos.size() >= 9){
            throw new MyDemoException("图片数量大于9");
        }

        Iterator<Photos> iterator = photos.iterator();

        while (iterator.hasNext()){
            String url = iterator.next().getUrl();
            String end = url.substring(url.lastIndexOf("."));
            if (!end.equals(".jpg")&&!end.equals(".png")){
                throw new MyDemoException("图片格式错误");
            }
        }

        photos.forEach(img -> {
            File file = new File(img.getUrl());
            int length = (int) file.length();
            if (length > 1024 * 10){
                throw new MyDemoException("图片太大了");
            }
        });



        return true;
    }
}