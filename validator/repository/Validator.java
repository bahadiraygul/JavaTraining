package validator.repository;

public interface Validator<T> {

    boolean validate(T input);
}
