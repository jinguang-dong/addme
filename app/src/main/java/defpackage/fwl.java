package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fwl extends ndp {
    final /* synthetic */ fwn a;
    private boolean b;

    public fwl(fwn fwnVar) {
        this.a = fwnVar;
    }

    @Override // defpackage.ndp, defpackage.ndo
    public final void a() {
        fwn fwnVar = this.a;
        synchronized (fwnVar.q) {
            if (fwnVar.z.Z()) {
                Iterator it = fwnVar.p.iterator();
                while (it.hasNext()) {
                    ((fyt) it.next()).k(false);
                }
                fwnVar.d.G(false);
            } else if (!this.b) {
                gzi gziVar = gzo.a;
            }
            this.b = false;
        }
    }

    @Override // defpackage.ndp, defpackage.ndo
    public final void e() {
        fwn fwnVar = this.a;
        synchronized (fwnVar.q) {
            this.b = true;
            if (!fwnVar.z.Z()) {
                Iterator it = fwnVar.p.iterator();
                while (it.hasNext()) {
                    ((fyt) it.next()).k(false);
                }
            }
        }
    }
}
