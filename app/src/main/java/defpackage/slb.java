package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class slb implements skz {
    private static final int c(StackTraceElement[] stackTraceElementArr, Class cls, int i) {
        String name = cls.getName();
        boolean z = false;
        while (i < stackTraceElementArr.length) {
            if (stackTraceElementArr[i].getClassName().equals(name)) {
                z = true;
            } else if (z) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // defpackage.skz
    public final StackTraceElement a(Class cls, int i) {
        ske.f(i >= 0, "skipFrames must be >= 0");
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iC = c(stackTrace, cls, i + 1);
        if (iC != -1) {
            return stackTrace[iC];
        }
        return null;
    }

    @Override // defpackage.skz
    public final StackTraceElement[] b(Class cls, int i, int i2) {
        ske.f(i == -1 || i > 0, "maxDepth must be > 0 or -1");
        ske.f(true, "skipFrames must be >= 0");
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iC = c(stackTrace, cls, i2 + 1);
        if (iC == -1) {
            return new StackTraceElement[0];
        }
        int length = stackTrace.length - iC;
        if (i <= 0 || i >= length) {
            i = length;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i];
        System.arraycopy(stackTrace, iC, stackTraceElementArr, 0, i);
        return stackTraceElementArr;
    }
}
