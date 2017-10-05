/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20171005;

/**
 *
 * @author merarli
 */
public class Cat {

    private int no;
    private String name;
    private String kind;
    private String kenami;
    private String color;
    private String sex;
    private int age;
    private double weight;

    public Cat() {
    }
    
    public Cat(String name,String kind){
        
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setKenami(String kenami) {
        this.kenami = kenami;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void printCat() {
        System.out.println(name + "(" + kind +") :" + weight);
    }
    

    @Override
    public String toString() {
        return "Cat{" + "no=" + no + ", name=" + name + ", kind=" + kind + ", kenami=" + kenami + ", color=" + color + ", sex=" + sex + ", age=" + age + ", weight=" + weight + '}';
    }

    public String getName() {
        return name;
    }

    public String getKind() {
        return kind;
    }
    
    
}

