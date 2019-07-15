#include <stdio.h>
int main() {
	//Type your code
  int n,a;
  scanf("%d",&n);
  int f = n%10;
  while(n!=0)
  {
    a=n%10;
    n=n/10;
  }
 printf("%d",f+a); 
	return 0;
}