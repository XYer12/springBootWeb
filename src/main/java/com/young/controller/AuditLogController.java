package com.young.controller;

import com.young.pojo.AuditLog;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuditLogController {

    @RequestMapping("/search/auditLog")
    public AuditLog[] searchAuditLog(
            HttpServletRequest req,
            @RequestParam("") int pageNum,
            @RequestParam("") int pageIndex) {
        req.getQueryString();
        return null;
    }

}
