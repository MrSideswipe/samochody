package lab_5;

import static java.lang.System.out;
import java.util.List;
 
public class CarSystem {
 
 
    public static void main (String[] args){
       
        Position position1 = new Position(1,2);
        Position position2 = new Position(-2,1);
        Boolean flag;
       
        out.println(position1);
        out.println(position1.x);
        // nie mozna zrobic position.x=10, gdyz x jest "final"
       
        flag = position1.smaller(position2);
        if (flag == true)
            out.println("True");
        else
            out.println("False");
       
        flag = position1.larger(position2);
        if (flag == true)
            out.println("True");
        else
            out.println("False");
       
        out.println(position1.add(position2));
       
        MapDirection direction = MapDirection.West;
       
        out.println(direction.next());
       
        out.println(direction.previous());
       
        MoveDirection moveDirection = MoveDirection.Right;
        if(moveDirection == MoveDirection.Right)
        {
            direction = direction.next();
        }
       
        out.println(direction);
       /*
        Car car1 = new Car();
        out.println(car1);
        car1=car1.move(MoveDirection.Right);
        car1=car1.move(MoveDirection.Forward);
        car1=car1.move(MoveDirection.Forward);
        car1=car1.move(MoveDirection.Forward);
        out.println(car1);
       
        out.println("==================");
       
        Car car2 = new Car();
        OptionsParser parser = new OptionsParser();
        String[] options = new String[5];
        options[0] = "r";
        options[1] = "right";
        options[2] = "forward";
        options[3] = "backward";
        options[4] = "b";
        List<MoveDirection> direct = parser.parse(options);
        for(MoveDirection d : direct)
        {
            car2.move(d);
            out.println(car2);
        }
        */
       
        MoveDirection[] directions = new OptionsParser().parse(args);
        IWorldMap map = new RectangularMap(10, 5);
        map.add(new Car(map));
        map.add(new Car(map,3,4));
        map.run(directions);
       
    }
}