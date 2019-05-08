#include<stdio.h>
int main()
{
  int i=365, j=4, q,r;
  q= i/j;
  r=i%j;
  printf("Quotient: %d\n", q);
  printf("Remainder: %d", r);
  return 0;
}