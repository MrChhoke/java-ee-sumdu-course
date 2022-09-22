package ua.bondar.pattern.prototype.shape;


public abstract class Shape {

    private String id;
    protected String type;

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Shape)) {
            return false;
        }
        String checkId = ((Shape) obj).id;
        return id.equals(checkId);
    }

    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}
