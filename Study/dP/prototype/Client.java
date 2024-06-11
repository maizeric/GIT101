package designpatterns.prototype;

public class Client {

    public static void fillRegistry(StudentRegistry registry){
        Student sept22Prototype = new Student();
        sept22Prototype.setBatchName("Sept22");
        sept22Prototype.setAvgPSP(85);
        registry.register("Sept22",sept22Prototype);

        IntellijStudent sept22IntellijStudentPrototype = new IntellijStudent();
        sept22IntellijStudentPrototype.setBatchName("Sept22");
        sept22IntellijStudentPrototype.setAvgPSP(85);
        registry.register("Sept22Intellij" , sept22IntellijStudentPrototype);
    }

    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        fillRegistry(registry);
        Student vipul = registry.get("Sept22").clone();
        vipul.setName("Vipul");
        vipul.setAge(25);
        vipul.setPsp(90);

        Student bijit = registry.get("Sept22").clone();
        bijit.setName("Bijit");
        bijit.setAge(26);
        bijit.setPsp(92);

        Student pooja = registry.get("Sept22Intellij").clone();
        pooja.setName("Pooja");
        pooja.setAge(26);
        pooja.setPsp(92);

        System.out.println("DEBUG");
    }
}
