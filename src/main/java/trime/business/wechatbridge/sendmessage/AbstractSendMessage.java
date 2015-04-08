package trime.business.wechatbridge.sendmessage;

import com.thoughtworks.xstream.XStream;
import trime.business.wechatbridge.message.MessageUtil;

import java.io.Serializable;

/**
 * Created by better on 15/4/8.
 */
public class AbstractSendMessage implements Serializable {

    protected String touser;
    protected String msgtype;

    public String toJson() {
        XStream xStream = MessageUtil.createJsonXstream();
        return xStream.toXML(this);
    }

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }
}
