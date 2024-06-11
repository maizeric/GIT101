package designpatterns.builder;

public class Student {
    private String name;
    private int age;
    double psp;
    String universityName;
    long id;
    int gradYear;
    String phoneNumber;

    //Builder class is the inner class fo Student
    //made this class static because getBuilder() is static method hence it can return only static variable
    static class Builder {
        private String name;
        private int age;
        double psp;
        String universityName;
        long id;
        int gradYear;
        String phoneNumber;
        private Builder(){

        }
        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public long getId() {
            return id;
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    Student(Builder builder){
        //Validations start
        if(builder.gradYear>2022){
            throw new IllegalArgumentException("Grad Year cant be greater than 2022");
        }
        //Validations end
        this.name = builder.getName();
        this.age = builder.getAge();
        this.gradYear = builder.getGradYear();
    }
}
