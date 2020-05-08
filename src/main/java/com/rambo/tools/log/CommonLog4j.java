package com.rambo.tools.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Copyright (c) 2015 XiaoMi Inc. All Rights Reserved.
 * Authors: chengxingfu <chengxingfu@xiaomi.com>
 * Date:2020-05-08
 */
public class CommonLog4j {
    static final Log log = LogFactory.getLog(CommonLog4j.class);

    public void foo() {
        log.info("foo");
        log.error("error info ");
    }
    public static void main(String[] args) {
        CommonLog4j commonLog4j = new CommonLog4j();
        log.info("calling foo...");
        commonLog4j.foo();
    }
}
