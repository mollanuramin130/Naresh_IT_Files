// //Method 1

// #include<stdio.h>

// int isBalance(char str[],int strLen);

// int main(){
//     printf("Enter Your string : ");
//     char str[50];
//     scanf("%[^\n]",str);
//     int strLen=0;
//     for(int i=0;i<str[i];i++){
//         strLen++;
//     }

//     if(isBalance(str,strLen)){
//         printf("Balance paraenthesis \n");
//     }
//     else{
//         printf("Not a Balance paraenthesis \n");
//     }
// }

// int isBalance(char str[],int strLen){

//     for(int i=0;i<=strLen/2;i++){
//         if((str[i]=='(' && str[strLen-i-1]!=')') || (str[i]=='{' && str[strLen-i-1]!='}') || (str[i]=='[' && str[strLen-i-1]!=']')){
//             return 0;
//         }
//     }
//     return 1;
// }

//Method 2

#include <stdio.h>
#include <string.h>

int isBalance(char str[], int strLen);

int main() {
    printf("Enter your string: ");
    char str[50];
    scanf("%[^\n]", str);

    int strLen = strlen(str);

    if (isBalance(str, strLen)) {
        printf("Balanced brackets\n");
    } else {
        printf("Not balanced brackets\n");
    }

    return 0;
}

int isBalance(char str[], int strLen) {
    char stack[50]; // Stack to hold opening brackets
    int top = -1;   // Index of the top of the stack

    for (int i = 0; i < strLen; i++) {
        if (str[i] == '(' || str[i] == '{' || str[i] == '[') {
            // Push opening brackets onto the stack
            stack[++top] = str[i];
        } else if (str[i] == ')' || str[i] == '}' || str[i] == ']') {
            // Check for matching opening bracket
            if (top == -1) {
                return 0; // No matching opening bracket
            }
            char topBracket = stack[top--]; // Pop from the stack
            if ((str[i] == ')' && topBracket != '(') ||
                (str[i] == '}' && topBracket != '{') ||
                (str[i] == ']' && topBracket != '[')) {
                return 0; // Mismatched brackets
            }
        }
    }

    return top == -1; // If stack is empty, brackets are balanced
}
