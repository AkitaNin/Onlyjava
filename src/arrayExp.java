import java.util.ArrayList;


public class arrayExp {
    // datatype[] <tên mảng> = new datatype[size];
    // datatype : cùng kiểu dữ liệu
    // tên mảng : tuần theo quy tắc đặt tên
    // [] : bắt buộc (quy tắc khai báo mảng)
    // size : kích thước cua mảng. Là số nguyên int\

    //ArrayList<Type> tên mảng = new ArrayList<>()

    ArrayList<String> usernamesList;

    String[] usernames;

    public arrayExp (String ten,String nine){
        usernamesList = new ArrayList<>();
        usernamesList.add("QA");
        usernamesList.add("Pre");
        usernamesList.add("Prod");

    }

    public arrayExp() {
        usernames = new String[3];
        usernames[0] = "admin";
        usernames[1] = "tester";
        usernames[2] = "guest";
    }

    public arrayExp(String Role) {
        usernames = new String[3];
        usernames[0] = "Ju";
        usernames[1] = "mid";
        usernames[2] = "sen";
        
    }
    public static void main(String[] args) {
        arrayExp obj = new arrayExp();
        arrayExp obj2 = new arrayExp("thông minh");
        arrayExp obj3 = new arrayExp("thông minh", "hello");

        System.out.println(obj3.usernamesList);
        System.out.println(obj.usernames[1]); // In ra: tester
        System.out.println(obj2.usernames[1]); // In ra: mid

    }

}
