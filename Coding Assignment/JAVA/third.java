package JAVA;

import java.util.Scanner;

public class third {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();
		
		int count [] = new int[26];
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				int temp = (int)s.charAt(i)-97;
				count[temp]++;
			}
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				int temp = (int)s.charAt(i)-65;
				count[temp]++;
			}
		}
		
		for(int i=0;i<26;i++) {
			if(count[i]==0) {
				System.out.println("The given string is not Panagram");
				return;
			}
		}
		
		System.out.println("The given string is panagram");

	}

}
