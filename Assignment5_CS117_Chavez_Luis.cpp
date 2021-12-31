// Assignment5_CS117_Chavez_Luis.cpp : This file contains the 'main' function. Program execution begins and ends there.
//
#include <iostream>
#include <iomanip>
#include <cstring>
#include <string>
#include <cstdlib>
#include <string.h>
#include <chrono>
using namespace std;

struct Date
{
    int month;
    int day;
    int year;
};
struct Time
{
    int hour;
    int min;
};
struct Event
{
    char desc[80];
    Date myDate;
    Time myTime;
};
int readEvents(Event* myEvents[], int max)
{
    char choice;
    char slash;
    char colon;
    int i = 0;
    while (i<max)
    {
        cout << "Enter [y/Y] to add an Event or [n/N] to exit" << endl;
        cin >> choice;
        if (choice == tolower('Y')||choice == toupper('y'))
        {
            myEvents[i] = new Event;
            cout << "Enter the description:\n";
            cin.ignore();
            cin.getline(myEvents[i]->desc, sizeof(myEvents[i]->desc));

            cout << "Enter date (MM/DD/YY) \n";
            cin >> myEvents[i]->myDate.month >> slash >> myEvents[i]->myDate.day >> slash >> myEvents[i]->myDate.year;

            cout << "Enter time: \n";
            cin >> myEvents[i]->myTime.hour >> colon >> myEvents[i]->myTime.min;
        }
        else
        {
            break;
        }
        i++;
    }

    return i;

}
void display(Event* myEvents[], int eventCount)
{
    for (int i = 0; i < eventCount; i++)
    {
        cout << myEvents[i]->desc << endl;
        cout << "Date: " <<  myEvents[i]->myDate.month << "/" << myEvents[i]->myDate.day << "/" << myEvents[i]->myDate.year << "\n" << "Time: " << myEvents[i]->myTime.hour << ":" << myEvents[i]->myTime.min << endl;
    }
}
void sort_desc(Event* myEvents[], int eventCount)
{
    bool swapped;

    do
    {
        swapped = false;
        for (int i = 0; i < eventCount-1; i++)
        {
            if (strcmp(myEvents[i]->desc, myEvents[i + 1]->desc) > 0)
            {
                swap(myEvents[i], myEvents[i + 1]);
                swapped = true;
            }
        }
    } while (swapped);
}
void sort_date(Event* myEvents[], int eventCount)
{
    bool swapped;

    do
    {
        swapped = false;
        for (int i = 0; i < eventCount-1; i++)
        {
            if ((myEvents[i]->myDate.day > myEvents[i + 1]->myDate.day) && (myEvents[i]->myDate.month > myEvents[i + 1]->myDate.month) && (myEvents[i]->myDate.year > myEvents[i + 1]->myDate.year))
            {
                swap(myEvents[i], myEvents[i + 1]);
                swapped = true;
            }
        }
    } while(swapped);
}
void lin_search(Event* myEvents[], int eventCount, char* searchStr)
{
    for (int i = 0; i < eventCount-1; i++)
    {
        if (strstr(myEvents[i]->desc, searchStr) != NULL)
        {
            cout << myEvents[i]->desc << endl;
            cout << myEvents[i]->myDate.month << "/" << myEvents[i]->myDate.day << "/" << myEvents[i]->myDate.year << "\n" << myEvents[i]->myTime.hour << ":" << myEvents[i]->myTime.min << endl;
        }
    }
}
void bin_search(Event* myEvents[], int eventCount, int month)
{
    int i = 0;
    int r = eventCount - 1;
    while (i <= r)
    {
        int m = i + (r - i) / 2;

        if (myEvents[m]->myDate.month == month)
        {
            cout << myEvents[m]->desc << endl;
            cout << myEvents[m]->myDate.month << "/" << myEvents[m]->myDate.day << "/" << myEvents[m]->myDate.year << "\n" << myEvents[m]->myTime.hour << ":" << myEvents[m]->myTime.min << endl;
        }
        if (myEvents[m]->myDate.month < month)
            i = m + 1; // ignores left half

        else
            r = m - 1; //ignores right half


    };
    
}
int main()
{
    Event* myEvents[50];
    char str[200];
    int total = readEvents(myEvents, 50);
    int month;

    cout << "Events entered:\n";
    display(myEvents, total);

    cout << "Events sorted by description:\n";
    sort_desc(myEvents, total);
    display(myEvents, total);

    cout << "Enter a search string: ";
    cin.ignore();
    cin.getline(str, sizeof(str));
    lin_search(myEvents, total, str);

    cout << "Events sorted by date:\n";
    sort_date(myEvents, total);
    display(myEvents, total);

    cout << "Enter a month to list Events for: ";
    cin >> month;
    bin_search(myEvents, total, month);

    return 0;
}