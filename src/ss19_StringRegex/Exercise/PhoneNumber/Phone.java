package ss19_StringRegex.Exercise.PhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {

        private static final String ACCOUNT_REGEX = "^[0-9]{2}+[-]+[0-9]{10}+$";

        public Phone() {
        }

        public boolean validate(String regex) {
            Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
            Matcher matcher = pattern.matcher(regex);
            return matcher.matches();
        }
    }
