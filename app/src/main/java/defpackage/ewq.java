package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ewq extends ewu {
    @Override // defpackage.ewu
    public final float a(int i, int i2, int i3, int i4) {
        return Math.min(1.0f, b.a(i, i2, i3, i4));
    }

    @Override // defpackage.ewu
    public final int b(int i, int i2, int i3, int i4) {
        if (a(i, i2, i3, i4) == 1.0f) {
            return 2;
        }
        return b.b(i, i2, i3, i4);
    }
}
