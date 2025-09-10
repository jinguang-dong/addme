package defpackage;

import dalvik.system.VMStack;

/* compiled from: PG */
/* loaded from: classes.dex */
class sjk extends sjc {
    @Override // defpackage.sjc
    public shd a(Class cls, int i) {
        return shd.a;
    }

    @Override // defpackage.sjc
    public String b(Class cls) {
        StackTraceElement stackTraceElementA;
        if (sjm.a) {
            try {
                if (cls.equals(sjm.p())) {
                    return VMStack.getStackClass2().getName();
                }
            } catch (Throwable unused) {
            }
        }
        if (!sjm.b || (stackTraceElementA = skw.a(cls, 1)) == null) {
            return null;
        }
        return stackTraceElementA.getClassName();
    }
}
