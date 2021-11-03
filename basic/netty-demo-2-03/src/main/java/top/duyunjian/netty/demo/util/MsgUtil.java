package top.duyunjian.netty.demo.util;


import top.duyunjian.netty.demo.domain.MsgInfo;
/**
 * @description: MsgUtil
 * @author: mqxu
 * @date: 2021-11-02
 */
public class MsgUtil {

    public static MsgInfo buildMsg(String channelId, String msgContent) {
        return new MsgInfo(channelId,msgContent);
    }

}