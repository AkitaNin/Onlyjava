package OOP;

public class bai30_oop {
    public static void main(String[] args) {
        //khởi tạo đối tượng
        Student st1 = new Student();
        Student st2 = new Student();
        Student st5 = new Student();

        Student st3 = new Student("Naoki", 5541);
        st1.displayInfo();
        st2.displayInfo();
        st3.displayInfo();
        st5.setFullName("Java");
        st5.setNumID(6674);
        st5.displayInfo();

        st5.cooking();

        TestClass tc = new TestClass();
        tc.Cong(1,2);


        WebSite wt = new WebSite("google.com", "map.com");
        //wt.setGgmap("hello");
        wt.setGg("nohello");
        wt.displayURRL();

    }
}
