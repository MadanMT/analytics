package com.avanseus.algorithms;

public class GenericFactory<T> {
    Class theClass = null;

    public GenericFactory(Class theClass) {
        this.theClass = theClass;
    }

    public T createInstance() throws InstantiationException, IllegalAccessException {
        return (T) this.theClass.newInstance();
    }

    public void test(boolean key){
        if (key){
            key = false;
        }
    }
    public static void main(String[] args) {
        int numberOfPounds = 200;
        double onePoundInKg = 0.4535;
        System.out.println(numberOfPounds * onePoundInKg);
        boolean isChar = true;
        GenericFactory genericFactory = new GenericFactory();
    }
}
