public class Main {
    public static void main(String[] args) {
        System.out.println("I am Learing Android Devlopment!");
        System.out.println("I am so excited!");
        String name = "Md. Sohanur Rahman Hridoy";
        System.out.println(name);
        int stId = 2102002;
        System.out.println("Student Id : "+stId);
        //This add stId + stId:
        System.out.println(stId+stId);
        /*
         * This is multiline
         * Comments...
         */

         System.out.println(name.substring(3,6));
         System.out.println(name.toUpperCase());
         
         float fNum = 3.44f;
         System.out.println(fNum);

         double dNum = 23.2;
         System.out.println(dNum);

        boolean isTrue = false;
        System.out.println(isTrue);

        //Operators ...revisited:
        int a = 44;
        int b = 33;
        System.out.println(a+=b);
        System.out.println(a*=b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a++);
        System.out.println(b--);
        System.out.println(4^2);

        //if-else Conditionals:
        int var = 64;
        if(var>45){
            System.out.println("The variable is greater than 45");
            if(var==4){
                System.out.println("This is 4");
            }
        }else{
            System.out.println("This is lesser than 45");
        }

        //Loops:
        //for:
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }//while:
        int i = 0;
        while (i<5) {
            System.out.println(i);
            i++;
        }//do-while:
        do{
            System.out.println(i);
            i++;
        }while(i<10);

        

    }
}