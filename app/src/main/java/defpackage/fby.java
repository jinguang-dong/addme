package defpackage;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fby extends ojl {
    public final pka a;
    public float b;
    public ltq c;
    private final pbc d;
    private final owq e;
    private final fbz f;
    private final odb g;

    public fby(pbc pbcVar, our ourVar, kgw kgwVar, hwt hwtVar, owq owqVar, owq owqVar2, mdy mdyVar, owf owfVar) {
        super((short[]) null);
        this.b = 0.0f;
        this.c = ltq.ON;
        pbc pbcVarA = pbcVar.a("LowLightAfLock");
        this.d = pbcVarA;
        pka pkaVarL = kgwVar.l();
        this.a = pkaVarL;
        owqVar = pkaVarL == pka.FRONT ? owqVar2 : owqVar;
        this.e = owqVar;
        this.g = new odb(owfVar);
        fbz fbzVar = new fbz(kgwVar, hwtVar, pbcVarA, "cuttlef-af-".concat(String.valueOf(pkaVarL.name())));
        ourVar.d(fbzVar);
        this.f = fbzVar;
        fbzVar.b();
        ourVar.d(owqVar.dK(new fcs(this, mdyVar, 1), sxo.a));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, owf] */
    @Override // defpackage.ojl
    public final void a(poe poeVar) {
        Float f = (Float) poeVar.a(CaptureResult.LENS_FOCUS_DISTANCE);
        rnt.x(f);
        this.b = f.floatValue();
        fbz fbzVar = this.f;
        fbzVar.a(poeVar);
        odb odbVar = this.g;
        if (((Boolean) odbVar.b.dL()).booleanValue()) {
            int iMin = Math.min(odbVar.a + 1, 5);
            odbVar.a = iMin;
            if (iMin >= 5 && !fbzVar.c()) {
                owq owqVar = this.e;
                if (((Integer) owqVar.dL()).intValue() == ltq.ON.f) {
                    Integer num = (Integer) poeVar.a(CaptureResult.CONTROL_AF_STATE);
                    rnt.x(num);
                    if (lnn.a(num.intValue()) == lnn.PASSIVE_UNFOCUSED) {
                        this.d.f("Locking AF");
                        owqVar.a(Integer.valueOf(ltq.ON_LOCKED.f));
                        return;
                    }
                    return;
                }
                return;
            }
        } else {
            odbVar.a = 0;
        }
        owq owqVar2 = this.e;
        if (((Integer) owqVar2.dL()).intValue() == ltq.ON_LOCKED.f) {
            this.d.f("Unlocking AF");
            owqVar2.a(Integer.valueOf(ltq.ON.f));
        }
    }
}
