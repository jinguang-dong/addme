package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ako implements akp {
    private final /* synthetic */ int a;

    public ako(int i) {
        this.a = i;
    }

    @Override // defpackage.akp
    public final /* synthetic */ float a() {
        return 0.0f;
    }

    @Override // defpackage.akp
    public final void b(chq chqVar, int i, int[] iArr, int[] iArr2) {
        if (this.a != 0) {
            akq.b(i, iArr, iArr2, false);
        } else {
            akq.d(iArr, iArr2);
        }
    }

    public final String toString() {
        return this.a != 0 ? "Arrangement#Bottom" : "Arrangement#Top";
    }
}
