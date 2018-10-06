public class Flight{

    private int passangers;
    private int seats;

    public Flight() {
        passangers = 0;
        seats = 150;
    }

    public boolean hasRoom(Flight f2){
        int total = passangers + f2.passangers;
        return total <= seats;
    }

    public  Flight createNewWithBoth(Flight f2){
        Flight newFlight = new Flight();
        newFlight.seats = seats;
        newFlight.passangers = passangers + f2.passangers;
        return newFlight;
    }

    public void add1Passanger(){
        if(passangers < seats)
            passangers += 1;

        else
            handleTooMany();

    }

    private void handleTooMany(){
        System.out.println("Too many");
    }
}

