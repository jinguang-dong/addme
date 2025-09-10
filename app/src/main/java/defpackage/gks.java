package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gks {
    private final owf d;
    private boolean c = false;
    public final List a = new ArrayList();
    private boolean e = false;
    paq b = null;

    public gks(owf owfVar) {
        this.d = owfVar;
        owfVar.dK(new gej(this, 6), sxo.a);
    }

    private final void e() {
        if (!this.c) {
            this.e = false;
        } else if (!((Boolean) this.d.dL()).booleanValue() && !this.e) {
            if (this.b == null) {
                List list = this.a;
                if (list.isEmpty()) {
                    return;
                }
                this.b = ((gkq) ujp.aQ(list)).a();
                return;
            }
            return;
        }
        paq paqVar = this.b;
        if (paqVar != null) {
            paqVar.close();
            this.b = null;
        }
    }

    public final synchronized paq a(gkq gkqVar) {
        this.a.add(gkqVar);
        e();
        return new fid(this, gkqVar, 12);
    }

    public final synchronized void b() {
        this.e = true;
        e();
    }

    public final synchronized void c(boolean z) {
        this.c = z;
        e();
    }

    public final synchronized void d() {
        e();
    }
}
