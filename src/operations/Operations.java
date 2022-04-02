package operations;

import java.util.Scanner;

public class Operations {
    private int namesNumber;
    Scanner sc = new Scanner(System.in);
    String currentName;


    public void Operations(){
        StringBuilder builder = new StringBuilder();
        System.out.print("Podaj ilość imion do wpisania: ");
        namesNumber = sc.nextInt();
        sc.nextLine();
        System.out.println();

        for (int i = 0; i < namesNumber; i++){
        currentName = sc.nextLine();

            int position = currentName.length();
            builder.append(currentName.charAt(position-1));
                                }

        System.out.println("\n"+builder);

    }
}
