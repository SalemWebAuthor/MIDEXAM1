public class Balance {

    int balance = 10000;
    int deduct1 = 1500, deduct2 = 2500, deduct3 = 3500, deduct4 = 4000;
    int newbal1 , newbal2, newbal3, newbal4;


    public void getbalance() {

        System.out.println("Your Balance is: P" + balance);
        System.out.println("");
    }

}
class Plan1 extends Balance {
    public void getplan1() {
        System.out.println("You have chosen the Regular Subscription Plan");
        newbal1 = balance - deduct1;
        if (deduct1 > balance) {
            System.out.println("Insufficient Funds! Cannot subscribe to plan");
            System.exit(0);
        }else {
            System.out.println("P" + deduct1 + " is deducted from your Current Balance");
            System.out.println("Your Current Balance is now P" + newbal1);
            System.out.println("Regular Subscription is now registered to your account");
            System.out.println("Thank you for subscribing!");
        }
    }
}
class Plan2 extends Balance {
    public void getplan2() {
        System.out.println("You have chosen the Premium Subscription Plan");
        newbal2 = balance - deduct2;
        if (deduct2 > balance) {
            System.out.println("Insufficient Funds! Cannot subscribe to plan");
            System.exit(0);
        }else {
            System.out.println("P" + deduct2 + " is deducted from your Current Balance");
            System.out.println("Your Balance is now P" + newbal2);
            System.out.println("Premium Subscription is now registered to your account");
            System.out.println("Thank you for subscribing!");
        }
    }
}
class Plan3 extends Balance {
    public void getplan3() {
        System.out.println("You have chosen the Family Subscription Plan");
        newbal3 = balance - deduct3;
        if (deduct3 > balance) {
            System.out.println("Insufficient Funds! Cannot subscribe to plan");
            System.exit(0);
        }else {
            System.out.println("P" + deduct3 + " is deducted from your Current Balance");
            System.out.println("Your Balance is now P" + newbal3);
            System.out.println("Family Subscription is now registered to your account");
            System.out.println("Thank you for subscribing!");
        }
    }
}
class Plan4 extends Balance {
    public void getplan4() {
        System.out.println("You have chosen the Barkada Subscription Plan");
        newbal4 = balance - deduct4;
        if (deduct4 > balance) {
            System.out.println("Insufficient Funds! Cannot subscribe to plan");
            System.exit(0);
        }else {
            System.out.println("P" + deduct4 + " is deducted from your Current Balance");
            System.out.println("Your Balance is now P" + newbal4);
            System.out.println("Barkada Subscription is now registered to your account");
            System.out.println("Thank you for subscribing!");
        }
    }
}

class Check extends Balance {

}
class Check1 extends Balance {

    public void getCheck1() {
        System.out.println("Current Subscription: Regular Subscription");
        newbal1 = balance - deduct1;
        System.out.println("Current Balance: " + newbal1);
    }
}

class Check2 extends Balance {

    public void getCheck2() {
        System.out.println("Current Subscription: Premium Subscription");
        newbal2 = balance - deduct2;
        System.out.println("Current Balance: " + newbal2);
    }
}

class Check3 extends Balance {

    public void getCheck3() {
        System.out.println("Current Subscription: Family Subscription");
        newbal3 = balance - deduct3;
        System.out.println("Current Balance: " + newbal3);
    }
}

class Check4 extends Balance {

    public void getCheck4() {
        System.out.println("Current Subscription: Barkada Subscription");
        newbal4 = balance - deduct4;
        System.out.println("Current Balance: " + newbal4);
    }
}
class Cancel extends Balance {

    public void getCancel() {
        System.out.println("Subscription Cancelled");
    }
}