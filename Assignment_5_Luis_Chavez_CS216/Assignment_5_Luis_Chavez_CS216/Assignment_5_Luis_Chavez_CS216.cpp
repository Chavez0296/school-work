// Assignment_5_Luis_Chavez_CS216.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <string>

using namespace std;

class Student {
    
public:
    string name;
    double gpa;
    Student(string name = " " , double gpa = 0.0);
    Student(const Student& stu); //stu1 = stu2
    
    string get_name();
    double get_gpa();
    virtual void read();
    virtual void print();
    Student& operator=(const Student& stu); //assignment operator overloaded
    bool operator!=(const Student& stu) const;
    friend ostream& operator<<(ostream& output, const Student &stu); //prints Student info
    friend istream& operator>>(istream &input, Student &stu); //reads Student info
    ~Student();
    
};
ostream& operator<<(ostream& output, const Student& stu)
{
    output << "\nStudent: " << stu.name << endl;
    output << "GPA: " << stu.gpa << endl;
    return output;
}
istream& operator>>(istream& input, Student& stu) {
    cout << "Enter student name: ";
    cin.ignore();
    getline(input, stu.name);
    cout << "\nEnter student gpa: ";
    input >> stu.gpa;
    return input;
}
Student::Student(string n, double g) {
    name = n;                       //setter
    gpa = g;                      //constructor;
}
string Student::get_name() {
    return name;
}
double Student::get_gpa() {
    return gpa;
}

 void Student::read() {
    cin >> *this;

}
void Student::print() {
    
    cout << *this;
}
Student::Student(const Student& stu){
    Student tmp;
    tmp.name = stu.name;
    tmp.gpa = stu.gpa;
    *this = tmp;
    //copy constructor
}
Student& Student::operator=(const Student& stu) {
    if (this != &stu)
        name = stu.name;                       //setter
         gpa = stu.gpa;   //copy checkpoint
    return *this;
}
bool Student::operator!=(const Student& stu) const
{
    return false;
}
Student::~Student() {
    
}
class Employee {

  
public:
    int id;
    double salary;
    Employee(int id = 0, double salary = 0.0);
    Employee(const Employee& emp); //emp1 = emp2

    int get_id();
    double get_salary();
    virtual void read();
    virtual void print();
    Employee& operator=(const Employee& emp); //assignment operator overloaded
    bool operator!=(const Employee& emp) const;
    friend ostream& operator<<(ostream& output, const Employee& emp); //prints Employee info
    friend istream& operator>>(istream& input, Employee& emp); //reads Employee info
    ~Employee();
};
ostream& operator<<(ostream& output, const Employee& emp)
{
    cout << "\nID: ";
    output << emp.id;
    cout << "\nSalary: ";
    output << emp.salary;
    return output;
}
istream& operator>>(istream& input, Employee& emp) {
    cout << "Enter Employee's ID: ";
    input >> emp.id;
    cout  << "Enter Employee's salary: ";
    input >> emp.salary;
    return input;
}
Employee::Employee(int d, double s) {
    id = d;                       //setter
    salary = s;                     //constructor;
}
int Employee::get_id() {
    return id;
}
double Employee::get_salary() {
    return salary;
}
void Employee::read()
{
    cin >> *this;
}
void Employee::print()
{
    cout << *this;
}

Employee::Employee(const Employee& emp) {

    Employee temp;
    temp.id = emp.id;   //copy constructor
    temp.salary = emp.salary;
    *this = temp;
    
}
Employee &Employee::operator=(const Employee& emp) {
    if (this != &emp)
        id = emp.id;                       //setter
    salary = emp.salary;  //copy checkpoint
    return *this;
}

