package oop.collectionFremwork.enumExample;

public class EnumDemo {

    enum  Color{
          red,blue,green,white,black;
    }

    public static void main(String[] args) {

        Color color ;
       color=Color.black;

        System.out.println(color);

        for(Color e : Color.values()){
            System.out.println(e);
        }
    }
}
