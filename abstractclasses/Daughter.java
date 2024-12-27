package AbstractMethod;

public class Daughter extends Parent {

    @Override
    void carrer(String name) {
        System.out.println("I want to become "+ name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love "+name+ " he is "+ age);

    }
}
