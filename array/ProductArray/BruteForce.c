#include<stdio.h>
#include<stdio.h>
int* product(int nums[n]){
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
