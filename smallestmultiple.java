public class smallestmultiple {
    public static void main(String[] args) {

       int i = 1;
       while(i>0) {
           int flag = 0;
           for (int j = 1; j <= 20; j++) {
               if(i%j!=0){
                   flag=1;
               }
           }
           if(flag==0){
               System.out.println(i);
               break;
           }
           i++;
       }
    }
}
