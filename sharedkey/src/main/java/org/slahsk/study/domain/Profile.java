package org.slahsk.study.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Table(name = "TB_PROFILE")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Profile {

    @EmbeddedId
    private ProfileId id;

    private String message;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    @ToString.Exclude
    private User user;

}
