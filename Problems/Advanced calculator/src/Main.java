/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        String operator = args[0];
        // write your code here

        switch (operator) {
            case "MAX":
                int maxValue = Integer.parseInt(args[1]);
                for (int i = 1; i < args.length; i++) {
                    if (Integer.parseInt(args[i]) > maxValue) {
                        maxValue = Integer.parseInt(args[i]);
                    }
                }
                System.out.println(maxValue);
                break;
            case "MIN":
                int minValue = Integer.parseInt(args[1]);
                for (int i = 1; i < args.length; i++) {
                    if (Integer.parseInt(args[i]) < minValue) {
                        minValue = Integer.parseInt(args[i]);
                    }
                }
                System.out.println(minValue);
                break;
            case "SUM":
                int sum = 0;
                for (int i = 1; i < args.length; i++) {
                    sum += Integer.parseInt(args[i]);
                }
                System.out.println(sum);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}