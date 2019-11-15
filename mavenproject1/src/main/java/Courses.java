



public class Courses {
    int id;
    String name;
    char exam;

    Courses(int id, String name, char exam) {
        this.id = id;
        this.name = name;
        this.exam = exam;
    }
    
 public String toString() {
    return id+" "+name+" "+exam;
}
    Courses() {
    }
    
    public String printProgramm(){
        
        String sA="<html>Exam A :<br><html>";
        String sB="<html>Exam B :<br><html>";
        String sC="<html>Exam C :<br><html>";
        String sE="<html>Exam E :<br><html>";
         /* for(Courses lesson: list){
              switch(lesson.exam){
              
                case 'A':
                      sA+=lesson.id+"\t"+lesson.name+"\t"+lesson.exam+"<br>";
                      break;
                case 'B':
                      sB+=lesson.id+"\t"+lesson.name+"\t"+lesson.exam+"<br>";
                      break;
                case 'C':
                      sC+=lesson.id+"\t"+lesson.name+"\t"+lesson.exam+"<br>";
                      break;
                case 'E':
                      sE+=lesson.id+"\t"+lesson.name+"\t"+lesson.exam+"<br>";
                      break;
              }
          }*/
    return sA+"<br>"+sB+"<br>"+sC+"<br>"+sE+"<br>";
        }
}
