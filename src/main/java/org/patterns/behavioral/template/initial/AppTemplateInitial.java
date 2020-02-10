package org.patterns.behavioral.template.initial;

public class AppTemplateInitial {
    public static void main(String[] args) {
        DevelopJavaCode developJavaCode = new DevelopJavaCode();
        developJavaCode.keyInCode();
        developJavaCode.compileCode();
        developJavaCode.testCode();

        DevelopCSCode developCSCode = new DevelopCSCode();
        developCSCode.keyInCode();
        developCSCode.compileCode();
        developCSCode.testCode();
    }
}
