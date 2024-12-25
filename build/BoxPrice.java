package inheritance;

public class BoxPrice extends BoxWeight{
    double p ;

    BoxPrice(){
        this.p = 35.99;
    }

    BoxPrice(double l,double w,double h,double wei , double p){
        super(l,w,h,wei);
        this.p =p;
    }


}