bool Employee::operator!=(const Employee& emp) const
{
    return false;
}
Employee::~Employee() {

}
template <typename T> 
class List
{
protected:
    int size;
    T* ptr;

public:
    List() {
        size = 0;
        ptr = NULL;
    }
     List(int s) {
        if (s < 1) { 
            cout << "\nMinimum size is 1.  Size set to 1." << endl; 
            size = 1; 
        }
        else
            size = s; 
        ptr = new T[size];
    }   
    List(const List& l) : size(l.size) //copy constructor used to initialize a List object using an existing List object
    { //this creates the new object with l.size elements
        ptr = new T[l.size];
        for (int i = 0; i < l.size; i++) //now copy elements
            ptr[i] = l.ptr[i];
    }//copy constructor
     int get_size() const {
        return size;
    }
     void set(T* p, int s) {
        if (size > 0) { 
            size = s; 
            delete[] ptr; 
            ptr = new T[size]; 
            for (int i = 0; i < size; i++)
                ptr[i] = p[i];
        }
        else { 
            cout << "\nError!  Size cannot be less than 1."; 
            exit(1); 
        }

    }
      void read() {
        for (int i = 0; i < size; i++)
            cin >> ptr[i];
    }
     void print() const {
         for (int i = 0; i < size; i++)
             cout << ptr[i];
        cout << endl;
    }//display a range
     const List<T>& operator=(const List<T>& l) {
        if (&l != this) {
            if (size != l.size) { 
                delete[] ptr; 
                size = l.size; 
                ptr = new T[l.size]; 
            }
            for (int i = 0; i < l.size; i++)
                ptr[i] = l.ptr[i];
        }
        return *this;
        
    }//overloaded assignment operator used to assign list l to list
     
     ~List() {
         delete[] ptr;
            size = 0;
            ptr = NULL;
     }
};

class StudentWorker : public Student, public Employee {
    virtual void read();
    virtual void print();
    friend ostream& operator<<(ostream& output, const StudentWorker& stuwrkr); //prints StudentWorker info
    friend istream& operator>>(istream& input, StudentWorker& stuwrkr); //reads StudentWorker info
};
ostream& operator<<(ostream& output, const StudentWorker& stuwrkr)
{
    
    cout << "\nID: ";
    output << stuwrkr.id;
    cout << "\nSalary: ";
    output << stuwrkr.salary;
    output << "\nStudent: " << stuwrkr.name << endl;
    output << "GPA: " << stuwrkr.gpa;
    return output;
}
istream& operator>>(istream& input, StudentWorker& stuwrkr) {
    cout << "Enter Employee's ID: ";
    input >> stuwrkr.id;
    cout << "\nEnter Employee's salary: ";
    input >> stuwrkr.salary;
    cout << "Enter student name: ";
    cin.ignore();
    getline(input, stuwrkr.name);
    cout << "\nEnter student gpa: ";
    input >> stuwrkr.gpa;
    return input;
}
void StudentWorker::read() {
    Employee::read();
    Student::read();
}
void StudentWorker::print() {
    Employee::print();
    cout << " , ";
    Student::print();
}
int main()
{
    List<Employee> employee_list(3);
    List<Student> student_list(3);
    List<StudentWorker> student_workerList(2);
    cout << "Created 10 staff. The following are the first 3: " << endl;
    employee_list.print();
  
    cout << "Created 100 Students. The following are the first 3: " << endl;
    student_list.print();
    cout << "Created 10 Student Wrokers. The following are the first 2: " << endl;
    student_workerList.print();

    cout << "\nEnter the ID and Salary of 3 employees: " << endl;
    employee_list.read();
    cout << "\nEnter the name and GPA of the Students: " << endl;
    student_list.read();
    cout << "\nEnter ID, salary, name and GPA for Student Workers: " << endl;
    student_workerList.read();

    cout << "\nStaff list: " << endl;
    employee_list.print();
    cout << "\nStudents list: " << endl;
    student_list.print();
    cout << "\nList of Student Workers: " << endl;
    student_workerList.print();

    cout << "\nCreated helpers list: " << endl;
    List<StudentWorker> student_helper(student_workerList);
    student_helper.print();
    cout << "\nCreated instructors List: " << endl;
    List<Employee> instructor(3);
    instructor.print();
    instructor = employee_list;
    cout << "\nInstructors list after copying from Staff: " << endl;
    instructor.print();
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
