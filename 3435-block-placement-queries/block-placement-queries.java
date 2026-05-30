class Solution {
    class SegTree {
        int n;
        int[] tree;

        public SegTree(int size) {
            n = 1;
            while (n <= size)
                n *= 2;
            tree = new int[2 * n];
        }

        public void update(int i, int val) {
            i += n;
            tree[i] = val;

            while (i > 1) {
                i >>= 1;
                tree[i] = Math.max(tree[i * 2], tree[i * 2 + 1]);
            }
        }

        public int query(int r) {
            int l = n;
            int rr = r + n + 1;
            int ans = 0;

            while (l < rr) {
                if ((l & 1) == 1) {
                    ans = Math.max(ans, tree[l]);
                    l++;
                }

                if ((rr & 1) == 1) {
                    rr--;
                    ans = Math.max(ans, tree[rr]);
                }

                l >>= 1;
                rr >>= 1;
            }

            return ans;
        }
    }

    public List<Boolean> getResults(int[][] queries) {
        int mx = 0;

        for (int[] q : queries)
            mx = Math.max(mx, q[1]);

        SegTree st = new SegTree(mx + 1);

        TreeSet<Integer> set = new TreeSet<>();
        set.add(0);

        List<Boolean> ans = new ArrayList<>();

        for (int[] q : queries) {
            int x = q[1];

            if (q[0] == 1) {
                Integer prev = set.floor(x);
                Integer next = set.ceiling(x);

                st.update(x, x - prev);

                if (next != null)
                    st.update(next, next - x);

                set.add(x);

            } else {
                int sz = q[2];

                Integer prev = set.floor(x);

                int best = Math.max(x - prev, st.query(prev));

                ans.add(best >= sz);
            }
        }

        return ans;
    }
}