import java.util.*;

public class Practical_4A {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Password: ");
        String st,str= sc.nextLine();

        while(true){
            System.out.print("Enter your Password: ");
            st = sc.nextLine();
            
             if (str.equals(st)) {

                int count = 0;

                if (st.length() >= 8) {
                    System.out.println("Length Rule Passed");
                    count++;
                } else {
                    System.out.println("Length Rule Failed");
                }

                boolean upper = false;
                boolean digit = false;
                boolean special = false;

                int i = 0;
                while (i < st.length()) {
                    char ch = st.charAt(i);

                    if (ch >= 'A' && ch <= 'Z')
                        upper = true;
                    else if (ch >= '0' && ch <= '9')
                        digit = true;
                    else if (!(ch >= 'a' && ch <= 'z'))
                        special = true;

                    i++;
                }

                if (upper) {
                    System.out.println("Uppercase Rule Passed");
                    count++;
                } else {
                    System.out.println("Uppercase Rule Failed");
                }

                if (digit) {
                    System.out.println("Digit Rule Passed");
                    count++;
                } else {
                    System.out.println("Digit Rule Failed");
                }

                if (special) {
                    System.out.println("Special Character Rule Passed");
                    count++;
                } else {
                    System.out.println("Special Character Rule Failed");
                }

                if (count <= 1)
                    System.out.println("Strength : Weak");
                else if (count <= 3)
                    System.out.println("Strength : Medium");
                else
                    System.out.println("Strength : Strong");

            } else {
                System.out.println("Password is Invalid");
            }

        }
        //sc.close();
    }
}