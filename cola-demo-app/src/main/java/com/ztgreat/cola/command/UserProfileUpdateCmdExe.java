package com.ztgreat.cola.command;

import com.alibaba.cola.dto.Response;
import com.ztgreat.cola.convertor.UserProfileConvertor;
import com.ztgreat.cola.domain.user.UserProfile;
import com.ztgreat.cola.dto.UserProfileUpdateCmd;
import com.ztgreat.cola.domain.gateway.UserProfileGateway;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserProfileUpdateCmdExe{

    @Resource
    private UserProfileGateway userProfileGateway;

    public Response execute(UserProfileUpdateCmd cmd) {
        UserProfile userProfile = UserProfileConvertor.toEntity(cmd.getUserProfileCO());
        userProfileGateway.update(userProfile);
        return Response.buildSuccess();
    }
}