package com.gb;

import com.gb.util.JwtUtils;
import io.jsonwebtoken.Claims;

public class ParseToken {
    public static void main(String[] args) {
        Claims claims = JwtUtils.parseJWT("eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIxMjM0NTYiLCJpYXQiOjE1NDY4NjMwOTEsInN1YiI6IiIsImlzcyI6IndnYiJ9.I3GH-YqDGeBdRIaqXCZ8f6hz5bjZxQpmALiT4RA_qLo");
        System.out.println(claims.getId());
    }
}
