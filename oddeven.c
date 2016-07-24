#include<stdio.h>
int main(){
	int array1[100];
	int array2[100];
	int outarr[100];
	int n;
	int i;
	scanf("%d",&n);
	for(i=0;i<n;i++){
		scanf("%d",&array1[i]);
	}
	for(i=0;i<n;i++){
		scanf("%d",&array2[i]);
	}
	for(i=0;i<n;i++){
		if(i%2==0){
			outarr[i]=array1[i];
		}
		else{
			outarr[i]=array2[i];
		}
	}
	for(i=0;i<n;i++)
	printf("%d ",outarr[i]);
}
