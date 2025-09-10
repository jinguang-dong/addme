package defpackage;

import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class can implements ayj, cwf {
    public final bxv a;
    public final ayj b;
    public boolean c;
    public cwc d;
    public uiu e = bza.a;

    public can(bxv bxvVar, ayj ayjVar) {
        this.a = bxvVar;
        this.b = ayjVar;
    }

    @Override // defpackage.cwf
    public final void a(cwh cwhVar, cwa cwaVar) {
        if (cwaVar == cwa.ON_DESTROY) {
            d();
        } else {
            if (cwaVar != cwa.ON_CREATE || this.c) {
                return;
            }
            b(this.e);
        }
    }

    public final void b(uiu uiuVar) {
        aat aatVar = new aat(this, uiuVar, 7);
        bxv bxvVar = this.a;
        byz byzVarE = bxvVar.E();
        if (byzVarE != null) {
            aatVar.a(byzVarE);
        }
        if (bxvVar.isAttachedToWindow()) {
            return;
        }
        bxvVar.x = aatVar;
    }

    @Override // defpackage.ayj
    public final void d() {
        if (!this.c) {
            this.c = true;
            this.a.setTag(R.id.wrapped_composition_tag, null);
            cwc cwcVar = this.d;
            if (cwcVar != null) {
                cwcVar.c(this);
            }
        }
        this.b.d();
    }
}
