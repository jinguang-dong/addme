package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pbm implements AutoCloseable {
    private final pbn a;

    public pbm(pbn pbnVar, String str) {
        this.a = pbnVar;
        pbnVar.f(str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.g();
    }
}
