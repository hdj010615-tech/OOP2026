
HOMEWORK1

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

HOMEWORK2

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


HOMEWORK3


	public static void main(String[] args)
	{
		float val1 = 1;
		float val2 = 2;

		for (int i = 0; i < 20; i++) {
			float value = val2 / val1;
			System.out.println(val2 + "/" + val1 + " = " + value);
			float temp = val1;
			val1 = val2;
			val2 = temp + val2;
		}
	}
<img width="915" height="845" alt="스크린샷 2026-09-14 142918" src="https://github.com/user-attachments/assets/433c60a1-4da3-4ce1-9df8-b0bdb0daf53a" />


HOMEWORK4

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1; i<=9; i++) {
			for(j=1; j<=9; j++) 
				System.out.printf("%d * %d = %d\n",i,j,i*j);
		}
	}

<img width="907" height="298" alt="image" src="https://github.com/user-attachments/assets/092b71cd-ca72-41bc-b115-dc3a3b988b72" />
<img width="733" height="861" alt="image" src="https://github.com/user-attachments/assets/f12eb31d-fc29-42f0-ac3d-199b1c2b4f4f" />
<img width="725" height="861" alt="image" src="https://github.com/user-attachments/assets/92a5b02e-c9d8-4f69-8f65-4c1b2ae10daf" />

HOMEWORK5

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n=100,sign=1;
		double sum=0;
			for(i=0;i<n;i++) {
				sum += sign*1./((2.*i+1.)*Math.pow(3.,i));
				sign *= -1;
			}
			System.out.println(sum*Math.sqrt(12));

	}

<img width="1507" height="847" alt="스크린샷 2026-09-28 141330" src="https://github.com/user-attachments/assets/e1a0dc47-3234-40ef-ba73-5526c31430ca" />





