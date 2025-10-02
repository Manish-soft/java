class TeaCup{

String teaType;
static int totalcups=0;

  TeaCup(String teaType){
  this.teaType=teaType;
  totalcups++;
  }
  
  public String getteaType(){
  return teaType;
  
  }
  
  public static void showtotalcups(){
  System.out.println("total cups made" + totalcups);
  }
  
   public static void main(String[] agrs){
   
   TeaCup tea1 = new TeaCup("masala tea");
   TeaCup tea2 = new TeaCup("green tea");
   TeaCup tea3 = new TeaCup("ginger tea");
  
     System.out.println("tea1 type"  + tea1.getteaType());
	 System.out.println("tea2 type"  + tea2.getteaType());
     System.out.println("tea3 type"  + tea3.getteaType());
     TeaCup.showtotalcups();


  
   } 
  







}