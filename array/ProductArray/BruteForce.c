//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

#include<stdio.h>
#include<stdio.h>
#define MAX 5

int* product(int nums[MAX],int n){
  int ans[n];
  for(int i=0;i<n;i++){
    ans[i]=1;
    for(int j=0;j<n;j++){
      if(i==j)
        continue;
      ans[i]*=nums[j];
    }
  }
  return ans;

}
int main(){
  int n;
  scanf("%d",&n);
  int nums[MAX];
  for(int i=0;i<n;i++){
    scanf("%d",&nums[i]);
  }
  int *ans=product(nums,n);
  for(int i=0;i<n;i++){
    printf("%d ",ans[i]);
  }
}
/*

    Time Complexity : O(N^2), Where N is the size of the Array(nums). Here Two nested loop creates the time 
    complexity.

    Space complexity : O(1), Constant space. Extra space is only allocated for the Array(output), however the
    output does not count towards the space complexity.

    Solved using Array(Two Nested Loop). Brute Force Approach.

    Note : This will give TLE.

*/