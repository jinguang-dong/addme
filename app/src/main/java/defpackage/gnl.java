package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gnl {
    public int a;
    public int b;
    public int c;
    public pka d;
    public gnm e;
    public nkw f;
    public boolean g;
    public byte h;
    public int i;

    public final void a(boolean z) {
        this.g = z;
        this.h = (byte) (this.h | 8);
    }

    public final void b(pka pkaVar) {
        pkaVar.getClass();
        this.d = pkaVar;
    }

    public final void c(int i) {
        this.a = i;
        this.h = (byte) (this.h | 1);
    }

    public final void d(nkw nkwVar) {
        nkwVar.getClass();
        this.f = nkwVar;
    }

    public final void e(int i) {
        this.c = i;
        this.h = (byte) (this.h | 4);
    }

    public final void f(gnm gnmVar) {
        gnmVar.getClass();
        this.e = gnmVar;
    }

    public final void g(int i) {
        this.b = i;
        this.h = (byte) (this.h | 2);
    }
}
