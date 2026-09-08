
public class helloword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int i = 0;
	    int j = 0;
	    int n = 0;

	    for(i=0; i<10; i++) {
	        for(j=0; j<=i; j++){
	            System.out.print("#");
	        }
	        System.out.println();
	    }
	    System.out.println();

	    for(i=0; i<10; i++) {
	        for(j=0; j<10-i; j++){
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
	
<img width="1005" height="847" alt="image" src="https://github.com/user-attachments/assets/99a9b6db-23e5-438d-a75c-49ab096818dd" />
<img width="1833" height="827" alt="image" src="https://github.com/user-attachments/assets/c078b98e-5be1-4c54-bcbf-6810d6244af6" />


}

public class helloword {

	public static void main(String[] args) 
	{
		int n = 20; 

		 int prev = 0, curr = 1;

		System.out.print(prev + " ");
		System.out.print(curr + " ");

		for (int i = 2; i < n; i++) {
			int next = prev + curr;
			System.out.print(next + " ");
			prev = curr;
			curr = next;
		}

		// TODO Auto-generated method stub
	}
}
<img width="1852" height="872" alt="image" src="https://github.com/user-attachments/assets/8d26082b-1c47-45bb-9fd1-c06da09d768b" />




