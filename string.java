class Main
{
    // Reverse a string in Java using String Concatenation operator
    public static String reverse(String str)
    {
        // return if string is null or empty
        if (str == null || str.equals(""))
            return str;
 
        // variable to store the reversed string
        String rev = "";
 
        // use string concatenation operator to build reversed string by
        // reading character from the end of the original string
        for (int i = str.length() - 1; i >=0 ; i--)
            rev += str.charAt(i);
 
        return rev;
    }
 
    public static void main (String[] args)
    {
        String str = "Reverse me!";
 
        str = reverse(str);        // string is immutable
 
        System.out.println("Reversed string is: " + str);
    }
}