package validator.repository;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setName("John", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return !input.isEmpty() &&
                        Character.isUpperCase(input.charAt(0));
            }
        });
        user.setLastName("Smith", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input != null && !input.isEmpty() &&
                        Character.isUpperCase(input.charAt(0));
            }
        });
        user.setAge(20, new Validator<Integer>() {
            @Override
            public boolean validate(Integer input) {
                return input >= 0 && input <= 150;
            }
        });
        user.setLogin("test123456", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.length() == 10;
            }
        });
        user.setPassword("tes!t", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.contains("!");
            }
        });
        System.out.println(user);
    }
}
