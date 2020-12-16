class Solution {
    public boolean wordPattern(String pattern, String s) {
        // a dog
        // b cat
        // b cat
        // a dog

        // a dog
        // b cat
        // b cat
        // a fish 
        // false

        // a dog
        // a cat
        // false

        String[] s_arr = s.split(" ");
        int len = pattern.length();
        if (len != s_arr.length) {
            return false;
        }

        Map<String, String> map = new HashMap<String, String> ();
        Map<String, String> map_T = new HashMap<String, String> ();
        for(int i = 0; i < len; i ++) {
            String alpaha = String.valueOf(pattern.charAt(i));
            String word = s_arr[i];
            if (map.containsKey(alpaha)) {
                if (!map.get(alpaha).equals(word)) {
                    return false;
                }
            } else {
                map.put(alpaha, word);
            }
            if (map_T.containsKey(word)) {
                if (!map_T.get(word).equals(alpaha)) {
                    return false;
                }
            } else {
                map_T.put(word, alpaha);
            }
        }

        return true;
    }
}