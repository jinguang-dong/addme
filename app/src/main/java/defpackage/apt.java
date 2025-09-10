package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apt extends bij implements cap, bvd {
    public final ago a;
    private boolean b;

    public apt(ago agoVar) {
        this.a = agoVar;
    }

    public static final bkg c(apt aptVar, bry bryVar, uif uifVar) {
        Object objA;
        if (aptVar.w && aptVar.b) {
            bry bryVarZ = bko.z(aptVar);
            if (true != bryVar.dm()) {
                bryVar = null;
            }
            if (bryVar != null && (objA = uifVar.a()) != null) {
                float f = bryVarZ.n(bryVar, false).b;
                return ((bkg) objA).e((Float.floatToRawIntBits(r4.c) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            }
        }
        return null;
    }

    @Override // defpackage.cap
    public final Object d(bry bryVar, uif uifVar, uhb uhbVar) throws Throwable {
        Object objI = ung.i(new aps(this, bryVar, uifVar, new au(this, bryVar, uifVar, 3), null), uhbVar);
        return objI == uhi.a ? objI : ufg.a;
    }

    @Override // defpackage.bij
    public final boolean db() {
        return false;
    }

    @Override // defpackage.bvd
    public final void dd(bry bryVar) {
        this.b = true;
    }

    @Override // defpackage.bvd
    public final /* synthetic */ void k(long j) {
    }
}
