package com.ztgreat.cola.dto;

import lombok.Data;

@Data
public class UserProfileGetQry extends CommonCommand {
    private String userId;
    private String id;

    public UserProfileGetQry(){

    }

}