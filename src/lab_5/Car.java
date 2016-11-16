package lab_5;

import static java.lang.System.out;

public class Car {
    private Position position = new Position(2,2);
    private MapDirection direction = MapDirection.North;
    private IWorldMap map;
   
    public Car(IWorldMap map)
    {
        this.map = map;
    }
   
    public Car(IWorldMap map, int x, int y)
    {
        this.map = map;
        this.position = new Position(x,y);
    }
   
    public Position getPosition()
    {
        return this.position;
    }
   
    public String toString()
    {
        //return "(" + this.position.x + "," + this.position.y + ") - kierunek " + this.direction;
        String znak;
        if(this.direction == MapDirection.North)
        {
            znak = "N";
            return znak;
        }
       
        if(this.direction == MapDirection.South)
        {
            znak = "S";
            return znak;
        }
       
        if(this.direction == MapDirection.East)
        {
            znak = "E";
            return znak;
        }
       
        if(this.direction == MapDirection.West)
        {
            znak = "W";
            return znak;
        }
        znak = "X";
        return znak;
           
    }
   
    public Car move(MoveDirection move_direction)
    {
        //if(this.map.canMoveTo(position))
       
        switch (move_direction)
        {
        case Right:
            this.direction=this.direction.next();
            break;
        case Left:
            this.direction=this.direction.previous();
            break;
 
        case Forward:
            switch (direction)
            {
            case North:
                //if (this.position.smaller(new Position(3,3)))
                if(this.map.canMoveTo(new Position(1,0)))
                    if (!this.map.isOccupied(this.position.add (new Position(1,0))))
                        this.position = this.position.add (new Position(1,0));     // w ten sposb trzeba
                break;
            case South:
                //if (this.position.larger(new Position(1,1)))
                if(this.map.canMoveTo(new Position(-1,0)))
                    if (!this.map.isOccupied(this.position.add (new Position(-1,0))))
                        this.position = this.position.add (new Position(-1,0));
                break;
            case East:
                //if (this.position.smaller(new Position(3,3)))
                if(this.map.canMoveTo(new Position(0,1)))
                    if (!this.map.isOccupied(this.position.add (new Position(0,1))))
                        this.position = this.position.add (new Position(0,1));
                break;
            case West:
                //if (this.position.larger(new Position(1,1)))
                if(this.map.canMoveTo(new Position(0,-1)))
                    if (!this.map.isOccupied(this.position.add (new Position(0,-1))))
                        this.position = this.position.add (new Position(0,-1));
                break;
            default:
                out.println("Blad przy przesuwaniu samochodu");
                break;
            }
            break;
        case Backward:
            switch (direction)
            {
            case North:
                //if (this.position.larger(new Position(1,1)))
                if(this.map.canMoveTo(new Position(-1,0)))
                    if (!this.map.isOccupied(this.position.add (new Position(-1,0))))
                        this.position = this.position.add (new Position(-1,0));
                break;
            case South:
                //if (this.position.smaller(new Position(3,3)))
                if(this.map.canMoveTo(new Position(1,0)))
                    if (!this.map.isOccupied(this.position.add (new Position(1,0))))
                        this.position = this.position.add (new Position(1,0));
                break;
            case East:
                //if (this.position.larger(new Position(1,1)))
                if(this.map.canMoveTo(new Position(0,-1)))
                    if (!this.map.isOccupied(this.position.add (new Position(0,-1))))
                        this.position = this.position.add (new Position(0,-1));
                break;
            case West:
                //if (this.position.smaller(new Position(3,3)))
                if(this.map.canMoveTo(new Position(0,1)))
                    if (!this.map.isOccupied(this.position.add (new Position(0,1))))
                        this.position = this.position.add (new Position(0,1));
                break;
            default:
                out.println("Blad przy przesuwaniu samochodu");
                break;
            }
            break;
        default:
            out.println("Zly kierunek");
            break;
           
        }
        return this;
    }
}
 