import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Main {






    public static void main(String[] args) throws Exception {



Voter v=new Voter();

try{
    v.ageCheck(12);
}catch (Exception e){
    System.out.println(e);
}
    }
}


class  Voter{
    void ageCheck(int age) throws  Exception{
        if(age>18){
            System.out.println("valied to vote");
        }else{
            throw new Exception("the person should be !8+");
        }
    }

}