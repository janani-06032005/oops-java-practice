package AbstractMethod;

//this concept is same like overriding .. but in overridding the parent class will also have the same method and body of the function
//the child class will override it based on their need
//but here in abstract method the parent class is only providing the template of functions and it doesnot have any body ..
//so that the child can use that template for their own use


//you cant have static,final(not overridden) abstract(overridden) class
abstract public  class Parent {
    abstract void carrer(String name);
    abstract void partner(String name , int age);

//    you cant create abstract constructor
//    abstract Parent(){
//
//    }


//    you can have a normal method inside abstract method
    void greeting(){
        System.out.println("hello");
    }
}
