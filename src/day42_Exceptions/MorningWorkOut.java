package day42_Exceptions;

public class MorningWorkOut {
    public static void main(String[] args) {

        System.out.println("---------Push up started--------------");

        for (int i = 1; i <= 30 ; i++) {
            System.out.println("Push up 1"+i); // S.out. prt " \rPush up " +i
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("--------------Push up completed----------------------");

        System.out.println("--------------Pull up started");

        for (int i = 1; i <= 20 ; i++) {
            System.out.print("\rPush up 1"+i);
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

}
