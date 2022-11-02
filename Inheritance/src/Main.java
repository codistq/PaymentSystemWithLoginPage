public class Main {
    public static void main(String[] args) {
        Workers w1 = new Workers("John Smith", "+122255588", "john@smith.com");
        Academician a1 = new Academician("Ted mosby","+14448885","ted@mosby.com","ARC","Professor");
        a1.Exited();
        a1.intoStudy();
        System.out.println(w1.getFullname());
        Ofiicer o1 = new Ofiicer("Paul walker","+12225556","paul@walker.com","Officer","9AM - 18 PM");
        o1.worked();
        Lecturer l1 = new Lecturer("Lily Aldrin","+1445885240","lily@aldrin.com","TEC","DOC.","105");
        l1.doExam();


    }
}