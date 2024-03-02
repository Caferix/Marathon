public class MarathonTest {
    public static void main(String[] args) {
        int[]minutesArray={341,273,278,329,445,402,388,270,243,334,412,393,299,343,317,265};
        String[]namesArray={"Kadir","Gökhan","Hakan","Suzan","Pınar","Mehmet","Ali","Emel","Fırat","James","Jale","Ersin","Deniz","Gozde","Anil","Burak"};

        Marathon myMarathon= new Marathon(minutesArray, namesArray);

        System.out.println("Birinci: "+myMarathon.theNameOf1()+" "+ myMarathon.findRank1()+"'");
        System.out.println("İkinci: "+myMarathon.theNameOf2()+" "+ myMarathon.findRank2()+"'");
        System.out.println("Üçüncü: "+myMarathon.theNameOf3()+" "+ myMarathon.findRank3()+"'");

        myMarathon.siniflandirma();
    }
}
