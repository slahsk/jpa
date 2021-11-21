package org.slahsk.study.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slahsk.study.domain.Addres;
import org.slahsk.study.domain.Profile;
import org.slahsk.study.domain.ProfileId;
import org.slahsk.study.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Transactional
@SpringBootTest
public class UserServiceTest {

    @Autowired
    UserService userService;

    public User getData(){
        User user = User.builder().name("hj").build();
        Addres addres = Addres.builder()
                .address("서울").message("조기저편").build();

        Profile p1 =Profile.builder().message("이상").id(new ProfileId(null,"100")).build();
        Profile p2 =Profile.builder().message("비정상").id(new ProfileId(null,"200")).build();
        Profile p3 =Profile.builder().message("몰라").id(new ProfileId(null,"300")).build();


        user.setAddres(addres);

        user.setProfiles(Arrays.asList(p1,p2,p3));

        return user;
    }
    @Test
    void saveTest(){
        User user = getData();

        User save = userService.save(user);
        System.out.println(save);

        Assertions.assertNotNull(save.getId());
    }
}
