class Solution {
    public String countOfAtoms(String formula) {
        Stack<HashMap<String,Integer>> st = new Stack<>();
        st.push(new HashMap<>());

        int i = 0, n = formula.length();

        while(i < n) {
            char ch = formula.charAt(i);

            if(ch == '(') {
                st.push(new HashMap<>());
                i++;
            }
            else if(ch == ')') {
                i++;
                int val = 0;
                while(i < n && Character.isDigit(formula.charAt(i))) {
                    val = val * 10 + (formula.charAt(i) - '0');
                    i++;
                }
                if(val == 0) val = 1;

                HashMap<String,Integer> cur = st.pop();
                HashMap<String,Integer> par = st.peek();

                for(String atom : cur.keySet()) {
                    par.put(atom,
                            par.getOrDefault(atom, 0) + cur.get(atom) * val);
                }
            }
            else {
                StringBuilder atom = new StringBuilder();
                atom.append(ch);
                i++;
                while(i < n && Character.isLowerCase(formula.charAt(i))) {
                    atom.append(formula.charAt(i));
                    i++;
                }
                int val = 0;
                while(i < n && Character.isDigit(formula.charAt(i))) {
                    val = val * 10 + (formula.charAt(i) - '0');
                    i++;
                }

                if(val == 0) val = 1;

                HashMap<String,Integer> cur = st.peek();
                String at = atom.toString();

                cur.put(at, cur.getOrDefault(at, 0) + val);
            }
        }

        TreeMap<String,Integer> tm = new TreeMap<>(st.pop());

        StringBuilder ans = new StringBuilder();

        for(String atom : tm.keySet()) {
            ans.append(atom);
            if(tm.get(atom) > 1) ans.append(tm.get(atom));
        }

        return ans.toString();
    }
}