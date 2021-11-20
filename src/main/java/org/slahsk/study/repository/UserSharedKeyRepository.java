package org.slahsk.study.repository;

import org.slahsk.study.domain.UserSharedKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSharedKeyRepository extends JpaRepository<UserSharedKey, Long> {
}
