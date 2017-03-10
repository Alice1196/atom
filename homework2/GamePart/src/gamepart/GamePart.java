package gamepart;
import org.apache.logging.log4j.*; 

class People implements Movable {
     @Override
     public void Move(double x,double y){
         
     }
     @Override
     public void Position(int x,int y,int widht,int hight){
         
     }
}

class Bombs implements Positionable,Temporary {
     @Override
     public void Position(int x,int y,int widht,int hight){
         
     }
     @Override
     public boolean isDead(){
         return true;
     }
}

class Boxes implements Positionable{
     private static final Logger log = LogManager.getLogger(Boxes.class);

     public Boxes() {
        log.info("A class constructor.");
     }
     @Override
     public void Position(int x,int y,int widht,int hight){

     }
     
}

class GameSession {
    public void GameSessionCreator(){
        Boxes Box1 = new Boxes();
        Boxes Box2 = new Boxes();
        People Girl = new People();
        People Boy = new People();
        Bombs Bomb1 = new Bombs();
        Bombs Bomb2 = new Bombs();
        
    }
}
public class GamePart{
    public static void main(String Arg[]){
        GameSession c = new GameSession();
        c.GameSessionCreator();
    }
}
