package com.skilltest.core;

import java.util.ArrayList;

public class Partition {
	
	
	
	public static ArrayList<ArrayList<Integer>> partition (ArrayList<Integer> inputList, Integer taille){
		 
		ArrayList<ArrayList<Integer>> returnList = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
 
		int i=0,j=0;
		while (i<inputList.size())
		{
			list.clear();
			for ( j = 0; j < taille; j++) 
			{
				if((j+i)<inputList.size())
				list.add(inputList.get(i+j));
			}
			returnList.add((ArrayList<Integer>) list.clone());
			i+=taille;
			
		}
 
		return returnList;
	}
	
	
	
	
	

}
