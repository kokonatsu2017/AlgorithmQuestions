package Medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode 950
 * @author kokonatsudream
 *
 */
public class deckRevealedIncreasing {
	public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Queue<Integer> index = new LinkedList<Integer>();
        int[] res = new int[deck.length];
       
        for(int i = 0; i < deck.length; i++){
        	index.add(i);
        }
       
        
        for(int card : deck){
        	res[index.remove()] = card;
        	if(!index.isEmpty()){
        		index.add(index.remove());
        	}
        }
        
        return res;
       
    }
}
