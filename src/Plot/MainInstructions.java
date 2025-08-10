package Plot;

public interface MainInstructions {
    public static void startGame () {
        System.out.println("Игра началась!");
    }
    public static void instructionInputName () {
        System.out.println("1. Введите имя");
    }
    public static void instructionInputClass () {
        System.out.println("2. Выберите предмет из перечисленных и введите в консоль:" +
                "'Cane', 'Knife', 'Axe'");
    }


}
