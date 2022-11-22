#include <iostream>
using namespace std;

bool Leap(int year) //Return true if it is a leap year
{
  return(((year%4==0)&&(year%100 !=0))||(year%400==0));
}
bool ifValid(int m,  int d , int y) // return true if date is valid
{
  if(m<1||m>12)
  return false;
  if(d<1||d>31)
  return false;
  if(m==2) //return days in february month if leap year
  {
    if(Leap(y))
    return(d<=29);
    else
    return(d<=28);
  }
  
  if(m==4||m==6||m==9||m==11) //condition for months with 30 days 
    return (d<=30);
  return true;
}
int main(void) {
  int d,m,yr;
  cout<<"Enter month:"<<endl;
  cin>>m;
  cout<<"Enter day:"<<endl;
  cin>>d;
  cout<<"Enter year:"<<endl;
  cin>>yr;
  int r=ifValid(m,d,yr);
  if(r==1)//if date is valid
  {
    cout<<"Date validated"<<endl;
  }
  else //if date is invalid display correct date
  {
    if(m<1)
    {
      m=1;
    }
    if(m>12) 
    {
      m=12;
    }
    if(m==4||m==6||m==9||m==11)
    {
      if(d>30)
      {
        int z=d-30;
        d=z;
        m=m+1;
      }
    } 
    else
    {
      if(d>31)
      {
        int j=d-31;
        if(m==12)
        {
          m=1;
          d=j;
          yr=yr+1;
        }
        else
        {
          m=m+1;
          d=j;
        }
      }
    }
    if(d<1)
    {
      d=d+1;
    }
    if(m==2)
    {
      if((yr%4==0 && yr%100 !=0) || (yr%400 ==0))
      {
        if(d>29)
        {
          d=d-29;
          m=m+1;
        }
      }
      else
      {
        if(d>28)
        {
          int i=d-28;
          d=i;
          m=m+1;
        }
      }
    }
    cout<<"Invalid date entered. Changed to "<<m<<"/"<<d<<"/"<<yr;
  }
}