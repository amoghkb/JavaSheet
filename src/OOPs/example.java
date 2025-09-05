package OOPs;

import javax.xml.namespace.QName;

public class example {

    public static void main(String[] args) {

        Amogh a=new Amogh();

        System.out.println(a.name);
        System.out.println(a.age);
    }
}



class Amogh{

    Amogh(){

        this.name="ammu";
                this.age=213;
    }
    String name;
    int age;

}