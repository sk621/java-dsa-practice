package BasicMaths;

import java.util.Scanner;

public class Armstrong {

    static int countDigit(int num){

        int count = 0;

        while(num!=0){

            num /= 10;

            count++;
        }
        return count;
    }

    static int calRes(int num){

        int count = countDigit(num);

        int res = 0;

        while(num != 0) {
            res += (int) Math.pow(num % 10, count);
            num /= 10;
        }
        return res;
    }

    static void checkArmstrong(int num){

        if(calRes(num) == num){
          System.out.print(num + " is an armstrong number");
        }
        else{
            System.out.print(num + " is not an armstrong number");
        }
    }

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = scn.nextInt();

        checkArmstrong(num);

    }
}
