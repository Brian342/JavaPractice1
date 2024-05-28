public class Mygenericclass <Thing,Thing2>{
    
    Thing x;
    Thing2 y;
    Mygenericclass(Thing x, Thing2 y){
        this.x = x;
        this.y = y;
    } 
    public Thing2 getValue(){
        return y;
    }
}
