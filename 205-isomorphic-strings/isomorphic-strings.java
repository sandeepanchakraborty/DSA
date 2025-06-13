class Solution {
    public boolean isIsomorphic(String s, String t) {
            if(s.length()!=t.length()) return false;

      Map<Character,Character> ms=new HashMap<>();
      Map<Character,Character> mt=new HashMap<>();

      for(int i=0;i<s.length();i++){
        char cs=s.charAt(i);
        char ct=t.charAt(i);

        if(ms.containsKey(cs)){
            if(ms.get(cs)!=ct) return false;
        }else{
            ms.put(cs,ct);
        }
        if(mt.containsKey(ct)){
            if(mt.get(ct)!=cs) return false;
        }else{
            mt.put(ct,cs);
        }
      }
      return true;
    }
}