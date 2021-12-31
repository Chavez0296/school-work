#include <iostream>
#include <string>
#include <iomanip>
#include <cstdlib>
#include <ctime>
using namespace std;

void sort(string str[][7]); 
void printRandomLines(string words[][7]);
void stringRand(string words[][7], string str[][10]);
int binSearch(string words[7], string target); //Setting up functions so that can be placed below main
int main()
{
    int size[7];
    string words[5][7];
    string target;
    string str[6][10] = { { "the", "a", "this", "that", "some", "\0", "\0", "\0", "\0", "\0"},
                          {"crazy", "lazy", "fast", "slow", "big", "skinny", "tall", "poor", "drunk", "pretty"},
                          {"man", "woman", "boy", "girl", "cat", "dog", "bird", "teacher", "mailman", "driver"},
                          {"drove", "took", "carried", "hit", "pushed", "fell", "ran", "brought", "pulled", "climbed"},
                          {"over", "under", "by", "between", "next to", "near", "across", "to", "from", "into"},
                          {"refrigerator", "stove", "car", "house", "school", "pool", "roof", "floor", "table", "wall"},
                        }; //2D array of random words
    stringRand(words, str);
    printRandomLines(words);
    sort(words);
    cout << "\n\n\n\n";
    cout << "Sorted words:\n";
    printRandomLines(words);
    do {
        cout << "Enter word to search for: ";
        getline(cin, target);
        int index;
        for (int i = 0; i < 5; i++)
        {
            index = binSearch(words[i], target);

            if (index >= 0)
            {
                break;
            }
        }
        cout << index << "\n";
    } while (target != "\0"); //Looping until null string is entered 
    return 0;
}
void sort(string str[][7]) //Alphabetically sorting the random words 
{
    for (int j = 0; j < 5; j++)
    {
        bool swap;
        do

        {
            swap = false; //initially there are no swaps

            for (int i = 0; i < 7 - 1; i++)
            {   
                string str1 = str[j][i];
                string str2 = str[j][i + 1];
                if (str1.compare(str2) > 0) 
                {
                    string tmp = str[j][i];
                    str[j][i] = str[j][i + 1];
                    str[j][i + 1] = tmp;
                    swap = true;
                }

            }
        } while (swap); //while a swap was done, continue
    }
}
int binSearch(string words[7], string target) //Ascending Binary Search Algorithim for sorted strings 
{
    
   int first = 0, last = 7 - 1, mid = (first + last) / 2;
     while (first <= last)
     {      
        
            if (target.compare(words[mid]) < 0)
            {
                last = mid - 1;
                mid = (first + last) / 2;

            }
            else if (target.compare(words[mid]) > 0)
            {
                first = mid + 1;
                mid = (first + last) / 2;
            }
            else
            {
                return mid;
            }
    }
     return -1;
}

void stringRand(string words[][7], string str[][10]) //randomizing the selection of words stored in the 2D array in main 
{
    unsigned seed;
    seed = time(0);
    srand(seed);

    for (int i = 0; i < 5; i++)
    {
        for (int j = 0; j < 7; j++)
        {
            int randRow = rand() % 6;
            int randCol = rand() % 10;
            words[i][j] = str[randRow][randCol];
        }
    }
}
void printRandomLines(string words[][7])//Print line fuction for a 5x7 2D array
{
    for (int i = 0; i < 5; i++)
    {
        for (int j = 0; j < 7; j++)
        {

            cout << words[i][j] << " | ";
        }
        cout << "\n";
    }

}