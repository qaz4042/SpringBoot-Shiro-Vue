package com.heeexy.example.service;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.ArticleCatalogDao;
import com.heeexy.example.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: heeexy
 * @date: 2017/10/24 16:07
 */
@Service
public class ArticleCatalogService {

    @Autowired
    private ArticleCatalogDao articleCatalogDao;

    /**
     * 新增文章
     */
    @Transactional(rollbackFor = Exception.class)
    public JSONObject addArticleCatalog(JSONObject jsonObject) {
        articleCatalogDao.addArticleCatalog(jsonObject);
        return CommonUtil.successJson();
    }

    /**
     * 文章列表
     */
    public JSONObject listArticleCatalog(JSONObject jsonObject) {
        CommonUtil.fillPageParam(jsonObject);
        int count = articleCatalogDao.countArticleCatalog(jsonObject);
        List<JSONObject> list = articleCatalogDao.listArticleCatalog(jsonObject);
        return CommonUtil.successPage(jsonObject, list, count);
    }

    /**
     * 更新文章
     */
    @Transactional(rollbackFor = Exception.class)
    public JSONObject updateArticleCatalog(JSONObject jsonObject) {
        articleCatalogDao.updateArticleCatalog(jsonObject);
        return CommonUtil.successJson();
    }
}
