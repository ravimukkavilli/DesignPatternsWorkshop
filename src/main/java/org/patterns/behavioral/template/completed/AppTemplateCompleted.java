package org.patterns.behavioral.template.completed;

public class AppTemplateCompleted {
    public static void main(String[] args) {
        Develop developJavaCode = new DevelopJavaCode();
        developJavaCode.code();

        Develop developCSCode = new DevelopCSCode();
        developCSCode.code();
    }
}
