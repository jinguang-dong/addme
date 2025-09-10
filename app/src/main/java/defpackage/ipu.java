package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ipu implements pau {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ AtomicBoolean c;
    final /* synthetic */ Runnable d;
    final /* synthetic */ ipv e;

    public ipu(ipv ipvVar, AtomicBoolean atomicBoolean, Runnable runnable, AtomicBoolean atomicBoolean2, Runnable runnable2) {
        this.a = atomicBoolean;
        this.b = runnable;
        this.c = atomicBoolean2;
        this.d = runnable2;
        this.e = ipvVar;
    }

    @Override // defpackage.pau
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        boolean z = false;
        if (!((Boolean) obj).booleanValue()) {
            if (this.e.a.a().equals(pka.FRONT) && (this.a.get() || this.c.get())) {
                this.b.run();
            }
            this.a.set(false);
            this.c.set(false);
            return;
        }
        ipv ipvVar = this.e;
        owf owfVar = ipvVar.d;
        Object objDL = owfVar.dL();
        iqh iqhVar = iqh.SATURN;
        if (objDL != iqhVar || !ipvVar.a.a().equals(pka.FRONT)) {
            Object objDL2 = owfVar.dL();
            iqh iqhVar2 = iqh.URANUS;
            if (objDL2 != iqhVar2 || !ipvVar.a.a().equals(pka.BACK)) {
                owf owfVar2 = ipvVar.b;
                boolean z2 = ((nkw) owfVar2.dL()).equals(nkw.PHOTO) && owfVar.dL() == iqhVar2 && ipvVar.a.a().equals(pka.FRONT);
                if (((nkw) owfVar2.dL()).equals(nkw.VIDEO) && owfVar.dL() == iqhVar) {
                    z = true;
                }
                if (z2 || z) {
                    this.c.set(true);
                    this.d.run();
                    return;
                }
                return;
            }
        }
        this.a.set(true);
        this.b.run();
    }
}
