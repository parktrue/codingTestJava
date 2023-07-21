import java.util.*;

class Solution {
    static class Student {
        double average;
        int index;

        public Student(double average, int index) {
            this.average = average;
            this.index = index;
        }
    }

    public int[] solution(int[][] score) {
        int n = score.length;
        int[] answer = new int[n];
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            double average = (score[i][0] + score[i][1]) / 2.0;
            students[i] = new Student(average, i);
        }

        Arrays.sort(students, (a, b) -> Double.compare(b.average, a.average));

        int rank = 1;
        for (int i = 0; i < n; i++) {
            if (i > 0 && students[i].average != students[i-1].average) {
                rank = i + 1;
            }
            answer[students[i].index] = rank;
        }

        return answer;
    }
}
