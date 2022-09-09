/*
You are given two classes, Person and Student, where Person is the base class and Student is the derived class. 
Completed code for Person and a declaration for Student are provided for you in the editor. Observe that Student inherits all the properties of Person.

Complete the Student class by writing the following:

A Student class constructor, which has 4 parameters:
A string, firstName .
A string, lastName .
An integer, idNumber .
An integer array (or vector) of test scores, scores.
A char calculate() method that calculates a Student object's average and returns the grade character representative of their calculated average:

Grading Scale

Letter - Average

O - 90<= a <= 100
E - 80<= a < 90
A - 70<= a < 800
P - 55<= a < 700
D - 40<= a < 55
T - a < 40

Sample Input

Heraldo Memelli 8135627
2
100 80

Sample Output

 Name: Memelli, Heraldo
 ID: 8135627
 Grade: O
*/

using System;
using System.Linq;

class Person{
	protected string firstName;
	protected string lastName;
	protected int id;
	
	public Person(){}
	public Person(string firstName, string lastName, int identification){
			this.firstName = firstName;
			this.lastName = lastName;
			this.id = identification;
	}
	public void printPerson(){
		Console.WriteLine("Name: " + lastName + ", " + firstName + "\nID: " + id); 
	}
}

class Student : Person{
    private int[] testScores;  
    
    public Student(string firstName, string lastName, int id, int[] testScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.testScores = testScores;
    }
    
    public string Calculate(){
        var avg = testScores.Average();
        return GradingScale(avg);
    }  
    
    private string GradingScale(double avg){
        if(90 <= avg && avg <= 100)
            return "O";
        if(80 <= avg && avg < 90)
            return "E";
        if(70 <= avg && avg < 80)
            return "A";
        if(55 <= avg && avg < 70)
            return "P";
        if(40 <= avg && avg < 55)
            return "D";
        return "T";
    }
}

class Solution {
	static void Main() {
		string[] inputs = Console.ReadLine().Split();
		string firstName = inputs[0];
	  	string lastName = inputs[1];
		int id = Convert.ToInt32(inputs[2]);
		int numScores = Convert.ToInt32(Console.ReadLine());
		inputs = Console.ReadLine().Split();
	  	int[] scores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			scores[i]= Convert.ToInt32(inputs[i]);
		} 
	  	
		Student s = new Student(firstName, lastName, id, scores);
		s.printPerson();
		Console.WriteLine("Grade: " + s.Calculate() + "\n");
	}
}