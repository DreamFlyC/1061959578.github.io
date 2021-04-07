package test05;

public class Test52 {
    public static void main(String[] args) {
        int a=3;
        Integer b =3;
        Integer c =3;
        System.out.println(a==b);
        System.out.println(b==c);

        Integer n=1;
        Double x =2.0;
        System.out.println(true?n:x);
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
