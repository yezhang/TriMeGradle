package trime.business.wechatbridge.sendmessage;

import com.thoughtworks.xstream.XStream;
import trime.business.wechatbridge.message.MessageUtil;

/**
 * 被客服接口调用，向用户推送图文接机消息、订单消息
 * Created by better on 15/4/8.
 */
public class NewsMessage {

    protected String touser;
    protected String msgtype;

    protected News news;

    public String toJson() {
        XStream xStream = MessageUtil.createJsonXstream();
        return xStream.toXML(this);
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
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
