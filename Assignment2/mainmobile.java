class Mobile{

  String model;
  
  static int totalMobiles = 0;
  
    Mobile(String types){
	model = types;
	totalMobiles++;
	}

       String getmodel(){
		return model;
		}
		
		static void showtotalMobiles(){
		System.out.println("total mobile will be"+ totalMobiles);
		
		}
            

}

class mainmobile{

public static void main(String agrs[]){

 Mobile m1 = new Mobile("samsung galaxy m32");
  Mobile m2 = new Mobile("Redmi note 12");
  
  System.out.println("mobile1 model" + m1.getmodel());
   System.out.println("mobile1 model" + m2.getmodel());

          Mobile.showtotalMobiles();

}


}