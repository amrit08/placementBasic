package string;
public class StringBasics
{
    public static void main(String[] args)
    {
        String name = "Amritjslka";
        String a= name+"sdkf";
        System.out.println(a);
        String sameName = "Amrit";
        String newName = new String("Amrit");
        System.out.println(name);
        System.out.println(newName);

        if(name == sameName)
        {
            System.out.println("Both are same");

        }

        if (name == newName)
        {
            System.out.println("Botha re same");

        }
        else
        {
            System.out.println("Both are not same");
        }
        if (name.equals(newName))
        {
            System.out.println("name and new name are same values");

        }
        else
        {
            System.out.println("not same +++++++++++");
        }
    }
}
