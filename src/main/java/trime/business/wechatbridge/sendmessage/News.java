package trime.business.wechatbridge.sendmessage;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by better on 15/4/8.
 */
public class News implements Serializable {
    protected List<Article> articles = new ArrayList<Article>();

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public void addArticle(Article article){
        this.articles.add(article);
    }

    public void removeArticle(Article article){
        this.articles.remove(article);
    }
}
