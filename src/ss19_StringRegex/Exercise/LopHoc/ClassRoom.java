package ss19_StringRegex.Exercise.LopHoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassRoom {
        private static final String ACCOUNT_REGEX = "^[C|A|P]{1}+[0-9]{4}+[G|H|I|K|L|M]{1}$";

        public ClassRoom() {
        }

        public boolean validate(String regex) {
            Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
            Matcher matcher = pattern.matcher(regex);
            return matcher.matches();
        }
    }
