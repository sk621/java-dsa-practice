//WAP to print name n times using recursion
package Recursion;

import java.util.Scanner;

public class PrintName {
    static Scanner scn = new Scanner(System.in);

    static void nameRec(int sVal, String name, int val){

        if(sVal > val){
            return;
        }
        System.out.println(name);

        nameRec(sVal+1,name,val);
    }

    public static void main(String[] args){

        System.out.println("Enter a name:");

        String name = scn.nextLine();

        System.out.println("Enter a value:");

        int val = scn.nextInt();

        nameRec(1,name,val);

    }
}
