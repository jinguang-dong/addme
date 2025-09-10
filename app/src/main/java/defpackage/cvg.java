package defpackage;

import com.google.android.apps.camera.rectiface.Iqz.mPfBwqXsnpXI;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cvg {
    public final float a;
    public final cvc b;

    public cvg(float f, cvc cvcVar) {
        cvcVar.getClass();
        this.a = f;
        this.b = cvcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvg)) {
            return false;
        }
        cvg cvgVar = (cvg) obj;
        return Float.compare(this.a, cvgVar.a) == 0 && a.ao(this.b, cvgVar.b);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ProgressableFeature(progress=" + this.a + mPfBwqXsnpXI.uDnZJaJtxlOSnl + this.b + ')';
    }
}
