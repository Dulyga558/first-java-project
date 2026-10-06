// ==========================================
// КОНСПЕКТ 5: МИНИ-ПРАКТИКА (Conspect5.java)
// ==========================================

enum ProductStatus {
    ACTIVE,
    DISCONTINUED
}

// Қателік болмас үшін класс атын Product5 деп өзгерттік
class Product5 {
    private final String code;
    private String name;
    private double price;
    private ProductStatus status;

    public Product5(String code, String name, double price) {
        if (code == null || code.isBlank()) {
            throw new IllegalArgumentException("Тауар коды бос болмауы тиіс!");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Тауар аты бос болмауы тиіс!");
        }
        if (!Double.isFinite(price) || price <= 0) {
            throw new IllegalArgumentException("Баға оң сан және ақырлы болуы тиіс!");
        }

        this.code = code.strip();
        this.name = name.strip();
        this.price = price;
        this.status = ProductStatus.ACTIVE;
    }

    public String getCode() { return code; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public ProductStatus getStatus() { return status; }

    public void discontinue() {
        if (this.status == ProductStatus.DISCONTINUED) {
            throw new IllegalStateException("Тауар өндірістен бұрыннан шығарылған!");
        }
        this.status = ProductStatus.DISCONTINUED;
    }

    public void changePrice(double newPrice) {
        if (this.status != ProductStatus.ACTIVE) {
            throw new IllegalStateException("Өндірістен шығарылған тауардың бағасын өзгертуге болмайды!");
        }
        if (!Double.isFinite(newPrice) || newPrice <= 0) {
            throw new IllegalArgumentException("Жаңа баға оң сан болуы тиіс!");
        }
        this.price = newPrice;
    }

    @Override
    public String toString() {
        return "Product5{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", status=" + status +
                '}';
    }
}

public class Conspect5 {
    public static void main(String[] args) {
        System.out.println("=== 1. Дұрыс тауар құру ===");
        Product5 laptop = new Product5("P1001", "Ноутбук", 450000.0);
        System.out.println("Бастапқы тауар: " + laptop);

        System.out.println("\n=== 2. Бағасын ауыстыру (changePrice) ===");
        laptop.changePrice(420000.0);
        System.out.println("Жаңа баға: " + laptop.getPrice() + " тг");

        System.out.println("\n=== 3. Өндірістен шығару (discontinue) ===");
        laptop.discontinue();
        System.out.println("Жаңа статус: " + laptop.getStatus());

        System.out.println("\n=== 4. Қате сценарий: өндірістен шыққан соң баға өзгерту ===");
        try {
            laptop.changePrice(400000.0);
        } catch (IllegalStateException e) {
            System.out.println("Ұсталған қателік: " + e.getMessage());
        }

        System.out.println("\n=== 5. Қате сценарий: теріс баға беру ===");
        try {
            Product5 phone = new Product5("P1002", "Смартфон", -50000.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Ұсталған қателік: " + e.getMessage());
        }
    }
}