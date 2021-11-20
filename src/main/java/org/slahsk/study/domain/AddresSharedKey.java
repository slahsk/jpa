package org.slahsk.study.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddresSharedKey implements Serializable {
    @Id
    @Column(name = "user_id")
    private Long id;

    private String address;
    private String message;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    @ToString.Exclude
    private UserSharedKey user;
}
