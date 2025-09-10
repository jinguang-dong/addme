package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hhd extends Exception {
    public final pbw a;
    public final pjr b;
    public final long c;

    /* JADX WARN: Illegal instructions before constructor call */
    public hhd(pjr pjrVar, pbw pbwVar, long j) {
        String str;
        String str2 = pjrVar.a;
        if (j == 0) {
            str = "before opening: ";
        } else {
            str = "after being open for " + Duration.ofNanos(j).toMillis() + " milli seconds: ";
        }
        super("Camera " + str2 + " encountered a fatal error " + str + pbwVar.c());
        this.b = pjrVar;
        this.a = pbwVar;
        this.c = j;
    }
}
