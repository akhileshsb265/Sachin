class Medical {
    public static void main(String[] args) {
        String patientName = "Abhishek";
        int patientAge = 35;
        boolean IsEmergency = false; 

        if (patientName=="Ramesh"&& patientAge == 35 && IsEmergency){
            System.out.println(patientName + " is now in stable condition");
        }
        if (patientName=="Suresh" && patientAge == 45 && IsEmergency){
            System.out.println(patientName + " is now in stable condition");
        }
        if (patientName=="Abhishek" && patientAge == 35 && IsEmergency){
            System.out.println(patientName + " is now in stable condition");
        }
        if (patientName=="Abhishek" && patientAge == 36) {
            System.out.println(patientName + " is now in stable condition");
        }
        if (patientName=="Mahesh" && patientAge == 37 && IsEmergency) {
            System.out.println(patientName + " is now in stable condition");
        }
    }
}