package AbstractMethod;

public class Main {
    public static void main(String [] args){
        Son son= new Son();
        son.carrer("coder");
        son.partner("devi",21);

        Daughter daughter = new Daughter();
        daughter.carrer("doctor");
        daughter.partner("kapur",23);

//        you cant create object for abstract class
//        Parent parent = new Parent();
    }


}
