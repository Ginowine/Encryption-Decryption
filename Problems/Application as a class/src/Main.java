class Application {
    static String name = "SimpleApplication";

    static void run(String[] args) {
        // implement me
        System.out.println(name);
        for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }

    public static void main(String[] args){
        String[] input = new String[] {"args1", "args2", "args3"};
        run(input);
    }
}