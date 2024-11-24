package Redrover.scool;

import java.util.Scanner;

public class Prompter {
    private final String prompt;
    private Scanner scanner = new Scanner(System.in);

    public Prompter(String prompt) {
        this.prompt = prompt;
    }

    public String read() {
        String input;
        do {
            System.out.print(prompt + ": ");
            input = scanner.nextLine();
        } while (input == null || input.isEmpty());
        return input;
    }
}
