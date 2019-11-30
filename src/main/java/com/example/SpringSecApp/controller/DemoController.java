package com.example.SpringSecApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@RestController
public class DemoController {

    private final String USE_THIS_PORT = "8082";

    @GetMapping(path = "/")
    public String index() {
        return "<center>" +
                "<font size=\"8\">" +
                "<p>HOME PAGE</p>\n" +
                "</font>" +
                "<font size=\"5\">" +
                "<p>Hello stranger, this is a freely accessible page.</p>\n" +
                "<p>In order to visit page for registered users, please click " +
                "<a href=\"http://127.0.0.1:" + USE_THIS_PORT + "/users\">here</a>.</p>" +
                "</font>" +
                "</center>";
    }

    @GetMapping(value = "/users")
    public String user(Principal principal
    ) {
        return "<center>" +
                "<font size=\"8\">" +
                "<p>USER PAGE</p>\n" +
                "</font>" +
                "<font size=\"5\">" +
                "<p>Welcome " + principal.getName() + ".</p>\n" +
                "<p>Click <a href=\"http://127.0.0.1:" + USE_THIS_PORT + "/logout\">here</a> to logout.</p>" +
                "</font>" +
                "</center>";
    }

    @GetMapping(value = "/logout")
    public String logout(HttpServletRequest request) throws ServletException {
        request.logout();
        return "<center>" +
                "<font size=\"8\">" +
                "<p>EXIT PAGE</p>\n" +
                "</font>" +
                "<font size=\"5\">" +
                "<p>You've been logged out.</p>\n" +
                "<p>Click <a href=\"http://127.0.0.1:" + USE_THIS_PORT + "/\">here</a> to go to main page.</p>" +
                "</font>" +
                "</center>";
    }

}
