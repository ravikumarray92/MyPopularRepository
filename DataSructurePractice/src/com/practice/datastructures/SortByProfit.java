package com.practice.datastructures;

import java.util.Comparator;

public class SortByProfit implements Comparator<Job>{

	@Override
	public int compare(Job jobA, Job jobB) {
		// TODO Auto-generated method stub
		return  jobA.profit - jobB.profit;
	}

}
