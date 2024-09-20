#include<stdio.h>
#include<stdbool.h>

bool isPalindrome(int x) {
    long int temp,rev,dig;
    rev=0;
    temp =x;
    while(x>0){
        dig=x%10;
        rev=rev*10+dig;
        x=x/10;
    }
    if(rev == temp)
      return true;
    else
      return false;
    
}