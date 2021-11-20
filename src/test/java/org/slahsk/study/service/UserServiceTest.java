package org.slahsk.study.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slahsk.study.domain.Addres;
import org.slahsk.study.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@SpringBootTest
public class UserServiceTest {

    @Autowired
    UserService userService;


    @Test
    void saveTest(){
        User user = User.builder().name("hj").build();
        Addres addres = Addres.builder().address("서울").message("조기저편").build();
        user.setAddres(addres);


        User save = userService.save(user);
        System.out.println(save);

        Assertions.assertNotNull(save.getId());
    }
}
