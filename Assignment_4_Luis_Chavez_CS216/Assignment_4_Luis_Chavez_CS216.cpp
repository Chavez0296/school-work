// Assignment_4_Luis_Chavez_CS216.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <string>
#include <iomanip>
using namespace std;

class Class {
    string title;
    int units;
    char grade;
public:
    Class() {
        title = "";
        units = 0;
        grade = '-';
    }
    ~Class() {

    }

    string getTitle() {
        return title;
    }

    int getUnits() {
        return units;
    }

    char getGrade() {
        return grade;
    }

    friend ostream& operator<<(ostream& out, const Class& c) {
        out << "Title: " << c.title << " Units: " << c.units << " Grade: " << c.grade;
        return out;
    }

    friend istream& operator>>(istream& in, Class& c) {
        cout << "Title: ";
        in >> c.title;
        cout << "Units: ";
        in >> c.units;
        cout << "Grade:(A, B, C, D, F) ";
        in >> c.grade;
        return in;
    }

};

class Student {
    string name;
    double gpa;
    int numOfClasses;
    Class* classPtr;
public:
    Student() {
        name = "";
        gpa = 0.0;
        numOfClasses = 0;
        classPtr = NULL;
    }
    
    ~Student() {
        delete[] classPtr;
    }
  
   virtual void read() {
       cout << "Enter Student Name: ";
       cin.ignore();
       getline(cin, name);
       cout << "Enter number of classes taken: ";
       cin >> numOfClasses;

       classPtr = new Class[numOfClasses];

       for (int i = 0; i < numOfClasses; ++i) {
           cout << "Entering class " << i + 1 << ":\n";
           cin >> classPtr[i];
       }

       gpa = calc_gpa();

   }

    double calc_gpa() {
        int unitXgp = 0, unitSum = 0;

        for (int i = 0; i < numOfClasses; ++i) {
            unitXgp += classPtr[i].getUnits() * (4 - classPtr[i].getGrade() % 'A');
            unitSum += classPtr[i].getUnits();
        }

        return 1.0 * unitXgp / unitSum;
    }

    double get_gpa() {
        return gpa;
    }

    virtual void print() {
        cout << "\nStudent Name: " << name << "\nGPA: " << gpa << "\nClasses:\n";

        for (int i = 0; i < numOfClasses; ++i) {
            cout << classPtr[i] << "\n";
        }
        cout << endl;
        
    }

};

class StudentWorker : public Student {
    int weeklyHours;
    double hourlyRate;
public:
    StudentWorker() {
        
        weeklyHours = 0;
        hourlyRate = 0.0;
        
    }

    void read() {
        Student::read();
        cout << "Enter weekly hours: ";
        cin >> weeklyHours;
        cout << "Enter hourly rate: ";
        cin >> hourlyRate;
    }

    void print() {
        Student::print();
        cout << "Weekly Hours: " << weeklyHours << "\nHourly Rate: " << fixed << setprecision(2) << hourlyRate << "\n" << "Wages: " << weeklyHours * hourlyRate << "\n";
    }

    ~StudentWorker();
   
};

int main() {

    Student* stu[70];
    int curr = 0;

    char ch, w;

    cout << "Do you want to enter a student? (y/n) ";
    cin >> ch;

    while (curr < 70 && (ch == 'y' || ch == 'Y')) {

        cout << "Is he/she a student worker? (y/n) ";
        cin >> w;

        if (w == 'y' || w == 'Y')
            stu[curr] = new StudentWorker();
        else
            stu[curr] = new Student();

        stu[curr]->read();
        
        stu[curr]->print();
        cout << "\n";

        curr++;

        cout << "Do you want to enter more? (y/n) ";
        cin >> ch;
    }

    double gpaSum = 0.0;
    cout << "List of Students:\n " << endl;
    for (int i = 0; i < curr; ++i) {
        stu[i]->print();
        gpaSum += stu[i]->get_gpa();
        cout << endl;
    }

    cout << "Average GPA = " << 1.0 * gpaSum / curr << "\n";

    return 0;
}

// Run program: Ctrl + F5 or Debug > Start Without Debugging menu
// Debug program: F5 or Debug > Start Debugging menu

// Tips for Getting Started: 
//   1. Use the Solution Explorer window to add/manage files
//   2. Use the Team Explorer window to connect to source control
//   3. Use the Output window to see build output and other messages
//   4. Use the Error List window to view errors
//   5. Go to Project > Add New Item to create new code files, or Project > Add Existing Item to add existing code files to the project
//   6. In the future, to open this project again, go to File > Open > Project and select the .sln file

StudentWorker::~StudentWorker()
{
}
