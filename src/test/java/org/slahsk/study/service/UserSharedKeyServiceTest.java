package org.slahsk.study.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slahsk.study.domain.AddresSharedKey;
import org.slahsk.study.domain.UserSharedKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@SpringBootTest
public class UserSharedKeyServiceTest {

    @Autowired
    UserSharedKeyService userSharedKeyService;


    @Test
    void saveTest(){
        UserSharedKey user = UserSharedKey.builder().name("hj").build();
        AddresSharedKey addresSharedKey = AddresSharedKey.builder()
                .address("서울").message("조기저편").build();
        user.setAddresSharedKey(addresSharedKey);
        addresSharedKey.setUser(user);

        UserSharedKey save = userSharedKeyService.save(user);
        System.out.println(save);

        Assertions.assertNotNull(save.getId());
    }
}
