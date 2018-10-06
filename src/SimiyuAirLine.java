public class SimiyuAirLine {

    public static void main(String[] args){

        System.out.println("kennedy simiyu flight app  system");

        Flight kkmToBGM = new Flight();

        Flight flight1 = new Flight();
        Flight flight2 = new Flight();

        Flight mumiasToBGM = new Flight();
        mumiasToBGM.add1Passanger();

        // System.out.println(mumiasToBGM.passangers);

        Flight BGM1 = new Flight();
        Flight BGM2 = new Flight();

        Flight BGM3 = new Flight();
        if(BGM1.hasRoom(BGM2))
            BGM3 =
                    BGM1.createNewWithBoth(BGM2);

    }

}
