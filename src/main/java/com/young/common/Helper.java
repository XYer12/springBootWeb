package com.young.common;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.Optional;
import java.util.UUID;

public class Helper {

    public static String getTraceId(HttpServletRequest req) {
        String traceId = (String) req.getAttribute("traceId");
        if (traceId == null) {
            traceId = req.getHeader("x-trace-id");
            if (traceId != null && !traceId.isEmpty()) {
                req.setAttribute("traceId", traceId);
            }
        }
        if (traceId == null) {
            traceId = UUID.randomUUID().toString();
            req.setAttribute("traceId", traceId);
        }
        return traceId;
    }
}
