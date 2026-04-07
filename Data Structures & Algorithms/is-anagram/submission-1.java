class Solution {
    public boolean isAnagram(String s, String t) {
        //here also I can use hashmap.
        Map<Character,Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();


        if(s.length()!=t.length())
        return false;


        for(int i=0;i<s.length();i++)
        { 
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            smap.put(ch1,smap.getOrDefault(ch1, 0) + 1);
            tmap.put(ch2,tmap.getOrDefault(ch2,0) + 1);
        }

        if(smap.equals(tmap))
        return true;
        else
        return false;
    }
}
