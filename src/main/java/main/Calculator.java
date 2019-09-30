package main;

class Calculator {
    private XClass x;

    int sum(int a, int b) {
        return a + b;
    }
    int diff(int a, int b) {
        return a - b;
    }

    public void setX(XClass x) {
        this.x = x;
    }

    public XClass getX() {
        return x;
    }
}
