 class OrderNumberDisplay {
    public static void main(String[] args) {
        String orderNumber = "INV2025";

       
        StringBuilder sb = new StringBuilder(orderNumber);

        
        sb.reverse();

      
        System.out.println(sb.toString());
    }
}
