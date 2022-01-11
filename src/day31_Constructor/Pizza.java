package day31_Constructor;

public class Pizza {

    public char size;
    public int numOfChzTopping,numOfProniTopping;


    public Pizza(char size, int numOfChzTopping, int numOfProniTopping) {
        this.size = size;
        this.numOfChzTopping = numOfChzTopping;
        this.numOfProniTopping = numOfProniTopping;
    }

    public double calcCost(){
        double startingPrice = (size == 'S')? 10 : (size == 'M')? 12 : 14;

        double totalPrice = startingPrice +(numOfChzTopping + numOfProniTopping)*2;
        return totalPrice;
    }


    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numOfChzTopping=" + numOfChzTopping +
                ", numOfProniTopping=" + numOfProniTopping +
                '}';
    }
}
/*
  Pizza Task:
    	Attributes:
    		size, numberofCheeseTopping, numberOfPepperoniTopping

    		Add a constructor that can set all the fields

		Actions:
			calcCost(): returns the totalCost of the pizza
			toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping


 */