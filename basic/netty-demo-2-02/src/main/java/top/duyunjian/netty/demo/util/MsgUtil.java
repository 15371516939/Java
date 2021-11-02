package top.duyunjian.netty.demo.util;

import top.duyunjian.netty.demo.domain.MsgBody;

/**
 * @description: MsgUtil
 * @author: mqxu
 * @date: 2021-11-02
 **/
public class MsgUtil {

    /**
     * 构建protobuf消息体
     */
    public static MsgBody buildMsg(String channelId, String msgInfo) {
        MsgBody.Builder msg = MsgBody.newBuilder();
        msg.setChannelId(channelId);
        msg.setMsgInfo(msgInfo);
        return msg.build();
    }

}