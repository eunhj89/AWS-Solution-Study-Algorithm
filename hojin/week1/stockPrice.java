import java.util.Stack;
import java.util.LinkedList;
class Solution {
    public int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
				for (int j = 0; j < prices.length; j++) {
			for (int i = j+1; i < prices.length; i++) {
				if (prices[j] <= prices[i]) {
					answer[j]++;
				} else {
					answer[j]++;
					break;
				}
			}
		}
		return answer;

}
