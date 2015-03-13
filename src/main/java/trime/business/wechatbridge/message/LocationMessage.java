package trime.business.wechatbridge.message;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by better on 15/3/13.
 */
@XStreamAlias("xml")
public class LocationMessage extends AbstractMessage {
    private double Location_X;
    private double Location_Y;
    private double Scale;
    @XStreamCDATA
    private String Label;

    public LocationMessage(){
        MsgType = IMessage.LOCATION_MESSAGE;
    }
    public double getLocation_X() {
        return Location_X;
    }

    public void setLocation_X(double location_X) {
        Location_X = location_X;
    }

    public double getLocation_Y() {
        return Location_Y;
    }

    public void setLocation_Y(double location_Y) {
        Location_Y = location_Y;
    }

    public double getScale() {
        return Scale;
    }

    public void setScale(double scale) {
        Scale = scale;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
    }
}
