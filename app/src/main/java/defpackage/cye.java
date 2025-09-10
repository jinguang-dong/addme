package defpackage;

import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cye implements cwr {
    public final cyj a;
    public boolean b = false;
    public final rby c;

    public cye(cyj cyjVar, rby rbyVar) {
        this.a = cyjVar;
        this.c = rbyVar;
    }

    @Override // defpackage.cwr
    public final void b(Object obj) {
        if (cyc.b(2)) {
            Objects.toString(this.a);
            cyj.e(obj);
        }
        this.b = true;
        rby rbyVar = this.c;
        rbyVar.a.clear();
        rbyVar.a.addAll((List) obj);
        rbyVar.a.notifyDataSetChanged();
    }

    public final String toString() {
        return this.c.toString();
    }
}
