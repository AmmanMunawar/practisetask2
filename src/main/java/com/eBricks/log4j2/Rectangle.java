package com.eBricks.log4j2;

class Rectangle extends Shape{
    private int x;
    private int y;
    private int width;
    private int height;
    public Rectangle(int x,int y ,int width,int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public void draw(){
        System.out.println("Rectangle Points for X = " +  this.x + "  Rectangle Points for Y = "
                + this.y +"  Rectangle Points for width = "
                + this.width +"  Rectangle Points for height = " +this.height);
    }
}