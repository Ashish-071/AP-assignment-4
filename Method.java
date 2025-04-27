class AccessModifiersExample {
    public void publicMethod() {

        System.out.println("This is a public method.");
    }

    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    void defaultMethod() {
        System.out.println("This is a default (package-private) method.");
    }

    public static void main(String[] args) {
        AccessModifiersExample example = new AccessModifiersExample();

        example.publicMethod();    
        example.protectedMethod();  
        example.defaultMethod();    

        Subclass subclass = new Subclass();
        subclass.accessMethods();
    }
}

class Subclass extends AccessModifiersExample {

    public void accessMethods() {

        publicMethod();       
        protectedMethod();    
        defaultMethod();     
    }
}
