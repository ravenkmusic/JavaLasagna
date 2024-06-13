public class Lasagna {
    // define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }

    // define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutes){
        return expectedMinutesInOven() - actualMinutes;
    }

    // define the 'preparationTimeInMinutes()' method

    public int preparationTimeInMinutes(int numOfLayers){
        return numOfLayers * 2;
    }

    // define the 'totalTimeInMinutes()' method

    public int totalTimeInMinutes(int prepTime, int actualMinutes){
        return preparationTimeInMinutes(prepTime) + actualMinutes;
    }
}