package az.ingress.registration.registration;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.JdbcTypeCode;
import java.sql.Types;
import java.util.UUID;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "registration")
public class Registration {
    @Id
    @JdbcTypeCode(Types.VARCHAR)
    UUID id;

    String userName;

    String userEmail;

    String userPassword;

    boolean isEnabled;


}
