class circlee
{
    double radius;
    void calculateArea()
    {
        double area =Math.PI*radius*radius;

    System.out.println("area of circle=" + area);
    }
    void calculateCircumference()
    {
        double circumference = 2*Math.PI*radius;

        System.out.println("circumference of circle =" + circumference);
    }
    public static void main(String[] args)
    {
        circlee c = new circlee();
        c.radius=5;
        c.calculateArea();
        c.calculateCircumference();
    }
}