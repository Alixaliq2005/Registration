package az.ingress.registration.Repository;

import az.ingress.registration.registration.ConfirmationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfirmationTokenRepository extends JpaRepository<ConfirmationToken,Long> {

    ConfirmationToken findByConfirmationToken(String confirmationToken);
}
