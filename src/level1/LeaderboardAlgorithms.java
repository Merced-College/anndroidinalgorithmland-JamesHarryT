package level1;

import java.util.ArrayList;

/**
 * STUDENT TODO FILE
 *
 * You will implement sorting and binary search for the Leaderboard Terminal.
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
    public static int binarySearchByUsername(ArrayList<ScoreEntry> list, String username) {
        // TODO
        return -1;
    }
}
