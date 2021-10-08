public class HomeWorkApp1 {  public static void main(String[] args) {
    printTreeWords();
    checkSunSing();
    printColor();
    compareNumbers();
}

    public static void printTreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSunSing() {
        int a = 15;
        int b = 10;
        if (a + b >=0) {
            System.out.println("Сумма положительная");}
        else if (a + b <=0) {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 45;
        if (value <= 100) {
            System.out.println("Желтый");
        } else if (value < 0) {
            System.out.println("Красный");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 5;
        int b = 2;
        if (a < b) {
            System.out.println("а меньше b"); }
        if (a >= b) {
            System.out.println("а больше или равно b");
        }
    }
}



