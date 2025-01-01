public class CommandLineArgsDemo {
    public static void main(String[] args) {
        // Check if arguments are provided
        if (args.length == 0) {
            System.out.println("No command line arguments provided.");
        } else {
            System.out.println("Command line arguments:");

            // Iterate through the arguments and print them
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        }
    }
}

