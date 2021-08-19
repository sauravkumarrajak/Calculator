import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Welcome To Calculator");
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.println("What do You want to do ? '+' , '-' , '*' , '/' , '%' and " +
                    " Enter 'x' or 'X' for exit()  ");
            char operator = in.next().trim().charAt(0);
            if(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%'){
                System.out.print("Enter the First Number:  ");
                int num1 = in.nextInt();
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
                break;
            }else{
                System.out.print("Invalid Operation");
            }
            System.out.println("The answer is " + ans);
        }in.close();

    }
}
