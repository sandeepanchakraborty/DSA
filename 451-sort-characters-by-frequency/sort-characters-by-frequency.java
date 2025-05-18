class Solution {
    public String frequencySort(String s) {
        int[] freq=new int[128];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }

        List<Character> lis=new ArrayList<>();
        for(int i=0;i<128;i++){
            if(freq[i]>0){
                lis.add((char)i);
            }
        }

        lis.sort((a,b)-> freq[b]-freq[a]);

        StringBuilder sb=new StringBuilder();

        for(char eachchar:lis){
            for(int i=0;i<freq[eachchar];i++){
                sb.append(eachchar);
            }
        }
        return sb.toString();
    }
}