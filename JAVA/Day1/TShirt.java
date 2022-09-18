package com.sonata.assignment;

public class TShirt {
	String color,material,design;
	TShirt (){}
	TShirt ( String color , String material , String design) {
		this.color = color;
		this.material = material;
		this.design = design;
	}
	public static void main(String[] args) {	
		TShirt[] small = new TShirt[3];
		small[0] = new TShirt( "Red" , "" , "Star Wars: Dark Side" );
		small[1] = new TShirt( "Blue" , "CottonBlend" , "Iron Man: Tony's Choice" );
		small[2] = new TShirt( "Yellow" , "Polyster" , "Solids Oversized: Sage Green" );
		TShirt[] medium = new TShirt[3];
		medium[0] = new TShirt( "Red" , "Cotton" , "Star Wars: Dark Side" );
		medium[1] = new TShirt( "Blue" , "CottonBlend" , "Iron Man: Tony's Choice" );
		medium[2] = new TShirt( "Yellow" , "Polyster" , "Solids Oversized: Sage Green" );
		TShirt[] large = new TShirt[3];
		large[0] = new TShirt( "Red" , "Cotton" , "Star Wars: Dark Side" );
		large[1] = new TShirt( "Blue" , "CottonBlend" , "Iron Man: Tony's Choice" );
		large[2] = new TShirt( "Yellow" , "Polyster" , "Solids Oversized: Sage Green" );		
		TShirt[] extraLarge = new TShirt[3];
		extraLarge[0] = new TShirt( "Red" , "Cotton" , "Star Wars: Dark Side" );
		extraLarge[1] = new TShirt( "Blue" , "CottonBlend" , "Iron Man: Tony's Choice" );
		extraLarge[2] = new TShirt( "Yellow" , "Polyster" , "Solids Oversized: Sage Green" );		
		//Small
		System.out.println("\nSize - Small\n");
		for( int i = 0 ; i < small.length ; i++ ) {
			System.out.println( "T-Shirt Color - " + small[i].color + "\nT-Shirt Material - " + small[i].material + "\nT-Shirt Design - " + small[i].design + "\n--------------------------------------------------" );
		}		
		//Medium
		System.out.println("\nSize - Medium\n");
		for( int i = 0 ; i < medium.length ; i++ ) {
			System.out.println( "T-Shirt Color - " + medium[i].color + "\nT-Shirt Material - " + medium[i].material + "\nT-Shirt Design - " + medium[i].design + "\n--------------------------------------------------" );
		}
		//Large
		System.out.println("\nSize - Large\n");
		for( int i = 0 ; i < large.length ; i++ ) {
			System.out.println( "T-Shirt Color - " + large[i].color + "\nT-Shirt Material - " + large[i].material + "\nT-Shirt Design - " + large[i].design + "\n--------------------------------------------------" );
		}
		//Extra-Large
		System.out.println("\nSize - Extra-Large\n");
		for( int i = 0 ; i < extraLarge.length ; i++ ) {
			System.out.println( "T-Shirt Color - " + extraLarge[i].color + "\nT-Shirt Material - " + extraLarge[i].material + "\nT-Shirt Design - " + extraLarge[i].design + "\n--------------------------------------------------" );
		}		
	}
}