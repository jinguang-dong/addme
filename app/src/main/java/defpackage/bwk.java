package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bwk implements bsq {
    private final bru a;
    private final int b;
    private final int c;
    private final /* synthetic */ int d;

    public bwk(bru bruVar, int i, int i2, int i3) {
        this.d = i3;
        this.a = bruVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.bru
    public final int c(int i) {
        int i2 = this.d;
        bru bruVar = this.a;
        return i2 != 0 ? bruVar.c(i) : bruVar.c(i);
    }

    @Override // defpackage.bru
    public final int d(int i) {
        int i2 = this.d;
        bru bruVar = this.a;
        return i2 != 0 ? bruVar.d(i) : bruVar.d(i);
    }

    @Override // defpackage.bru
    public final int e(int i) {
        int i2 = this.d;
        bru bruVar = this.a;
        return i2 != 0 ? bruVar.e(i) : bruVar.e(i);
    }

    @Override // defpackage.bru
    public final int f(int i) {
        int i2 = this.d;
        bru bruVar = this.a;
        return i2 != 0 ? bruVar.f(i) : bruVar.f(i);
    }

    @Override // defpackage.bru
    public final Object g() {
        int i = this.d;
        bru bruVar = this.a;
        return i != 0 ? bruVar.g() : bruVar.g();
    }

    @Override // defpackage.bsq
    public final bte r(long j) {
        if (this.d != 0) {
            if (this.c == 1) {
                return new brm(this.b == 2 ? this.a.d(cho.a(j)) : this.a.f(cho.a(j)), cho.g(j) ? cho.a(j) : 32767);
            }
            return new brm(cho.h(j) ? cho.b(j) : 32767, this.b == 2 ? this.a.c(cho.b(j)) : this.a.e(cho.b(j)));
        }
        if (this.c == 1) {
            return new bwl(this.b == 2 ? this.a.d(cho.a(j)) : this.a.f(cho.a(j)), cho.g(j) ? cho.a(j) : 32767);
        }
        return new bwl(cho.h(j) ? cho.b(j) : 32767, this.b == 2 ? this.a.c(cho.b(j)) : this.a.e(cho.b(j)));
    }
}
