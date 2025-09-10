package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class knk extends ojl implements owf {
    private final pbc a;
    private final ovx b;
    private int c;
    private final kgw d;

    public knk(pbb pbbVar, kgw kgwVar, kow kowVar) {
        super((short[]) null);
        this.a = pbbVar.a("AutoFlashIndicator");
        this.d = kgwVar;
        boolean z = false;
        if (((kox) kowVar.dL()).equals(kox.ON) && kgwVar.I()) {
            z = true;
        }
        this.b = new ovx(Boolean.valueOf(z));
    }

    @Override // defpackage.ojl
    public final void a(poe poeVar) {
        Integer num;
        if (this.d.I() && (num = (Integer) poeVar.a(CaptureResult.CONTROL_AE_STATE)) != null) {
            if (a.K(num, 4)) {
                ovx ovxVar = this.b;
                if (!((Boolean) ovxVar.d).booleanValue()) {
                    this.a.b("Flash required");
                }
                this.c = 0;
                ovxVar.a(true);
                return;
            }
            if (a.K(num, 2) || a.K(num, 3)) {
                ovx ovxVar2 = this.b;
                if (((Boolean) ovxVar2.d).booleanValue()) {
                    this.a.b("Flash not required");
                }
                this.c = 0;
                ovxVar2.a(false);
                return;
            }
            int i = this.c + 1;
            this.c = i;
            if (i > 30) {
                ovx ovxVar3 = this.b;
                if (((Boolean) ovxVar3.d).booleanValue()) {
                    return;
                }
                this.a.h(ojl.bI("No converged AE result for %d frames,falling back to single-image auto-flash photo", Integer.valueOf(this.c)));
                ovxVar3.a(true);
            }
        }
    }

    @Override // defpackage.owf
    public final paq dK(pau pauVar, Executor executor) {
        return this.b.dK(pauVar, executor);
    }

    @Override // defpackage.owf
    public final /* bridge */ /* synthetic */ Object dL() {
        return (Boolean) this.b.d;
    }
}
