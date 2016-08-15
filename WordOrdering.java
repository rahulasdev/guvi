import java.lang.*;
import java.io.*;
import java.util.*;
public class WordOrdering{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		input=input.toLowerCase();
		String str[]=input.split(" ");
		for(int i=0;i<str.length;i++){
			for(int j=i+1;j<str.length;j++){
				if(str[i].length()<str[j].length()){
					String temp=str[j];
					str[j]=str[i];
					str[i]=temp;
				}
				else if(str[i].length()==str[j].length()&&str[i].compareTo(str[j])>0){
					String temp=str[j];
					str[j]=str[i];
					str[i]=temp;
				}
			}
		}
		for(int i=0;i<str.length;i++){
			String word="";
			String noWord="";
			for(int j=0;j<str[i].length();j++){
				char c=str[i].charAt(j);
				if(Character.isAlphabetic(c)){
					word=word+c;
				}
				else{
				 	noWord=noWord+c;
				}
			}
			char arr[]=word.toCharArray();
			Arrays.sort(arr);	
			word=String.valueOf(arr);
			word=Character.toUpperCase(word.charAt(0))+word.substring(1);
			System.out.print(word+noWord+" ");
		}
	}
}
