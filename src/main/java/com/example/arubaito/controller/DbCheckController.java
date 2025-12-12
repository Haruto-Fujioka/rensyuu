package com.example.arubaito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DbCheckController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/db-check")
    @ResponseBody
    public String checkDb() {
        try {
            int count = jdbcTemplate.queryForObject(
                    "SELECT COUNT(*) FROM authn_data",
                    Integer.class
            );
            return "DB 接続成功！ authn_data の行数 = " + count;
        } catch (Exception e) {
            return "DB 接続失敗… エラー: " + e.getMessage();
        }
    }

    @GetMapping("/check-db")
    @ResponseBody
    public String Db() {
        return jdbcTemplate.queryForObject("SELECT current_database()", String.class);
    }

}
