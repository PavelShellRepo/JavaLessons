package homework.lesson10;

import java.util.Date;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        Date today = new Date();
        System.out.println("Current date: " + today);
        System.out.println("Current date in ms: " + today.getTime());

        long msDay = 24 * 60 * 60 * 1000; // ms in one day
        System.out.println("Years from 1970: " + today.getTime() / msDay / 360); // years from 1970 in days

        Date currentTime = new Date(); // current time
        Thread.sleep(3000);            // wait 3ms
        Date newTime = new Date();     // new current time

        long msDelay = newTime.getTime() - currentTime.getTime(); // delay in ms from current to new time
        System.out.println("Time distance is: " + msDelay + " in ms.");
    }
}
