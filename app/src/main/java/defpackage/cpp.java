package defpackage;

import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpp {
    public static final cpp a = cpl.d;
    public final cpm b;

    private cpp(WindowInsets windowInsets) {
        this.b = new cpl(this, windowInsets);
    }

    static cmh h(cmh cmhVar, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, cmhVar.b - i);
        int iMax2 = Math.max(0, cmhVar.c - i2);
        int iMax3 = Math.max(0, cmhVar.d - i3);
        int iMax4 = Math.max(0, cmhVar.e - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? cmhVar : cmh.b(iMax, iMax2, iMax3, iMax4);
    }

    public static cpp n(WindowInsets windowInsets) {
        return o(windowInsets, null);
    }

    public static cpp o(WindowInsets windowInsets, View view) {
        coe.d(windowInsets);
        cpp cppVar = new cpp(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int[] iArr = con.a;
            cppVar.q(coh.a(view));
            cppVar.p(view.getRootView());
            cppVar.b.j(view.getWindowSystemUiVisibility());
        }
        return cppVar;
    }

    @Deprecated
    public final int a() {
        return this.b.d().e;
    }

    @Deprecated
    public final int b() {
        return this.b.d().b;
    }

    @Deprecated
    public final int c() {
        return this.b.d().d;
    }

    @Deprecated
    public final int d() {
        return this.b.d().c;
    }

    public final WindowInsets e() {
        cpm cpmVar = this.b;
        if (cpmVar instanceof cpf) {
            return ((cpf) cpmVar).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cpp) {
            return Objects.equals(this.b, ((cpp) obj).b);
        }
        return false;
    }

    public final cmh f(int i) {
        return this.b.a(i);
    }

    @Deprecated
    public final cmh g() {
        return this.b.o();
    }

    public final int hashCode() {
        cpm cpmVar = this.b;
        if (cpmVar == null) {
            return 0;
        }
        return cpmVar.hashCode();
    }

    public final cnq i() {
        return this.b.s();
    }

    @Deprecated
    public final cpp j() {
        return this.b.t();
    }

    @Deprecated
    public final cpp k() {
        return this.b.p();
    }

    @Deprecated
    public final cpp l() {
        return this.b.q();
    }

    public final cpp m(int i, int i2, int i3, int i4) {
        return this.b.e(i, i2, i3, i4);
    }

    final void p(View view) {
        this.b.f(view);
    }

    final void q(cpp cppVar) {
        this.b.i(cppVar);
    }

    public final boolean r() {
        return this.b.r();
    }

    public cpp() {
        this.b = new cpm(this);
    }
}
