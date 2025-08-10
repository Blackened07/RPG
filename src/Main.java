import Plot.MainInstructions;
import Plot.PlotLine;
import Character.Char;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MainInstructions.startGame();
        Scanner userInputStart = new Scanner(System.in);

        PlotLine.introduce();
        MainInstructions.instructionInputName();
        MainInstructions.instructionInputClass();

        Char player = new Char(userInputStart.nextLine(), userInputStart.nextLine());
        player.setStats(player.getCHARCLASS());
        player.getInfo();
        PlotLine.line1();






    }
}