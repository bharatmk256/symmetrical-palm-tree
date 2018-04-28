public class Main {
    public static void main(String [] args){


    //constructor
        class Game{
            int score;
            //Default constructor
            Game(){
                score=0;
            }
            //Constructor by starting score valu
            Game(int startingScore){
                score=startingScore;
                Game tetris = new Game();
                Game sudoku =new Game(150);
                Game dart = null;
            }

        }




    }
}
