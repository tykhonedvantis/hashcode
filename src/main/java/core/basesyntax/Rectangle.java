package core.basesyntax;

import java.util.Objects;

public class Rectangle {
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
        Rectangle otherRectangle  = (Rectangle) o;
        return Objects.equals(width, otherRectangle.width) && Objects.equals(length, otherRectangle.length) && Objects.equals(color, otherRectangle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length, color);
    }
}
