package Amazon.Easy;

import java.util.Arrays;

import lib.Interval;

/**
 * Leetcode 252
 * @author kokonatsudream
 *
 */
public class MeetingRooms {
	public boolean canAttendMeetings(Interval[] intervals) {
        Arrays.sort(intervals, (a, b) -> {
        	return Integer.compare(a.start, b.start);
        });
        
        int begin = 0;
        
        for(int i = 0; i < intervals.length; i++){
        	Interval interval = intervals[i];
        	
        	if(interval.start < begin){
        		return false;
        	}
        	
        	begin = interval.end; 
        }
        
        return true;
    }
}
