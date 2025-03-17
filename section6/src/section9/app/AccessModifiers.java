package section9.app;

public class AccessModifiers {

    // public access modifier is accessible from anywhere
    public String publicString = "publicString";
    // protected access modifier is accessible within the package and subclasses
    protected String protectedString = "protectedString";
    // default access modifier is only accessible within the package
    String defaultString = "defaultString";
    // private  access modifier is only accessible within the class
    private String privateString = "privateString";

    //    method with private access modifier
    private void privateMethod() {
//        you can't provide access modifier to local variables
//        private String abc = "abc";

        System.out.println("privateMethod");
    }

    //    method with default access modifier
    void defaultMethod() {
        System.out.println("defaultMethod");
    }

    //    method with protected access modifier
    protected void protectedMethod() {
        System.out.println("protectedMethod");
    }

    //    method with public access modifier
    public void publicMethod() {
        System.out.println("publicMethod");
    }

}
