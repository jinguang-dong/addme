package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ovs implements paq, ovu {
    private final paq a;
    private final String b;

    public ovs(paq paqVar, String str) {
        this.a = paqVar;
        this.b = str;
    }

    @Override // defpackage.ovu
    public final String b() {
        return this.b;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
