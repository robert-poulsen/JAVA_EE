package valerij.task7;

import java.util.TreeMap;

public interface DataElement {
    public TreeMap accept(DataElementsVisitor visitor);
}
