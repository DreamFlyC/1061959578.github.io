package cn.dsq.no11.test3;

import cn.dsq.no11.test4.CodeTest204Outer;

public class CodeTest204Innermain {
    public static void main(String[] args) {
        CodeTest204Outer outer = new CodeTest204Outer();
        CodeTest204Outer.CodeTest204Inner inener = new CodeTest204Outer().new CodeTest204Inner();
        inener.methodInner();
    }
}
