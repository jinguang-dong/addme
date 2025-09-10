package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bri implements brk {
    private final /* synthetic */ int a;

    public bri(int i) {
        this.a = i;
    }

    @Override // defpackage.brk
    public final long a(long j, long j2) {
        long jFloatToRawIntBits;
        long jFloatToRawIntBits2;
        long jFloatToRawIntBits3;
        long jFloatToRawIntBits4;
        int i = this.a;
        if (i == 0) {
            float fY = byi.y(j, j2);
            jFloatToRawIntBits = Float.floatToRawIntBits(fY);
            jFloatToRawIntBits2 = Float.floatToRawIntBits(fY);
            int i2 = btm.a;
        } else {
            if (i != 1) {
                if (Float.intBitsToFloat((int) (j >> 32)) > Float.intBitsToFloat((int) (j2 >> 32)) || Float.intBitsToFloat((int) (j & 4294967295L)) > Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                    float fY2 = byi.y(j, j2);
                    long jFloatToRawIntBits5 = Float.floatToRawIntBits(fY2);
                    long jFloatToRawIntBits6 = Float.floatToRawIntBits(fY2);
                    jFloatToRawIntBits3 = jFloatToRawIntBits5 << 32;
                    jFloatToRawIntBits4 = jFloatToRawIntBits6 & 4294967295L;
                    int i3 = btm.a;
                } else {
                    jFloatToRawIntBits3 = Float.floatToRawIntBits(1.0f) << 32;
                    jFloatToRawIntBits4 = Float.floatToRawIntBits(1.0f) & 4294967295L;
                    int i4 = btm.a;
                }
                return jFloatToRawIntBits3 | jFloatToRawIntBits4;
            }
            float fMax = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
            jFloatToRawIntBits = Float.floatToRawIntBits(fMax);
            jFloatToRawIntBits2 = Float.floatToRawIntBits(fMax);
            int i5 = btm.a;
        }
        jFloatToRawIntBits3 = jFloatToRawIntBits << 32;
        jFloatToRawIntBits4 = jFloatToRawIntBits2 & 4294967295L;
        return jFloatToRawIntBits3 | jFloatToRawIntBits4;
    }
}
