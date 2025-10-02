class Teacup{

String teaType;


  static int totalcups = 0;
  
        Teacup(String type){
		
		teaType = type;
		totalcups++;
		
		}
		
		String getTeaType(){
         return teaType;		
		
		}
		
		static void showTotalcups(){
		System.out.println("totalcups of tea prepared" + totalcups);
		}
		
}

		class Maintea{
		public static void main(String args[]){
		
		Teacup cup1 = new Teacup("green tea");
	    Teacup cup2 = new Teacup("black tea");
	    Teacup cup3 = new Teacup("lemon tea");
		
		System.out.println("cup1 contain" + cup1.getTeaType());
		System.out.println("cup2 contain" + cup2.getTeaType());
		System.out.println("cup3 contain" + cup3.getTeaType());
		
		           Teacup.showTotalcups();
		
		
		}
		
		
		
		}
		
		
		
		
		




