   public static int countBanknotes(int sum){
        int[] notes = new int[]{ 500, 200, 100, 50, 20, 10, 5, 2, 1 };
        int i = 0;
        int result = 0;
        while (i < notes.length) {
            if (sum >= notes[i]) {
                sum = sum - notes[i];
                result += 1;
            } else {
                i++;
            }
        }
        return result;
    }