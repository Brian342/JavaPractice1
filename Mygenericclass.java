public class Mygenericclass <Thing>{
    
    Thing x;
    Mygenericclass(Thing x){
        this.x = x;
    } 
    public Thing getValue(){
        return x;
    }
}
