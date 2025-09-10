package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class leo {
    public byte a;
    private boolean b;
    private int c;

    public leo() {
    }

    public final lep a() {
        if (this.a == 3) {
            return new lep(this.b, this.c);
        }
        throw new IllegalStateException();
    }

    public final void b(boolean z) {
        this.b = z;
        this.a = (byte) (this.a | 1);
    }

    public final void c(int i) {
        this.c = i;
        this.a = (byte) (this.a | 2);
    }

    public final fhi d() {
        if (this.a == 7) {
            return new fhi(this.b, this.c);
        }
        throw new IllegalStateException();
    }

    public final void e(int i) {
        this.c = i;
        this.a = (byte) (this.a | 2);
    }

    public final void f(boolean z) {
        this.b = z;
        this.a = (byte) (this.a | 1);
    }

    public leo(fhi fhiVar) {
        this.b = fhiVar.b;
        this.c = fhiVar.c;
        this.a = (byte) 7;
    }

    public leo(lep lepVar) {
        this.b = lepVar.a;
        this.c = lepVar.b;
        this.a = (byte) 3;
    }
}
