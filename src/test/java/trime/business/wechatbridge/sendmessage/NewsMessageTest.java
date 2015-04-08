package trime.business.wechatbridge.sendmessage;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import trime.business.wechatbridge.message.IMessage;

/**
 * NewsMessage Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>四月 8, 2015</pre>
 */
public class NewsMessageTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testToJson() {
        Article article1 = new Article();
        article1.setTitle("Happy Day");
        article1.setDescription("Is Really A Happy Day");
        article1.setUrl("URL");
        article1.setPicurl("PIC_URL");

        Article article2 = new Article();
        article2.setTitle(article1.getTitle());
        article2.setDescription(article1.getDescription());
        article2.setUrl(article1.getUrl());
        article2.setPicurl(article1.getPicurl());

        News news = new News();
        news.addArticle(article1);
        news.addArticle(article2);

        NewsMessage newsMessage = new NewsMessage();
        newsMessage.setNews(news);
        newsMessage.setTouser("OPENID");
        newsMessage.setMsgtype(IMessage.SEND_NEWS_MESSAGE);

        System.out.println(newsMessage.toJson());
    }


} 
