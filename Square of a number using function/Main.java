#include<stdio.h>
   int sum(int m);
     int main()
   {
     int n;
     scanf("%d", &n);
     printf("%d", sum(n));
     return 0;
   }
  
int sum(int m)   
{
  int result = m*m;
  return result;
}
  
