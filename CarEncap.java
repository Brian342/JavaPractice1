public class CarEncap {
    
    private String make;
    private String model;
    private int year;

    CarEncap(String make, String model,int year){
        this.setModel(model);
        this.setMake(make);
        this.setYear(year); 
   }
   CarEncap(CarEncap x){
    this.copy(x);
   }

    public  String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }

    public void setModel(String model){
        this.model = model;
    }
    public void setMake(String make){
        this.make = make;
    }
    public void setYear(int year){
        this.year= year;
    }

    public void copy(CarEncap x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }
}
