class Book{

private int copies;

void addcopies(int n){
if(n > 0){
   copies += n;
}
}

    void removecopies(int n){
	if(n <= copies){
	copies -= n;
	}else{
	    System.out.println("not enough copy");
	
	}
	
	
	}

         int getcopies(){
		 return copies;
		 
		 
		 }



}

class Maincopies{

 public static void main(String[] agrs){
 
 Book b1 = new Book();
 
 b1.addcopies(3);
 b1.removecopies(1);
 
 System.out.println("copiesavailable"  + b1.getcopies());
 
 
 }




}