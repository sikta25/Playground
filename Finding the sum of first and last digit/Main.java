#include <stdio.h>
int main() {
	int a,temp,f,r,sum=0;
  scanf("%d",&a);
  temp=a;
  int l=a%10;
  while(temp>0)
  {
    r=temp%10;
    temp=temp/10;
  }
  f=r;
  sum=l+f;
  printf("%d",sum);
    //Type your code
	return 0;
}