package oop.inheritance;

public class BoxWeight extends  Box {

    int quantity;
    double  weight ;

    BoxWeight(){
        this.weight=-1;
    }

    BoxWeight(double w,double h, double l, double weight){

        super(w, h, l);

//      what is the supper class ?
//      this is the call the parent class of the constructor
//      used to initilise  values present in the parent class constructor

        this.weight=weight;
    }

    BoxWeight(int numberOfbBox,String boxName){
        super(boxName);
        this.quantity=numberOfbBox;
    }

}
