package io.github.java.other;


import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description URL和正则表达式提取站点图片
 * @author duyunjian
 * @date 2021/10/19
 *
 */

@Slf4j
public class URLRegExSample {

    private static final String SITE_URL = "https://mqxu.top";
    private static final String IMG_PATTERN = "<img.*?>";
    private static final String HTTP_PATTERN = "\"https?(.*?)(\"|>|\\s+)";

    public static void main(String[] args){
        try {
            //创建站点URL
            URL site = new URL(SITE_URL);
            //创建URL连接
            URLConnection connection = site.openConnection();
            //由连接的字节输入流——>字节字符转换流-->扫描流
            Scanner in = new Scanner(new InputStreamReader(connection.getInputStream()));
            //用正则表达式（'<img.*?>') 提取<img src="">标签
            Pattern compile = Pattern.compile(IMG_PATTERN);
            //匹配对象
            Matcher imgMatcher,httpsMatcher;
            //定义图片链接
            String imgUrl;
            int count = 0;
            while (in.hasNext()){
                //按行读取
                String line = in.nextLine();
                //匹配正则，过滤出<img src="****"/>这样的行
                imgMatcher =compile.matcher(line);
                //当前行符合正则匹配
                if(imgMatcher.find()){
                    //提取出完整的img标签
                    String imgElement = imgMatcher.group();
                    //log.info(imgElement)
                    //这个正则用来从完整的img标签中提取到http地址
                    httpsMatcher = Pattern.compile(HTTP_PATTERN).matcher(imgElement);
                    if (httpsMatcher.find()){
                        //提取出https,包含双引号
                        imgUrl = httpsMatcher.group();
                        //取子串，去除引号
                        log.info(imgUrl.substring(1,imgUrl.length()- 1));
                        count++;


                    }
                }
            }
            log.info("img count of this site:" +count);
            in.close();
        }catch (IOException e){
            log.error("IO异常");
        }
    }



}
