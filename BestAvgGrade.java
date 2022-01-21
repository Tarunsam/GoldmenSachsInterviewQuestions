package com.gs.ownpractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//  Find the best average grade.
//Given a list of student test scores
//Each student may have more than one test score in the list.
public class BestAvgGrade {
	static int bestAverage = 0;

	public static Integer bestAvgGrade(String[][] scores)
	  {
	    // write your code goes here
		
		Map<String, List<Integer>> marks = new HashMap<>();
		for (int i = 0; i < scores.length; i++) {
		String name = "";
		for (int j = 0; j < scores[i].length; j++) {
			if (j == 0) {
			name = scores[i][j];
			} 
				else if (!marks.containsKey(name)) 
				{
				List<Integer> mark = new ArrayList<>();
				mark.add(Integer.parseInt(scores[i][j]));
				marks.put(name, mark);
			} 
				else {
					marks.get(name).add(Integer.parseInt(scores[i][j]));
				}
			}
		}

		marks.forEach((k, v) -> {
			int sum = 0;
			for (Integer number : v) {
				sum += number;
			}
			int avg = sum / v.size();
			if (avg > bestAverage)
				bestAverage = avg;
		});

		return bestAverage;
	  }
	
	  public static boolean pass()
	  {
	    String[][] s1 = { { "Rohan", "84" },
	               { "Sachin", "102" },
	               { "Ishan", "55" },
	               { "Sachin", "18" } };

	    return bestAvgGrade(s1) == 84;
	  }

	  public static void main(String[] args)
	  {
	    if(pass())
	    {
	      System.out.println("Pass");
	    }
	    else
	    {
	      System.out.println("Some Fail");
	    }
	  }
}
