package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brp extends btk {
    public brp() {
        super(null);
    }

    @Override // defpackage.btk
    public final float a(bry bryVar, bry bryVar2) {
        return Float.intBitsToFloat((int) (bryVar2.i(bryVar, (Float.floatToRawIntBits(((int) (bryVar.h() >> 32)) / 2.0f) << 32) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L)) & 4294967295L));
    }

    public brp(uiu uiuVar) {
        super(uiuVar);
    }
}
