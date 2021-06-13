import java.util.Scanner;

public class PasswordStrengthIndicator {

         static class PW
        {
            public static void main (String[] args)
            {

                Scanner user = new Scanner(System.in);
                System.out.println("Enter your password: ");
                String str = user.nextLine();

                int len = str.length();
                int digit = 0;
                int lowerCase = 0;
                int upperCase = 0;
                int count = 0;

                char ch;

                if(len >= 8)
                {
                    while(count < len)
                    {
                        ch = str.charAt(count);
                        if(Character.isDigit(ch))
                        {
                            digit = digit + 1;
                        }
                        if(Character.isLowerCase(ch))
                        {
                            lowerCase = lowerCase + 1;
                        }
                        if(Character.isUpperCase(ch))
                        {
                            upperCase = upperCase + 1;
                        }
                        
                        count = count + 1;

                    }

                }

                if(digit >=1 && lowerCase >=1 && upperCase >= 1)
                    System.out.println("Acceptable PW.");
                else
                    System.out.println("Unacceptable PW.");
            }
        }

    }
