class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hm= new HashMap<>();
        for(int i=0 ; i<strs.length; i++)
        {
            String curr = strs[i];
            char[] temp = curr.toCharArray();
            Arrays.sort(temp);
            String sortedStr = new String(temp);

            hm.computeIfAbsent(sortedStr, k-> new ArrayList<>()).add(curr);

        }

        return new ArrayList<>(hm.values());
    }
}
