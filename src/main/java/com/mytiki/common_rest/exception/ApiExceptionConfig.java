/*
 * Copyright (c) TIKI Inc.
 * MIT license. See LICENSE file in root directory.
 */

package com.mytiki.common_rest.exception;

import org.springframework.context.annotation.Import;

@Import({
      ApiExceptionHandler.class
})
public class ApiExceptionConfig {
}
