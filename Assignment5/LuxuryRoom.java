import java.util.;


class RoomNotAvailable extends Execption{

RoomNotAvailable(String msg){
super(msg);
}
}
class Room{

int roomid;
Strin roomtype;
int price;
boolean available;

Room(int roomid,int price,boolean available){
this.roomid=roomid;
this.price=price;
this.available=available;
}

 public void book() throws
 RoomNotAvailable{
 if(available){
 throw new
 roomnotavailable("Room" + roomid + "not available");
 }
 isavaliable = false;
 }
 
 else{
 System.out.println("available");
 }
 
 public string getdetails(){
 return roomid;
 return roomtype;
 return available;
 }
 
 class LuxuryRoom extends Room{
 
 String amenities;
 
 LuxuryRoom(String amenities){
 super(roomid,price)
 this.amenities=amenities;
 }
 @Overide
 public voidbook()throws
 roomnotavailableException{
 System.out.println("booking an economy room");
 super.book();
 }

 }
 
 
 
 
 
 }
 
 
 }
 
 
 }






}