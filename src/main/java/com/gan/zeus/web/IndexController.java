/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.gan.zeus.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author 辰星
 * @version $Id: IndexController.java, v 0.1 2020年04月06日 16:20 辰星 Exp $
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(value = "/dashboard.htm", method = RequestMethod.GET)
    public String dashboard(ModelMap modelMap) {
        return "dashboard.vm";
    }
}
