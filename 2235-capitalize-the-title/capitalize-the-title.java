class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split("\\s+");
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < words.length;i++){
            String word = words[i];

            if(word.length() <= 2){
                res.append(word.toLowerCase());
            }
            else{
                res.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase());
            }

            if(i < words.length -1){
                res.append(" ");
            }
        }
        return res.toString();  
    }
}