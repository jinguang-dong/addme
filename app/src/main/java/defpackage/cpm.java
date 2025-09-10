package defpackage;

import android.view.View;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cpm {
    static final cpp e = new cpd().a().j().k().l();
    final cpp f;

    public cpm(cpp cppVar) {
        this.f = cppVar;
    }

    public cmh a(int i) {
        return cmh.a;
    }

    public cmh c(int i) {
        if ((i & 8) == 0) {
            return cmh.a;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public cmh d() {
        return cmh.a;
    }

    public cpp e(int i, int i2, int i3, int i4) {
        return e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpm)) {
            return false;
        }
        cpm cpmVar = (cpm) obj;
        return k() == cpmVar.k() && r() == cpmVar.r() && Objects.equals(d(), cpmVar.d()) && Objects.equals(o(), cpmVar.o()) && Objects.equals(s(), cpmVar.s());
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(k()), Boolean.valueOf(r()), d(), o(), s());
    }

    public boolean k() {
        return false;
    }

    public boolean m(int i) {
        return true;
    }

    public cmh o() {
        return cmh.a;
    }

    public cpp p() {
        return this.f;
    }

    public cpp q() {
        return this.f;
    }

    public boolean r() {
        return false;
    }

    public cnq s() {
        return null;
    }

    public cpp t() {
        return this.f;
    }

    public cmh u() {
        return d();
    }

    public cmh v() {
        return d();
    }

    public cmh w() {
        return d();
    }

    public void f(View view) {
    }

    public void g(cmh[] cmhVarArr) {
    }

    public void i(cpp cppVar) {
    }

    public void j(int i) {
    }
}
