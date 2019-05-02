package com.eBricks.log4j2;

class Circle extends Shape{
    private int x;
    private int y;
    private int radius;
    public Circle(int x,int y ,int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void draw(){
        System.out.println("  = " +  this.x + "  Circle Points for Y = "
                + this.y +"   = " + this.radius);
    }
}