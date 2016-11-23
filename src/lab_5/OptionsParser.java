package lab_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
 
public class OptionsParser {
    public MoveDirection[] parse(String[] texts)
    {
        int j = 0;
        for (String text : texts)
        {
            j++;
        }
       
        MoveDirection Direction[] = new MoveDirection[j];
        int i = 0;
        for(String text : texts)
        {
            if(text.equals("forward") || text.equals("f"))
            {
                Direction[i] = MoveDirection.Forward;
                i++;
            }
           
            else if(text.equals("backward") || text.equals("b"))
            {
                Direction[i] = MoveDirection.Backward;
                i++;
            }
           
            else if(text.equals("right") || text.equals("r"))
            {
                Direction[i] = MoveDirection.Right;
                i++;
            }
           
            else if(text.equals("left") || text.equals("l"))
            {
                Direction[i] = MoveDirection.Left;
                i++;
            }
            
            else
            {
            	throw new IllegalArgumentException(text + " is invalid");
            }
            
        }
        return Direction;
    }
}