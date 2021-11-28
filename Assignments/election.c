#include <stdio.h>
void main(){
    int a[100],n,i, count[5], spoilt=0;
    printf("Enter the number of voters:\n");
    scanf("%d",&n);
    printf("Enter the ballot votes:\n");
    for(i=0;i<n;i++)
        scanf("%d",&a[i]);
    for(i=0;i<5;i++)
        count[i]=0;
    for(i=0;i<n;i++){
        switch(a[i]){
            case 1: count[0]++; break;
            case 2: count[1]++; break;
            case 3: count[2]++; break;
            case 4: count[3]++; break;
            case 5: count[4]++; break;
            default: spoilt++;
        }
    }
    for(i=1;i<=5;i++){
        printf("Candidate %d has secured votes %d \n",i,count[i-1]);
    }
    printf("Number of spoilt ballots is: %d", spoilt);
}