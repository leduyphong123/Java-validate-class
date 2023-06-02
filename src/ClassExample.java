import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExample {
    private static final String CLASS_REXGER = "^[CPA]+\\d{4}+[GHIK]$";
    public ClassExample(){}
    public boolean validate(String name){
        Pattern pattern = Pattern.compile(CLASS_REXGER);
        Matcher matcher=pattern.matcher(name);
        return matcher.matches();
    }
}
