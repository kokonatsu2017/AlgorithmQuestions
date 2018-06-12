package String;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequentWords {
	public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> wordsFrequency = new HashMap<>();
        
        for(String s: words) {
        	if(wordsFrequency.containsKey(s))
        		wordsFrequency.put(s, wordsFrequency.get(s) + 1);
        	else
        		wordsFrequency.put(s, 1);
        }
        
        Queue<String> queue = new PriorityQueue<>(k, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if (wordsFrequency.get(a) == wordsFrequency.get(b)) {
                    return b.compareTo(a);
                }
                return wordsFrequency.get(a) - wordsFrequency.get(b);
            }
        });
        
        for(String word: wordsFrequency.keySet()) {
        	queue.add(word);
        	if(queue.size() > k) {
        		queue.poll();
        	}
        }
        
        List<String> res = new ArrayList<>();
        while(!queue.isEmpty()) {
        	res.add(0, queue.poll());
        }
        
        return res;
        
    }
}
