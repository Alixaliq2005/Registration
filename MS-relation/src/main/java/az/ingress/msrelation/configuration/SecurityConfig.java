package az.ingress.msrelation.configuration;

import az.ingress.msrelation.domain.UserRole;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;

import java.util.List;

//@EnableWebSecurity
//@EnableGlobalMethodSecurity(
//        prePostEnabled = true,
//        securedEnabled = true,
//        jsr250Enabled = true
//)
//@RequiredArgsConstructor

public class SecurityConfig implements ApplicationSecurityConfig {

//    private final UserRole userRole;
//
//    @Override
//    @SneakyThrows
//    public void configure(AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry
//                                  requestMatcherRegistry) {
//        configurePublicOperation(requestMatcherRegistry);
//        configureUserOperation(requestMatcherRegistry);
////        configureStuffOperation(httpSecurity);
//      configureAdminOperation(requestMatcherRegistry);
//    }
//
//    @SneakyThrows
//    private void configurePublicOperation(AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry
//                                                  http) {
//        http.requestMatchers(HttpMethod.GET, "/api/booking/id").permitAll();
//        http.requestMatchers(HttpMethod.GET, "/api/booking").permitAll();
//        http.requestMatchers(HttpMethod.GET, "/api/user/id").permitAll();
//        http.requestMatchers(HttpMethod.GET, "/api/user").permitAll();
//    }
//
//    @SneakyThrows
//    private void configureUserOperation(AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry
//                                                http) {
//        http.requestMatchers(HttpMethod.GET, "booking/v1/api/").authenticated();
//        http.requestMatchers(HttpMethod.GET, "/api/booking/create").hasAnyAuthority(adminOrUser());
//        http.requestMatchers(HttpMethod.GET, "/payments/{paymentId}/users/{userId}").authenticated();
//
//    }
//
//    @SneakyThrows
//    private void configureAdminOperation(AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry
//                                                http) {
//        http.requestMatchers(HttpMethod.GET, "/api/user/id").hasAnyAuthority(admin());
//        http.requestMatchers(HttpMethod.PUT, "/api/user/id").hasAnyAuthority(admin());
//
//
//    }
//
//
//
//    private String admin() {
//        return UserRole.ROLE_ADMIN.name();
//    }
//
//    private String[] adminOrStuff() {
//        return List.of(UserRole.ROLE_ADMIN.name(), UserRole.ROLE_STAFF.name()).toArray(new String[0]);
//    }
//
//    private String[] adminOrUser() {
//        return List.of(UserRole.ROLE_ADMIN.name(), UserRole.ROLE_USER.name()).toArray(new String[0]);
//    }
//

}
