package behavioralPatterns.strategy1;

public class Validator {
    private final ValidationStrategy strategy;

    public Validator(ValidationStrategy v) {
        this.strategy = v;
    }

    public boolean validate(String s) {
        return strategy.execute(s);
    }

    public static void main(String[] args) {
        Validator numericValidator = new Validator((String s) -> s.matches("\\d+"));
        System.out.println(numericValidator.validate("aaa"));
        Validator lowerCaseValidator = new Validator((String s) -> s.matches("[a-z]+"));
        System.out.println(lowerCaseValidator.validate("bbb"));
    }
}
