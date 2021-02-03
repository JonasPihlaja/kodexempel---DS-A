package com.company;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		LinkedThings linkedThings = new LinkedThings();

		linkedThings.add(new Thing("skjorta"));
		linkedThings.add(new Thing("byxor"));
		linkedThings.add(new Thing("pipo"));
		linkedThings.add(new Thing("shorts"));

		System.out.println("Things:");
		System.out.println(linkedThings.listThings());


		LinkedThangs linkedThangs = new LinkedThangs();

		linkedThangs.add(new Thang("skjorta"));
		linkedThangs.add(new Thang("byxor"));
		linkedThangs.add(new Thang("pipo"));
		linkedThangs.add(new Thang("bandana"));

		System.out.println("Thangs with nodes:");
		System.out.println(linkedThangs.listThings());

		System.out.println("---------\n\nGrafstruktur:");
		ArrayList<Thing> outfits = new GraphThings().createGraph();

		for(int i = 0; i < outfits.size(); i++){
			System.out.println("\n"+outfits.get(i).getName()+" passar med:");

			for (int j = 0; j < outfits.get(i).getRelations().size(); j++){

				System.out.println(outfits.get(i).getRelations().get(j).getName());
			}
		}

	}
}
