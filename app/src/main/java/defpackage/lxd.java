package defpackage;

import com.google.android.apps.camera.imax.cyclops.audio.xcIh.cdVQ;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lxd {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final mxj e;
    public final Optional f;
    public final boolean g;
    public final lyr h;

    public lxd() {
        throw null;
    }

    public static lxc a(lyr lyrVar) {
        lxc lxcVar = new lxc(null);
        lxcVar.a = lyrVar;
        lxcVar.b(false);
        lxcVar.c(false);
        lxcVar.f(false);
        lxcVar.d(false);
        lxcVar.g(mxj.PHONE_LAYOUT);
        lxcVar.h(Optional.empty());
        lxcVar.e(false);
        return lxcVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lxd) {
            lxd lxdVar = (lxd) obj;
            if (this.h.equals(lxdVar.h) && this.a == lxdVar.a && this.b == lxdVar.b && this.c == lxdVar.c && this.d == lxdVar.d && this.e.equals(lxdVar.e) && this.f.equals(lxdVar.f) && this.g == lxdVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.h.hashCode() ^ 1000003) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (true == this.g ? 1231 : 1237);
    }

    public lxd(lyr lyrVar, boolean z, boolean z2, boolean z3, boolean z4, mxj mxjVar, Optional optional, boolean z5) {
        this.h = lyrVar;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = mxjVar;
        this.f = optional;
        this.g = z5;
    }

    public final String toString() {
        Optional optional = this.f;
        mxj mxjVar = this.e;
        return "{" + String.valueOf(this.h) + ", " + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ", " + String.valueOf(mxjVar) + ", " + String.valueOf(optional) + ", " + this.g + cdVQ.IweckhwBwWdH;
    }
}
