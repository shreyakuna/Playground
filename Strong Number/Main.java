#include <stdio.h>
int main() {
	//Type your code
  int n,r,fact=1,sum=0;
  scanf("%d",&n);
  int m=n;
  while(n>0)
  {
    r=n%10;
    fact=1;
    for(int i=1;i<=r;i++)
     fact=fact*i;
     
    sum=sum+fact;
    n=n/10;
  }
  
  if(m==sum)
    printf("Yes");
  else
    printf("No");
	return 0;
}