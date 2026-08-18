class Solution {
    public String frequencySort(String s) {
        StringBuilder ans = new StringBuilder();
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }

        ArrayList<Character> temp = new ArrayList<>(map.keySet());
        temp.sort((a, b) -> Integer.compare(map.get(b), map.get(a)));

        for(char ch : temp){
            for(int i = 0; i < map.get(ch);i++){
                ans.append(ch);
            }
        }


        return ans.toString();
    }
}