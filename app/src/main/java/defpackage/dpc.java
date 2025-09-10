package defpackage;

import androidx.wear.ambient.AmbientModeSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dpc implements blp {
    private final dre a;

    public dpc(dre dreVar) {
        this.a = dreVar;
    }

    @Override // defpackage.blp
    public final blh a(long j, cib cibVar, chq chqVar) {
        dre dreVar = this.a;
        dreVar.b(j);
        bkn bknVar = new bkn((byte[]) null);
        bknVar.f(dreVar.b, dreVar.e);
        float f = dreVar.b;
        float f2 = dreVar.e;
        float f3 = dreVar.e;
        AmbientModeSupport.AmbientCallback.k(bknVar, (Float.floatToRawIntBits(f + f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L), f3, f3, 180.0f);
        int i = (int) (j >> 32);
        bknVar.e((Float.intBitsToFloat(i) - dreVar.b) - dreVar.e, 0.0f);
        float fIntBitsToFloat = Float.intBitsToFloat(i) - dreVar.b;
        float f4 = dreVar.e;
        float f5 = dreVar.e;
        AmbientModeSupport.AmbientCallback.k(bknVar, (Float.floatToRawIntBits(fIntBitsToFloat - f4) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), f5, f5, 270.0f);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i);
        float f6 = dreVar.b;
        float fX = chp.x((fIntBitsToFloat2 - (f6 + f6)) / 2.0f, dreVar.e, dreVar.c);
        float f7 = dreVar.d / 2.0f;
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) - dreVar.b;
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2) - f7;
        AmbientModeSupport.AmbientCallback.k(bknVar, (Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3 - fX) << 32), fX, f7, 0.0f);
        bknVar.e(dreVar.b + fX, Float.intBitsToFloat(i2));
        float f8 = dreVar.b + fX;
        float fIntBitsToFloat5 = Float.intBitsToFloat(i2) - f7;
        AmbientModeSupport.AmbientCallback.k(bknVar, (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat5) & 4294967295L), fX, f7, 90.0f);
        return new ble(bknVar);
    }
}
