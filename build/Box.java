package inheritance;

public class Box {
    double l;
    double h;
    double w;



    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    Box(double side){
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double a,double b,double c){
        this.w = a;
        this.l = b;
        this.h = c;
    }

}
