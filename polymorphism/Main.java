package polymorphism;

// this is a example for method overriding ..
// because in all the three classes there is a method named area ...
// and its statement is overridden by another statement in each class .. so based on the object it is printing different statements

public class Main {
    public static void main(String [] args){
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        shape.area();
        circle.area();
        triangle.area();
    }
}
