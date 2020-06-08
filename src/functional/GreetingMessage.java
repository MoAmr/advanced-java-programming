package functional;

@FunctionalInterface
public interface GreetingMessage {

    /**
     * A functional interface is an interface that has only one abstract method.
     * @param name
     */
    public abstract void greet(String name);
}
