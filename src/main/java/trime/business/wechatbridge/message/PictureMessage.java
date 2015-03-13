package trime.business.wechatbridge.message;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by better on 15/3/13.
 */
@XStreamAlias("xml")
public class PictureMessage extends AbstractMessage {
    @XStreamCDATA
    private String PicUrl;
    @XStreamCDATA
    private String MediaId;

    public PictureMessage(){
        MsgType = IMessage.PICTURE_MESSAGE;
    }

    public String getPicUrl() {
        return PicUrl;
    }

    public void setPicUrl(String picUrl) {
        PicUrl = picUrl;
    }

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }
}
