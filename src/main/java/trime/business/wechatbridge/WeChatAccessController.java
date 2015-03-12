package trime.business.wechatbridge;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * Created by better on 15/3/11.
 */
@Controller
@RequestMapping("wechat")
public class WeChatAccessController {

    private static final String TOKEN = "yezhang";


    @RequestMapping(method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String initWeChatURL(HttpServletRequest request) {
        String echostr = request.getParameter("echostr");

        if (validateWeChatUrl(request) && echostr != null) {
            return echostr;
        } else {
            return "error";
        }
    }

    //接收微信公众号接收的消息，处理后再做相应的回复
    @RequestMapping(method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
    public void replyMessage(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        /* 消息的接收、处理、响应 */

        //仅处理微信服务端发的请求
        if (validateWeChatUrl(request)) {
            // 将请求、响应的编码均设置为UTF-8（防止中文乱码）
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");

            // 调用核心业务类接收消息、处理消息
            String respMessage = MessageService.processRequest(request);

            // 响应消息
            PrintWriter out = response.getWriter();
            out.print(respMessage);
        }
    }

    /**
     * 根据token计算signature验证是否为 WeChat 服务端发送的消息
     */
    private boolean validateWeChatUrl(HttpServletRequest request) {
        String signature = request.getParameter("signature");
        String timestamp = request.getParameter("timestamp");
        String nonce = request.getParameter("nonce");
        if (signature != null && timestamp != null && nonce != null) {
            String[] strSet = new String[]{TOKEN, timestamp, nonce};
            java.util.Arrays.sort(strSet);
            String key = "";
            for (String string : strSet) {
                key = key + string;
            }
            String pwd = sha1(key);
            return pwd.equals(signature);
        } else {
            return false;
        }
    }

    private String sha1(String key) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA1");
            md.update(key.getBytes());
            String pwd = new BigInteger(1, md.digest()).toString(16);
            return pwd;
        } catch (Exception e) {
            e.printStackTrace();
            return key;
        }
    }


}
