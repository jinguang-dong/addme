package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qfd implements qfo {
    public static final float[] a = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    public final qin b;
    public rwc c = rvk.a;

    public qfd(qin qinVar) {
        this.b = qinVar;
    }

    public final void a(qin qinVar) {
        qin qinVar2 = this.b;
        if (qinVar != qinVar2) {
            throw new IllegalArgumentException(mn.j(qinVar2, qinVar, "Input to GLTextureCopier must be on the copier's GL context. Found input on context ", " but expect input to be on "));
        }
    }

    @Override // defpackage.qfo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
