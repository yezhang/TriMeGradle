package trime.business.wechatbridge.custom;

import trime.business.wechatbridge.message.IMessage;

/**
 * Created by better on 15/3/13.
 */
public class ReplyTextMessage {
     class ContentMessage{
        private String content;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }

    private String touser;
    private String msgtype;
    private ContentMessage text;

    public ReplyTextMessage(){
        this.msgtype = IMessage.REPLY_TEXT_MESSAGE;
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

    public ContentMessage getText() {
        return text;
    }

    public void setText(String text) {
        this.text = new ContentMessage();
        this.text.content = text;
    }
}
