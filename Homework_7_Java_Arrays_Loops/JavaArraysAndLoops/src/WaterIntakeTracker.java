public class WaterIntakeTracker {
    public static void main(String[] args) {

        int[] waterIntake = {4, 2, 1, 2, 0, 4, 3};

        int totalWater = 0;
        int i = 0;

        while (i < waterIntake.length) {
            if (waterIntake[i] >= 2) {
                totalWater += waterIntake[i];
            }
            i++;
        }
        System.out.println("Загальна кількість випитих склянок води за тиждень: " + totalWater);
    }
}
