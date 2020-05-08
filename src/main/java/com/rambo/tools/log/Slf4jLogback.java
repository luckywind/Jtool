package com.rambo.tools.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright (c) 2015 XiaoMi Inc. All Rights Reserved.
 * Authors: chengxingfu <chengxingfu@xiaomi.com>
 * Date:2020-05-08
 */
public class Slf4jLogback {
    static final Logger logger = LoggerFactory.getLogger(Slf4jLogback.class);

    public static void main(String[] args) {
        logger.info("info ");
        logger.error("error ");
    }
}
