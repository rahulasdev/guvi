

import java.util.Scanner;

public class SameString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String input1=s.nextLine();
		String input2=s.next();
		String str[]=input1.split(" ");
		for(int i=0;i<str.length;i++){
			if(input2.equals(str[i])){
				System.out.println(i);
				break;
			}
		}

	}

}
