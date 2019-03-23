package pl.advanced1.lambda.generic;


public class MyGenericSecret<T> {

    private T object;

    public MyGenericSecret(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    @Override
    public String toString() {
        return "MyGenericSecret{" +
                "object=" + object +
                '}';
    }
}
