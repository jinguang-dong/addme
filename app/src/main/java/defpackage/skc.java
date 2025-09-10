package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class skc extends sjc {
    public static final sjc a = new skc();

    private skc() {
    }

    @Override // defpackage.sjc
    public final shd a(Class cls, int i) {
        StackTraceElement stackTraceElementA = skw.a(cls, i + 1);
        return stackTraceElementA != null ? new shv(stackTraceElementA) : shd.a;
    }

    @Override // defpackage.sjc
    public final String b(Class cls) {
        StackTraceElement stackTraceElementA = skw.a(cls, 1);
        if (stackTraceElementA != null) {
            return stackTraceElementA.getClassName();
        }
        throw new IllegalStateException("no caller found on the stack for: ".concat(String.valueOf(cls.getName())));
    }

    public final String toString() {
        return "Default stack-based caller finder";
    }
}
