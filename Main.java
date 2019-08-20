public class Main {

    private static boolean checkName(String name) {
        return false;
    }

    private static boolean checkAge(String age) {
        return false;
    }

    private static boolean checkAddress(String address) {
        return false;
    }

    private static boolean checkEmail(String email) {
        return false;
    }

    public static void main(String[] args) {

        if (args == null || args.length < 2) {
            System.out.println("Please add an argument from following list, and a value :\n" +
                    " * name, age, address, email\n\n" +
                    "e.g : java Main name Jean-Luc");
            return;
        }

        String arg = args[0];
        String text = args[1];
        if (arg == null || arg.isEmpty() || arg.isBlank()) {
            System.out.println("Please add an argument from following list, and a value :\n" +
                    " * name, age, address, email\n\n" +
                    "e.g : java Main name Jean-Luc");
            return;
        }
        if (text == null || text.isEmpty() || text.isBlank()) {
            System.out.println("Please add a value after the argument, e.g :\n" +
                    "java Main name Jean-Luc");
            return;
        }

        switch (arg) {
            case "name":
                if (checkName(text)) {
                    System.out.println("This name is valid.");
                } else {
                    System.out.println("This name is invalid!");
                }
                break;
            case "age":
                if (checkAge(text)) {
                    System.out.println("This age is valid.");
                } else {
                    System.out.println("This age is invalid!");
                }
                break;
            case "address":
                if (checkAddress(text)) {
                    System.out.println("This address is valid.");
                } else {
                    System.out.println("This address is invalid!");
                }
                break;
            case "email":
                if (checkEmail(text)) {
                    System.out.println("This email is valid.");
                } else {
                    System.out.println("This email is invalid!");
                }
                break;
            default:
                System.out.println("Please add an argument from following list :\n" +
                        " * name, age, address, email");
        }
    }
}
