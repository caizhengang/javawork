public class Level2
{ 
    public static void main(String[] args) {
        int start = 20150918;
        int end =100000000;
        for(int i=start;i<=end;i++) {
            boolean isPrime = true;
            for(int j=2;j<i;j++) {
                if(i%j==0) {
                    isPrime = false;
                    break;
                }
             }
             if(isPrime==true) {
                 System.out.println(i+"ÊÇËØÊý");
             }
         }
               
      }
}