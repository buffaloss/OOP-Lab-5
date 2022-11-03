import java.util.ArrayList;

public class Curriculum extends SubjectList{

    public String exist() {
        String existence = "Exists";
        return existence;
    }

    public ArrayList<String> subject;

    Curriculum(String SubjectName){
        super(SubjectName);
        subject = new ArrayList<>();
        subject.add("Mathematics");
        subject.add("English language");
        subject.add("Romanian language");
        subject.add("History");
        subject.add("Biology");
        subject.add("Chemistry");
        subject.add("Physics");
        subject.add("Informatics");
        subject.add("Physical Education");
        subject.add("Arts");
        subject.add("Geography");

    }

    void outputSubjects() {
        System.out.println();
        for (int i = 0; i<subject.size();i++){
            System.out.println(subject.get(i));
        }
        System.out.println();

    }
}