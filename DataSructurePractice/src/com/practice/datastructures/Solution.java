package com.practice.datastructures;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

	public static void main(String[] args) {

		ArrayList<Job> jobList = new ArrayList<Job>();
		jobList.add(new Job(2, 100));
		jobList.add(new Job(1, 19));
		jobList.add(new Job(2, 27));
		jobList.add(new Job(1, 25));
		jobList.add(new Job(3, 15));

		Collections.sort(jobList, new SortByProfit());
		for(int i = 0; i < jobList.size();i++)
		System.out.println(jobList.get(i).getProfit());
	}

}
