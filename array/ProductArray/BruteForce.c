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