package polymorphism;
// here we are going to perform constructor over loading ie) compile time polymorphism
// constructor is a method so it is also called as method overloading ...
// method overloading means method with same name but different number of parameters and return type

public class Numbers {
    int sum (int a,int b){
        return a+b;
    }
    int sum (int a,int b,int c){
        return a+b+c;
    }


    public static void main(String [] args){
        Numbers num = new Numbers();
        int ans1 = num.sum(2,3);
        int ans2 = num.sum(2,3,4);

        System.out.println(ans1);
        System.out.println(ans2);

    }
}
