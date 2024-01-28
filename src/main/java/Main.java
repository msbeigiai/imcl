import com.msbeigi.dir.CommandFactory;
import com.msbeigi.exceptions.CommandNotAssignedException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNext("exit")) {
            String command = scanner.nextLine();
            CommandFactory commandFactory = new CommandFactory(command);

            try {
                commandFactory.execute();
            } catch (CommandNotAssignedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
