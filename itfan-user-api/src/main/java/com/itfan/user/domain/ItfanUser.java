package com.itfan.user.domain;

import lombok.Data;

@Data
public class ItfanUser {

    private Integer userId;

    private String userName;

    private String password;

    private String roles;

}