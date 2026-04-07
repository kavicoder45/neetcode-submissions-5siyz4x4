class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
       //1. sort the string. and check have I seen this element before ? 
       //2. "Key" => "value" ("sorted string " => List<> which contains same string);
       //3. Arrays.sort() modify the existing array. 
       Map<String,List<String>> map = new HashMap<>();
       List<List<String>> result = new ArrayList<>();
/*
       for(int i=0;i<strs.length;i++)
       {
         char[] arr = strs[i].toCharArray();
         Arrays.sort(arr);
         if(map.containsKey(arr.toString()));
         {
            map.put(String.valueOf(arr),map.getOrDefault(String.valueOf(arr),new ArrayList<>(String.valueOf(arr))).add(String.valueOf))
         }
       } 
getOrDefault() → returns a list ✔️
.add() → returns boolean ❌
map.put() → expects a List, not boolean ❌ 

*/

        for(int i=0;i<strs.length;i++)
        {
            char[] arr  = strs[i].toCharArray();
            char[] arr1 = strs[i].toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            String value = new String(arr1);

            if(!map.containsKey(key))
            {
                List<String> list = new ArrayList<>();
                list.add(value);
                map.put(key, list);
            }
            else
            {
                 //here we are adding same list (because it refer the same address);
            map.get(key).add(value);
            }
        }

        for(Map.Entry<String,List<String>> entry : map.entrySet())
        {
            result.add(entry.getValue());
        }

        return result;
        
    }
}
