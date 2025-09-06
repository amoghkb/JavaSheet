

class Main{

    public static void main(String[] args) {


    }
    }


    interface  amogh{


    default  void somename(){
        System.out.println("Somename");
    }
    default  void some(){

    }
    void amoghlifestyle();

    void amoghmoney();

    }

    interface  ashi{

    void ashilifesyle();

    }

    class parents implements  amogh,ashi{


        @Override
        public void amoghlifestyle() {
            System.out.println("it is your choice amogh");
        }

        @Override
        public void amoghmoney() {
            System.out.println("you have to report to father");
        }

        @Override
        public void ashilifesyle() {
            System.out.println("you have to report to husband");
        }
    }