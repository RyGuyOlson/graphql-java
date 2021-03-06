package graphql.language;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class IntValue extends AbstractNode<IntValue> implements Value<IntValue> {

    private BigInteger value;

    public IntValue(BigInteger value) {
        this.value = value;
    }

    public BigInteger getValue() {
        return value;
    }

    public void setValue(BigInteger value) {
        this.value = value;
    }

    @Override
    public List<Node> getChildren() {
        return new ArrayList<>();
    }

    @Override
    public boolean isEqualTo(Node o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IntValue that = (IntValue) o;

        return !(value != null ? !value.equals(that.value) : that.value != null);

    }

    @Override
    public IntValue deepCopy() {
        return new IntValue(value);
    }

    @Override
    public String toString() {
        return "IntValue{" +
                "value=" + value +
                '}';
    }
}
