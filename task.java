import java.util.Scanner;


class task {

	public static void main(String[] args) {
		        Scanner s = new Scanner(System.in);
		        int j;
		        String z="";
		        int i;
		        for(j=1 ; j<=10 ; j++){
		        	
		        	for(i=1 ; i<=j ;i++){
		        		z=z+i*j+" ";
		        	}
		        	System.out.println();
		        	System.out.println(z);
		        	z="";
		        }
		        
	}

}
