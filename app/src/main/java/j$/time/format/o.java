package j$.time.format;

/* loaded from: classes3.dex */
public final class o implements e {
    public final j$.time.temporal.l a;
    public final B b;
    public final x c;
    public volatile j d;

    public o(j$.time.temporal.l lVar, B b, x xVar) {
        this.a = lVar;
        this.b = b;
        this.c = xVar;
    }

    @Override // j$.time.format.e
    public final boolean h(u uVar, StringBuilder sb) {
        Long lA = uVar.a(this.a);
        if (lA == null) {
            return false;
        }
        j$.time.chrono.l lVar = (j$.time.chrono.l) uVar.a.N(j$.time.temporal.m.b);
        String strB = (lVar == null || lVar == j$.time.chrono.s.c) ? this.c.b(this.a, lA.longValue(), this.b, uVar.b.b) : this.c.a(lVar, this.a, lA.longValue(), this.b, uVar.b.b);
        if (strB != null) {
            sb.append(strB);
            return true;
        }
        if (this.d == null) {
            this.d = new j(this.a, 1, 19, A.NORMAL);
        }
        return this.d.h(uVar, sb);
    }

    public final String toString() {
        B b = B.FULL;
        j$.time.temporal.l lVar = this.a;
        B b2 = this.b;
        if (b2 == b) {
            return "Text(" + String.valueOf(lVar) + ")";
        }
        return "Text(" + String.valueOf(lVar) + "," + String.valueOf(b2) + ")";
    }
}
