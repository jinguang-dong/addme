package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rj {
    public final rq a;
    public us b;
    public final vm c;

    public rj(rq rqVar, und undVar, uiq uiqVar) {
        undVar.getClass();
        this.a = rqVar;
        this.c = new vm(undVar, new sn(uiqVar, this, 1));
        ukc.C(undVar, null, 0, new si(this, (uhb) null, 1), 3);
    }

    static /* synthetic */ String e(Exception exc) {
        return "Unexpected error: " + exc.getMessage();
    }

    public final vj a() {
        vm vmVar = this.c;
        synchronized (vmVar.b) {
            if (vmVar.e) {
                return null;
            }
            int i = vmVar.c + 1;
            vmVar.c = i;
            if (i == 1) {
                uol uolVar = vmVar.d;
                if (uolVar != null) {
                    uolVar.s(null);
                }
                vmVar.d = null;
            }
            return new vk(vmVar);
        }
    }

    public final Object b(uhb uhbVar) {
        Object objE = ung.E(this.a.c, new cre((uhb) null, 1, (byte[]) null), uhbVar);
        uhi uhiVar = uhi.a;
        if (objE != uhiVar) {
            objE = ufg.a;
        }
        return objE == uhiVar ? objE : ufg.a;
    }

    public final String c() {
        return this.a.a;
    }

    public final void d() {
        this.c.b();
        this.a.a();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActiveCamera(cameraId=");
        sb.append((Object) pp.a(c()));
        sb.append(")@");
        String string = Integer.toString(super.hashCode(), 16);
        string.getClass();
        sb.append(string);
        return sb.toString();
    }
}
