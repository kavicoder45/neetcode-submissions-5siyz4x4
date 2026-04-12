class Solution {

    static final int MAX_CHAR = 26;

    public String findHash(String s)
    {
        //here we are going to construct the hash for keys in hashmap. 
        int[] freq = new int[MAX_CHAR];
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray())
        {
            freq[ch - 'a']++; // it is unary operator. it refere a = a + 1 => a++;
        }

        for(int i=0;i<MAX_CHAR;i++)
        {
            sb.append(freq[i]);
            sb.append("#");
        }

        return sb.toString();

    }
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();

        Map<String,Integer> map = new HashMap<>();

        for(int i=0;i<strs.length;i++)
        {
            String key = findHash(strs[i]);

            if(!map.containsKey(key))
            {
                map.put(key,result.size());
                result.add(new ArrayList<>());
            }

            result.get(map.get(key)).add(strs[i]);
        }
        

        return result;
    }
}
