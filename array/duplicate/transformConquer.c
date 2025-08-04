//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
int sort(int *nums,int n){
  for(int i=0;i<n-1;i++){
    for(int j=i+1;j<n;j++){
      if(nums[i]>nums[j]){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
      }
    }
  }
  return 0;
}

int containsDuplicate(int* nums, int numsSize){
  sort(nums,numsSize);
  for(int i=0;i<numsSize-1;i++){
    if(nums[i]==nums[i+1]){
      return 1;
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