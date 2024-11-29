package com.deadman.app;
public class Math {

    public static int  sum(int n1, int n2){
        Subt.sub();
        return n1+n2;
    }

}
/* A classe publica precisa ter o mesmo nome do arquivo mas outra
 * classe pode ser declarada alem da publica
 */
class Subt{
    public static void sub(){
        System.out.println("classe sub");
    }
}