#include <stdio.h>
int main() {
	int a,temp,r,sum=0;
  scanf("%d",&a);
  temp=a;
  while(temp>0)
  {
    r=temp%10;
    temp=temp/10;
    sum=sum+r;
  }
  printf("%d",sum);
    //Type your code
	return 0;
}