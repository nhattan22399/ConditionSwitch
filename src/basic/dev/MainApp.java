package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//10.1
		System.out.println("Nhap y = ");
		int y = sc.nextInt();
		switch (y) {
		case (-3): System.out.println("a khong phai la so nguyen duong");
		break;
		case (-2): System.out.println("a khong phai la so nguyen duong");
		break;
		case (-1): System.out.println("a khong phai la so nguyen duong");
		break;
		case (0): System.out.println("a khong phai la so nguyen duong");
		break;
		case (1): System.out.println("a la so nguyen duong");
		break;
		case (2): System.out.println("a la so nguyen duong");
		break;
		case (3): System.out.println("a la so nguyen duong");
		break;
		default: if(y<0) {
				System.out.println("a khong phai la so nguyen duong");}
		else System.out.println("a la so nguyen duong");
		}
		//10.2
		System.out.println("Nhap n = ");
		int n = sc.nextInt();
		switch (n) {
		case (3): System.out.println("n chia het cho 3");
		break;
		case (6): System.out.println("n chia het cho 3");
		break;
		case (9): System.out.println("n chia het cho 3");
		break;
		case (5): System.out.println("n chia het cho 5");
		break;
		case (10): System.out.println("n chia het cho 5");
		break;
		case (15): System.out.println("n chia het cho 5");
		break;
		default: if (n%3==0) { System.out.print("n chia het cho 3");
		}else if (n%5==0) System.out.print("n chia het cho 5");
		}
		//10.3
		System.out.println("Nhap thang = ");
		int x = sc.nextInt();
		switch (x) {
		case 1,3,5,7,9,11: System.out.println("Thang có 31 ngày");
		break;
		case 4,6,8,12: System.out.println("Thang có 30 ngày");
		break;
		default: System.out.println("Thang có 28 hoac 29 ngày");
		}
		//10.4
		 System.out.print("Nhập hệ số bậc 2, a = ");
	        float a = sc.nextFloat();
	        System.out.print("Nhập hệ số bậc 1, b = ");
	        float b = sc.nextFloat();
	        System.out.print("Nhập hằng số tự do, c = ");
	        float c = sc.nextFloat();
	        if (a == 0) {
	            if (b == 0) {
	                System.out.println("Phương trình vô nghiệm!");
	            } else {
	                System.out.println("Phương trình có một nghiệm: "
	                        + "x = " + (-c / b));
	            }
	            return;
	        }
	        // tính delta
	        float delta = b*b - 4*a*c;
	        float x1;
	        float x2;
	        // tính nghiệm
	        if (delta > 0) {
	            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
	            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
	            System.out.println("Phương trình có 2 nghiệm là: "
	                    + "x1 = " + x1 + " và x2 = " + x2);
	        } else if (delta == 0) {
	            x1 = (-b / (2 * a));
	            System.out.println("Phương trình có nghiệm kép: "
	                    + "x1 = x2 = " + x1);
	        } else {
	            System.out.println("Phương trình vô nghiệm!");
	        }
	        //10.5
	        System.out.print("Nhập canh 1 = ");
	        float c1 = sc.nextFloat();
	        System.out.print("Nhập canh 2 = ");
	        float c2 = sc.nextFloat();
	        System.out.print("Nhập canh 3 = ");
	        float c3 = sc.nextFloat();
	        //Kiem tra ba canh tam giac
	        if ((c1+c2)>c3) System.out.println("c1 c2 c3 la ba canh cua tam giac");
	        else 
	        	System.out.println("c1 c2 c3 khong phai la ba canh cua tam giac");
	        
	    }
	     
	}
	

