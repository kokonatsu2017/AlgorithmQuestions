package Amazon.Medium;

import java.util.LinkedList;

public class RoundRobin {
	public class Process {
		int arrivalTime;
		int execTime;
		
		public Process(int a, int e){
			arrivalTime = a;
			execTime = e;
		}
	}
	public double roundRobin(int[] arrive, int[] execute, int q){
		LinkedList<Process> queue = new LinkedList<Process>();
		int currTime = 0;
		int waitTime = 0;
		int nextProIndex = 0;
		
		while(!queue.isEmpty() || nextProIndex < arrive.length){
			if(!queue.isEmpty()){
				Process currProcess = queue.poll();
				waitTime += currTime - currProcess.arrivalTime;
				currTime += Math.min(currProcess.execTime, q);
				
				for(int i = nextProIndex; i < arrive.length; i++){
					if(arrive[i] <= currTime){
						queue.offer(new Process(arrive[i], execute[i]));
						nextProIndex = i + 1;
					} else {
						break;
					}
				}
				
				if(currProcess.execTime > q){
					queue.offer(new Process(currTime, currProcess.execTime - q));
				}
			} else {
				queue.offer(new Process(arrive[nextProIndex], execute[nextProIndex]));
				currTime = arrive[nextProIndex];
				nextProIndex++;
			}
		}
		return (double) waitTime / arrive.length;
	}
}
