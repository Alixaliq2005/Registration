package az.ingress.registration.service;

import az.ingress.registration.registration.Registration;
import org.springframework.http.ResponseEntity;

public interface UserRegistrationService {

    ResponseEntity<?> saveUser(Registration user);

    ResponseEntity<?> confirmEmail(String confirmationToken);
}
