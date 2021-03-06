
class Student{
    private String studentname;
    private String subId;
    private String name;
    private int maxMarks;
    private int marksObtain;

    //we create a non- parametrised constructor in java 
    public Student(String studentname,String subId, String name, int maxMarks, int marksObtain){
        this.studentname = studentname;
        this.subId = subId;
        this.name = name;
        this.maxMarks = maxMarks;
        this.marksObtain = marksObtain;
    }
    public String getstudentName(){return studentname;}
    public String getSubID(){return subId;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtains(){return marksObtain;}

    public void setMaxMarks(int mm)
    {
        maxMarks=mm;
    }
    
    public void setMarksObtain(int m)
    {
        marksObtain=m;
    }

    // methods
    public boolean isQualified(){
        return marksObtain>=maxMarks/10*4;
    }

    public String toString(){
        return"\n Student name : "+studentname+"\n SubjectID : "+subId+"\n Name : "+name+"\n maxMarks : " + maxMarks+"\n MarksObtained : "+marksObtain +"\n Result : " + isQualified();
    }
    
}

public class Student_ArraysOfObjects {
    public static void main(String[] args) {
        //impliments of the arrays 
        Student subs[] = new Student[3];
        subs[0] = new Student("prashant kumar","s101","dataStructure",100,90);
        subs[1] = new Student("Aman kumar","s102","Maths",100,84);
        subs[2] = new Student("Rahul kumar","s109","Operatings ",100,96);

        for(Student s : subs){
            System.out.println(s);
        }
    }

}

//!<--------------- Output is ------------------------------>
/*
Student name : prashant kumar
 SubjectID : s101
 Name : dataStructure
 maxMarks : 100
 MarksObtained : 90
 Result : true
--------------------------------------------------------------------------------------------
 Student name : Aman kumar
 SubjectID : s102
 Name : Maths
 maxMarks : 100
 MarksObtained : 84
 Result : true
--------------------------------------------------------------------------------------------
 Student name : Rahul kumar
 SubjectID : s109
 Name : Operatings 
 maxMarks : 100
 MarksObtained : 96
 Result : true
*/
