package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jto implements kfm, paq {
    private kfm a;

    public jto(kfm kfmVar) {
        this.a = kfmVar;
    }

    @Override // defpackage.kfm
    public final synchronized void b() {
        kfm kfmVar = this.a;
        if (kfmVar != null) {
            kfmVar.b();
        }
    }

    @Override // defpackage.kfm
    public final synchronized void c(long j) {
        kfm kfmVar = this.a;
        if (kfmVar != null) {
            kfmVar.c(j);
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a = null;
    }

    @Override // defpackage.kfm
    public final synchronized void d() {
        kfm kfmVar = this.a;
        if (kfmVar != null) {
            kfmVar.d();
        }
    }

    @Override // defpackage.kfm
    public final synchronized void e(float f) {
        kfm kfmVar = this.a;
        if (kfmVar != null) {
            kfmVar.e(f);
        }
    }

    @Override // defpackage.kfm
    public final synchronized void f(float f, int i) {
    }

    @Override // defpackage.kfm
    public final synchronized void g(float f, long j) {
        kfm kfmVar = this.a;
        if (kfmVar != null) {
            kfmVar.g(f, j);
        }
    }
}
