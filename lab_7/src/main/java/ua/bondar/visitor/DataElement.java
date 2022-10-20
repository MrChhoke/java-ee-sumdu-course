package ua.bondar.visitor;

public interface DataElement {

    void acceptOperation(DataElementVisitor visitor);

}
