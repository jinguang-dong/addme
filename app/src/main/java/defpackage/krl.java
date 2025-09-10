package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class krl implements ksc {
    public boolean a;
    public nkw b;
    public pka c;
    private int d;

    public krl() {
        gzg gzgVar = haf.a;
    }

    private final void c() {
        this.d = 0;
        this.b = null;
        this.c = null;
        this.a = false;
    }

    public final synchronized void a(int i) {
        c();
        this.d = i;
    }

    public final synchronized void b() {
        if (this.d != 0) {
            c();
        }
    }

    @Override // defpackage.ksc
    public final void w(ksa ksaVar, krs krsVar, int i) {
    }
}
