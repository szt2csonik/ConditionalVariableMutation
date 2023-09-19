import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer as variable 'a':");
        int a = scanner.nextInt();
        int output1 = 0;
        if (a % 2 == 0) {
            output1 += 1;
        }

        int b = -1;
        while (b > 30 || b < 0) {
            System.out.println("Please enter an integer as variable 'b':");
            b = scanner.nextInt();
        }
        String output2;
        if (b >= 10 && b <= 20) {
            output2 = "Sweet!";
        } else if (b < 10) {
            output2 = "Less!";
        } else if (b > 20) {
            output2 = "More!";
        }

        int c = -1;
        int output3 = 0;
        while (c < 0 || c > 100) {
            System.out.println("Please enter an integer between 0 and 100 as variable credits:");
            c = scanner.nextInt();
        }
        System.out.println("Please enter a boolean (true/false) as variable isBonus:");
        boolean isBonus = scanner.nextBoolean();
        if (c >= 50 || isBonus == false) {
            output3 -= 2;
        } else if (c < 50 || isBonus == false) {
            output3 -= 1;
        } else {
            output3 = output3;
        }
        String output4;
        int d = -1;
        while (d < 0 && d > 50){
            System.out.println("Please enter an integer between 0 and 50 as variable d:");
            d = scanner.nextInt();
        }
        int time = -1;
        while (time < 0 && time > 500){
            System.out.println("Please enter an integer between 0 and 500 as variable time:");
            time = scanner.nextInt();
        }
        if (d%4==0||time<200){
           output4="Check!";
        }
        else if (d%4==0||time>200){
            output4="Time out!";
        }
        else {
            output4="Run Forest Run!";
        }

    }
}