package trime.business.wechatbridge.sendmessage;

import java.io.Serializable;

/**
 * Created by better on 15/4/8.
 */
public class TextContent implements Serializable{
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
