package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddp implements AutoCloseable {
    public final cxb a;

    public ddp(cxb cxbVar) {
        this.a = cxbVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [dfe, java.lang.Object] */
    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.a.close();
    }
}
