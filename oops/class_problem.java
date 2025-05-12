class Solution {
   int salary;
    String name;
    public int getSalary() {
        return salary;
    }
    public void setSalary(int s) {
        salary = s;
    }

    public String getName() {
        return name;
    }
    public void setName(String n){

        name = n;
    }

}


class cellphone{
    public void call(){
        System.out.println("calling");
    }
    public void message(){
        System.out.println("sending message");
    }
    public void camera(){
        System.out.println("taking photo");
    }
    public void video(){
        System.out.println("taking video");
    }
    public void internet(){
        System.out.println("using internet");
    }
    public void music(){
        System.out.println("playing music");
    }
}


public class class_problem {
    public static void main(String[] args)
    {
        Solution ishan = new Solution();
         ishan.setName("ishan kr");
         ishan.salary = 100000;
            ishan.setSalary(400000);
         System.out.println(ishan.getName() + " " + ishan.getSalary());

         cellphone apple = new cellphone();
         apple.call();
         apple.message();
         apple.camera();
         apple.video();
         apple.internet();
         apple.music();



    }
    
}
