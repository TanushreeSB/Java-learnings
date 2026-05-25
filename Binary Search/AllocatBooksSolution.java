public class AllocatBooksSolution {

    public static long GivesNinjatest(int n, int m, int[] time) {

        long l = 0, r = 0;

        for (int t : time) {
            l = Math.max(l, t);
            r += t;
        }

        while (l < r) {

            long mid = (l + r) / 2, sum = 0;
            int days = 1;

            for (int t : time) {
                if (sum + t > mid) {
                    days++;
                    sum = 0;
                }
                sum += t;
            }

            if (days <= n) r = mid;
            else l = mid + 1;
        }

        return l;
    }
}
