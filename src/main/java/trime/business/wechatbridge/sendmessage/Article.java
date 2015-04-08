package trime.business.wechatbridge.sendmessage;

import java.io.Serializable;

/**
 * Created by better on 15/4/8.
 */
public class Article implements Serializable{
    protected String title;
    protected String description;
    protected String url;
    protected String picurl;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }
}
