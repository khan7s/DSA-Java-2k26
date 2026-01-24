
/*
Validate password conditions

    At least one uppercase

    One lowercase

    One digit

    One special character

    length must be atleast 8

ASCII values
Uppercase : 'A' – 'Z' → 65 – 90
Lowercase : 'a' – 'z' → 97 – 122
Digit     : '0' – '9' → 48 – 57
Special   : Anything NOT in above ranges

*/


public class PasswordValidations {
    public static void main(String[] args) {
        String str = "Abc_123z";
        System.out.println(validation(str));
    }

    static boolean validation(String s){
        boolean hasUpper = false;
        boolean haslower = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        if(s.length()<8){
            return false;
        }

        for(char ch:s.toCharArray()){
            if(ch>='A' && ch<='Z'){
                hasUpper = true;
            }else if(ch>='a' && ch<='z'){
                haslower = true;
            }else if(ch>='0' && ch<='9'){
                hasDigit = true;
            }else{
                hasSpecialChar = true;
            }
        }

        if(hasDigit && hasUpper && hasSpecialChar && haslower){
            return true;
        }
        
        return false;
    }
}
