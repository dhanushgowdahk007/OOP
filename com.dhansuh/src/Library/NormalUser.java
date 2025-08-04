package Library;

public class NormalUser extends User {

    public NormalUser(String name) {
        super(name);
    }

    public NormalUser(String name, String email, String phoneNumber){
        super(name, email, phoneNumber);
    }

    @Override
    public void menu(){
        System.out.println("""
                1. View Books.
                2. Search.
                3. Place Order.
                4. Borrow Book.
                5. Calculate Fine.
                6. Return Book.
                7. Exit.
                """);
    }
}
