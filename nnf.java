import java.util.Scanner;


public class nnf extends task {
		public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        System.out.println("please enter intigere number");
	        int x=s.nextInt();
	        System.out.println("please enter no. of digits");
	        int y=s.nextInt();
	        String L=("The number is ");
	        int i;
	        for(i=y-1 ; i>=0 ; i--){
	        	char z=(char) (x/(Math.pow(10,i))%10+'0');
	        	L=L+z;
	        }
	        System.out.println(L);
		}    

}
