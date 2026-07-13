#include <stdio.h>
#include <string.h>

#define MAX_DAYS 30
#define NUM_CATEGORIES 3
#define HIGH_EXPENSE_LIMIT 1000
#define GOOD_SAVINGS_LIMIT 500

void inputUserName(char name[]);
int inputNumberOfDays(void);
void inputExpenses(int expenses[][NUM_CATEGORIES], int days);
void calculateDailyTotals(int expenses[][NUM_CATEGORIES], int days, int dailyTotals[]);
void calculateTotalAverage(int dailyTotals[], int days, float *total, float *average);
int findHighestExpense(int expenses[][NUM_CATEGORIES], int days);
void displayReport(const char name[], float total, float average, int highest);

int main(void)
{
    char userName[50];
    char copiedName[50];

    int expenses[MAX_DAYS][NUM_CATEGORIES];
    int dailyTotals[MAX_DAYS];

    float total = 0;
    float average = 0;
    int highest;
    int days;

    inputUserName(userName);

    size_t len = strlen(userName);
    (void)len;

    strcpy(copiedName, userName);

    int cmp = strcmp("Food", "Food");
    (void)cmp;

    days = inputNumberOfDays();

    inputExpenses(expenses, days);

    calculateDailyTotals(expenses, days, dailyTotals);

    calculateTotalAverage(dailyTotals, days, &total, &average);

    highest = findHighestExpense(expenses, days);

    displayReport(copiedName, total, average, highest);

    return 0;
}

void inputUserName(char name[])
{
    printf("Enter Name: ");
    scanf("%49s", name);
}

int inputNumberOfDays(void)
{
    int days;

    do
    {
        printf("Enter number of days: ");
        scanf("%d", &days);

        if (days <= 0 || days > MAX_DAYS)
        {
            printf("Enter days between 1 and %d\n", MAX_DAYS);
        }

    } while (days <= 0 || days > MAX_DAYS);

    return days;
}

void inputExpenses(int expenses[][NUM_CATEGORIES], int days)
{
    int i, j;

    printf("\n");

    for (i = 0; i < days; i++)
    {
        printf("Day %d expenses: ", i + 1);

        for (j = 0; j < NUM_CATEGORIES; j++)
        {
            scanf("%d", &expenses[i][j]);
        }
    }
}

void calculateDailyTotals(int expenses[][NUM_CATEGORIES], int days, int dailyTotals[])
{
    int i, j;

    for (i = 0; i < days; i++)
    {
        dailyTotals[i] = 0;

        for (j = 0; j < NUM_CATEGORIES; j++)
        {
            dailyTotals[i] += expenses[i][j];
        }
    }
}

void calculateTotalAverage(int dailyTotals[], int days, float *total, float *average)
{
    int i;

    *total = 0;

    for (i = 0; i < days; i++)
    {
        *total += dailyTotals[i];
    }

    *average = *total / days;
}

int findHighestExpense(int expenses[][NUM_CATEGORIES], int days)
{
    int i, j;
    int max = expenses[0][0];

    for (i = 0; i < days; i++)
    {
        for (j = 0; j < NUM_CATEGORIES; j++)
        {
            if (expenses[i][j] > max)
            {
                max = expenses[i][j];
            }
        }
    }

    return max;
}

void displayReport(const char name[], float total, float average, int highest)
{
    printf("\nUser: %s\n\n", name);

    printf("Total Expense: %.0f\n", total);
    printf("Average Expense: %.0f\n", average);
    printf("Highest Expense: %d\n\n", highest);

    if (highest >= HIGH_EXPENSE_LIMIT)
    {
        printf("High Spending Alert!\n");
    }

    if (average < GOOD_SAVINGS_LIMIT)
    {
        printf("Good Savings\n");
    }
}
