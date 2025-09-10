package defpackage;

import com.google.vr.audio.Cf.qcjAcSmlN;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cve {
    public final cux a;
    public float b;
    public float c;
    final /* synthetic */ cvf d;
    private final float e;

    public cve(cvf cvfVar, cux cuxVar, float f, float f2) {
        cuxVar.getClass();
        this.d = cvfVar;
        this.a = cuxVar;
        if (f2 < f) {
            throw new IllegalArgumentException("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
        }
        this.e = cpo.d(cuxVar);
        this.b = f;
        this.c = f2;
    }

    public final String toString() {
        return "MeasuredCubic(outlineProgress=[" + this.b + " .. " + this.c + "], size=" + this.e + ", cubic=" + this.a + ')';
    }

    public final uev a(float f) {
        float fM = ukc.m(f, this.b, this.c);
        float f2 = this.c;
        float f3 = this.b;
        cux cuxVar = this.a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (cpo.c(cuxVar, ((fM - f3) / (f2 - f3)) * this.e) >> 32));
        if (fIntBitsToFloat < 0.0f || fIntBitsToFloat > 1.0f) {
            throw new IllegalArgumentException(qcjAcSmlN.BmzgrHaLctGF);
        }
        cvf cvfVar = this.d;
        uev uevVarJ = cuxVar.j(fIntBitsToFloat);
        return new uev(new cve(cvfVar, (cux) uevVarJ.a, this.b, fM), new cve(cvfVar, (cux) uevVarJ.b, fM, this.c));
    }
}
