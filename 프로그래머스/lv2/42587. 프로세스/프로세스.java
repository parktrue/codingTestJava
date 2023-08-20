import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<PrintJob> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new PrintJob(i, priorities[i]));
        }

        while (!queue.isEmpty()) {
            PrintJob currentJob = queue.poll();
            boolean isHigherPriorityExist = queue.stream().anyMatch(job -> job.priority > currentJob.priority);

            if (isHigherPriorityExist) {
                queue.offer(currentJob);
            } else {
                answer++;
                if (currentJob.index == location) {
                    break;
                }
            }
        }

        return answer;
    }

    class PrintJob {
        int index;
        int priority;

        PrintJob(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }
}
