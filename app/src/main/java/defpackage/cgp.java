package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgp extends TextPaint {
    public int a;
    private chd b;
    private blo c;
    private bkv d;
    private bks e;
    private bbo f;
    private bki g;
    private fnd h;
    private byi i;

    public cgp(float f) {
        super(1);
        this.density = f;
        this.b = chd.a;
        this.a = 3;
        this.c = blo.a;
    }

    private final void g() {
        this.f = null;
        this.e = null;
        this.g = null;
        setShader(null);
    }

    private final fnd h() {
        fnd fndVar = this.h;
        if (fndVar != null) {
            return fndVar;
        }
        fnd fndVar2 = new fnd(this);
        this.h = fndVar2;
        return fndVar2;
    }

    public final void a(int i) {
        if (a.p(i, this.a)) {
            return;
        }
        h().j(i);
        this.a = i;
    }

    public final void b(bks bksVar, long j, float f) {
        g();
    }

    public final void c(long j) {
        bkv bkvVar = this.d;
        if ((bkvVar != null && a.q(bkvVar.g, j)) || j == 16) {
            return;
        }
        this.d = new bkv(j);
        setColor(bko.h(j));
        g();
    }

    public final void d(blo bloVar) {
        if (bloVar == null || a.ao(this.c, bloVar)) {
            return;
        }
        this.c = bloVar;
        if (a.ao(bloVar, blo.a)) {
            clearShadowLayer();
            return;
        }
        blo bloVar2 = this.c;
        float f = bloVar2.d;
        long j = bloVar2.c;
        float fIntBitsToFloat = Float.intBitsToFloat(0);
        long j2 = this.c.c;
        setShadowLayer(Float.MIN_VALUE, fIntBitsToFloat, Float.intBitsToFloat(0), bko.h(this.c.b));
    }

    public final void e(chd chdVar) {
        if (chdVar == null || a.ao(this.b, chdVar)) {
            return;
        }
        this.b = chdVar;
        setUnderlineText(chdVar.a(chd.b));
        setStrikeThruText(this.b.a(chd.c));
    }

    public final void f(byi byiVar) {
        if (byiVar == null || a.ao(this.i, byiVar)) {
            return;
        }
        this.i = byiVar;
        if (a.ao(byiVar, bmx.a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(byiVar instanceof bmy)) {
            throw new uet();
        }
        h().s(1);
        bmy bmyVar = (bmy) byiVar;
        h().r(bmyVar.a);
        h().q(bmyVar.b);
        h().p(bmyVar.d);
        h().o(bmyVar.c);
        h().t();
    }
}
