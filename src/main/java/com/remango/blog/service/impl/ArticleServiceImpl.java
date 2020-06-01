package com.remango.blog.service.impl;

import com.remango.blog.entity.Article;
import com.remango.blog.entity.PageList;
import com.remango.blog.service.ArticleService;
import org.springframework.stereotype.Service;
import java.util.Map;

/**
 * Created by li on 2019/3/14.
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Override
    public PageList<Article> queryArticleList(String key, Integer offset, Integer limit){
        PageList<Article> articlePageList = new PageList<>();
        return articlePageList;

    }
    @Override
    public PageList<Article> queryArticleListByTimeLine(String TimeLine, Integer offset, Integer limit){
        PageList<Article> articlePageList = new PageList<>();
        return articlePageList;

    }

    @Override
    public PageList<Article> queryArticleListByVisits(Integer offset, Integer limit) {
        PageList<Article> articlePageList = new PageList<>();
        return articlePageList;
    }

    @Override
    public void saveArticle(Article article){

    }
    @Override
    public Article queryArticle(Long articleId, String author){
        return null;
    }
    @Override
    public void updateArticleVisits(Map<String, Object> map) {

    }

    @Override
    public Article queryArticleInfoById(Long id) {
        return null;
    }
}
