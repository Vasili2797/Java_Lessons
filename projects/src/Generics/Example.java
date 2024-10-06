package Generics;

public class Example {
    public static void main(String[] args) {
        BankAccont<String> b1 = new BankAccont<>("Hello");
        BankAccont<Integer> b2 = new BankAccont<>(4);

        // b1.display();
        // b2.display();
        Integer[] money1 = {100,200,300};
        Double[] money2 = {20.45,67.32,30.00};

        b1.depositMoney(money1);
        b2.depositMoney(money2);
    }
}

class BankAccont<T>{ //if I do BankAccount<T extends Number>{}, the the String type will no longer function
    T t1;
    BankAccont(T t1){
        this.t1=t1;
    }
    public void display(){
        System.out.println(t1);
    }
    
    public <T> void depositMoney(T[] money){
        for(T i: money){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}