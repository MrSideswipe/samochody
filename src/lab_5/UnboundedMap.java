package lab_5;

public class UnboundedMap implements IWorldMap {

	private HayStack[] list;
	
	public UnboundedMap (HayStack[] list_stack)
	{
		list = list_stack;
	}
	
	@Override
	public boolean canMoveTo(Position position) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(Car car) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void run(MoveDirection[] directions) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isOccupied(Position position) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object objectAt(Position position) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public String toString()
	{
		
	}

}
