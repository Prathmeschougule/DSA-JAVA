package oop.object;
import java.util.Objects;

public class Equal {



    private  String name ;
    private  String address;

    public Equal(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equal equal = (Equal) o;
        return Objects.equals(name, equal.name) && Objects.equals(address, equal.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    public static void main(String[] args) {

        Equal obj = new Equal("Adminat" , "Kolhapur");
        Equal obj2 =obj;
        Equal obj3 = new Equal( " Adminat", "Kolhapur");
        Equal obj4 = new Equal( " Adminat", "Kolhapur");



//

        System.out.println(obj== obj2);
        System.out.println(obj==obj3);

        System.out.println(obj.equals(obj2));
        System.out.println(obj.equals(obj3));
    }
}
