package defpackage;

import com.google.android.libraries.oliveoil.natives.TtaZ.VnmwoBe;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cyd extends cwq {
    public final int j = 54321;
    public final cyj k;
    public cye l;
    private cwh m;

    public cyd(cyj cyjVar) {
        this.k = cyjVar;
        if (cyjVar.j != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        cyjVar.j = this;
        cyjVar.d = 54321;
    }

    @Override // defpackage.cwp
    protected final void e() {
        if (cyc.b(2)) {
            toString();
        }
        cyj cyjVar = this.k;
        cyjVar.f = true;
        cyjVar.h = false;
        cyjVar.g = false;
        cyi cyiVar = (cyi) cyjVar;
        List list = cyiVar.c;
        if (list != null) {
            cyiVar.b(list);
            return;
        }
        cyjVar.d();
        cyiVar.a = new cyh(cyiVar);
        cyiVar.a();
    }

    @Override // defpackage.cwp
    protected final void f() {
        if (cyc.b(2)) {
            toString();
        }
        cyj cyjVar = this.k;
        cyjVar.f = false;
        cyjVar.d();
    }

    @Override // defpackage.cwp
    public final void g(cwr cwrVar) {
        super.g(cwrVar);
        this.m = null;
        this.l = null;
    }

    public final void j() {
        cwh cwhVar = this.m;
        cye cyeVar = this.l;
        if (cwhVar == null || cyeVar == null) {
            return;
        }
        super.g(cyeVar);
        d(cwhVar, cyeVar);
    }

    public final void k() {
        if (cyc.b(3)) {
            toString();
        }
        cyj cyjVar = this.k;
        cyjVar.d();
        cyjVar.g = true;
        cye cyeVar = this.l;
        if (cyeVar != null) {
            g(cyeVar);
            if (cyeVar.b) {
                if (cyc.b(2)) {
                    Objects.toString(cyeVar.a);
                }
                rby rbyVar = cyeVar.c;
                rbyVar.a.clear();
                rbyVar.a.notifyDataSetChanged();
            }
        }
        cyd cydVar = cyjVar.j;
        if (cydVar == null) {
            throw new IllegalStateException("No listener register");
        }
        if (cydVar != this) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        cyjVar.j = null;
        cyjVar.h = true;
        cyjVar.f = false;
        cyjVar.g = false;
        cyjVar.i = false;
    }

    public final void l(cwh cwhVar, rby rbyVar) {
        cye cyeVar = new cye(this.k, rbyVar);
        d(cwhVar, cyeVar);
        cwr cwrVar = this.l;
        if (cwrVar != null) {
            g(cwrVar);
        }
        this.m = cwhVar;
        this.l = cyeVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(VnmwoBe.OQmKiZi);
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.j);
        sb.append(" : ");
        cyj cyjVar = this.k;
        sb.append(cyjVar.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cyjVar)));
        sb.append("}}");
        return sb.toString();
    }
}
