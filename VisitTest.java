package pll;

import bll.Visit;

public class VisitTest {

	public static void main(String[] args) {
		
		Visit ob = new Visit("Ashish", 500);
		System.out.println("Data before medical visits : ");
		System.out.println(ob);
			
		ob.visit("All Ok", 20);
		
		System.out.println("\n\nData after medical visits : ");
		
		if(ob.hasTakenPlace())
			System.out.println(ob);
		else
			System.out.println("The patient does not visited.");

	}

}
