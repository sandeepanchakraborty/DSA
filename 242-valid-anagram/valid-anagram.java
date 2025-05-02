class Solution {
    public boolean isAnagram(String a, String b) {
          if(a.length()!=b.length()){
        return false;
    }
    char arrA[]=a.toCharArray();
    char arrB[]=b.toCharArray();
    Arrays.sort(arrA);
    Arrays.sort(arrB);
    int indexA=0;
    int indexB=0;
    int len=a.length();
        while(indexA<len && indexB<len){
            if(arrA[indexA]!=arrB[indexB]){
                return false;
            }
            indexA++;
            indexB++;
        }
        return true;
    }
    }