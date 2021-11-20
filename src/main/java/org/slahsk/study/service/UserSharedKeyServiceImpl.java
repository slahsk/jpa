package org.slahsk.study.service;

import lombok.RequiredArgsConstructor;
import org.slahsk.study.domain.UserSharedKey;
import org.slahsk.study.repository.UserSharedKeyRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserSharedKeyServiceImpl implements UserSharedKeyService {
    private final UserSharedKeyRepository userSharedKeyRepository;

    @Override
    public UserSharedKey save(UserSharedKey user) {
        UserSharedKey save = userSharedKeyRepository.save(user);
        return save;
    }
}
