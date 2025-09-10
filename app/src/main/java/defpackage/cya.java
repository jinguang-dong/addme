package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cya implements AutoCloseable, und {
    private final uhf a;

    public cya(uhf uhfVar) {
        uhfVar.getClass();
        this.a = uhfVar;
    }

    @Override // defpackage.und
    public final uhf c() {
        return this.a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ujp.S(this.a, null);
    }
}
