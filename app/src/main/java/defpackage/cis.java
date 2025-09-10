package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cis extends cil {
    @Override // defpackage.cil
    public final void a(cit citVar, cit citVar2) {
        citVar.next = citVar2;
    }

    @Override // defpackage.cil
    public final void b(cit citVar, Thread thread) {
        citVar.thread = thread;
    }

    @Override // defpackage.cil
    public final boolean c(ciu ciuVar, cip cipVar, cip cipVar2) {
        synchronized (ciuVar) {
            if (ciuVar.listeners != cipVar) {
                return false;
            }
            ciuVar.listeners = cipVar2;
            return true;
        }
    }

    @Override // defpackage.cil
    public final boolean d(ciu ciuVar, Object obj, Object obj2) {
        synchronized (ciuVar) {
            if (ciuVar.value != obj) {
                return false;
            }
            ciuVar.value = obj2;
            return true;
        }
    }

    @Override // defpackage.cil
    public final boolean e(ciu ciuVar, cit citVar, cit citVar2) {
        synchronized (ciuVar) {
            if (ciuVar.waiters != citVar) {
                return false;
            }
            ciuVar.waiters = citVar2;
            return true;
        }
    }
}
