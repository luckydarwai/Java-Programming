
//Question 1: Write a program to print "Good morning" and "Welcome" continuously on the screen in Java using threads.

import java.lang.Thread;

class wish1 extends Thread {

    public void run() {

        try {
            while (true) {
                Thread.sleep(200);
                System.out.println("Good Morning");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class wish2 extends Thread {

    public void run() {
        int i = 0;
        try {
            while (i < 5) {
                Thread.sleep(200);

                System.out.println("Welcome");
                i++;
            }
        }

        catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class PracticeSet13 {
    public static void main(String[] args) {

        wish1 t1 = new wish1();
        wish2 t2 = new wish2();

        // Question 3: Demonstrate gerPriority() and setPriority() methods in Java
        // threads.
        t1.setPriority(2);
        t2.setPriority(9);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        // t1.start();

        // Question 4: How do you get the state of a given thread in Java?

        // Answer 4: getState() method is used to get the state of a given thread in
        // Java.
        System.out.println(t2.getState());
        t2.start();
        System.out.println(t2.getState());

        // Question 5: How do you get the reference to the current thread in Java?

        // Answer 5: currentThread() method is used to reference the current thread in
        // Java.

        System.out.println(Thread.currentThread().getState());
    }
}

// Question 2: Add a sleep method in the welcome thread of question 1 to delay
// its execution for 200ms.
// This Question is also done in Question 1 by me.
