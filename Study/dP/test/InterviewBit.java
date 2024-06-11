package designpatterns.test;

class InterviewBit{
    int i;
    {
        System.out.println(" Instance Block 1. Value of i = "+i);
    }
    {
        i = 5;
    }
    InterviewBit(){
        System.out.println(" Welcome to InterviewBit ");
    }
    public static void main(String[] args){
        InterviewBit ib = new InterviewBit();
    }
    public void method_1(){
        System.out.println(" Instance method. ");
    }
    {
        System.out.println(" Instance Block 2. Value of i = "+i);
        method_1();
    }
}