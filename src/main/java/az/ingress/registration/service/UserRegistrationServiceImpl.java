package az.ingress.registration.service;

import az.ingress.registration.Repository.ConfirmationTokenRepository;
import az.ingress.registration.Repository.UserRegistrationRepository;
import az.ingress.registration.registration.ConfirmationToken;
import az.ingress.registration.registration.Registration;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserRegistrationServiceImpl implements UserRegistrationService {

    private final UserRegistrationRepository userRepository;

    private final ConfirmationTokenRepository confirmationTokenRepository;

    private final MailSender mailSender;

    public ResponseEntity<?> saveUser(Registration user) {
        if (userRepository.existsByUserEmail(user.getUserEmail())) {
            return ResponseEntity.badRequest().body("error : email is already in use");
        }
        userRepository.save(user);
        ConfirmationToken confirmationToken = new ConfirmationToken();
        confirmationTokenRepository.save(confirmationToken);
        String subject = "complete registration";
        String text = "Hello user, to confirm your account,please click here:" +
                "http://localhost:5689/v1/registration/confirm-account?token=" + confirmationToken.getConfirmationToken();

        mailSender.sendEmail(user.getUserEmail(), subject, text);
        System.out.println("Confirmation Token:" + confirmationToken.getConfirmationToken());
        return ResponseEntity.ok("Verify email by the link sent to your email address");
    }

    public ResponseEntity<?> confirmEmail(String confirmationToken) {
        ConfirmationToken token = confirmationTokenRepository.findByConfirmationToken(confirmationToken);

        if (token != null) {
            Registration user = userRepository.findByUserEmailIgnoreCase(token.getUserEntity().getUserEmail());
            user.setEnabled(true);
            userRepository.save(user);
            return ResponseEntity.ok("Email verified successfully");
        }
        return ResponseEntity.badRequest().body("Error:Could not verify email");
    }

}
