package com.skilltest.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import com.skilltest.core.Partition;




public class TestPartition {
	
	
	
	@Test
	public void testPartition(){
		ArrayList<Integer> inputList = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			inputList.add(i);
		}
		
		ArrayList<ArrayList<Integer>> resultat = new ArrayList<ArrayList<Integer>>();      
		resultat.add(new ArrayList<Integer>(Arrays.asList((Integer)0,(Integer)1)));
		resultat.add(new ArrayList<Integer>(Arrays.asList((Integer)2,(Integer)3)));
		resultat.add(new ArrayList<Integer>(Arrays.asList((Integer)4)));
               
                
	    assertEquals(resultat,Partition.partition(inputList, 2));
	}
	
	

}
