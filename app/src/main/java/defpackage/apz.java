package defpackage;

import com.google.android.apps.camera.ui.hotshot.yElM.PNlJufQ;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apz extends apu {
    public apz(apv apvVar, apv apvVar2, apv apvVar3, apv apvVar4) {
        super(apvVar, apvVar2, apvVar3, apvVar4);
    }

    @Override // defpackage.apu
    public final blh b(long j, float f, float f2, float f3, float f4, cib cibVar) {
        if (f + f2 + f3 + f4 == 0.0f) {
            return new blf(bko.r(j));
        }
        bkg bkgVarR = bko.r(j);
        cib cibVar2 = cib.a;
        float f5 = cibVar == cibVar2 ? f : f2;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f5);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f5);
        float f6 = cibVar != cibVar2 ? f : f2;
        long jFloatToRawIntBits3 = Float.floatToRawIntBits(f6);
        long jFloatToRawIntBits4 = Float.floatToRawIntBits(f6);
        float f7 = cibVar == cibVar2 ? f3 : f4;
        long jFloatToRawIntBits5 = Float.floatToRawIntBits(f7);
        long jFloatToRawIntBits6 = Float.floatToRawIntBits(f7);
        float f8 = cibVar != cibVar2 ? f3 : f4;
        return new blg(bdq.r(bkgVarR, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), (jFloatToRawIntBits3 << 32) | (jFloatToRawIntBits4 & 4294967295L), (jFloatToRawIntBits6 & 4294967295L) | (jFloatToRawIntBits5 << 32), (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof apz) {
            apz apzVar = (apz) obj;
            return a.ao(this.a, apzVar.a) && a.ao(this.b, apzVar.b) && a.ao(this.c, apzVar.c) && a.ao(this.d, apzVar.d);
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return PNlJufQ.ElgxgDx + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
