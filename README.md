
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

HOMEWORK6

public class HOMEWORK6 {
    public static void main(String[] args) {
        int i, j, n = 10;
        int array[] = new int[n];
        int binomial[][] = new int[n][n];
        float farr[] = new float[n];
        double darr[] = new double[n];
		for (i = 0; i < n; i++) {
            binomial[i][0] = binomial[i][i] = 1;
            for (j = 1; j < i; j++) {
                binomial[i][j] = binomial[i-1][j-1] + binomial[i-1][j];
            }
        }
        printArray(n, binomial);
    }

    static void printArray(int n, int binomial[][]) {
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(binomial[i][j] + " ");
            }
            System.out.println();
        }
    }
}
<img width="1511" height="868" alt="image" src="https://github.com/user-attachments/assets/16f26aaa-e8ae-42c3-a211-bf958782c287" />


HOMEWORK7

	public static void main(String[] args) {
		   int data[] = new int[20];
	        for (int i = 0; i < 20; i++)
	            data[i] = (int)(Math.random() * 100);

	        System.out.println("정렬 전");
	        for (int i = 0; i < 20; i++)
	            System.out.print(data[i] + " ");
	        System.out.println();

	        // 선택 정렬
	        for (int i = 0; i < 19; i++) {
	            int min = i;                      
	            for (int j = i + 1; j < 20; j++) {
	                if (data[j] < data[min])
	                    min = j;
	            }
	            int temp = data[i];              
	            data[i] = data[min];
	            data[min] = temp;
	        }

	        System.out.println("정렬 후");
	        for (int i = 0; i < 20; i++)
	            System.out.print(data[i] + " ");
	        System.out.println();

	}

<img width="1195" height="886" alt="스크린샷 2026-10-12 142531" src="https://github.com/user-attachments/assets/c7ea78e9-81c1-478a-bf40-41447de3c866" />

HOMEWORK8

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int studentCount = 30; 
        int subjectCount = 4;   
        
        int[][] score = new int[studentCount][subjectCount];

        System.out.println("번호\t국어\t영어\t수학\t과학\t총점");
      

        for (int i = 0; i < studentCount; i++) {
            int sum = 0; 
            
            for (int j = 0; j < subjectCount; j++) {
                score[i][j] = (int) (Math.random() * 101); 
                sum += score[i][j];
            }

            System.out.print((i + 1) + "\t");
            for (int j = 0; j < subjectCount; j++) {
                System.out.print(score[i][j] + "\t");
            }
            System.out.println(sum);
        }
    }	
	}
<img width="1248" height="681" alt="image" src="https://github.com/user-attachments/assets/e9ccd402-a47d-4e80-a84c-91f98e05ac52" />


HOMEWORK10
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array_count, max_value, bin_size, display_scale, hist_size;
		if(args.length !=4)
			return;
		array_count = Integer.parseInt(args[0]);
		max_value = Integer.parseInt(args[1]);
		bin_size = Integer.parseInt(args[2]);
		display_scale = Integer.parseInt(args[3]);
		hist_size = max_value/bin_size;
		
		int[] arr = new int[array_count];
		int[] hist = new int[hist_size];
		for (int i=0; i<array_count; i++) {
			arr[i] = (int) (Math.random()*max_value);
		}
		for (int i=0; i<array_count; i++) {
			System.out.print(arr[i] + " ");  
		}
		System.out.println();  
		
		for (int i=0; i<array_count; i++) {
			hist[arr[i]/bin_size]++;
		}
		for (int i=0; i<hist_size; i++) {
			System.out.print(hist[i] + " ");  
		}
		System.out.println();  
	}
<img width="1750" height="838" alt="image" src="https://github.com/user-attachments/assets/3156c0d0-3d80-4ae7-a35f-c2109aac082c" />

HOMEWORK11


	public static void main(String[] args) {
		int array_count;
		if(args.length !=1)
			return;
		array_count = Integer.parseInt(args[0]);
		int[] arr = new int[array_count];
		for (int i=0; i<array_count; i++) {
			arr[i] = (int) (Math.random()*100);
		}
		for (int i=0; i<array_count; i++) {
			System.out.print(arr[i] + " ");  
		}
		System.out.println();
		double sum = 0;
		for (int i=0; i<array_count; i++) {
			sum+=arr[i];
		}
		System.out.printf("arithematic mean : = %f\n", sum/array_count);
		double prod = 1;
		for (int i=0; i<array_count; i++) {
			prod*=arr[i];
		}
		System.out.printf("harmonic mean : = %f\n", Math.pow(prod, (double)1./array_count));
		
	}

	
<img width="1452" height="807" alt="image" src="https://github.com/user-attachments/assets/24def2e3-220e-42c6-8647-a5d3d7b72f16" />

HOMEWORK 13

package HOMREWORK_13;

import java.util.Scanner;

public class HOMREWORK_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String inputString = scanner.nextLine().trim();

            if (inputString.isEmpty()) continue;

            // 하나 이상의 공백 기준으로 분할
            String[] arrOfStr = inputString.split("\\s+");

            // 피연산자 2개 (토큰 3개: 숫자 연산자 숫자)
            if (arrOfStr.length == 3) {
                try {
                    double num1 = Double.parseDouble(arrOfStr[0]);
                    String op = arrOfStr[1];
                    double num2 = Double.parseDouble(arrOfStr[2]);

                    double result = calculate(num1, op, num2);
                    printResult(result);
                } catch (NumberFormatException e) {
                    System.out.println("잘못된 숫자 형식입니다.");
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
            } 
            // 피연산자 3개 (토큰 5개: 숫자 연산자 숫자 연산자 숫자)
            else if (arrOfStr.length == 5) {
                try {
                    double num1 = Double.parseDouble(arrOfStr[0]);
                    String op1 = arrOfStr[1];
                    double num2 = Double.parseDouble(arrOfStr[2]);
                    String op2 = arrOfStr[3];
                    double num3 = Double.parseDouble(arrOfStr[4]);

                    // 연산자 우선순위 판별
                    double result;
                    if (getPriority(op2) > getPriority(op1)) {
                        double right = calculate(num2, op2, num3);
                        result = calculate(num1, op1, right);
                    } else {
                        double left = calculate(num1, op1, num2);
                        result = calculate(left, op2, num3);
                    }

                    printResult(result);
                } catch (NumberFormatException e) {
                    System.out.println("잘못된 숫자 형식입니다.");
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
            } 
            else {
                System.out.println("입력 형식이 올바르지 않습니다.");
            }
        }
    }

    private static int getPriority(String op) {
        switch (op) {
            case "+": case "-":
                return 1;
            case "*": case "/": case "#":
                return 2;
            default:
                return 0;
        }
    }

    private static double calculate(double a, String op, double b) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/":
                if (b == 0) throw new ArithmeticException("0으로 나눌 수 없습니다.");
                return a / b;
            case "#":
                return gcd((int) a, (int) b);
            default:
                throw new ArithmeticException("지원하지 않는 연산자입니다: " + op);
        }
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return Math.abs(a);
    }

    private static void printResult(double result) {
        if (result == (long) result) {
            System.out.println((long) result);
        } else {
            System.out.printf("%.2f\n", result);
        }
    }
}
<img width="961" height="716" alt="image" src="https://github.com/user-attachments/assets/6e4681ef-8862-448c-87f5-e03df9697e18" />







