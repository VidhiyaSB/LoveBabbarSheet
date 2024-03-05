class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(arr[i]==i+1){
                    arr1.add(i+1);
            }
        }
        return arr1;
    }
}
