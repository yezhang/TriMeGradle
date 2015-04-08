package trime.business.webchatbridge;

import trime.business.wechatbridge.message.IMessage;
import trime.business.wechatbridge.sendmessage.Article;
import trime.business.wechatbridge.sendmessage.News;
import trime.business.wechatbridge.sendmessage.NewsMessage;

/**
 * Created by better on 15/4/8.
 */
public class testMain1 {
    public static void main(String [] args){
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
