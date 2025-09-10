package defpackage;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kvt implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ kvt(Object obj, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        this.f = i;
        this.e = obj;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f != 0) {
            kva kvaVar = (kva) this.e;
            pfu pfuVar = kvaVar.f;
            boolean z = this.b;
            pfuVar.q(this.a, z, false);
            if (this.c) {
                boolean z2 = this.d;
                scl sclVar = new scl();
                if (z2) {
                    sclVar.d(new pej(CaptureRequest.CONTROL_AF_REGIONS, kvaVar.h.E()));
                }
                if (z) {
                    sclVar.d(new pej(CaptureRequest.CONTROL_AE_REGIONS, kvaVar.h.E()));
                }
                pfuVar.n(sclVar.g());
                return;
            }
            return;
        }
        kvv kvvVar = (kvv) this.e;
        pfu pfuVar2 = kvvVar.o;
        boolean z3 = this.b;
        pfuVar2.q(this.a, z3, false);
        if (this.c) {
            boolean z4 = this.d;
            pdi pdiVarV = pfu.v();
            if (z4) {
                ((pey) pdiVarV).h = kvvVar.u.E();
            }
            if (z3) {
                ((pey) pdiVarV).i = kvvVar.u.E();
            }
            pey peyVar = (pey) pdiVarV;
            peyVar.j = kvvVar.u.E();
            pfuVar2.r(new pex(peyVar));
        }
    }
}
