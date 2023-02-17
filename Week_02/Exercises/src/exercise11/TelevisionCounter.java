package exercise11;

public final class TelevisionCounter {
    private int counter;
    private boolean isWorking;
    private boolean isTurnedOn;

    public TelevisionCounter() {
        this.counter = 0;
        this.isWorking = true;
        this.isTurnedOn = false;
    }

    public int getCounter() {
        return counter;
    }

    public void addToCounter() {
        this.counter++;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public void toggleTurnedOn() {
//        if(isTurnedOn) {
//            isTurnedOn = false;
//        } else {
//            isTurnedOn = true;
//        }
        isTurnedOn = !isTurnedOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TelevisionCounter that = (TelevisionCounter) o;

        if (counter != that.counter) return false;
        if (isWorking != that.isWorking) return false;
        return isTurnedOn == that.isTurnedOn;
    }

    @Override
    public int hashCode() {
        int result = counter;
        result = 31 * result + (isWorking ? 1 : 0);
        result = 31 * result + (isTurnedOn ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TelevisionCounter{" +
                "counter=" + counter +
                ", isWorking=" + isWorking +
                ", isTurnedOn=" + isTurnedOn +
                '}';
    }
}
