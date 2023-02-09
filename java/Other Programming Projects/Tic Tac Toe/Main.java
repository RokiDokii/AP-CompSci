import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] slot = {"1","2","3","4","5","6","7","8","9"};
        String board = "\n|-|-|-|\n|"+slot[0]+"|"+slot[1]+"|"+slot[2]+"|\n|-|-|-|\n|"+slot[3]+"|"+slot[4]+"|"+slot[5]+"|\n|-|-|-|\n|"+slot[6]+"|"+slot[7]+"|"+slot[8]+"|\n|-|-|-|\n";
        System.out.println(board);
        for (int turn = 1; turn <= 9; turn++){
            System.out.print("Insert a slot to place X in\n> ");
            String x = input.nextLine();
            // System.out.print("Insert a slot to place O in\n> ");
            // int o = input.nextInt();
            for (int i = 0; i <= 8; i++){
                slot[i] = slot[i].replace(x,"X");
            }
            System.out.println(board);
        }
    }
}