package test;

import javax.persistence.Entity;

@Entity
public class Test2 {
	public static void main(String[] args) {
		int[] a1= new int[10];
		int[] a2 = new int[9];
		
		for(int i =0;i<9;i++){
			a1[i] = i;
			a2[i]=i;
		}
		a1[9] = 9;
		
		System.out.println("BEFORE : " + a1[9] + a2[8] + a2.length);
		a2=a1;
		System.out.println("AFTER  : " + a1[9] + a2[8] + a2[9] + a2.length);
	}
}
