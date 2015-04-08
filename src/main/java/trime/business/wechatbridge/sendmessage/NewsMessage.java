package trime.business.wechatbridge.sendmessage;

import com.thoughtworks.xstream.XStream;
import trime.business.wechatbridge.message.MessageUtil;

/**
 * 被客服接口调用，向用户推送图文接机消息、订单消息
 * Created by better on 15/4/8.
 */
public class NewsMessage extends AbstractSendMessage{

    protected News news;

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

}
