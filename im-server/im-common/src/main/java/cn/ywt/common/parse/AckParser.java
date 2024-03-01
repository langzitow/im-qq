package cn.ywt.common.parse;

import cn.ywt.protobuf.generate.Ack;



public class AckParser extends AbstractByEnumParser<Ack.AckMsg.MsgType, Ack.AckMsg> {

    public AckParser(int size) {
        super(size);
    }

    @Override
    protected Ack.AckMsg.MsgType getType(Ack.AckMsg msg) {
        return msg.getMsgType();
    }
}
