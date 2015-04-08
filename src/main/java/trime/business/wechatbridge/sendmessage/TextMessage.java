package trime.business.wechatbridge.sendmessage;

import java.io.Serializable;

/**
 * Created by better on 15/4/8.
 */
public class TextMessage extends AbstractSendMessage {
    private TextContent text;

    public TextContent getText() {
        return text;
    }

    public void setText(TextContent text) {
        this.text = text;
    }
}
