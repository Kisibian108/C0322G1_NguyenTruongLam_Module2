package ss19_StringRegex.Exercise.PhoneNumber;

public class TestPhone {

    private static Phone phoneExample;
    public static final String[] validPhone = new String[] { "84-0973439239" };
    public static final String[] invalidPhone = new String[] { "a2-2222222222" };

    public static void main(String args[]) {
        phoneExample = new Phone();
        for (String phone : validPhone) {
            boolean isvalid = phoneExample.validate(phone);
            System.out.println("Account is " + phone +" is valid: "+ isvalid);
        }
        for (String phone : invalidPhone) {
            boolean isvalid = phoneExample.validate(phone);
            System.out.println("Account is " + phone +" is valid: "+ isvalid);
        }
    }
}


