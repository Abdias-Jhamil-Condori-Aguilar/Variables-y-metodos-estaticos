public class Main {
    public static void main(String [] args){
        System.out.println(Util.DOLARES);
        System.out.println(Util.ARGENTINO);
        System.out.println(Util.EUROS);
        double pesos;
        pesos=Util.bolivianosPesos(1000);
        System.out.println(pesos);
        double DOLARES;
        DOLARES=Util.dolaresBolivianos(1000);
        System.out.println(DOLARES);
        double EUROS;
        EUROS=Util.eurosBolivianos(1000);
        System.out.println(EUROS);
    }
}
