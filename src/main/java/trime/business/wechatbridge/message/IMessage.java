package trime.business.wechatbridge.message;

/**
 * Created by better on 15/3/13.
 */
public interface IMessage {
    public static final String TEXT_MESSAGE = "text";
    public static final String PICTURE_MESSAGE = "image";
    public static final String VOICE_MESSAGE = "voice";
    public static final String VIDEO_MESSAGE = "video";
    public static final String LOCATION_MESSAGE = "location";
    public static final String LINK_MESSAGE = "link";

    public static final String REPLY_TEXT_MESSAGE = "";
    public static final String SEND_NEWS_MESSAGE = "news";
    public static final String SEND_TEXT_MESSAGE = "text";
}
