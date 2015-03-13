package trime.business.wechatbridge.message;

import com.thoughtworks.xstream.XStream;

import java.io.Serializable;

/**
 * Created by better on 15/3/13.
 */
public class AbstractMessage implements Serializable{

    @XStreamCDATA
    protected String ToUserName;
    @XStreamCDATA
    protected String FromUserName;
    protected long CreateTime;
    protected long MsgId;
    @XStreamCDATA
    protected String MsgType = "";

    public String toXML(){
        XStream xStream = MessageUtil.createXstream();
        xStream.processAnnotations(this.getClass());
        return xStream.toXML(this);
    }

    public String getToUserName() {
        return ToUserName;
    }

    public void setToUserName(String toUserName) {
        ToUserName = toUserName;
    }

    public String getFromUserName() {
        return FromUserName;
    }

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }

    public long getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(long createTime) {
        CreateTime = createTime;
    }

    public long getMsgId() {
        return MsgId;
    }

    public void setMsgId(long msgId) {
        MsgId = msgId;
    }

    public String getMsgType() {
        return MsgType;
    }

    public void setMsgType(String msgType) {
        MsgType = msgType;
    }
}
