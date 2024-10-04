package org.ntut.posd2024f.shapes;

import java.util.Iterator;
import java.util.List;

public class CompoundShape implements Shape { //包含多個形狀
    private final List<Shape> shapes;
    public CompoundShape(List<Shape> shapes) {
        this.shapes=shapes;
    }
    
    public double area() {//計算列表中所有形狀的總面積
        double all=0;
        for(Shape shape:shapes){
            all+=shape.area();
        }
        return all;
    }

    public double perimeter() {//計算列表中所有形狀的總周長
        double all=0;
        for(Shape shape:shapes){
            all+=shape.perimeter();
        }
        return all;
    }

    @Override
    public void add(Shape shape) {//將一個形狀添加到列表中
        shapes.add(shape);
    }

    @Override
    public Iterator<Shape> iterator() {
        //該方法應返回一個迭代器，能遍歷CompoundShape中的元素。
        return shapes.iterator();
    }
}
