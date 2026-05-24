// https://www.naukri.com/code360/problems/aggressive-cows_1082559

import java.util.*;

public class AggressiveCowsSolution {

    static boolean isPossible(int[] stalls, int k, int mid, int n) {

        int cowCount = 1;
        int lastPos = stalls[0];

        for (int i = 1; i < n; i++) {

            if (stalls[i] - lastPos >= mid) {
                cowCount++;

                if (cowCount == k) {
                    return true;
                }

                lastPos = stalls[i];
            }
        }

        return false;
    }

    public static int aggressiveCows(int[] stalls, int k) {

        Arrays.sort(stalls);

        int n = stalls.length;

        int s = 0;
        int e = stalls[n - 1] - stalls[0];

        int ans = -1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (isPossible(stalls, k, mid, n)) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return ans;
    }
}
