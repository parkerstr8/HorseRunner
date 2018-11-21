public class HorseBarn {
    private Horse[] spaces;

    public HorseBarn(Horse[] spaces) {
        this.spaces = spaces;
    }

    public int findHorseSpace(String name) {
        for (int x = 0; x <= spaces.length - 1; x++) {
            if (this.spaces[x] != null && this.spaces[x].getName().equals(name)) {
                return x;
            }
            }

        return -1;


    }


    public void consolidate() {
        for (int x = 0; x <= spaces.length - 1; x++) {
            if (this.spaces[x] ==null)
            {
                for (int i = x + 1; i < this.spaces.length; i++) {
                    if (this.spaces[i] != null) {
                        this.spaces[x] = this.spaces[i];
                        this.spaces[i] = null;
                        i = this.spaces.length;
                    }
                }
            }
        }
    }

    public String toString() {
        String horseInfo = "";
        for (int x = 0; x < this.spaces.length; x++) {
            if (this.spaces[x] != null) {
                horseInfo = horseInfo + "[" + this.spaces[x].getName() + "]";

            }
            else {
                horseInfo = horseInfo + "[null]";
            }


        }
        return horseInfo;
    }
}
