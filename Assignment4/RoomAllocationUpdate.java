 class RoomAllocationUpdate {
    public static void main(String[] args) {
        
        String original = "101";

      
        String insertText = "New Building ";

    
        StringBuffer roomInfo = new StringBuffer(original);

    
        roomInfo.insert(0, insertText);

     
        System.out.println(roomInfo.toString());
    }
}
