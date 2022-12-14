/*
Task
Given a Book class and a Solution class, write a MyBook class that does the following:

* Inherits from Book
* Has a parameterized constructor taking these 3 parameters:
1-string 
2-string 
3-int 
*Implements the Book class' abstract display() method so it prints these 3 lines:
1-Title:, a space, and then the current instance's title.
2-Author:, a space, and then the current instance's author.
3-Price, a space, and then the current instance's price.

Input Format

You are not responsible for reading any input from stdin. 
The Solution class creates a Book object and calls the MyBook class constructor (passing it the necessary arguments). 
It then calls the display method on the Book object.

Output Format

The void display() method should print and label the respective title, author, and price of the MyBook object's instance (with each value on its own line) like so:

Title: $title
Author: $author
Price: $price

Sample Input

The following input from stdin is handled by the locked stub code in your editor:

The Alchemist
Paulo Coelho
248

Sample Output

The following output is printed by your display() method:

Title: The Alchemist
Author: Paulo Coelho
Price: 248
*/

using System;
using System.Collections.Generic;
using System.IO;
abstract class Book
{

    protected String title;
    protected String author;

    public Book(String t, String a)
    {
        title = t;
        author = a;
    }
    public abstract void display();


}

//Write MyBook class

class MyBook : Book
{
    private int price;

    public MyBook(String title, String author, int price) : base(title, author)
    {
        this.price = price;
    }

    public override void display()
    {
        Console.Write("Title: {0} \nAuthor: {1} \nPrice: {2}", title, author, price);
    }
}

class Solution
{
    static void Main(String[] args)
    {
        String title = Console.ReadLine();
        String author = Console.ReadLine();
        int price = Int32.Parse(Console.ReadLine());
        Book new_novel = new MyBook(title, author, price);
        new_novel.display();
    }
}