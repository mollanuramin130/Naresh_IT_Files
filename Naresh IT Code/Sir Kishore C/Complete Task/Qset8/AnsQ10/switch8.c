#include<stdio.h>

int main() {
    int score1, score2;
    char name1[30], name2[30];

    printf("Enter First person name: ");
    scanf(" %[^\n]", name1); // Add space before %[^\n] to consume any leftover newline

    printf("Enter First person score: ");
    scanf("%d", &score1);

    getchar(); // Consume leftover newline after the integer input

    printf("Enter Second person name: ");
    scanf(" %[^\n]", name2); // Add space before %[^\n]

    printf("Enter Second person score: ");
    scanf("%d", &score2);

    if (score1 >= score2) {
        printf("%s won the match by %d runs\n", name1, score1 - score2);
    } else {
        printf("%s won the match by %d runs\n", name2, score2 - score1);
    }

    return 0;
}

/*
alternative Method
#include<stdio.h>

int main() {
    int score1, score2;
    char name1[30], name2[30];

    printf("Enter First person name: ");
    gets(name1); // Add space before %[^\n] to consume any leftover newline

    printf("Enter First person score: ");
    scanf("%d", &score1);

   

    printf("Enter Second person name: ");
    getchar();
   gets(name2); // Add space before %[^\n]

    printf("Enter Second person score: ");
    scanf("%d", &score2);

    if (score1 >= score2) {
        printf("%s won the match by %d runs\n", name1, score1 - score2);
    } else {
        printf("%s won the match by %d runs\n", name2, score2 - score1);
    }

    return 0;
}

*/