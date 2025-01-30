package Prototype;

/* prototype design pattern is used to create copy or clone object
  we need to add one method like clone which clone existing object and
   also copy if any existing private field is there
 */
public class Student implements Prototype{

    public String name;
    private int id;
    public Student(String name,int id){
        this.name=name;
        this.id=id;
    }
    public Prototype clone(){
        return new Student(name,id);
    }
}
