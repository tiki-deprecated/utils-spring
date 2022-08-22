/*
 * Copyright (c) TIKI Inc.
 * MIT license. See LICENSE file in root directory.
 */

package com.mytiki.spring_rest_api;

public interface ApiConstants {

    String API = "api";
    String LATEST = "latest";
    String API_LATEST_ROUTE = "/" + API + "/" + LATEST + "/";

    String HEALTH = "health";
    String HEALTH_ROUTE = "/" + HEALTH;
}
