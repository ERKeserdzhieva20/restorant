public class Order {
    public int getNumberOfPortions() {
        return numberOfPortions;
    }

    public void setNumberOfPortions(int numberOfPortions) {
        this.numberOfPortions = numberOfPortions;
    }

    public String getTypeOfOrder() {
        return typeOfOrder;
    }

    public void setTypeOfOrder(String typeOfOrder) {
        this.typeOfOrder = typeOfOrder;
    }

    public boolean isCooked() {
        return isCooked;
    }

    public void setCooked(boolean cooked) {
        isCooked = cooked;
    }

    public boolean isTaken() {
        return isTaken;
    }

    public void setTaken(boolean taken) {
        isTaken = taken;
    }

    private int numberOfPortions;
    private String typeOfOrder;
    private boolean isCooked = false;
    private boolean isTaken  = false;

    public boolean isServed() {
        return isServed;
    }

    public void setServed(boolean served) {
        isServed = served;
    }

    private boolean isServed  = false;

     Order (int numberOfPortions, String typeOfOrder){
        this.numberOfPortions = numberOfPortions;
        this.typeOfOrder = typeOfOrder;
    };

    @Override
    public String toString() {
        return  this.numberOfPortions  + " " + this.typeOfOrder;
    }
}
