package defpackage;

import android.graphics.Rect;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kqp {
    public final pko a;
    public final pas b;
    public final Rect c;
    private final pko d;

    public kqp(pko pkoVar, pko pkoVar2, pas pasVar, Rect rect) {
        this.a = pkoVar;
        this.d = pkoVar2;
        this.b = pasVar;
        this.c = rect;
    }

    public static kqp a(pjo pjoVar, pas pasVar, int i) throws kqo {
        List<pas> listY = pjoVar.y(i);
        if (listY.isEmpty()) {
            throw new kqo(a.bv(i, "No picture sizes supported for format: "));
        }
        rnt.L(!listY.isEmpty());
        long j = Long.MAX_VALUE;
        pas pasVarBM = null;
        for (pas pasVar2 : listY) {
            long jB = pasVar2.b();
            if (pasVar2.a >= pasVar.a && pasVar2.b >= pasVar.b && jB < j) {
                pasVarBM = pasVar2;
                j = jB;
            }
        }
        if (pasVarBM == null) {
            pasVarBM = ojl.bM(listY);
        }
        return new kqp(new pko(i, pasVarBM), new pko(i, ojl.bM(listY)), pasVar, pae.i(pasVar).e(pasVarBM));
    }

    public final pas b() {
        return this.d.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqp)) {
            return false;
        }
        kqp kqpVar = (kqp) obj;
        return this.b.equals(kqpVar.b) && this.d.equals(kqpVar.d) && this.a.equals(kqpVar.a) && this.c.equals(kqpVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.d, this.a, this.c});
    }

    public final String toString() {
        rwb rwbVar = new rwb("PictureSizeCalculator.Configuration");
        rwbVar.b("desired size", this.b);
        rwbVar.b("large image reader", this.a);
        rwbVar.b("full-size image reader", this.d);
        rwbVar.b("crop", this.c);
        return rwbVar.toString();
    }
}
