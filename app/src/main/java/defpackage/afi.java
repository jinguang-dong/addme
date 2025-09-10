package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afi implements blp {
    public static final afi a = new afi();

    private afi() {
    }

    @Override // defpackage.blp
    public final blh a(long j, cib cibVar, chq chqVar) {
        float fMo0do = chqVar.mo0do(30.0f);
        return new blf(new bkg(0.0f, -fMo0do, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)) + fMo0do));
    }
}
