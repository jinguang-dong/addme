package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lmf {
    public Rect e;
    private final poj h;
    public pka a = null;
    public ltf b = ltf.UNKNOWN;
    public pao c = pao.CLOCKWISE_0;
    public syu d = null;
    public Long f = null;
    private Long i = null;
    public ltr g = ltr.OFF;

    public lmf(poj pojVar) {
        this.e = null;
        this.h = pojVar;
        this.e = pojVar.e();
    }

    public final lmg a() {
        Long lValueOf = this.f;
        Long lValueOf2 = this.i;
        if (lValueOf == null) {
            lValueOf = Long.valueOf(this.h.d());
        }
        if (lValueOf2 == null) {
            lValueOf2 = Long.valueOf(nnp.a(lValueOf.longValue()));
        }
        poj pojVar = this.h;
        ltf ltfVar = this.b;
        pka pkaVar = this.a;
        pao paoVar = this.c;
        syu syuVar = this.d;
        Rect rectE = this.e;
        if (rectE == null) {
            rectE = pojVar.e();
        }
        return new lmg(pojVar, ltfVar, pkaVar, paoVar, syuVar, rectE, lValueOf.longValue(), lValueOf2.longValue(), this.g);
    }

    public final void b(long j) {
        this.i = Long.valueOf(j);
    }
}
