package Interface;
//so here comes an need of interface using multiple inheritance .. in abstract class we cant extends two parent classes
//but in interface we cant implements two parent classes
//we can also inherit multiple interfaces by using extend keyword
//the variables are by default in interface as static and final .. for more ref notes
public class Car implements Engine,Brake{

//    this @ is known as annotation .. internally annotation is an interface .. ctrl+click to see more
    @Override
    public void brake() {
        System.out.println("I have petrol engine");

    }

    @Override
    public void start() {
        System.out.println("I have petrol start");

    }

    @Override
    public void stop() {
        System.out.println("I have petrol stop");

    }
}
