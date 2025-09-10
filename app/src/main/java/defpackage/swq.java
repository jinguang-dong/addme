package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class swq extends swo {
    @Override // defpackage.swo
    public final swk a(swv swvVar, swk swkVar) {
        swk swkVar2;
        synchronized (swvVar) {
            swkVar2 = swvVar.listenersField;
            if (swkVar2 != swkVar) {
                swvVar.listenersField = swkVar;
            }
        }
        return swkVar2;
    }

    @Override // defpackage.swo
    public final swu b(swv swvVar, swu swuVar) {
        swu swuVar2;
        synchronized (swvVar) {
            swuVar2 = swvVar.waitersField;
            if (swuVar2 != swuVar) {
                swvVar.waitersField = swuVar;
            }
        }
        return swuVar2;
    }

    @Override // defpackage.swo
    public final void c(swu swuVar, swu swuVar2) {
        swuVar.next = swuVar2;
    }

    @Override // defpackage.swo
    public final void d(swu swuVar, Thread thread) {
        swuVar.thread = thread;
    }

    @Override // defpackage.swo
    public final boolean e(swv swvVar, swk swkVar, swk swkVar2) {
        synchronized (swvVar) {
            if (swvVar.listenersField != swkVar) {
                return false;
            }
            swvVar.listenersField = swkVar2;
            return true;
        }
    }

    @Override // defpackage.swo
    public final boolean f(swv swvVar, Object obj, Object obj2) {
        synchronized (swvVar) {
            if (swvVar.valueField != obj) {
                return false;
            }
            swvVar.valueField = obj2;
            return true;
        }
    }

    @Override // defpackage.swo
    public final boolean g(swv swvVar, swu swuVar, swu swuVar2) {
        synchronized (swvVar) {
            if (swvVar.waitersField != swuVar) {
                return false;
            }
            swvVar.waitersField = swuVar2;
            return true;
        }
    }
}
