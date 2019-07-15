#include <stdio.h>
int main() {
	//Type your code
  int n,a[50],i=0,count=0;
  scanf("%d",&n);
  while(n!=0)
  {
    a[i]=n%10;
    count++;
    n=n/10;
    i++;
  }
  printf("%d",a[count-2]);
	return 0;
}