import com.msbeigi.dir.CommandFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNext("e")) {
            String command = scanner.nextLine();
            CommandFactory commandFactory = new CommandFactory(command);

            commandFactory.execute();

        }
    }
}
