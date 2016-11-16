package lab_5;

public class Position {
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

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