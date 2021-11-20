package org.slahsk.study.service;

import lombok.RequiredArgsConstructor;
import org.slahsk.study.domain.User;
import org.slahsk.study.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
//@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    @Override
    public User save(User user) {
        User save = userRepository.save(user);
        return save;
    }
}
