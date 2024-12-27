package AbstractMethod;

public class Son extends Parent {


    @Override
    void carrer(String name) {
        System.out.println("I will become a "+name);



    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love " + name+ " she is "+ age);
    }
}
