package lab_5;

public enum MapDirection {
    North,
    South,
    East,
    West;
   
    public String toString()
    {
        switch(this){
        case North: return "Polnoc";
        case South: return "Poludnie";
        case East: return "Wschod";
        case West: return "Zachod";
        default: return "Nieznany kierunek";
        // kompilator sie pluje jak nie ma default
        }
    }
   
    public MapDirection next()
    {
        switch(this){
        case North: return East;
        case South: return West;
        case East: return South;
        case West: return North;
        default: return null;
        // kompilator sie pluje jak nie ma default
        }
    }
   
    public MapDirection previous()
    {
        switch(this){
        case North: return West;
        case South: return East;
        case East: return North;
        case West: return South;
        default: return null;
        // kompilator sie pluje jak nie ma default
        }
    }
}