 class Element
 {
    //here I declared the variable in static. when you declare variable as static all the object will 
    //share the same reference so we end up with same value. 
        public int key;
        public  int value;

        public Element(int a ,int b)
        {
            this.key = a;
            this.value = b;
        }

        public int getKey()
        {
            return key;
        }
        public int getValue()
        {
            return value; 
        }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        //hashSet to check the number of unique element: 
        Set<Integer> set = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();
        List<Element> list = new ArrayList<>();


        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        //if k = number of unique element return set. 
        if(k == set.size())
        return set.stream().mapToInt(Integer::intValue).toArray();

        //add the logic: 
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i], 1);
            }
            else
            {
                map.put(nums[i],map.get(nums[i]) + 1);
            }
        }
        //take the map to create the object of key and value: 
        map.forEach((key,value)->{
            list.add(new Element(key,value));
        });

        // sor the array list: 

        Collections.sort(list, new Comparator<Element>(){
            public int compare(Element a , Element b)
            {
                return Integer.compare(b.getValue(), a.getValue());
            }
        });

        int[] result = new int[k];
       for(int i=0;i<k;i++)
       {
        result[i] = list.get(i).getKey();
       }

       return result;
    }
}
