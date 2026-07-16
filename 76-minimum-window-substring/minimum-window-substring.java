class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        int i = 0, j = 0;
        int n = s.length();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int count = map.size();
        int min = Integer.MAX_VALUE;
        int start = -1;

        while (j < n) {

            char ch = s.charAt(j);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) {
                    count--;
                }
            }

            while (count == 0) {

                if (j - i + 1 < min) {
                    min = j - i + 1;
                    start = i;
                }

                char left = s.charAt(i);

                if (map.containsKey(left)) {
                    map.put(left, map.get(left) + 1);

                    if (map.get(left) == 1) {
                        count++;
                    }
                }

                i++;
            }

            j++;
        }

        return start == -1 ? "" : s.substring(start, start + min);
    }
}