public class Conversion {
    
        public static String timeConversion(String s) {
        String newS = s.toUpperCase();
        
        
        if(newS.contains("AM")){
            String noHora = newS.substring(0, newS.indexOf("AM"));
            String horaMil = "";
            String [] separat = noHora.split(":");
            
            if(Integer.parseInt(separat[0]) < 12){
                horaMil += String.format("%02d", Integer.valueOf(separat[0]));
                horaMil += ":" + separat[1];
                horaMil += ":" + separat[2];
            }else{
                horaMil += "00";
                horaMil += ":" + separat[1];
                horaMil += ":" + separat[2];
            }
            return horaMil;
        }else{
            String noHora = newS.substring(0, newS.indexOf("PM"));
            String horaMil = "";
            String[] separat = noHora.split(":");
            if(Integer.parseInt(separat[0]) < 12){
                int nPr = 12 + Integer.parseInt(separat[0]);
                horaMil += String.format("%02d", nPr);
                horaMil += ":" + separat[1];
                horaMil += ":" + separat[2];
            }else{
                horaMil += "12";
                horaMil += ":" + separat[1];
                horaMil += ":" + separat[2];
            }
            return horaMil;
        }
    }

}

