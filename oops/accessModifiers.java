// in this we will learn about access modifiers and constructors
// access modifiers are used to set the visibility of classes, methods, and variables
// there are four types of access modifiers in java
// 1. public - accessible from anywhere
// 2. private - accessible only within the class
// 3. protected - accessible within the package and subclasses
// 4. default - accessible only within the package
class myEmployee{
    private  int id;
    private String name;   
    
    // constructor
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
}

public class accessModifiers {
    public static void main(String[] args)
    {
        myEmployee ishan = new myEmployee();
        // ishan.id = 1;
        // ishan.name = "ishan";
        // System.out.println(ishan.id);
        // System.out.println(ishan.name); // this will give an error due to private access modifier

        ishan.setId(1);
        ishan.setName("ishan kumar");
        System.out.println(ishan.getId());
        System.out.println(ishan.getName());
    }
    
}
