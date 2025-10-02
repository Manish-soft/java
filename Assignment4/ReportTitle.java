 class ReportTitle {
    public static void main(String[] args) {
        String originalTitle = "Annual Report";
        String department = "CDAC";

  
        StringBuilder sb = new StringBuilder(originalTitle);

        int insertIndex = sb.indexOf(" ");

     
        sb.insert(insertIndex, " " + department);

     
        System.out.println(sb.toString());
    }
}
