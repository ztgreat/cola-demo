package com.ztgreat.cola.domain;

import com.ztgreat.cola.domain.user.UserProfile;

public class DomainFactory {

    public static UserProfile getUserProfile(){
        return new UserProfile();
    }

}
