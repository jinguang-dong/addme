package defpackage;

import com.google.ar.core.ArCoreApk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fok {
    public final Object a;

    public fok(Object obj) {
        this.a = obj;
    }

    public fnp dN() {
        return (fnp) ezh.k(new fog(this, 4));
    }

    public fnt dO() {
        return (fnt) ezh.k(new fog(this, 8));
    }

    public final fnp p() {
        return (fnp) ezh.k(new fog(this, 6));
    }

    public final void q(float[] fArr) {
        ezh.m(new fjw(this, fArr, 2));
    }

    public final void r(float[] fArr) {
        ezh.m(new fjw(this, fArr, 3));
    }

    public fok() {
        this(ArCoreApk.getInstance());
    }
}
