package prac6;

interface Copyable {
    Copyable copy();
}
class ComplicatedObject implements Copyable {
    private Type type;
    public enum Type {
        ONE, TWO
    }

    public ComplicatedObject() {
        this.type = Type.TWO;
    }
    public ComplicatedObject copy() {
        ComplicatedObject complicatedobject = new ComplicatedObject();
        return complicatedobject;
    }
    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return this.type;
    }
}

public class PrototypeTest {
    public static void main(String[] args) {
        ComplicatedObject prototype = new ComplicatedObject();
        System.out.println(prototype.getType());

        ComplicatedObject clone = prototype.copy();
        clone.setType(ComplicatedObject.Type.ONE);
        System.out.println(clone.getType());
    }
}