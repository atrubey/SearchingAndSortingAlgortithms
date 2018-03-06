import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Algorithms {
	
	public static int findBrokenEgg(List<String> eggs) {
		
		int firstCrackedIndex = -1; 
		
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				firstCrackedIndex = i; 
				break; 
			}	
		}
		
		return firstCrackedIndex; 
		
	}

	public static int countPearls(List<Boolean> oysters) {
		
		int numPearls = 0; 
		
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				numPearls++; 
			}	
		}
		
		return numPearls; 
		
	}
	
	public static double findTallest(List<Double> peeps) {
		
		int tallestIndex = 0; 
		
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > peeps.get(tallestIndex)) {
				tallestIndex = i; 
			}	
		}
		
		return peeps.get(tallestIndex); 
		
	}
		
	public static String findLongestWord(List<String> words) {
		
		int longestIndex = 0; 
		
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > words.get(longestIndex).length()) {
				longestIndex = i; 
			}	
		}
		
		return words.get(longestIndex); 
		
	}
	
	public static boolean containsSOS(List<String> message) {
		
		boolean containsSOS = false; 
		
			if (message.contains(" ... --- ... ")) {
				containsSOS = true; 
			}	
		
		return containsSOS; 
		
	}
	
public static List<Double> sortScores(List<Double> result) {
	
		result = new ArrayList<Double>(result); 
	
		double temp;
		boolean swap = false; 
		
		do {
			swap = false; 
			for (int i = 0; i < result.size()-1; i++) {
				if (result.get(i) > result.get(i+1)) {
					temp = result.get(i); 
					result.add(i, result.get(i+1));
					result.remove(i+1); 
					result.add(i+1, temp);
					result.remove(i+2); 
					swap = true; 
				}
			}
		} while (swap == true); 
		
		return result; 
		
	}
	
}
