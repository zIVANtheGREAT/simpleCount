public class summer
{
    static int sum(int x, int y)
    {
        return x+y;
    }

    static int diff(int x, int y)
    {
        return x - y;
    }

    /**This method will display and return:
     @param str the name of the person
     @param age age of the person
     @param sal desired salary
     @return A string containing the variables
     with a sentence.
     */

    static String nameAgeSalary(String str, int age, double sal)
    {
        return "My name is " + str + ", my age is " + age +
                " and I hope to earn $" + sal + " per year";
    }

    /**This method will output a star pattern
     * @return the star pattern
     */

    static String starPattern()
    {
        return "     *\n" +
                "    ***\n" +
                "   *****\n" +
                "  *******\n" +
                "   *****\n" +
                "    ***\n" +
                "     +";

    }
}
