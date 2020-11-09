public class Task4 {
    public static void main(String[] args) {
        double zarplata = 1000.0;
        double premiya = 0;
        int visluga=5;

        if (visluga<5){
            premiya = zarplata*0.1;

        }
        else if (visluga>=5&&visluga<10){
            premiya = zarplata*0.15;
        }
        else if (visluga>=10&&visluga<15){
            premiya = zarplata*0.25;
        }
        else if (visluga>=15&&visluga<20){
            premiya = zarplata*0.35;
        }
        else if (visluga>=20&&visluga<25){
            premiya = zarplata*0.45;
        }
        else if (visluga>=25){
            premiya = zarplata*0.5;
        }
        System.out.println("Премия: " + premiya);
    }
}
