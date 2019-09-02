package pl.slemjet.state.exercise;

class CombinationLock {
    private int[] combination;
    public String status = "LOCKED";
    private int idx = 0;

    public CombinationLock(int[] combination) {
        this.combination = combination;
    }

    public void enterDigit(int digit) {
        if(status.equals("LOCKED")){
            status = "";
            idx = 0;
        }

        int expectedDigit = combination[idx];

        if (digit == expectedDigit) {
            status += digit;
            idx++;
        } else {
            status = "ERROR";
        }

        if (status.length() == combination.length) {
            status = "OPEN";
        }
    }
}

