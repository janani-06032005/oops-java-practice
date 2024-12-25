package inheritance;

public class BoxWeight extends Box{
    double we;

    BoxWeight(){
        this.we = 1;

    }
    BoxWeight(double l,double w,double h,double we){
        super(l,h,w);
        this.we = we;

    }
}


