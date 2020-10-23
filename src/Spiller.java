public class Spiller {

        int point; //Point skal defineres som Int da det involverer hele tal
        String navn; //Navn skal defineres som String da det involverer tekst

        public String getNavn() {
            return navn;
        } //Her gør vi så når man skriver getNavn så får man det definerede Navn

        public void setNavn(String navn) {
            this.navn = navn;
        } //Her gør vi så når man skriver setNavn så definerer vi navnet

        public int getPoint() {
            return point;
        } //Når man skriver getPoint så viser den ens point

        public void setPoint(int point) {
            this.point = point;
        } //Når man skriver setPoint så opdaterer den værdien af ens point
    }


