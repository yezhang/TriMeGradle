package trime.business.wechatbridge.sendmessage;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import trime.business.wechatbridge.message.IMessage;

/**
 * TextMessage Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>四月 8, 2015</pre>
 */
public class TextMessageTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testToJson() throws Exception {
        TextMessage textMessage = new TextMessage();
        TextContent textContent = new TextContent();
        textContent.setContent("Hello World");
        textMessage.setTouser("OPENID");
        textMessage.setMsgtype(IMessage.SEND_TEXT_MESSAGE);
        textMessage.setText(textContent);

        System.out.println(textMessage.toJson());
    }
}
