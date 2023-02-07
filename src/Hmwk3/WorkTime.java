package Hmwk3;

import java.util.Random;
public class WorkTime {



        public static void main(String[] args) {
            Random random = new Random();
            int n = random.nextInt(28800);
            System.out.println(n + " seconds");

            int hours = n / 3600;
            System.out.println((hours >=1) ? "Remaining " + hours + " hours" :
                    (n >= 60) ? "Remaining " + n / 60 + " minutes" : "Less than an hour remaining");
        }




}
