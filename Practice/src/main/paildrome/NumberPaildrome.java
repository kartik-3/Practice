package main.paildrome;

import java.lang.Math;

public class NumberPaildrome {

	public static void main(String[] args) {
		
		int a = 1232123;
		int c = 0;
		int i = 0;
		int b = a;
		while(b>0) {
			b /= 10;
			i++;
		}
		while(a>0) {
			c = c + (a%10) * (int)(Math.pow(10,(i-1)));
			a = a/10;
			i--;
		}
		System.out.println(c);
	}

}
