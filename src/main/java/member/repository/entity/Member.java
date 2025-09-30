package member.repository.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Getter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment in DB
    private Long memberId; // primary key

    private String id;
    private String name;
    private String phoneNumber;
}