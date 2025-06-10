package oop.singleTone;

public class SingleTone  {

  private    SingleTone (){
        System.out.println("Hello Word "    );
    }

    private static SingleTone instance;

  public static SingleTone getInstance(){

      if(instance == null){
          instance = new SingleTone();
      }
      return instance;
  }
}
