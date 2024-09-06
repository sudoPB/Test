#include <cs50.h>
#include <ctype.h>
#include <math.h>
#include <stdio.h>
#include <string.h>

int main(void)
{
    double lett = 0, wor = 1, sen = 0;
    string s = get_string("Text: ");
    for (int i = 0; i < strlen(s); i++)
    {
        if (isalpha(s[i]))
        {
            lett++;
        }
        else if (isblank(s[i]))
        {
            wor++;
        }
        else if (s[i] == '.' || s[i] == '?' || s[i] == '!')
        {
            sen++;
        }
    }
    double index = 0.0588 * (lett / wor * 100) - 0.296 * (sen / wor * 100) - 15.8;
    if (index < 1)
    {
        printf("Before Grade 1\n");
    }
    else if (index > 16)
    {
        printf("Grade 16+\n");
    }
    else
    {
        printf("Grade %i\n", (int) round(index));
    }
}
