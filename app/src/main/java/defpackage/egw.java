package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egw extends egf {
    private final ejh d;
    private final String e;
    private final boolean f;
    private final ehd g;
    private ehd h;

    public egw(efs efsVar, ejh ejhVar, eje ejeVar) {
        super(efsVar, ejhVar, gsn.an(ejeVar.i), gsn.am(ejeVar.j), ejeVar.g, ejeVar.e, ejeVar.f, ejeVar.c, ejeVar.b);
        this.d = ejhVar;
        this.e = ejeVar.a;
        this.f = ejeVar.h;
        ehd ehdVarA = ejeVar.d.a();
        this.g = ehdVarA;
        ehdVarA.h(this);
        ejhVar.i(ehdVarA);
    }

    @Override // defpackage.egf, defpackage.eib
    public final void a(Object obj, elq elqVar) {
        super.a(obj, elqVar);
        if (obj == efx.b) {
            this.g.d = elqVar;
            return;
        }
        if (obj == efx.K) {
            ehd ehdVar = this.h;
            if (ehdVar != null) {
                this.d.k(ehdVar);
            }
            if (elqVar == null) {
                this.h = null;
                return;
            }
            ehu ehuVar = new ehu(elqVar);
            this.h = ehuVar;
            ehuVar.h(this);
            this.d.i(this.g);
        }
    }

    @Override // defpackage.egf, defpackage.egi
    public final void b(Canvas canvas, Matrix matrix, int i) {
        if (this.f) {
            return;
        }
        Paint paint = this.b;
        paint.setColor(((ehe) this.g).k());
        ehd ehdVar = this.h;
        if (ehdVar != null) {
            paint.setColorFilter((ColorFilter) ehdVar.e());
        }
        super.b(canvas, matrix, i);
    }

    @Override // defpackage.egg
    public final String g() {
        return this.e;
    }
}
