abstract class Person{
    String firstName;
    String lastName;
    int age;
}

class Instructor extends Person{
    String courseTeaching;
    float salary;

    // instructor constructor
    public Instructor(String ifirstName, String ilastName, int iage, String icourseTeaching, float isalary ){
        firstName = ifirstName;
        lastName =  ilastName;
        age = iage;
        courseTeaching = icourseTeaching;
        salary = isalary;
    }
}
class Student extends Person{
    String id;
    String courseTaking;
    String major;

    //student instructor
    public Student(String sfirstName, String slastName, int sage, String sid, String scoursetaking, String smajor){
        firstName = sfirstName;
        lastName = slastName;
        age = sage;
        id = sid;
        courseTaking = scoursetaking;
        major = smajor;
    }
}


