package org.example;

public class Demo2Count3s {
    public static void main(String[] args) {
        int i=13839;
        int n=i;
        int count=0;
        while(n>0) {
            if((n % 10)==3) count++;
            n=n/10;
        }
        System.out.println(count);
    }
}
