//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    int [][] weight = new int[][]{{10, 20, 27}, {22, 5, 20}, {30, 20, 10}};
    String[] gym = {"GYM 1", "GYM 2", "GYM 3"};
    String[] months = {"MONTH 1", "MONTH 2", "MONTH 3"};

    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println("GYM WEIGHTLOSS APPLICATION");
    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");

    System.out.printf("%-18s", "");
    for (int month = 0; month < months.length; month++) {
        System.out.printf("%-18s", months[month]);
    }
    System.out.printf("| %-18s%-18s%-18s%-18s", "TOTAL", "AVERAGE", "MIN", "MAX");
    System.out.println();
    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");

    System.out.println();
    for (int gymYear = 0; gymYear < weight.length; gymYear++) {
        System.out.printf("%-18s", gym[gymYear]);

        int total = 0;
        int min = weight[gymYear][0];
        int max = weight[gymYear][0];

        for (int month = 0; month < weight[gymYear].length; month++) {
            int sales = weight[gymYear][month];
            System.out.printf("%-18s", sales + "kg");

            total += sales;
            if (sales > max) {
                max = sales;
            }
            if (sales < min) {
                min = sales;
            }
        }

        double average = (double) total / weight[gymYear].length;
        System.out.printf("| %-18s%-18s%-18s%-18s", total + "kg", String.format ("%.2f", average) + "kg", min + "kg", max + "kg");
        System.out.println();
    }
    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
}