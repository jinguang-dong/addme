package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azs implements axr {
    private final axr a;
    private final int b;
    private int c;

    public azs(axr axrVar, int i) {
        this.a = axrVar;
        this.b = i;
    }

    @Override // defpackage.axr
    public final Object a() {
        throw null;
    }

    @Override // defpackage.axr
    public final void b(uiu uiuVar, Object obj) {
        this.a.b(uiuVar, obj);
    }

    @Override // defpackage.axr
    public final void c() {
        throw null;
    }

    @Override // defpackage.axr
    public final void d(Object obj) {
        this.c++;
        this.a.d(obj);
    }

    @Override // defpackage.axr
    public final void g() {
        this.a.g();
    }

    @Override // defpackage.axr
    public final void h() {
        if (this.c <= 0) {
            ayi.i("OffsetApplier up called with no corresponding down");
        }
        this.c--;
        this.a.h();
    }

    @Override // defpackage.axr
    public final void i(int i, Object obj) {
        this.a.i(i + (this.c == 0 ? this.b : 0), obj);
    }

    @Override // defpackage.axr
    public final void j(int i, Object obj) {
        this.a.j(i + (this.c == 0 ? this.b : 0), obj);
    }

    @Override // defpackage.axr
    public final void k(int i, int i2, int i3) {
        int i4 = this.c == 0 ? this.b : 0;
        this.a.k(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.axr
    public final void l(int i, int i2) {
        this.a.l(i + (this.c == 0 ? this.b : 0), i2);
    }

    @Override // defpackage.axr
    public final /* synthetic */ void f() {
    }
}
