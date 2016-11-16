package lab_5;

public class Position {
    public final int x;
    public final int y;
   
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }
   
    @Override
    public String toString()
    {
        return "(" + this.x + "," + this.y + ")";
    }
   
    public Boolean smaller(Position coord)
    {
        if(this.x <= coord.x && this.y <= coord.y)
            return true;
        return false;
    }
   
 
    public Boolean larger(Position coord)
    {
        if(this.x >= coord.x && this.y >= coord.y)
            return true;
        return false;
    }
   
    public Position add (Position coord)
    {
        int x = this.x + coord.x;
        int y = this.y + coord.y;
        Position result = new Position(x,y);
       
        return result;
    }
   
   
}