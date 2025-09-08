package Pratice;

public class CustomArrayList {


    public static void main(String[] args) {
        MyArrayList a=new MyArrayList();
        a.add(12);
        a.add(245);
        a.add(52);
        a.add(855);
        a.add(98);
       a.add(23);
      a.add(633);
      a.remove(0);
MyArrayList at=new MyArrayList();

at.add(4);

    }
}

class MyArrayList {


     int[]array;
     int initalLength=10;

     int count;
     MyArrayList(){
         array=new int[initalLength];
     }




     void add(int num){
         if(count<=array.length/2){
             array[count]=num;
             count++;
         }else{
             int temp[]=new int[initalLength*2];

             initalLength=temp.length;

             System.arraycopy(array,0,temp,0,array.length);

             array=temp;
         }

         for (int i:array){
             System.out.print(i+" ");
         }
     }


     void remove(int index){
         int[] temp=new int[initalLength];
         if(index<=count){
             for (int i=0;i<temp.length;i++){
                 if(i!=index){
                     temp[i]=array[i];
                 }
             }
         }
         array=temp;
         System.out.println("i am removed");
         for (int i:array){
             System.out.println(i);
         }
     }


}