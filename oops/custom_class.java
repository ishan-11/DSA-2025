// creating a custom class
// creating a class
// creating a class with a method
//in one java file only one public class is allowed
// This is a simple Java program demonstrating a custom class
public class custom_class{
public static void main(String[] args){
    Employee ishan = new Employee();// instantiating a new employee object
    Employee ishan1 = new Employee();// instantiating a new employee object
    // setting the properties of the employee object
    // using the dot operator to access the properties of the object
    // and assigning values to them
  //settiing the attributes of the object
    ishan.id = 1;
    ishan.name = "ishan";
    ishan1.id = 2;
    ishan1.name = "ishan1";
    // printing the properties of the employee object
    // System.out.println(ishan.id);
    // System.out.println(ishan.name);
    // calling the display method of the employee object
    ishan.display();
    ishan1.display();
      // calling the display method of the employee object
}
}

// Employee class defined outside the custom_class
class Employee {
    int id;
    String name;
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}