package org.slahsk.study.domain;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "TB_USER")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long id;

    private String name;

    @CreatedDate
//    @Column(name = "create_date", nullable = false)
    private LocalDateTime createDate;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
    private Addres addres;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Profile> profiles;
}
