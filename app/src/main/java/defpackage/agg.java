package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agg implements agi {
    @Override // defpackage.agi
    public final /* synthetic */ float a(float f, float f2, float f3) {
        float f4 = f2 + f;
        if (f >= 0.0f && f4 <= f3) {
            return 0.0f;
        }
        if (f < 0.0f && f4 > f3) {
            return 0.0f;
        }
        float f5 = f4 - f3;
        return Math.abs(f) >= Math.abs(f5) ? f5 : f;
    }
}
