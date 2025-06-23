package kitchen;

public class kitchenBox {
    // 🧠 Instance variables – dành riêng cho mỗi object
    String knife;
    String spoon;
    String cookName;

    // ⚙️ Static variable – dùng chung cho tất cả hộp
    static int totalBoxCount = 0;

    // 🧱 Constructor – chỉ nhận thông tin cần thiết để khởi tạo object
    public kitchenBox(String knife, String spoon, String cookName) {
        this.knife = knife;
        this.spoon = spoon;
        this.cookName = cookName;
        totalBoxCount++;  // cập nhật biến static
    }

    // 🔪 Method – hành động của hộp
    public void prepareIngredients() {
        System.out.println(cookName + " đang chuẩn bị nguyên liệu bằng " + knife + " và " + spoon);
    }

    public void cook() {
        System.out.println(cookName + " đang nấu ăn...");
    }

    // 🔍 Static method – gọi mà không cần object
    public static void showTotalBoxes() {
        System.out.println("Tổng số hộp đã tạo: " + totalBoxCount);
    }

    public static void main(String[] args) {

        kitchenBox box1 = new kitchenBox("Dao Nhật", "Muỗng Gỗ", "Lan");
        box1.prepareIngredients();
        box1.cook();

        kitchenBox box2 = new kitchenBox("Dao Đức", "Muỗng Inox", "Minh");
        box2.prepareIngredients();

        kitchenBox.showTotalBoxes();  // → gọi static method
    }
}



