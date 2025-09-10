package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btw extends btk {
    public btw() {
        super(null);
    }

    @Override // defpackage.btk
    public final float a(bry bryVar, bry bryVar2) {
        long jH = bryVar.h() & 4294967295L;
        return Float.intBitsToFloat((int) (bryVar2.i(bryVar, (Float.floatToRawIntBits(((int) jH) / 2.0f) & 4294967295L) | (Float.floatToRawIntBits(Float.NaN) << 32)) >> 32));
    }

    public btw(uiu uiuVar) {
        super(uiuVar);
    }
}
