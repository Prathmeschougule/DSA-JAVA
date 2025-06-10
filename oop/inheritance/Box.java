package oop.inheritance;

public class Box {

    String  name;

    double h;
    double w;
    double l;


    Box(){
        this.h= -1;
        this.l = -1;
        this.w = -1;
    }

    Box(double side){

        this.h = side;
        this.w = side ;
         this.l = side;
    }

    Box(double w , double h , double l ){
        this.h = h;
        this.l=l;
        this.w=w;
    }

    Box(Box old ){
        this.h= old.h;
        this.w = old.w;
        this.l = old.l;

    }

    Box(String boxName ){
        this.name=boxName ;
    }
}

