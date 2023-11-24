package az.ingress.registration.service;

import az.ingress.registration.registration.Registration;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/registration")
public class RegistrationController {

    private final UserRegistrationService userRegistrationService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody Registration user){
        return userRegistrationService.saveUser(user);
    }

    @RequestMapping(value="/confirm-account",method = {RequestMethod.GET,RequestMethod.POST})
    public ResponseEntity<?> confirmUserAccount(@RequestParam("token")String confirmationToken){
        return userRegistrationService.confirmEmail(confirmationToken);
    }
}
