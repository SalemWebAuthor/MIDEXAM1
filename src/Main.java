import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        SubscriptionPlans display = new SubscriptionPlans();

        Status stat = new Status();

        Balance bal = new Balance();


        Plan1 regplan  = new Plan1();
        Plan2 premplan = new Plan2();
        Plan3 famplan  = new Plan3();
        Plan4 barplan  = new Plan4();


        Check1 chstat1 = new Check1();
        Check2 chstat2 = new Check2();
        Check3 chstat3 = new Check3();
        Check4 chstat4 = new Check4();
        Cancel canstat = new Cancel();

        display.setPlan1("[1]Regular Subscription Plan = P1,500");
        display.setPlan2("[2]Premium Subscription Plan = P2,500");
        display.setPlan3("[3]Family Subscription Plan  = P3,500");
        display.setPlan4("[4]Barkada Subscription Plan = P4,000");

        stat.setCheck("\t[5]Check status");
        stat.setCancel("\t[6]Cancel Subscription");

        int[][] Subs = new int[3][3];
        Subs[0][0] = 1;
        Subs[0][1] = 2;
        Subs[0][2] = 3;
        Subs[1][0] = 4;
        Subs[1][1] = 5;
        Subs[1][2] = 6;

        System.out.print("Enter Your Name: ");
        String name = myObj.nextLine();

        System.out.println("");
        System.out.println("Welcome" + " " + name + "!!");
        bal.getbalance();
        System.out.println("");
        System.out.println("TYPE THE NUMBER OF YOUR PREFERRED SUBSCRIPTION PLAN");
        System.out.println((display.getPlan1()));
        System.out.println((display.getPlan2()));
        System.out.println((display.getPlan3()));
        System.out.println((display.getPlan4()));
        System.out.println("");
        System.out.print("Enter subscription plan: ");
        String y = myObj.nextLine();

        if (Subs[0][0] == Integer.parseInt(y)) {
            regplan.getbalance();
            regplan.getplan1();
        } else if (Subs[0][1] == Integer.parseInt(y)) {
            premplan.getbalance();
            premplan.getplan2();
        } else if (Subs[0][2] == Integer.parseInt(y)) {
            famplan.getbalance();
            famplan.getplan3();
        } else if (Subs[1][0] == Integer.parseInt(y)) {
            barplan.getbalance();
            barplan.getplan4();
        } else {
            System.out.println("Error!!");
            return;
        }

        //Check Status
        System.out.println("");
        System.out.println("What do you want to do?");
        System.out.println(stat.getCheck());
        System.out.println(stat.getCancel());

        System.out.print("Enter input: ");
        String c = myObj.nextLine();
            if (Subs[0][0] == Integer.parseInt(y) && Subs[1][1] == Integer.parseInt(c)) {
                chstat1.getCheck1();
            } else if (Subs[0][1] == Integer.parseInt(y) && Subs[1][1] == Integer.parseInt(c)) {
                chstat2.getCheck2();
            } else if (Subs[0][2] == Integer.parseInt(y) && Subs[1][1] == Integer.parseInt(c)) {
                chstat3.getCheck3();
            } else if (Subs[1][0] == Integer.parseInt(y) && Subs[1][1] == Integer.parseInt(c)) {
                chstat4.getCheck4();
            } else if (Subs[0][0] == Integer.parseInt(y) && Subs[1][2] == Integer.parseInt(c)) {
                canstat.getCancel();
            } else if (Subs[0][1] == Integer.parseInt(y) && Subs[1][2] == Integer.parseInt(c)) {
                canstat.getCancel();
            } else if (Subs[0][2] == Integer.parseInt(y) && Subs[1][2] == Integer.parseInt(c)) {
                canstat.getCancel();
            } else if (Subs[1][0] == Integer.parseInt(y) && Subs[1][2] == Integer.parseInt(c)) {
                canstat.getCancel();
            } else if (Subs[1][0] == Integer.parseInt(y) && Subs[1][2] == Integer.parseInt(c)) {
                canstat.getCancel();
            } else {
                System.out.println("Error");
            }
    }
}