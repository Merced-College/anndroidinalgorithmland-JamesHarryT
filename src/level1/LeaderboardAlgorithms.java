package level1;

import java.util.ArrayList;

/**
 * Names: Harrison Tinley, Rito Murillo, Parminder Singh
 * Date: 3/30/26
 * This class has the algorithms we use in the program to sort by score and search for the score from the csv file.
 * It uses selection sort for sorting scores descending. It also uses binary search for searching the score of a player.
 */
public class LeaderboardAlgorithms {

    /**
     * TODO: Sort the list by score DESCENDING (highest score first).
     *
     * Requirements:
     * - Sort IN PLACE (modify the given list)
     * - You may use Collections.sort + Comparator for the first version.
     * - Week 8 challenge/extra credit: replace with merge sort or quicksort.
     */
    public static void sortByScoreDescending(ArrayList<ScoreEntry> scores) {
    	// Selection sort algorithm to order scores from highest to lowest.
        for (int i = 0; i < scores.size() - 1; i++) {
        	
        	//assumes the largest score is the at the current position
        	int maxIndex = i;
        	
        	
        	// search the rest of the list for a larger score and compares it to the current
        	for (int j = i + 1; j < scores.size(); j++) {
        		
        		// if a higher score is found then update the maxIndex
        		if (scores.get(j).getScore() > scores.get(maxIndex).getScore()) {
        			maxIndex = j;
        		}
        	}
        	
        	//makes temporary variable to swap largest score found with the value at current position
        	
        	ScoreEntry temp = scores.get(i);
        	scores.set(i, scores.get(maxIndex));
        	scores.set(maxIndex, temp);
        }
        
    }

    /**
     * TODO: Sort the list by username ASCENDING (A -> Z).
     *
     * Requirements:
     * - Sort IN PLACE (modify the given list)
     */
    public static void sortByUsernameAscending(ArrayList<ScoreEntry> list) {
        // TODO
    }

    /**
     * TODO: Binary search for an EXACT username match.
     *
     * Precondition: list must already be sorted by username ascending!
     *
     * @return index of the matching entry, or -1 if not found
     */
    public static int binarySearchByScore(ArrayList<ScoreEntry> scores, int target_score) {
    	// flipped version of binary search to work with descending order of sorted scores.
    	int low = 0;
    	int high = scores.size() - 1;
    	
    	while (low <= high) {
    		// set the middle index to the middle of the low and high bounds
    		int mid = low + (high - low) / 2;
    		
    		// if target was found return the index it was found at
    		if (scores.get(mid).getScore() == target_score) {
    			return mid;
    		}
    		
    		// because descending, if mid is less than the target, then ignore the right side and search the left
    		if (scores.get(mid).getScore() < target_score) {
    			high = mid - 1;
    		}
    		
    		// because descending, otherwise mid is more than the target, 
    		// so ignore the left side and search the right
    		else {
    			low = mid + 1;
    		}
    	}
    	
    	// target wasn't found so return -1
        return -1;
    }
}
