 class RemoveExtraText {
    public static void main(String[] args) {
       
        String original = "Please read - Do not disturb";

  
        String toDelete = "- Do not disturb";

        StringBuilder message = new StringBuilder(original);

  
        int index = message.indexOf(toDelete);


        if (index != -1) {
            message.delete(index, index + toDelete.length());
        }

    
        System.out.println("Cleaned message: " + message.toString());
    }
}
