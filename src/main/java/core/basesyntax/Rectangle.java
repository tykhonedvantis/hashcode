package core.basesyntax;

public class Rectangle {

    private static final int HASH_MULTIPLIER = 31;

    private Integer width;
    private Integer length;
    private String color;

    public Rectangle(Integer width, Integer length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle otherRectangle = (Rectangle) o;
        boolean sameWidth = width == null ? otherRectangle.width == null : width.equals(otherRectangle.width); // if null -> return true only for null, else just compare
        boolean sameLength = length == null ? otherRectangle.length == null : length.equals(otherRectangle.length);
        boolean sameColor = color == null ? otherRectangle.color == null : color.equals(otherRectangle.color);
        return sameWidth && sameLength && sameColor;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = HASH_MULTIPLIER * result + (width == null ? 0 : width.hashCode());
        result = HASH_MULTIPLIER * result + (length == null ? 0 : length.hashCode());
        result = HASH_MULTIPLIER * result + (color == null ? 0 : color.hashCode());
        return result;
    }
}
