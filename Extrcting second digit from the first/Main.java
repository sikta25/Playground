#include <stdio.h>
int main() {
  int a;
  scanf("%d",&a);
  int temp,r;
  temp=a;
  while(temp>10)
  {
    r=temp%10;
    temp=temp/10;
  }
  printf("%d",r);
	//Type your code
	return 0;
}