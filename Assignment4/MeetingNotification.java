 class MeetingNotification {
    public static void main(String[] args) {
        String baseText = "Meeting:";         
        String textToAppend = " Friday at 5 PM";

    
        StringBuffer notification = new StringBuffer(baseText);

     
        notification.append(textToAppend);

     
        System.out.println(notification.toString());
    }
}
