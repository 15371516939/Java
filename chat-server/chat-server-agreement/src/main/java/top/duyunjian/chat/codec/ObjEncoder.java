package top.duyunjian.chat.codec;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import top.duyunjian.chat.protocol.Packet;
import top.duyunjian.chat.util.SerializationUtil;

/**
 * 编码器
 *
 * @author duyunjian
 */
public class ObjEncoder extends MessageToByteEncoder<Packet> {

    @Override
    protected void encode(ChannelHandlerContext ctx, Packet in, ByteBuf out) {
        byte[] data = SerializationUtil.serialize(in);
        out.writeInt(data.length + 1);
        //添加指令
        out.writeByte(in.getCommand());
        out.writeBytes(data);
    }

}