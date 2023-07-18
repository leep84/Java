public class MyClass {
    public static void main(String[] args){
        System.out.println("This is a Java course");
        System.out.println(methodOne());
        System.out.println((methodName("Lee")));
        MyClass runner = new MyClass();
        String myVar = "shrek";
        System.out.println((runner.myMethod(myVar)));
    }

    public static String methodOne(){
        return "This is th first day of the Java course!";
    }

    public static String methodName(String userInput){
        return "Hello, my name is " + userInput;
    }

    public String myMethod( String input){
        return "My favourite film is" +input;
    }

}
