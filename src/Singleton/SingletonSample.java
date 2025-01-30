package Singleton;

/* singleton design pattern is used to create signle instrance of class
it is being used in creating dabatbase connection or logging object

to create singleton
three things needs to do
1) create private constructor
2) create static Instance field
3) static getInstance method
 */

public class SingletonSample {
    public static SingletonSample singletonSample;

    private SingletonSample(){

    }
    public static SingletonSample getSingletonInstance(){
        if(singletonSample==null){
            singletonSample=new SingletonSample();

        }
        return singletonSample;
    }
}
