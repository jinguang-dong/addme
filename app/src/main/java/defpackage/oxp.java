package defpackage;

import com.google.android.apps.camera.jni.gxp.Caan.yoGAhrpjU;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oxp {
    public final oxi a;
    public final oxj b;
    public final int c;
    public final oxh d;
    public final int e;
    public final int f;
    public final int g;
    public final float h;
    public final rwc i;
    public final rwc j;

    public oxp() {
        throw null;
    }

    public final int a() {
        return this.d.k;
    }

    public final int b() {
        oxh oxhVar = this.d;
        boolean zH = oxhVar.h();
        int i = this.c;
        return zH ? i : i / oxhVar.a();
    }

    public final int c() {
        return this.d.l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oxp) {
            oxp oxpVar = (oxp) obj;
            if (this.a.equals(oxpVar.a) && this.b.equals(oxpVar.b) && this.c == oxpVar.c && this.d.equals(oxpVar.d) && this.e == oxpVar.e && this.f == oxpVar.f && this.g == oxpVar.g) {
                if (Float.floatToIntBits(this.h) == Float.floatToIntBits(oxpVar.h) && this.i.equals(oxpVar.i) && this.j.equals(oxpVar.j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ Float.floatToIntBits(this.h)) * 1000003) ^ this.i.hashCode();
        return this.j.hashCode() ^ (iHashCode * 1000003);
    }

    public oxp(oxi oxiVar, oxj oxjVar, int i, oxh oxhVar, int i2, int i3, int i4, float f, rwc rwcVar, rwc rwcVar2) {
        oxiVar.getClass();
        this.a = oxiVar;
        oxjVar.getClass();
        this.b = oxjVar;
        this.c = i;
        oxhVar.getClass();
        this.d = oxhVar;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = f;
        this.i = rwcVar;
        this.j = rwcVar2;
    }

    public final String toString() {
        rwb rwbVarW = rnt.W(this);
        rwbVarW.b("camcorderVideoFileFormat", this.a);
        rwbVarW.b("camcorderVideoResolution", this.b);
        rwbVarW.e("videoCaptureBitRate", this.c);
        rwbVarW.e("videoCaptureFrameRate", a());
        rwbVarW.e("videoEncoder", this.e);
        rwbVarW.e("videoEncodingFrameRate", c());
        rwbVarW.d(yoGAhrpjU.LuAeOxkfIAkfgHe, this.h);
        rwbVarW.b("videoQpMax", this.i);
        rwbVarW.b("videoQpMax", this.j);
        return rwbVarW.toString();
    }
}
