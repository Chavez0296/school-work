#include <iostream>
#include <ctime>
#include <cstdlib>
using namespace std; 
void gen_dates(int months[], int days[], int num_of_days[12], int size) //function generating random days and months
{
  unsigned seed; //random generator seed
  seed = time(0); //Time function to get a "seed" value for srand
  srand(seed);

  int month; //initialize 
  for(int i=0; i<size; i++)
  {
    month = 1+rand()%12; //generate random month
    months[i]=month;
    days[i]=1+rand()%num_of_days[month-1];//generate random day
  }
}
int search_date(int months[], int days[], int size, int month, int day) //search date function
{
  for(int i=0; i<size; i++)
  {
    if(months[i]==month && days[i]==day)return i;
    
  }
  return -1;
}

int main() 
{
  int num_of_days[] = {31,28,31,30,31,30,31,31,30,31,30,31}; //declaring and initializing the number of days in 12 months
  int months[50], days[50], year, size; //Setting maximum array size to 50

  cout<<"Enter current year: ";
  cin >> year;
  if((year%4==0 && year%100!=0)||(year%400==0)) //Leap year check
  {
    cout<<year<<" is a leap year."<< endl;
    num_of_days[1]=29;
  }
  cout << "How many random days to generate?(<=50)";
  cin>>size;

 gen_dates(months,days,num_of_days,size); //printing dates in main

  for(int i=0;i<size;i++)
  {
    cout<<months[i]<<"/"<<days[i]<<endl;
  }

int search_month, search_day;
char separator;
cout<<"Enter month day(format mm/dd): ";
cin >> search_month>>separator>>search_day; //print the index of the first date found or print in main that the date could not be found.

int index = search_date(months,days,size,search_month,search_day);
if(index!=-1)
{
  cout<<"Date found at index " << index << endl;
}
else
{
  cout<< "-1"<< endl; //date not found program end
}
}