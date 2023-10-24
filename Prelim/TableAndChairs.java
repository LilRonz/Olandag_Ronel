public class TableAndChairs {

    public static void main(String[] args) {
        displayTableAndChairs();
    }

    public static void displayTableAndChairs() {
        String[] table = {
            "X                        X",
            "X                        X",
            "X       XXXXXXXXXX       X",
            "XXXXX   X        X   XXXXX",
            "X   X   X        X   X   X",
            "X   X   X        X   X   X"
        };

        for (String line : table) {
            System.out.println(line);
        }
    }
}