//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct

int containsDuplicate(int* nums, int numsSize){
  for(int i=0;i<numsSize;i++){
    for(int j=i+1;j<numsSize;j++){
      if(nums[i]==nums[j]){
        return 1;
      }
    }
  }
  
  return 0;
}
int main(){
  printf("Enter array size: ");
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++){
    scanf("%d",&arr[i]);
  }
  if(containsDuplicate(arr,n)){
    printf("true");
  }
  else{
    printf("false");
  }
}