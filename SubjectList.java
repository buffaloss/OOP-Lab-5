public class SubjectList extends Entity {
    
    public String exist() {
        String existence = "Exists";
        return existence;
    }
    public String subjectName;
    SubjectList(String SubjectName){
        subjectName =SubjectName;
    }

    void outputSubjectList(){
        System.out.println(subjectName);
    }
}
