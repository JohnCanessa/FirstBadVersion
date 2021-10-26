public class VersionControl {

    // **** ****
    public int bad;

    // **** ****
    public VersionControl() {}

    // **** ****
    public VersionControl(int bad) {
        this.bad = bad;
    }

    // **** API of interest ****
    public boolean isBadVersion(int n) {
        return n >= this.bad ? true : false;
    }

}
