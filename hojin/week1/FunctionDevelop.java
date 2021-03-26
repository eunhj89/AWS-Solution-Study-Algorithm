import java.util.LinkedList;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        LinkedList<Integer> days = new LinkedList<Integer>();
		LinkedList<Integer> answers = new LinkedList<Integer>();
		int[] answer = {};
		int tempNum = 0;

		for (int i = 0; i < progresses.length; i++) {
			days.offer((int) Math.ceil((100 - progresses[i]) / (double) speeds[i]));
		}
		while (days.iterator().hasNext()) {
			int comInt = days.poll();
			int numOfDeploy = 1;
			int sizeOfdays = days.size();
			for (int j = 0; j < sizeOfdays; j++) {
				if (comInt >= days.get(j)) {
					numOfDeploy++;
				}else {
					break;
				}
			}
			answers.add(numOfDeploy);
			while(numOfDeploy>1) {
				days.poll();
				numOfDeploy--;
			}
		}

		answer = answers.stream().mapToInt(x -> x).toArray();

		return answer;
    }
}
