package com.couchbase.lite.internal;

import java.util.UUID;

public class Misc {
    public static String CreateUUID() {
        return UUID.randomUUID().toString().toLowerCase();
    }
}