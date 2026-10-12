class Student
{
    String name;
    int rollNo;
    int age;

    void display()
    {
        System.out.println("name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Age: " + age);
    }
    public static void main(String[]args)
    {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "bhagyashree";
        s1.rollNo = 1;
        s1.age = 19;

        s2.name = "shakuntala";
        s2.rollNo = 2;
        s2.age = 18;

        s1.display();
        s2.display();
    }
}