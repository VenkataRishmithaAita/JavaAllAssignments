package singleton;

public class StaticAndNonStatic {
    String non_static_string;
    public void printString()
    {
        System.out.print("String is "+non_static_string);
    }
  /* public static StaticAndNonStatic getObjects(String string_parameter)
    {
        StaticAndNonStatic nonstatic_object = new StaticAndNonStatic();
        nonstatic_object.non_static_string=string_parameter;
        return nonstatic_object;
    }
*/
}
