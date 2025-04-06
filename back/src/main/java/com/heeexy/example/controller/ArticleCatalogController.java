package com.heeexy.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.config.annotation.RequiresPermissions;
import com.heeexy.example.service.ArticleCatalogService;
import com.heeexy.example.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**

 * @description: 文章相关Controller

 */
@RestController
@RequestMapping("/articleCatalog")
public class ArticleCatalogController {

    @Autowired
    private ArticleCatalogService articleCatalogService;

    /**
     * 查询文章列表
     */
    @RequiresPermissions("articleCatalog:list")
    @GetMapping("/listArticleCatalog")
    public JSONObject listArticleCatalog(HttpServletRequest request) {
        return articleCatalogService.listArticleCatalog(CommonUtil.request2Json(request));
    }

    /**
     * 新增文章
     */
    @RequiresPermissions("articleCatalog:add")
    @PostMapping("/addArticleCatalog")
    public JSONObject addArticleCatalog(@RequestBody JSONObject requestJson) {
        CommonUtil.hasAllRequired(requestJson, "name");
        return articleCatalogService.addArticleCatalog(requestJson);
    }

    /**
     * 修改文章
     */
    @RequiresPermissions("articleCatalog:update")
    @PostMapping("/updateArticleCatalog")
    public JSONObject updateArticleCatalog(@RequestBody JSONObject requestJson) {
        CommonUtil.hasAllRequired(requestJson, "id,name");
        return articleCatalogService.updateArticleCatalog(requestJson);
    }
}
