package az.ingress.registration.registration;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.UUID;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "confirmation")
public class ConfirmationToken {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "token_id")
    Long tokenId;

    @Column(name = "confirmation_token")
    String confirmationToken;

    @Temporal(TemporalType.TIMESTAMP)
    Date createdDate;

    @ManyToOne
    @JoinColumn(name="user_id")
    Registration userEntity;

    public ConfirmationToken(Registration user) {
        this.confirmationToken = generatedConfirmationToken();
        this.userEntity = user;
    }

    private String generatedConfirmationToken() {
        return UUID.randomUUID().toString();
    }


}
