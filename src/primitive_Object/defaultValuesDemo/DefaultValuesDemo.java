package primitive_Object.defaultValuesDemo;

public class DefaultValuesDemo {
    int intValue;          // mac dinh la 0
    double doubleValue;    // mac dinh la 0.0
    char charValue;        // mac dinh la `\u0000`
    boolean booleanValue;  // mac dinh la false

    Integer integerValue;  // mac dinh la null
    Double dDoubleValue;   // mac dinh la null
    String stringValue;    // mac dinh la null

    @Override
    public String toString() {
        return  "intValue=" + intValue +
                ", doubleValue=" + doubleValue +
                ", charValue=" + charValue +
                ", booleanValue=" + booleanValue +
                ", integerValue=" + integerValue +
                ", dDoubleValue=" + dDoubleValue +
                ", stringValue=" + stringValue;
    }

    public static void main(String[] args) {
    DefaultValuesDemo demo = new DefaultValuesDemo();
    System.out.println(demo.toString());
    }

}
