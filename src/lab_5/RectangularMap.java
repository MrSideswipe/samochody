package lab_5;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
 
public class RectangularMap implements IWorldMap {
 
    private List<Car> cars = new LinkedList<>();
    private Position MaxPosition;
    private Position MinPosition = new Position(0,0);
   
    RectangularMap(int width, int height){
        MaxPosition = new Position(width, height);
    }
   
    public Position getMax(){
        return MaxPosition;
    }
    public Position getMin(){
        return MinPosition;
    }
   
    @Override
    public boolean canMoveTo(Position position) {
        if (position.larger(MinPosition) && position.smaller(MaxPosition)) //  && !isOccupied(position)
            return true;
        return false;
        // TODO Auto-generated method stub
    }
 
    @Override
    public boolean add(Car car) {
        if (!isOccupied(car.getPosition()) && car.getPosition().larger(MinPosition) && car.getPosition().smaller(MaxPosition)){
            cars.add(car);
            return true;
        }
        return false;
       
    }
 
    //////////////////////////////
    @Override
    public void run(MoveDirection[] directions) {
        for (int j = 0; j < directions.length; j++){
            cars.get(j % cars.size()).move(directions[j]);
        }
        // TODO Auto-generated method stub
 
    }
 
    @Override
    public boolean isOccupied(Position position) {
        Iterator i = cars.iterator();
        while (i.hasNext()) {
            Car c = (Car) i.next();
            if (c.getPosition().equals(position))
                return true;
        }
        return false;
       
        // TODO Auto-generated method stub
    }
 
    @Override
    public Object objectAt(Position position) {
        Iterator i = cars.iterator();
        while (i.hasNext()) {
            Car c = (Car) i.next();
            System.out.println(c.getPosition());
            if (c.getPosition().equals(position)){
                System.out.println("Tu jest auto " + position);
                return c;
            }
 
        }
        return null;
       
        // TODO Auto-generated method stub
    }
}