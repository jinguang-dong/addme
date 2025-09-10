package defpackage;

import com.google.ar.core.ImageMetadata;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class uvb implements upd {
    public final umb a;
    public final long b;
    private final umb c;
    private final ulz d;

    public uvb(long j, uvb uvbVar, int i) {
        umc umcVar = umc.a;
        this.a = new umb(null, umcVar);
        this.c = new umb(uvbVar, umcVar);
        this.b = j;
        this.d = new ulz(i << 16, umcVar);
    }

    public abstract int a();

    public abstract void l(int i, uhf uhfVar);

    public final Object m() {
        return this.a.a;
    }

    public final uvb n() {
        Object objM = m();
        if (objM == uva.a) {
            return null;
        }
        return (uvb) objM;
    }

    public final uvb o() {
        return (uvb) this.c.a;
    }

    public final void p() {
        this.c.b(null);
    }

    public final void q() {
        Object obj;
        uvb uvbVarN;
        boolean z = unf.a;
        if (r()) {
            return;
        }
        while (true) {
            uvb uvbVarO = o();
            while (uvbVarO != null && uvbVarO.u()) {
                uvbVarO = (uvb) uvbVarO.c.a;
            }
            uvb uvbVarN2 = n();
            uvbVarN2.getClass();
            while (uvbVarN2.u() && (uvbVarN = uvbVarN2.n()) != null) {
                uvbVarN2 = uvbVarN;
            }
            umb umbVar = uvbVarN2.c;
            do {
                obj = umbVar.a;
            } while (!umbVar.d(obj, ((uvb) obj) == null ? null : uvbVarO));
            if (uvbVarO != null) {
                uvbVarO.a.c(uvbVarN2);
            }
            if (!uvbVarN2.u() || uvbVarN2.r()) {
                if (uvbVarO == null || !uvbVarO.u()) {
                    return;
                }
            }
        }
    }

    public final boolean r() {
        return n() == null;
    }

    public final void s() {
        if (this.d.b() == a()) {
            q();
        }
    }

    public final boolean t() {
        return ulz.a.addAndGet(this.d, -65536) == a() && !r();
    }

    public final boolean u() {
        return this.d.b == a() && !r();
    }

    public final boolean v() {
        ulz ulzVar;
        int i;
        do {
            ulzVar = this.d;
            i = ulzVar.b;
            if (i == a() && !r()) {
                return false;
            }
        } while (!ulzVar.c(i, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE + i));
        return true;
    }
}
