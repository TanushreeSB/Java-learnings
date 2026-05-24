// https://www.naukri.com/code360/problems/painter's-partition-problem_1089557

import java.util.ArrayList;

public class PaintersPartitionSolution {

    public static int countPainters(ArrayList<Integer> boards, int time) {

        int painters = 1;
        long boardsPainter = 0;

        for (int i = 0; i < boards.size(); i++) {

            if (boardsPainter + boards.get(i) <= time) {
                boardsPainter += boards.get(i);
            } else {
                painters++;
                boardsPainter = boards.get(i);
            }
        }

        return painters;
    }

    public static int findLargestMinDistance(ArrayList<Integer> boards, int k) {

        int low = Integer.MIN_VALUE;
        int high = 0;

        // finding max element and sum
        for (int board : boards) {
            low = Math.max(low, board);
            high += board;
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int painters = countPainters(boards, mid);

            if (painters > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}
