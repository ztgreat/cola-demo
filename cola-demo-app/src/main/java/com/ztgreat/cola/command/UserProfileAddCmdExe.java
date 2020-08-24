package com.ztgreat.cola.command;

import com.alibaba.cola.dto.Response;
import com.ztgreat.cola.convertor.UserProfileConvertor;
import com.ztgreat.cola.domain.user.UserProfile;
import com.ztgreat.cola.dto.UserProfileAddCmd;
import com.ztgreat.cola.domain.gateway.UserProfileGateway;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * UserProfileAddCmdExe
 *
 * @author Frank Zhang
 * @date 2019-02-28 6:25 PM
 */
@Component
public class UserProfileAddCmdExe{

    @Resource
    private UserProfileGateway userProfileGateway;

    public Response execute(UserProfileAddCmd cmd) {
        UserProfile userProfile = UserProfileConvertor.toEntity(cmd.getUserProfileCO());
        userProfileGateway.create(userProfile);
        return Response.buildSuccess();
    }
}
