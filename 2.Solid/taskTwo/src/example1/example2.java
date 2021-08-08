package example1;

abstract class shapes {
    abstract public void draw();
}

class Circle extends shapes {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle with radius " + this.radius);
    }
}

class Square extends shapes {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square with side " + this.side);
    }
}

class DrawShapes {
    public void draw(shapes[] shapes) {
        for (shapes shape : shapes) {
            shape.draw();
        }
    }
}