package org.example;

public class ReverseNumber {
    public static void main(String[] args) {
        int i=23579;
        int n=i;
        int revNum=0;
        while(n>0){
           revNum=revNum*10+(n%10);
           n=n/10;
        }
        System.out.println(revNum);
    }
}
