package top.duyunjian.netty.demo.util;

import top.duyunjian.netty.demo.domain.FileBurstInstruct;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: CacheUtil
 * @author: duyunjian
 * @date: 2021-11-02
 **/
public class CacheUtil {

    public static Map<String, FileBurstInstruct> burstDataMap = new ConcurrentHashMap<>();

}