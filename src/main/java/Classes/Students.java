package Classes;

public class Students extends People {
    final static Students INSTANCE = new Students();

    private Students() {
    }

    public static Students getInstance() {
        return INSTANCE;
    }

}
