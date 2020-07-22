package guru.sfg.brewery.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class CustomBcryptDecoder extends BCryptPasswordEncoder {

    public static PasswordEncoder getCustomBcryptPasswordEncoder() {
        return new BCryptPasswordEncoder(15);
    }

}
