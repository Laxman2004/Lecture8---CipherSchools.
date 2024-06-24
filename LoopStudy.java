public class LoopStudy {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        int i;
        //forloop
        for(i=0;i<100;i++){
            System.out.println(i+1);
        }
        System.out.println("i is: "+i);
        //whileloop
        int n=5;
        while(n>0){
            System.out.println("Hello");
            n--;
        }
        System.out.println("n is:" +n);
        //do-while
         n=5;
        do{
            System.out.println(n);
            n--;
        }
        while(n>0);


        System.out.println("Checking difference between while and do-while");
        
         n=0;
        while(n>0){
            System.out.println(n);
            n--;
        }
        System.out.println("n is:" +n);
        //do-while
         n=0;
        do{
            System.out.println(n);
            n--;
        }
        while(n>0);
    }
}
