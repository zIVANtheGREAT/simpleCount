/*
    This program is just for practicing
    the chapter 2 Java Challenges in
    Starting out with Java book
 */

public class Simple_Count
{
    static int sum(int x, int y)
    {
        return x+y;
    }

    public static void main(String[] args)
    {
        //Declarations
        //-----Used for nameAgeSalary method
        String name;
        int age;
        double salary;

        //Initialization
        name = "Larry the Lobster";
        age = 34;
        salary = 59345.50;

        //This will call the nameAgeSalary method in the summer class.
        System.out.println(summer.nameAgeSalary(name, age, salary));
        //This will call the starPattern method in the summer class
        System.out.println(summer.starPattern());

        System.out.println(sum(3, 4));
        System.out.println("Hello. Let the code begin.");
        System.out.println(summer.sum(4, 34));
        System.out.println(summer.diff(34, 23));


        double x = 0.0;
        int count = 0;

        while(x<2)
        {
            count += 1;
            x += 0.2;
        }

        System.out.println(x);
        System.out.println(count);

    }

}
