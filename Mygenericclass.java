public class Mygenericclass <Thing extends Number,Thing2 extends Number>{
    
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
