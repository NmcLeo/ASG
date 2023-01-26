import java.util.ArrayList;
import java.io.File; 
import java.io.FileWriter; 
import java.io.IOException;

public class main{

  static Instructor Bob = new Instructor("Bob", "Sponge", 50, "cmptxxx", 5000);
  static Instructor Star = new Instructor("Star", "Patrik", 51, "cmptyyy", 5000);
  static Student Trump = new Student("Trump", "Donald", 20, "23234534", "cmptxxx", "English");
  static Student Biden = new Student("Biden", "Joe", 20, "13214334", "cmptxxx", "English");
  static ArrayList<Person> personList = new ArrayList<Person>();
  
  public static void main(String args[]){
    personList.add(Bob);
    personList.add(Star);
    personList.add(Trump);
    personList.add(Biden);
    try {
      // create file and write to it
      FileWriter writer = new FileWriter("output.txt"); 
      int count =0; 
      for(Person person: personList) {

        // person attributes
        String str = person.firstName + " " + person.lastName + " " + person.age + " ";
        //Instructors
        if (count < 2){
          float s = ((Instructor)person).salary;
          str = str +  ((Instructor)person).courseTeaching + " " + String.valueOf(s);
        }
        //students
        else{
          str = str +  ((Student)person).id + " " +((Student)person).courseTaking + " " + ((Student)person).major;
        }
        count++;
        writer.write(str + System.lineSeparator());
      }
      writer.close();
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
    
