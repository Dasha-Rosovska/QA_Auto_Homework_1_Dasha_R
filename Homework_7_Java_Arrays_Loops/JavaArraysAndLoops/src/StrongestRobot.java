public class StrongestRobot {
    public static void main(String[] args) {
        int[] weights = {300, 450, 200, 500, 350};

        int maxWeight = weights[0];
        int strongestRobotIndex = 0;

        for (int i = 1; i < weights.length; i++) {
            if (weights[i] > maxWeight) {
                maxWeight = weights[i];
                strongestRobotIndex = i;
            }
        }

        System.out.println("Найсильніший робот: " + (strongestRobotIndex + 1));
        System.out.println("Він підняв: " + maxWeight + " кг");
    }
}
