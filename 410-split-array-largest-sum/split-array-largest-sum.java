class Solution {
    public int splitArray(int[]books, int students) {
         if(books.length<students){
            return -1;
        }
        int start=Integer.MIN_VALUE;
        int end=0;

        for(int i=0;i<books.length;i++){
            if(books[i]>start){
                start=books[i];
            }
            end=end+books[i];
        }
        
        while(start<=end){
            int mid=start+(end-start)/2;
            //agar allocation is possible then minimize the number of pages
            int totalstudent=isAllocationispossible(books,mid);
            if(totalstudent>students){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return start;
    }
    public static int isAllocationispossible(int books[],int pages){
         int n = books.length; 
         int students = 1;
        long pagesStudent = 0;
        for(int i=0;i<n;i++){
           
            if(pagesStudent + books[i]<=pages){
              pagesStudent+=books[i];
            }
            else{
                students++;
                pagesStudent=books[i];
            }
        }
        return students;
    }
}