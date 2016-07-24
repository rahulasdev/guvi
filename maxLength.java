package maxlength;

import java.util.Scanner;

public class maxLength {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		String str[]=input.split(" ");
		int max=str[0].length();
		int mp=0;
		for(int i=1;i<str.length;i++){
			if(max<str[i].length()){
				max=str[i].length();
				mp=i;
			}
		}
		System.out.println(str[mp]+" "+str[mp].length());
	}

}
