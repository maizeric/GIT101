package designpatterns.prototype;

public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private int psp;
    private String batchName;
    private double avgPSP;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPsp() {
        return psp;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public double getAvgPSP() {
        return avgPSP;
    }

    public void setAvgPSP(double avgPSP) {
        this.avgPSP = avgPSP;
    }

    @Override
    public Student clone() {
        Student stCopy = new Student();
        stCopy.setAvgPSP(this.avgPSP);
        stCopy.setBatchName(this.batchName);
        return stCopy;
    }
}
