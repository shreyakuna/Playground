#include <stdio.h>
#include<math.h>
int main()
{
  int b,e,p=1;
  scanf("%d%d",&b,&e);
  for(int i=0;i<e;i++)
    p=p*b;
  if(e<0)
    printf("Wrong input");
  else
    printf("%d",p);
  	//Your code here       
    return 0;
}