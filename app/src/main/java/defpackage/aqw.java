package defpackage;

import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqw implements baq {
    public final long a;
    public final arn b;
    public aqz c;
    public final bik d;
    private acv e;

    public /* synthetic */ aqw(long j, arn arnVar) {
        aqz aqzVar = aqz.a;
        this.a = j;
        this.b = arnVar;
        this.c = aqzVar;
        aei aeiVar = new aei(this, 14);
        aqx aqxVar = new aqx(aeiVar, arnVar, j);
        aqy aqyVar = new aqy(aeiVar, arnVar, j);
        this.d = bqh.b(bik.c, aqyVar, aqxVar, new arl(aqyVar, aqxVar)).cM(new PointerHoverIconModifierElement(bpr.b));
    }

    @Override // defpackage.baq
    public final void a() {
        if (this.e != null) {
            this.b.h();
            this.e = null;
        }
    }

    @Override // defpackage.baq
    public final void b() {
        if (this.e != null) {
            this.b.h();
            this.e = null;
        }
    }

    @Override // defpackage.baq
    public final void cU() {
        this.e = this.b.i();
    }
}
