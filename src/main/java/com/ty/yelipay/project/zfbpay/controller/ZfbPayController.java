package com.ty.yelipay.project.zfbpay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ty.yelipay.framework.web.controller.BaseController;
import com.ty.yelipay.framework.web.domain.AjaxResult;

/**
 * 首页 业务处理
 * 
 * @author panda
 */
@Controller
public class ZfbPayController extends BaseController{

	/**
     * 
     */
    @PostMapping("/add")
    @Transactional(rollbackFor = Exception.class)
    @ResponseBody
    public AjaxResult addSave(){
        return null;
    }
}
