//package java.opps;

public class Interface {
    
}

interface chessplayer{
    void moves();

}
class Queen implements chessplayer {
 public void moves(){
    System.out.print("up,down,left,right.diagonal(in all direction");
 }
}
class Rook implements chessplayer {
    public void moves(){
       System.out.print("up,down,left,right");
    }
   }
   class King implements chessplayer {
    public void moves(){
       System.out.print("up,down,left,right.diagonal(in all direction by 1atep");
    }
   }
