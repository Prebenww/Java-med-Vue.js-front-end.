public class VirvelLose extends Animal {
    private int legsNumb;
    private boolean canFly;
    private boolean canSwim;

    public VirvelLose(int legsNumb, boolean canFly, boolean canSwim) {
        this.legsNumb = legsNumb;
        this.canFly = canFly;
        this.canSwim = canSwim;
    }

    public int getLegsNumb() {
        return legsNumb;
    }

    public void setLegsNumb(int legsNumb) {
        this.legsNumb = legsNumb;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }
}
