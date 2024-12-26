package access;

//private is used to access the value only with in the particular class where it was initialzed ..
//so we cant use it anyother files.. so in order to resolve this problem we use getter and setter methods
//public can be used anywhere
//no modifier cannot  be used only in different package with no inheritance
//for better explanation refer notes
//there will be a table in the notes..so you can play with access modifiers by using that table

public class A {
    private int num = 72;
    String name;
    int [] arr;


    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }

    A(int a,String b){
        this.num = a;
        this.name = b;
        this.arr =new int[num];
    }


}
