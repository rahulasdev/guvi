#include<stdio.h>
#include<string.h>
int main(){
	char input[100];
	scanf("%s",input);
	int m=strlen(input);
	int i;
	for(i=m-1;i>=0;i--){
	printf("%c-",input[i]);
	}
}

