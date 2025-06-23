public class hello {
    int instanceVar = 10;             // biến instance
    static int staticVar = 20;        // biến static
    final int finalVar = 30;          // biến final

    public void methodExample() {
        int localVar = 40;            // biến local
        System.out.println("Local: " + localVar);
    }

    public static void main(String[] args) {
        hello obj = new hello();
        System.out.println("Instance: " + obj.instanceVar); // phải tạo object để dùng
        System.out.println("Static: " + staticVar);          // gọi trực tiếp
        // System.out.println(localVar); ❌ không thể gọi biến local ở đây
    }
}
