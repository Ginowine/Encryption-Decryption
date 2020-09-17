class Problem {
    public static void main(String[] args) {
        int index = 0;
        for (int i = 0; i < args.length; i++){
            if (args[i].equals("test")){
                index = i;
                break;
            }else {
                index = -1;
            }
        }
        System.out.println(index);
    }
}