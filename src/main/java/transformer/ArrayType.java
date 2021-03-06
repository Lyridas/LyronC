package transformer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayType extends VariableType {

    public ArrayType(String name) {
        super(name);
    }

    public VariableType getPointToType() {
        return pointToType;
    }

    public void setPointToType(VariableType pointToType) {
        this.pointToType = pointToType;
    }

    private VariableType pointToType;

    public void setDimensionFactors(List<Integer> dimensionFactors) {
        this.dimensionFactors = dimensionFactors;
    }

    public List<Integer> getDimensionFactors() {
        return dimensionFactors;
    }

    private List<Integer> dimensionFactors = new ArrayList<>();

    @Override
    public int getType() {
        return VariableType.ARRAY_TYPE;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer dimensionFactor : dimensionFactors) {
            stringBuilder.append(String.valueOf(dimensionFactor));
        }
        stringBuilder.append(pointToType.getName());
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayType arrayType = (ArrayType) o;
        return Objects.equals(pointToType, arrayType.pointToType) &&
                Objects.equals(dimensionFactors, arrayType.dimensionFactors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointToType, dimensionFactors);
    }

    @Override
    public int getLength() {
        int length = pointToType.getLength();
        for (Integer dimensionFactor : dimensionFactors) {
            length *= dimensionFactor;
        }
        return length;
    }
}
