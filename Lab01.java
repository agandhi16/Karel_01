/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Your Name here>  // replace <...> with your name
* @version <date/of/completion> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab01 {

     public static void main(String[] args) {
         Display.openWorld("maps/SSSSchool.map");         
         Display.setSize(10, 10);
         Display.setSpeed(5);
         
             
             Robot karel = new Robot();
             Robot pete = new Robot (4, 5, Display.SOUTH, 0);
             karel.move();
             karel.move();
             karel.turnLeft();
             karel.move();
             karel.turnLeft();
             karel.move();
             karel.pickBeeper();
             karel.turnLeft();
             karel.turnLeft();
             karel.move();
             karel.turnLeft();
             karel.turnLeft();
             karel.turnLeft();
             karel.move();
             karel.turnLeft();
             karel.move();
             karel.move();
             karel.move();
             karel.turnLeft();
             karel.move();
             karel.move();
             karel.move();
             karel.turnLeft();
             karel.move();
             karel.move();
             karel.turnLeft();
             karel.turnLeft();
             karel.turnLeft();
             karel.move();
             karel.putBeeper();
             pete.pickBeeper();
             pete.move();
             pete.turnLeft();
             pete.move();
             pete.move();
             pete.turnLeft();
             pete.move();
             pete.move();
             pete.turnLeft();
             pete.turnLeft();
             pete.turnLeft();
             pete.move();
             pete.move();
             pete.turnLeft();
             pete.move();
             pete.turnLeft();
             pete.move();
             pete.move();
             pete.turnLeft();
             pete.turnLeft();
             pete.turnLeft();
             pete.move();
             pete.move();
             pete.turnLeft();
             pete.move();
             pete.move();
             pete.putBeeper();
             pete.turnLeft();
             pete.turnLeft();
             pete.move();                       
                          
   }    
}
