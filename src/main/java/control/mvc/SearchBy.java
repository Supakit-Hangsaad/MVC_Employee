package control.mvc;

public class SearchBy {

    public String SearchData(String name) {
        if (name.equals("name")) {
            return "first_name";
        }
        if (name.equals("email")) {
            return "email";
        }
        if (name.equals("salary")) {
            return "salary";
        }
        if (name.equals("phone")) {
            return "phone_number";
        }

        return null;
    }

}
