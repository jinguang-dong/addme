package defpackage;

import android.graphics.Color;
import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ehg implements egy {
    private final egy a;
    private final ehd b;
    private final ehd c;
    private final ehd d;
    private final ehd e;
    private final ehd f;
    private boolean g = true;

    public ehg(egy egyVar, ejh ejhVar, hkk hkkVar) {
        this.a = egyVar;
        ehd ehdVarA = ((eie) hkkVar.d).a();
        this.b = ehdVarA;
        ehdVarA.h(this);
        ejhVar.i(ehdVarA);
        ehd ehdVarA2 = ((eif) hkkVar.a).a();
        this.c = ehdVarA2;
        ehdVarA2.h(this);
        ejhVar.i(ehdVarA2);
        ehd ehdVarA3 = ((eif) hkkVar.c).a();
        this.d = ehdVarA3;
        ehdVarA3.h(this);
        ejhVar.i(ehdVarA3);
        ehd ehdVarA4 = ((eif) hkkVar.b).a();
        this.e = ehdVarA4;
        ehdVarA4.h(this);
        ejhVar.i(ehdVarA4);
        ehd ehdVarA5 = ((eif) hkkVar.e).a();
        this.f = ehdVarA5;
        ehdVarA5.h(this);
        ejhVar.i(ehdVarA5);
    }

    public final void a(Paint paint) {
        if (this.g) {
            this.g = false;
            double dFloatValue = ((Float) this.d.e()).floatValue();
            float fFloatValue = ((Float) this.e.e()).floatValue();
            double d = dFloatValue * 0.017453292519943295d;
            float fSin = ((float) Math.sin(d)) * fFloatValue;
            float fCos = ((float) Math.cos(d + 3.141592653589793d)) * fFloatValue;
            int iIntValue = ((Integer) this.b.e()).intValue();
            paint.setShadowLayer(((Float) this.f.e()).floatValue(), fSin, fCos, Color.argb(Math.round(((Float) this.c.e()).floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }

    public final void b(elq elqVar) {
        this.b.d = elqVar;
    }

    public final void c(elq elqVar) {
        this.d.d = elqVar;
    }

    @Override // defpackage.egy
    public final void d() {
        this.g = true;
        this.a.d();
    }

    public final void e(elq elqVar) {
        this.e.d = elqVar;
    }

    public final void f(elq elqVar) {
        ehd ehdVar = this.c;
        if (elqVar == null) {
            ehdVar.d = null;
        } else {
            ehdVar.d = new ehf(elqVar);
        }
    }

    public final void g(elq elqVar) {
        this.f.d = elqVar;
    }
}
