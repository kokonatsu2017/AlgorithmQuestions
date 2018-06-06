import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

class Twitter {
	
	private Map<Integer, Set<Integer>> followee;
	private Map<Integer, List<Tweet>> tweets;
	
	private static int time;
	public class Tweet{
		public int id;
		public int time;
		
		public Tweet(int id, int time) {
			this.id = id;
			this.time = time;
		}
	}
    /** Initialize your data structure here. */
    public Twitter() {
    	followee = new HashMap<Integer, Set<Integer>>();
        tweets = new HashMap<Integer, List<Tweet>>();
        time = 0;
    }
    
    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
    	if(!tweets.containsKey(userId)) {
    		tweets.put(userId, new LinkedList<Tweet>());
    		follow(userId, userId);
    	}
    	
    	tweets.get(userId).add(new Tweet(tweetId, time++));
    }
    
    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
    	PriorityQueue<Tweet> heap = new PriorityQueue<>(new Comparator<Tweet>() {
    			public int compare(Tweet t1, Tweet t2) {
    				return t1.time - t2.time;
    			}
    	});
    	
    	Set<Integer> myFollowees = followee.get(userId);
    	
    	if(myFollowees != null) {
    		for(int followeeId: myFollowees) {
    			List<Tweet> followe_tweets = tweets.get(followeeId);
    			
    			if(followe_tweets == null) continue;
    			
    			for(Tweet t: followe_tweets) {
    				if(heap.size() < 10) {
    					heap.add(t);
    				} else {
    					if(t.time <= heap.peek().time) break;
    					
    					else {
    						heap.add(t);
    						heap.poll();
    					}
    				}
    			}
    		}
    	}
    	
    	List<Integer> feeds = new LinkedList<>();
    	while(!heap.isEmpty()) {
    		feeds.add(0, heap.poll().id);
    	}
    	
    	return feeds;
    }
    
    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
        if(!followee.containsKey(followerId)){
        	followee.put(followerId, new HashSet<Integer>());
        }
        followee.get(followerId).add(followeeId);
    }
    
    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
        if(!followee.containsKey(followerId)|| followerId == followeeId) {
        	return;
        }
        followee.get(followerId).remove(followeeId);
    }
}

