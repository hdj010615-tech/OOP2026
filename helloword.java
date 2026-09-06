
public class helloword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int i = 0;
	    int j = 0;
	    int n = 0;

	    for(i=0; i<10; i++) {
	        for(j=0; j<10-i; j++){
	            System.out.print("#");
	        }
	        System.out.println();
	    }
	    System.out.println();

	    for(i=0; i<10; i++) {
	        for(j=0; j<=i; j++){
	            System.out.print("#");
	        }
	        System.out.println();
	    }
	    System.out.println();

	    for(i=0; i<10; i++) {
	        for(j=0; j<9-i; j++) {
	            System.out.print(" ");
	        }
	        for(n=0; n<=i; n++) {
	            System.out.print("#");
	        }
	        System.out.println();
	    }
	    System.out.println();

	    for(i=0; i<10; i++) {
	        for(j=1; j<=i; j++) {
	            System.out.print(" ");
	        }
	        for(n=0; n<10-i; n++) {
	            System.out.print("#");
	        }
	        System.out.println();
	    }	
	}

}
