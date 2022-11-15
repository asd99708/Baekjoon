package P221115;

import java.util.Scanner;

public class q8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		int count = 0;
		
		for (int i = 0; i < a; i++) {
			String b = sc.next();
			
			for (int j = 0; j < b.length(); j++) {
				switch (b.charAt(j)) {
				case 'O':
					count++;
					sum += count;
					break;

				case 'X':
					count = 0;
					break;
				}
			}
			
			System.out.println(sum);
			count = 0;
			sum = 0;
		}
		
		sc.close();
	}
}
