class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        HashSet<String> used = new HashSet<>();
        int i=0,j=0;

           
        for(char c:pattern.toCharArray()){
            if (i >= s.length()) return false;
            
            while(j < s.length() && s.charAt(j) != ' '){
                j++;
            }
            String st=s.substring(i,j);
            if(map.containsKey(c)){
                if(!map.get(c).equals(st)) return false;
            }else{
                if(used.contains(st)) return false;
                map.put(c,st);
                used.add(st);
            }
            i=++j;
        }
        return i >= s.length();
    }
}