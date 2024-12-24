package oop;

public class Final {
    public static void main(String[] args) {
        A obj;
        for (int i = 0; i < 1_000_000_000; i++) {
            obj = new A("random name");
        }
    }
}

class A {
    final int rno = 10;
    String name;
    float marks;

    A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
        super.finalize(); // Always call the superclass's finalize method
    }
}
