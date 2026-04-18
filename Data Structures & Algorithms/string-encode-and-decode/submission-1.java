class Solution {

    public String encode(List<String> strs) {
        //encode the string as: length,#<string>
        // - eg: 5,4,#Helloworld.  

        if(strs.isEmpty())
        return "";

        List<Integer> sizes = new ArrayList<>();
        StringBuilder res = new StringBuilder();
        for(String sz : strs)
        sizes.add(sz.length());

        for(int i : sizes)
        res.append(i).append(",");
        //to identify the end of sizes: 

        res.append("#");

        for(String str : strs)
        res.append(str);

        return res.toString();
    }

    public List<String> decode(String str) {

        List<String> result = new ArrayList<>();

        if(str.length() == 0)
        return new ArrayList<>();

        List<Integer> sizes = new ArrayList<>();
        
        int i = 0;

        while(str.charAt(i)!='#') //important condition. 
        {
            StringBuilder num = new StringBuilder();
            while(str.charAt(i)!=',')
            {
                num.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(num.toString()));
            i++;
        }

        i++;

        for(int sz : sizes)
        {
            result.add(str.substring(i, i + sz));
            i = i+sz;
        }
        return result;
    }
}
