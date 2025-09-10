package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cka extends cjz {
    public int m;

    public cka(ckh ckhVar) {
        super(ckhVar);
        this.l = true != (ckhVar instanceof cke) ? 3 : 2;
    }

    @Override // defpackage.cjz
    public final void c(int i) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = i;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((cjx) it.next()).f();
        }
    }
}
