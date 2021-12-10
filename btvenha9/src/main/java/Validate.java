import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static boolean emailValidator(String email){
        String EMAIL_REGIX = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
        Pattern pattern = Pattern.compile(EMAIL_REGIX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean phoneValidator(String phone){
        String PHONE_REGIX = "^[0][1-9]\\d{8}$|^[1-9]\\d{8}$";
        Pattern pattern = Pattern.compile(PHONE_REGIX);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }
}
