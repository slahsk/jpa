package org.slahsk.study.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slahsk.study.domain.User;
import org.slahsk.study.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService userService;


    @PostMapping("/users")
    public ResponseEntity save(@RequestBody User user){
        log.info("post users: {}", user);
        userService.save(user);

        return ResponseEntity.ok().build();
    }


}
