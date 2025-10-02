class TemperatureSensor{
 private int temperature;
 
 
 void setTemperature(int t){
 if(t >=0 && t <=100){
 temperature = t;
 
 }else {
            System.out.println("Temperature out of range");
        }
 
 
 }

   int getTempertaure(){
   return temperature;
   
   }
}

class MainTemperture{

public static void main(String [] agrs){


  TemperatureSensor t1 = new TemperatureSensor();
  
     t1.setTemperature(-5);
	 t1.setTemperature(25);
	 System.out.println("temperature is " + t1.getTempertaure());

}





}
