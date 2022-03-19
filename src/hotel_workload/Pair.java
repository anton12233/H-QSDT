package hotel_workload;

public class Pair {

    private int element0;
    private int element1;
    private int eaten = 1;

    public Pair(int element0, int element1) {
        if(element0 >= element1)
            try {
                throw new Exception("The element1 must be larger than the element0"); //рантайм
            } catch (Exception e) {
                e.printStackTrace();
            }

        this.element0 = element0;
        this.element1 = element1;
    }

    public int getElement0() {
        return element0;
    }

    public int getElement1() {
        return element1;
    }

    public void setElement0(int element0) {
        this.element0 =  element0;
    }

    public void setElement1(int element1) {
        this.element1 = element1;
    }

    public void addEaten(int namnam){
        this.eaten +=namnam;
    }

    public boolean isInclude(Pair pair){

        return (((this.element0 >= pair.element0) && (this.element0 < pair.element1))
                ||((this.element1 > pair.element0) && (this.element1 < pair.element1))
                ||((this.element0 <= pair.element0) && (this.element1 >= pair.element1))
                ||((this.element0 >= pair.element0) && (this.element1 <= pair.element1)));
    }

    public int getEaten() {
        return eaten;
    }
}