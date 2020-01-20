#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <math.h>

void fail() {
    int *p = NULL;
    *p = 0;
}

bool read_bool() {
    int i = 0;
    int c = 0;
    bool value = true;
    while (c != '\n' && c != EOF) {
        c = getchar();
        if (c == '\n' || c == EOF) {
            break;
        }
        if (i == 0) { if (c == 't') { value = true; } else if (c == 'f') { value = false; } else { fail(); } }
        else if (i == 1) { if (value == true && c == 'r') {} else if (value == false && c == 'a') {} else {
         fail(); } }
        else if (i == 2) { if (value == true && c == 'u') {} else if (value == false && c == 'l') {} else {
         fail(); } }
        else if (i == 3) { if (value == true && c == 'e') {} else if (value == false && c == 's') {} else {
         fail(); } }
        else if (i == 4) { if (value == true) { fail(); } else if (value == false && c == 'e') {} else {
        fail(); } }
        else { fail(); }
        i++;
    }
    if (value == true && i == 4) {} else if (value == false && i == 5) {} else { fail(); }
    return value;
}

static int i;
static int j;
static int maximum;
static int Tval[30]

int maxTAB(int *t) {
    int i;
    int j;
    int max;

    i = (-(3));
    j = (0);
    max = t[(((-(3)) - (-3)) * (1)) + (((0) - (0)) * (6))];
    while ((i <= (3))) {
        while ((j <= (5))) {
            if ((t[((i - (-3)) * (1)) + ((j - (0)) * (6))] > max)) {
                max = t[((i - (-3)) * (1)) + ((j - (0)) * (6))];
            } else {

            }
            j = (j + (1));
        }
        i = (i + (1));
    }
    return max;
}


void theEnd() {


    printf("%s", ("that’s all !"));
}



int main(int argc, char **argv) {
    i = (-(3));
    j = (0);
    maximum = Tval[(((-(3)) - (-3)) * (1)) + (((0) - (0)) * (6))];
    while ((i <= (3))) {
        while ((j <= (5))) {
            scanf(" %d", &(Tval[((i - (-3)) * (1)) + ((j - (0)) * (6))]))
            j = (j + (1));
        }
        i = (i + (1));
    }
    maximum = maxTAB(Tval);
    printf("%d", maximum);
    theEnd()
}
