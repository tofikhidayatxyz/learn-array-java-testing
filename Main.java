public class Main {
    static String rooms[][] = {
        {
            "*", "*", "*", "*", "X"
        }, {
            "*", "*", "*", "*", "*"
        }, {
            "*", "*", "*", "*", "*"
        }, {
            "*", "*", "*", "X", "*"
        }
    };
    public static void main(String[] args) {
        int availableRooms = 0;
        for(int i = 0; i < rooms.length; i++) {
            for(int j = 0; j < rooms[i].length; j++) {
                if(rooms[i][j] == "X") {
                    System.out.println("Kamar terisi pada lantai " + (i + 1) + " ruangan ke " + (j + 1));
                }  else {
                    availableRooms++;
                }
            }
        }

        System.out.println("Ada " + availableRooms + "  yang kosong.");
    }   
}