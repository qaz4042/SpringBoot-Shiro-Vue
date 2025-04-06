package com.heeexy.example.dao;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * @author: heeexy
 * @description: 文章Dao层
 * @date: 2017/10/24 16:06
 */
public interface ArticleCatalogDao {
    /**
     * 新增文章
     */
    int addArticleCatalog(JSONObject jsonObject);

    /**
     * 统计文章总数
     */
    int countArticleCatalog(JSONObject jsonObject);

    /**
     * 文章列表
     */
    List<JSONObject> listArticleCatalog(JSONObject jsonObject);

    /**
     * 更新文章
     */
    int updateArticleCatalog(JSONObject jsonObject);
}
