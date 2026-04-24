class Solution {
    double valid = 0, total = 0;
    public double getProbability(int[] balls) {
        dfs(balls, 0, 0, 0, 0, 0, 1.0);
        return valid / total;
    }
    private void dfs(int[] balls, int idx,
                     int c1, int c2,
                     int n1, int n2,
                     double ways) {
        if (idx == balls.length) {
            if (n1 == n2) {
                total += ways;
                if (c1 == c2) valid += ways;
            }
            return;
        }
        int cnt = balls[idx];
        for (int i = 0; i <= cnt; i++) {
            int j = cnt - i;
            int nc1 = c1 + (i > 0 ? 1 : 0);
            int nc2 = c2 + (j > 0 ? 1 : 0);
            int nn1 = n1 + i, nn2 = n2 + j;
            double comb = combination(cnt, i);
            dfs(balls, idx + 1, nc1, nc2, nn1, nn2, ways * comb);
        }
    }
    private double combination(int n, int k) {
        if (k == 0 || k == n) return 1.0;
        if (k > n - k) k = n - k;
        double res = 1.0;
        for (int i = 1; i <= k; i++) {
            res *= (n - i + 1);
            res /= i;
        }
        return res;
    }
}