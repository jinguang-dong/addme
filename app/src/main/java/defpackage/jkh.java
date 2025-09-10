package defpackage;

import androidx.wear.ambient.AmbientMode;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jkh {
    public final lae a;
    public boolean b;
    public final hbj c;
    public AmbientMode.AmbientController d;
    private final owq e;
    private final kpb f;
    private final owf g;
    private final owq h;
    private final AtomicBoolean i = new AtomicBoolean(false);
    private final fdq j;

    public jkh(fdq fdqVar, lae laeVar, hbj hbjVar, kpb kpbVar, owq owqVar, owf owfVar, owq owqVar2) {
        this.j = fdqVar;
        this.a = laeVar;
        this.c = hbjVar;
        this.f = kpbVar;
        this.e = owqVar;
        this.g = owfVar;
        this.h = owqVar2;
    }

    public final void a() {
        if (this.i.getAndSet(true)) {
            return;
        }
        hbj hbjVar = this.c;
        owf owfVarH = owl.h(owl.a(this.f, this.e, this.g), new hve(this, hbjVar, 3, null));
        lae laeVar = this.a;
        fdq fdqVar = this.j;
        laeVar.j(fdqVar, owfVarH);
        fdqVar.j().d(this.h.dK(new jbp(this, 16), sxo.a));
    }

    public final void b(boolean z) {
        if (this.b == z) {
            return;
        }
        AmbientMode.AmbientController ambientController = this.d;
        if (ambientController != null) {
            Object obj = ambientController.a;
            if (z) {
                owq owqVar = ((fcy) obj).a;
                ovx ovxVar = (ovx) owqVar;
                fcx fcxVar = (fcx) ovxVar.d;
                fcx fcxVar2 = fcx.AE_LOCKED;
                if (!fcxVar.equals(fcxVar2) && !((fcx) ovxVar.d).equals(fcx.AE_AF_LOCKED)) {
                    owqVar.a(fcxVar2);
                }
            } else {
                owq owqVar2 = ((fcy) obj).a;
                ovx ovxVar2 = (ovx) owqVar2;
                fcx fcxVar3 = (fcx) ovxVar2.d;
                fcx fcxVar4 = fcx.AE_UNLOCKED;
                if (!fcxVar3.equals(fcxVar4) && !((fcx) ovxVar2.d).equals(fcx.UNLOCKED)) {
                    owqVar2.a(fcxVar4);
                }
            }
        }
        this.b = z;
    }
}
