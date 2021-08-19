import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Welcome To Calculator");
        Scanner in = new Scanner(System.in);
        int ans = 0;
        //using while loop for entire process
        while(true){
            System.out.println("What do You want to do ? '+' , '-' , '*' , '/' , '%' and " +
                    " Enter 'x' or 'X' for exit()  ");
            //Taking operator from the user input
            char operator = in.next().trim().charAt(0);
            if(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%'){
                //Taking num1 from the user input
                System.out.print("Enter the First Number:  ");
                int num1 = in.nextInt();
                //Taking num2 from the user input
                System.out.print("Enter the Second Number:  ");
                int num2 = in.nextInt();
                if(operator == '+'){
                    ans = num1+num2;
                }
                if(operator == '-'){
                    ans = num1-num2;
                }
                if(operator == '*'){
                    ans = num1+num2;
                }
                if(operator == '/'){
                    if(num2!=0){
                    ans = num1/num2;
                    }
                }
                if(operator == '%'){
                    ans = num1%num2;
                }
            }else if(operator == 'x' || operator == 'X'){
                //when user input the value of operator of x or X break the while loop & exit program
                break;
            }else{
                System.out.print("Invalid Operation");
            }
            System.out.println("The answer is " + ans);
        }in.close();

    }
}
