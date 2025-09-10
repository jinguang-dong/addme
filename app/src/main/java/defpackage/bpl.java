package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bpl extends bij implements bxd, bww, bun {
    public bps a;
    public boolean b;
    private final String c = "androidx.compose.ui.input.pointer.PointerHoverIcon";

    public bpl(bps bpsVar) {
        this.a = bpsVar;
    }

    private final void f() {
        bps bpsVar;
        uka ukaVar = new uka();
        bad.z(this, new aap(6));
        bpl bplVar = (bpl) ukaVar.a;
        if (bplVar == null || (bpsVar = bplVar.a) == null) {
            bpsVar = this.a;
        }
        e(bpsVar);
    }

    private final void k() {
        if (this.b) {
            this.b = false;
            if (this.w) {
                uka ukaVar = new uka();
                bad.z(this, new aaw(ukaVar, 6));
                bpl bplVar = (bpl) ukaVar.a;
                if (bplVar != null) {
                    bplVar.f();
                } else {
                    e(null);
                }
            }
        }
    }

    @Override // defpackage.bww
    public final void cX() {
        k();
    }

    @Override // defpackage.bij
    public final /* synthetic */ void cY() {
        amo.i(this);
    }

    @Override // defpackage.bij
    public final void cZ() {
        k();
    }

    public final void d() {
        ujw ujwVar = new ujw();
        ujwVar.a = true;
        bad.B(this, new aaw(ujwVar, 7));
        if (ujwVar.a) {
            f();
        }
    }

    @Override // defpackage.bxd
    public final /* synthetic */ Object dc() {
        return this.c;
    }

    public final void e(bps bpsVar) {
        bxu bxuVar = (bxu) bko.H(this, bze.k);
        if (bxuVar != null) {
            if (bpsVar == null) {
                bpsVar = bpr.a;
            }
            bxuVar.a = bpsVar;
            byg.a.a(bxuVar.b, bxuVar.a);
        }
    }

    @Override // defpackage.bww
    public final /* synthetic */ void l() {
        amo.j(this);
    }

    @Override // defpackage.bww
    public final void u(bpp bppVar, int i, long j) {
        if (i == 2) {
            List list = bppVar.a;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = ((bpv) list.get(i2)).i;
                if (!a.p(i3, 3) && !a.p(i3, 4)) {
                    int i4 = bppVar.d;
                    if (a.p(i4, 4)) {
                        this.b = true;
                        d();
                        return;
                    } else {
                        if (a.p(i4, 5)) {
                            k();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.bww
    public final /* synthetic */ void v() {
    }

    @Override // defpackage.bww
    public final /* synthetic */ void y() {
    }
}
