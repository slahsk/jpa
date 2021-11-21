package org.slahsk.study.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "TB_ADDRES")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Addres implements Serializable {
    @Id
    private Long id;

    private String address;
    private String message;

    @OneToOne
    @MapsId
    @ToString.Exclude
    @JoinColumn(name = "user_id")
    private User user;
}
