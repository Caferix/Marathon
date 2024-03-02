public class Marathon {

    private final int[] minutes;
    private String[] names;

    public Marathon(int[]minutesArray, String[]namesArray){
        minutes= minutesArray;
        names= namesArray;
    }

    // findRank metotları ile ilk üç kişinin yarışı bitirme sürelerini tespit ettik
    public int findRank1(){

        int theBest= minutes[0];
        int index=-1;

        for (int minute: minutes){
            if (minute < theBest){
                theBest=minute;
            }
        }



        for (int i = 0; i < minutes.length; i++) {
            if (minutes[i] == theBest) {
                index = i;
                break;
            }
        }
        return theBest;
    }

    public int findRank2(){

        int second=minutes[0];

        for (int minute: minutes){
            if (minute < second && minute > findRank1()){
                second= minute;
            }
        }
        return second;


    }
    public int findRank3(){

        int third= minutes[0];

        for (int minute: minutes){
            if (minute < third && minute > findRank2()){
                third=minute;
            }
        }
        return third;
    }

    // theNameOf metotları ile tespit ettiğimiz sürelerin kime ait olduğunu index bilgisinden faydalanarak bulduk
    // (burada dizilerin içinde tuttuğumuz süreler ve isimler aynı indexlere denk gelmelidir)
    public String theNameOf1(){
        int index1 = -1;

        for (int i = 0; i < minutes.length; i++) {
            if (minutes[i] == findRank1()) {
                index1 = i;
                break;
            }
        }
        return names[index1];


    }
    public String theNameOf2(){
        int index2 = -1;


        for (int i = 0; i < minutes.length; i++) {
            if (minutes[i] == findRank2()) {
                index2 = i;
                break;
            }
        }
        return names[index2];
    }
    public String theNameOf3(){
        int index3 = -1;

        for (int i = 0; i < minutes.length; i++) {
            if (minutes[i] == findRank3()) {
                index3 = i;
                break;
            }
        }
        return names[index3];
    }

    // Bitirme sürelerine göre üç gruba ayırıp sınıflandırdık
    public void siniflandirma() {
        int groupA = 0;
        int groupB = 0;
        int groupC = 0;

        for (int time : minutes) {
            if (time >= 200 && time <= 299) {
                groupA++;
            } else if (time >= 300 && time <= 399) {
                groupB++;
            } else if (time >= 400) {
                groupC++;
            }
        }

        System.out.println("A Grubu-----> " + groupA);
        System.out.println("B Grubu-----> " + groupB);
        System.out.println("C Grubu-----> " + groupC);
    }

    //Cafer Ceviz
}