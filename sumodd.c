#include<stdio.h>
int main(){
	int n;
	int i;
	int sum=1;
	int f=1;
	scanf("%d",&n);
	for(i=3;i<=n;i=i+2){
		if(f==1){
			f=0;
			sum=sum+i;
		}
		else{
			f=1;
			sum=sum-i;
		}	
	}
	printf("%d",sum);
}
