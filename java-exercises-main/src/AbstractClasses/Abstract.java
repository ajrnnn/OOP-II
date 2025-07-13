package AbstractClasses;

public class Abstract {
    public static void main(String[] args) {
        Admin currentAdmin = new Admin(1227, "Alex", "Alex@123");
        User currentUser = new User(7669, "Manu");
        currentAdmin.performOperation(new Update());
        currentUser.performOperation(new View());


    }

}


