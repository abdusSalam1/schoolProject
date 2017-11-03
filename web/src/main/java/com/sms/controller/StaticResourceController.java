package com.sms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.support.ServletContextResource;
import org.springframework.web.servlet.HandlerMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by umars on 11/2/2017.
 */
@Controller
public class StaticResourceController {

    @ResponseBody
    @RequestMapping(value = {"/static/public/**", "/static/resources/**"})
    public ResponseEntity locateCustomJavaScripts(HttpServletRequest request) {
        try {
            String mvcPath = (String) request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE);
            String fullPath = mvcPath.replaceFirst("static/", "WEB-INF/");
            return new ResponseEntity<>(new ServletContextResource(request.getServletContext(), fullPath), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}