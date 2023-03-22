package main;

public class TicTacToe {
    public static class GameXO {
        private final int fieldSize;
        private final String[][] field;
        private final String emptyField = "-";
        private final String player1 = "x";
        private final String player2 = "o";

        public GameXO(int fieldSize){
            this.fieldSize =fieldSize;
            this.field = new String[fieldSize][fieldSize];
            for (int i = 0; i < fieldSize; i++){
                for(int j = 0; j < fieldSize; j++){
                    this.field[i][j] = emptyField;
                }
            }

        }
        public void addCharX(int num){
            if (this.field[pos(num)[0]][pos(num)[1]].contains(emptyField)){
                this.field[pos(num)[0]][pos(num)[1]] = player1;
            }
        }
        public void addCharO(int num){
            if (this.field[pos(num)[0]][pos(num)[1]].contains(emptyField)){
                this.field[pos(num)[0]][pos(num)[1]] = player2;
            }
        }
        public String cleaner(int num){
            this.field[pos(num)[0]][pos(num)[1]] = emptyField;
            return this.field[pos(num)[0]][pos(num)[1]];
        }

        public String getState(int num){
            return this.field[pos(num)[0]][pos(num)[1]];
        }
        private int[] pos(int num){
            int row = 0;
            while (this.fieldSize <= num - 1) {
                row++;
                num -= this.fieldSize;
            }
            return new int[]{row, num-1};
        }
        public int maxXDiag(){
            int max_lenght = 0;
            int counterD1 = 0;
            int counterD2 = 0;
            int kol = fieldSize;
            for (int count = 0; count < fieldSize; count++) {
                if (!this.field[count][count].contains(emptyField) && this.field[count][count].contains(player1)){
                    ++counterD1;
                    max_lenght = Math.max(counterD1, max_lenght);
                }
                if (!this.field[--kol][count].contains(emptyField) && this.field[kol][count].contains(player1)){
                    ++counterD2;
                    max_lenght = Math.max(counterD2, max_lenght);
                }
            }
            return max_lenght;
        }
        public int maxODiag(){
            int counterD1 = 0;
            int counterD2 = 0;
            int max_lenght = 0;
            int kol = fieldSize;
            for (int count = 0; count < fieldSize; count++) {
                if (this.field[count][count] != null && this.field[count][count].contains(player2)){
                    ++counterD1;
                    max_lenght = Math.max(counterD1, max_lenght);
                }
                if (this.field[--kol][count] != null && this.field[kol][count].contains(player2)){
                    ++counterD2;
                    max_lenght = Math.max(counterD2, max_lenght);
                }
            }
            return max_lenght;
        }
        public int maxX(){
            int max_lenght = 0;
            int counterH = 0;
            int counterV = 0;
            for (int row = 0; row < fieldSize; row++) {
                for (int col = 0; col < fieldSize; col++) {
                    if (!this.field[row][col].contains(emptyField) && this.field[row][col].contains(player1)){
                        counterH++;
                        max_lenght = Math.max(counterH, max_lenght);
                    }
                    else counterH = 0;
                    if (!this.field[col][row].contains(emptyField) && this.field[col][row].contains(player1)){
                        counterV++;
                        max_lenght = Math.max(counterV, max_lenght);
                    }
                    else counterV = 0;
                }
            }
            return max_lenght;
        }
        public int maxO(){
            int max_lenght = 0;
            int counterH = 0;
            int counterV = 0;
            for (int row = 0; row < fieldSize; row++) {
                for (int col = 0; col < fieldSize; col++) {
                    if (!this.field[row][col].contains(emptyField) && this.field[row][col].contains(player2)){
                        counterH++;
                        max_lenght = Math.max(counterH, max_lenght);
                    }
                    else counterH = 0;
                    if (!this.field[col][row].contains(emptyField) && this.field[col][row].contains(player2)){
                        counterV++;
                        max_lenght = Math.max(counterV, max_lenght);
                    }
                    else counterV = 0;
                }
            }
            return max_lenght;

        }
    }

}
