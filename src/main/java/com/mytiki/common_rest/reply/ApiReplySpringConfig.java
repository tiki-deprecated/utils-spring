/*
 * Copyright (c) TIKI Inc.
 * MIT license. See LICENSE file in root directory.
 */

package com.mytiki.common_rest.reply;

import org.springframework.context.annotation.Import;

@Import({
        ApiReplyHandler.class
})
public class ApiReplySpringConfig {
}
