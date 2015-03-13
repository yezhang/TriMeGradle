package trime.business.wechatbridge.message;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by better on 15/3/12.
 */
@XStreamAlias("xml")
public class TextMessage extends AbstractMessage {

    public static final String TEXT = " <xml>\n" +
            " <ToUserName><![CDATA[toUser]]></ToUserName>\n" +
            " <FromUserName><![CDATA[fromUser]]></FromUserName> \n" +
            " <CreateTime>1348831860</CreateTime>\n" +
            " <MsgType><![CDATA[text]]></MsgType>\n" +
            " <Content><![CDATA[this is a test]]></Content>\n" +
            " <MsgId>1234567890123456</MsgId>\n" +
            " </xml>";

    @XStreamCDATA
    private String Content;

    public TextMessage()
    {
        MsgType = IMessage.TEXT_MESSAGE;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
