/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        String operator = args[0];
        // write your code here

        switch (operator){
            case "MAX":
                getMax(args);
                break;
            case "MIN":
                getMin(args);
                break;
            case "SUM":
                getSum(args);
                break;
        }
    }

    private static void getSum(String[] args) {
        int sum = 0;
        for (int i = 1; i < args.length; i++){
            sum += Integer.parseInt(args[i]);
        }
        System.out.println(sum);
    }

    private static void getMin(String[] args) {
        int minValue = Integer.parseInt(args[0]);
        for (int i = 1; i < args.length; i++){
            if (Integer.parseInt(args[0]) < minValue){
                minValue = Integer.parseInt(args[i]);
            }
        }
        System.out.println(minValue);
    }
    private static void getMax(String[] args) {
        int maxValue = Integer.parseInt(args[0]);
        for (int i = 1; i < args.length; i++){
            if (Integer.parseInt(args[i]) > maxValue){
                maxValue = Integer.parseInt(args[i]);
            }
        }
        System.out.println(maxValue);
    }
}