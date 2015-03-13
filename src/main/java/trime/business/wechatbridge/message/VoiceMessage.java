package trime.business.wechatbridge.message;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by better on 15/3/13.
 */
@XStreamAlias("xml")
public class VoiceMessage extends AbstractMessage {
    @XStreamCDATA
    private String MediaId;

    @XStreamCDATA
    private String Format;

    public VoiceMessage(){
        MsgType = IMessage.VOICE_MESSAGE;
    }
    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getFormat() {
        return Format;
    }

    public void setFormat(String format) {
        Format = format;
    }
}
