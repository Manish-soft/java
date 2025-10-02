// Interface for making calls
interface Callable {
    public void makeCall(String number);
}

// Interface for sending messages
interface Messaging {
    public void sendMessage(String number, String message);
}

// Interface for browsing the internet
interface Internet {
    public void browse(String website);
}

// SmartPhone class implementing all three interfaces
class SmartPhone implements Internet, Messaging, Callable {

    @Override
    public void browse(String website) {
        System.out.println("Browse: " + website);
    }

    @Override
    public void sendMessage(String number, String message) {
        System.out.println("Message to " + number + ": " + message);
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Call: " + number);
    }
}

// Main class to test SmartPhone features
public class MainSmartDevices {

    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone();

        s1.makeCall("64343845");
        s1.sendMessage("48454836", "Hello");
        s1.browse("www.cdac.in");
    }
}
