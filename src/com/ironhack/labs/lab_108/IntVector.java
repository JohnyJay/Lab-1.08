package com.ironhack.labs.lab_108;

public class IntVector implements IntList{
    private int length;
    private int usage;
    private int[] array;

    public IntVector() {
        this.length = 20;
        this.usage = 0;
        this.array = new int[length];
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getUsage() {
        return usage;
    }

    public void setUsage(int usage) {
        this.usage = usage;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public void add(int number) {

        if(usage<length){
            array[usage]=number;
            usage++;
        }else{
            length = (length * 2);
            int[] temp = array;
            array = new int[length];
            System.arraycopy(temp, 0, array, 0, temp.length);
            array[usage]=number;
            usage++;
        }

    }

    @Override
    public int get(int id) {
        return array[id];
    }

    public String arrayInfo(){
        return "The current length of the array is "+getLength()+" and the current usage is "+getUsage();
    }
}
