package tdd.calculator.App;
public class App 
{
    public static boolean isValidUserName(String name){
        return name.matches("^[a-zA-Z0-9]+$");
    }
}