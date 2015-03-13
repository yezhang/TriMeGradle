package trime.business.wechatbridge.message;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by better on 15/3/13.
 */
@XStreamAlias("xml")
public class LinkMessage extends AbstractMessage {
    @XStreamCDATA
    private String Title;
    @XStreamCDATA
    private String Description;
    @XStreamCDATA
    private String Url;

    public LinkMessage(){
        MsgType = IMessage.LINK_MESSAGE;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
