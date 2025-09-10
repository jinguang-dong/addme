package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shv extends shd {
    private final StackTraceElement b;

    public shv(StackTraceElement stackTraceElement) {
        this.b = stackTraceElement;
    }

    @Override // defpackage.shd
    public final int a() {
        return Math.max(this.b.getLineNumber(), 0);
    }

    @Override // defpackage.shd
    public final String b() {
        return this.b.getClassName();
    }

    @Override // defpackage.shd
    public final String c() {
        return this.b.getFileName();
    }

    @Override // defpackage.shd
    public final String d() {
        return this.b.getMethodName();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof shv) && this.b.equals(((shv) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
