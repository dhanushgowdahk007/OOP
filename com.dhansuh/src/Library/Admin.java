package Library;

public class Admin extends User{

    public Admin(String name){
        super(name);
    }

    public Admin(String name, String email, String phoneNumber){
        super(name, email, phoneNumber);
    }

    @Override
    public void menu(){
        System.out.println("""
                1. View Books.
                2. Add Books.
                3. Delete Books.
                4. Search.
                5. Delete all data.
                6. View Orders.
                7. Exit.
                """);
    }
}
