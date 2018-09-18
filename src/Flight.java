public class Flight{

    int passangers;
    int seats;

    Flight() {
        passangers = 0;
        seats = 150;
    }

    void add1Passanger(){
        if(passangers < seats)
            passangers += 1;

    }
}

