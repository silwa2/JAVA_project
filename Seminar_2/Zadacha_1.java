
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;

class Main{
    public static void main(String[] args) {

        Equation();
    }

    public static String GetString()
    {
        Scanner str = new Scanner(System.in);
        String equation;
        System.out.print("Enter function f(x):  ");
        equation = str.nextLine();
        return equation;

    }
    public static void Equation()
    {

        Map<String, Integer> states = new HashMap<String, Integer>();

        states.put("0", 0);
        Scanner str = new Scanner(System.in);
        // a + b + c + d + c
        String equation = GetString();
        equation = String.format(equation).replace(" ","");
        String[] st1 = equation.split("\\+");
        int sum = 0;
        for (int i = 0; i < st1.length; i++ )
        {
            System.out.print("Enter number: ");
            for(Map.Entry<String, Integer> item : states.entrySet())
            {
                if(item.getKey() != st1[i])
                {
                    states.put(st1[i], str.nextInt());
                    break;
                }
            }
            states.remove("0");
        }
        System.out.println(states.entrySet());

        for(Map.Entry<String, Integer> item : states.entrySet())
        {
            sum += item.getValue();
        }

        System.out.print("Summa function f(x) =  "+sum);
    }
}
