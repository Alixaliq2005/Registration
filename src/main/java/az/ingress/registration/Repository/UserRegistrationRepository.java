package az.ingress.registration.Repository;

import az.ingress.registration.registration.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRegistrationRepository extends JpaRepository<Registration, UUID> {

    Boolean existsByUserEmail(String userEmail);

    Registration findByUserEmailIgnoreCase(String userEmailId);
}
