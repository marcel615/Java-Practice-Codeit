package oop.lambda;

@FunctionalInterface
public interface GenericFunction <I, O> {

    O apply(I input);
}
