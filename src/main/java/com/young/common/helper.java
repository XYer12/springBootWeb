package com.young.common;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.Optional;
import java.util.UUID;

public class helper {

    public String getTraceId(HttpServletRequest req, HttpServletResponse resp) {
        String traceId = req.getHeader("traceId");
        if (traceId == null) {
            traceId = (String) req.getAttribute("traceId");
        }
        if (traceId == null) {
            traceId = UUID.randomUUID().toString();
            req.setAttribute("traceId", traceId);
        }
        return traceId;
    }
}
