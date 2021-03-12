/*
 * Copyright (c) My Tiki, Inc.
 * MIT license. See LICENSE file in root directory.
 */

package com.mytiki.common_rest.reply;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Import;

import java.lang.invoke.MethodHandles;

@Import({
        ApiReplyHandler.class
})
public class ApiReplySpringConfig {

    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    static {
        logger.trace("Registered Config" + MethodHandles.lookup().lookupClass().getSimpleName());
    }
}
