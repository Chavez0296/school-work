#include <iostream>
#include <iomanip>
#include <string>
using namespace std;
//structure for Class and Student
struct Class 
{
    string name;
    int units;
    char grade;
};
struct Student 
{
    string name;
    int numClasses;
    double gpa;
    struct Class c[20];
};
//function to get studemt info
int get_info(struct Student s[], int n)
{
    int i = 0;
    while (i < n) {
        cout << "Enter student name: ";
        getline(cin, s[i].name);
        if (s[i].name.empty())
            break;


        cout << "Enter number of classes taken by " << s[i].name << ": ";
        cin >> s[i].numClasses;
        cin.ignore();
        for (int j = 0; j < s[i].numClasses; j++)
        {
            cout << "Enter the name of class " << (j + 1) << ": ";
            getline(cin, s[i].c[j].name);
            cout << "Enter units of class " << s[i].c[j].name << ": ";
            cin >> s[i].c[j].units;
            cout << "Enter letter grade received for " << s[i].c[j].name << ": ";
            cin >> s[i].c[j].grade;
            cin.ignore();
        }
        i += 1;
    }
    return i;
}
//function return points for each grade
double get_points(char a) 
{
    if (a == 'A')
        return 4;
    else if (a == 'B')
        return 3;
    else if (a == 'C')
        return 2;
    else if (a == 'D')
        return 1;
    else if (a == 'F')
        return 0;
}
//function to get gpa
double get_gpa(struct Student s) 
{
    double sum = 0;
    double unitSum = 0;
    for (int i = 0; i < s.numClasses; i++)
    {
        sum += (s.c[i].units * get_points(s.c[i].grade));
        unitSum += s.c[i].units;
    }

    return sum / unitSum;
}
//sorting based on name
void sort_name(struct Student s[], int n) {
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = 0; j < n - i - 1; j++)
        {
            if (s[j].name > s[j + 1].name)
            {
                struct Student temp = s[j];
                s[j] = s[j + 1];
                s[j + 1] = temp;
            }
        }
    }
}
//sorting based on gpa
void sort_gpa(struct Student s[], int n) 
{
    for (int i = 0; i < n - 1; i++) 
    {
        for (int j = 0; j < n - i - 1; j++) 
        {
            if (s[j].gpa < s[j + 1].gpa) 
            {
                struct Student temp = s[j];
                s[j] = s[j + 1];
                s[j + 1] = temp;
            }
        }
    }
}
//binary search method
int search_name(struct Student s[], int l, int r, string name) {

    if (r >= l)
    {
        int mid = l + (r - l) / 2;

        // If the element is present at the middle
        // itself
        if (s[mid].name == name)
            return mid;

        // If element is smaller than mid, then
        // it can only be present in left subarray
        if (s[mid].name > name)
            return search_name(s, l, mid - 1, name);

        // Else the element can only be present
        // in right subarray
        return search_name(s, mid + 1, r, name);
    }
    return -1;
}
//display function
void display(struct Student s[], int n) {

    for (int i = 0; i < n; i++) {
        cout << "\nStudent: " << s[i].name << "\n";
        for (int j = 0; j < s[i].numClasses; j++)
        {
            cout << s[i].c[j].name << "," << s[i].c[j].units << " units, Grade " << s[i].c[j].grade << "\n";
        }
        cout << "GPA: " << setprecision(2) << s[i].gpa << "\n";

    }
}
//main method
int main() {
    const int s_size = 100;
    string search;
    struct Student s[s_size];

    //assigning 0 to gpa
    for (int i = 0; i < 100; i++)
    {
        s[i].gpa = 0.0;
    }
    //getting number of students
    int noOfStudents = get_info(s, s_size);

    //finding gpa for students entered
    for (int i = 0; i < noOfStudents; i++) 
    {
        s[i].gpa = get_gpa(s[i]);
    }

    //displaying the student details
    cout << "\nList of students entered:";
    display(s, noOfStudents);

    //sorting by name
    cout << "\nList of students sorted by name:";
    sort_name(s, noOfStudents);
    display(s, noOfStudents);

    //searching for a student
    cout << "\nEnter a student name to search for:\n";
    getline(cin, search);
    int result = search_name(s, 0, noOfStudents - 1, search);
    if (result == -1)
        cout << "Student not found\n";

    else 
    {
        cout << "\nStudent: " << s[result].name << "\n";
        for (int j = 0; j < s[result].numClasses; j++) 
        {
            cout << s[result].c[j].name << "," << s[result].c[j].units << " units, Grade " << s[result].c[j].grade << "\n";
        }
        cout << "GPA: " << setprecision(2) << s[result].gpa << "\n";
    }

    //sorting by gpa
    cout << "\nList of students sorted by GPA:";
    sort_gpa(s, noOfStudents);
    display(s, noOfStudents);


    return 0;
}