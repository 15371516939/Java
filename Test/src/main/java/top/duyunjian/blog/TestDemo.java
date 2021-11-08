package top.duyunjian.blog;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Slf4j
public class TestDemo {
    public static void main(String[] args) {
        Photos photos1 = new Photos("1","photos/0.jpg", LocalDateTime.now());
        Photos photos2 = new Photos("2","photos/1.jpg", LocalDateTime.now());
        Photos photos3 = new Photos("3","photos/2.jpg", LocalDateTime.now());
        Photos photos4 = new Photos("4","photos/3.jpg", LocalDateTime.now());
        Photos photos5 = new Photos("5","photos/4.jpg", LocalDateTime.now());
        Photos photos6 = new Photos("6","photos/5.jpg", LocalDateTime.now());
        Photos photos7 = new Photos("7","photos/6.jpg", LocalDateTime.now());
        Photos photos8 = new Photos("8","photos/7.jpg", LocalDateTime.now());
        Photos photos10 = new Photos("10","E:\\study\\Java2\\Test\\photos/9.jg", LocalDateTime.now());
        Photos photos9 = new Photos("9","photos/10.jpg", LocalDateTime.now());



        ArrayList<Photos> list = new ArrayList<>();
        ArrayList<Photos> list1 = new ArrayList<>();
        ArrayList<Photos> list2 = new ArrayList<>();
        list.add(photos1);
        list1.add(photos1);
        list1.add(photos2);
        list1.add(photos3);
        list1.add(photos4);
        list1.add(photos5);
        list1.add(photos6);
        list1.add(photos7);
        list1.add(photos8);
        list1.add(photos9);
        list1.add(photos10);
        list2.add(photos10);
        list1.add(photos9);



        Blog blog1 = new Blog("标题长度测试长度11111111111111", "中国", list);
        Blog blog2 = new Blog("禁词测试1", "DK",list );
        Blog blog3 = new Blog("禁词测试2", "EDG",list1 );
        Blog blog4 = new Blog("", "EDG",list1 );
        Blog blog5 = new Blog("df", "EDG",list2 );





        try {
            Checkimpl checkimpl = new Checkimpl();
            checkimpl.checkArticle(blog1);
        }catch (MyDemoException e){
            log.error(e.getMessage());
        }

        try {
            Checkimpl checkimpl = new Checkimpl();
            checkimpl.checkArticle(blog2);
        }catch (MyDemoException e){
            log.error(e.getMessage());
        }
        try {
            Checkimpl checkimpl1 = new Checkimpl();
            checkimpl1.checkArticle(blog3);
        }catch (Exception e){
            log.error(e.getMessage());
        }
        try {
            Checkimpl checkimpl1 = new Checkimpl();
            checkimpl1.checkArticle(blog4);
        }catch (Exception e){
            log.error(e.getMessage());
        }
        try {
            Checkimpl checkimpl1 = new Checkimpl();
            checkimpl1.checkArticle(blog5);
        }catch (Exception e){
            log.error(e.getMessage());
        }

    }
}