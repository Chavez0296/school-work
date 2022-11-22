// Assignment_1_Chavez _Luis.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <string>
#include <cstring>
#include <cstdio>
#include <stdlib.h>
#include <iomanip>
#include <conio.h>
#include "courses.h"

void add(Course* [], int);
void sort(Course* [], int);
int binarySearch(Course* [], string, int);
void display(Course* [], int);
void Delete(Course* [], int&);
using namespace std;
int main()
{
	const int arraySize = 10;
	Course* coursePtr[arraySize] = { NULL };

	int choice,courseCounter = 0;
	string courseSearch;
	int position;

	do {
		//Menu//
		cout << "1. Add new course\n" << "2. Edit an existing course\n" << "3. Display a course\n" << "4. List all courses\n" << "5. Display GPA\n" << "6. Delete all couses\n" << "7. Quit\n";
		cout << "Enter selection: ";  
		cin >> choice; //user input
		// Selection //
		switch (choice) {
		case 1:
			add(coursePtr, courseCounter);
			courseCounter++;				//Adding a course to Course array
			break;
		case 2:
			coursePtr[arraySize-1]->edit(coursePtr, courseCounter);  //Accessing course array to modify by pointing to edit function//
			break;
		case 3:
			if (courseCounter == 0) {
				cout << "\nNo courses available.";
			}
			else {
				sort(coursePtr, courseCounter);
				cout << "Enter course to find: ";
				cin.ignore();
				getline(cin, courseSearch);

				if (islower(courseSearch[0])) {
					courseSearch[0] = toupper(courseSearch[0]);
				}
				for (int i = 0; i < courseSearch.length()-1; i++) {
					if (courseSearch[i] == ' ') {
						courseSearch[i + 1] = toupper(courseSearch[i + 1]);
					}
				}
				position = binarySearch(coursePtr, courseSearch, courseCounter);

				if (position == -1) {
					cout << "\nCourse was not found.";
				}
				else
				{
					for (int i = 0; i < courseCounter; i++) {
						cout << endl;
						if (position == i) {
							display(coursePtr, i);
						}
					}
				}
			}
			break;
		case 4:
			if (courseCounter == 0) {
				cout << "\nNo courses available.";
			}
			else {
				sort(coursePtr, courseCounter);
				cout << endl;
				for (int i = 0; i < courseCounter; i++) {
					display(coursePtr, i);
					cout << endl;
				}
			}
			break;
		case 5:
			coursePtr[courseCounter]->displayGPA(coursePtr, courseCounter);
			break;
		case 6:
			Delete(coursePtr, courseCounter);
			cout << "All courses deleted!";
		case 7:
			Delete(coursePtr, courseCounter);
		}

		cout << endl;





	} while (choice != 7);

	return 0;
}
