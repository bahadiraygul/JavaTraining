package interfaces.exercise;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email implements UserValidator{
    private List<String> emailList;

    public Email(List<String> emailList){
        this.emailList = emailList;
    }

    // Method to validate email addresses using regex
    @Override
    public void validateEmails() {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);

        for (String email : emailList){
            Matcher matcher = pattern.matcher(email);
            if(matcher.matches()){
                System.out.println(email + " is valid email address.");
            }else{
                System.out.println(email + " is unvalid email address.");
            }
        }
    }
}
