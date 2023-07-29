package com.workintech.model;

public class Wall {

    double width;
    double height;


    public Wall(double  setWidth , double setHeight){
        setWidth(setWidth);
        setHeight(setHeight);
    }
    public double getWidth() {
        return width;
    }
    public double getHeight(){
        return  width;
    }
    public void setWidth(double setWidth){
        if (setWidth<0) this.width=0;

        else this.width=setWidth;

    }
    public void setHeight (double setHeight){
        if (setHeight<0) this.height=0;
        else this.height=setHeight;
    }


    public double getArea(){
        return width*height;
    }



}
