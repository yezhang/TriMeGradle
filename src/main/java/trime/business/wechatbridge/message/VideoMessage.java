package trime.business.wechatbridge.message;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by better on 15/3/13.
 */
@XStreamAlias("xml")
public class VideoMessage extends AbstractMessage{
    @XStreamCDATA
    private String MediaId;
    @XStreamCDATA
    private String ThumbMediaId;

    public VideoMessage(){
        MsgType = IMessage.VIDEO_MESSAGE;
    }

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getThumbMediaId() {
        return ThumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        ThumbMediaId = thumbMediaId;
    }
}
