package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eji extends ejh {
    public boolean j;
    private ehd k;
    private final List l;
    private final RectF m;
    private final RectF n;

    public eji(efs efsVar, ejk ejkVar, List list, efh efhVar) {
        ejh ejhVar;
        ejh ejiVar;
        String str;
        super(efsVar, ejkVar);
        this.l = new ArrayList();
        this.m = new RectF();
        this.n = new RectF();
        new Paint();
        this.j = true;
        eif eifVar = ejkVar.q;
        if (eifVar != null) {
            ehd ehdVarA = eifVar.a();
            this.k = ehdVarA;
            i(ehdVarA);
            this.k.h(this);
        } else {
            this.k = null;
        }
        zb zbVar = new zb(efhVar.f.size());
        int size = list.size() - 1;
        ejh ejhVar2 = null;
        while (true) {
            if (size < 0) {
                for (int i = 0; i < zbVar.b(); i++) {
                    ejh ejhVar3 = (ejh) zbVar.d(zbVar.c(i));
                    if (ejhVar3 != null && (ejhVar = (ejh) zbVar.d(ejhVar3.c.e)) != null) {
                        ejhVar3.f = ejhVar;
                    }
                }
                return;
            }
            ejk ejkVar2 = (ejk) list.get(size);
            int i2 = ejkVar2.t;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if (i3 == 0) {
                ejiVar = new eji(efsVar, ejkVar2, (List) efhVar.a.get(ejkVar2.f), efhVar);
            } else if (i3 == 1) {
                ejiVar = new ejn(efsVar, ejkVar2);
            } else if (i3 == 2) {
                ejiVar = new ejj(efsVar, ejkVar2);
            } else if (i3 == 3) {
                ejiVar = new ejl(efsVar, ejkVar2);
            } else if (i3 == 4) {
                ejiVar = new ejm(efsVar, ejkVar2, this, efhVar);
            } else if (i3 != 5) {
                switch (i2) {
                    case 1:
                        str = "PRE_COMP";
                        break;
                    case 2:
                        str = "SOLID";
                        break;
                    case 3:
                        str = "IMAGE";
                        break;
                    case 4:
                        str = "NULL";
                        break;
                    case 5:
                        str = "SHAPE";
                        break;
                    case 6:
                        str = "TEXT";
                        break;
                    default:
                        str = "UNKNOWN";
                        break;
                }
                elg.a("Unknown layer type ".concat(str));
                ejiVar = null;
            } else {
                ejiVar = new ejp(efsVar, ejkVar2);
            }
            if (ejiVar != null) {
                zbVar.g(ejiVar.c.d, ejiVar);
                if (ejhVar2 != null) {
                    ejhVar2.e = ejiVar;
                    ejhVar2 = null;
                } else {
                    this.l.add(0, ejiVar);
                    int i4 = ejkVar2.u;
                    int i5 = i4 - 1;
                    if (i4 == 0) {
                        throw null;
                    }
                    if (i5 == 1 || i5 == 2) {
                        ejhVar2 = ejiVar;
                    }
                }
            }
            size--;
        }
    }

    @Override // defpackage.ejh, defpackage.eib
    public final void a(Object obj, elq elqVar) {
        super.a(obj, elqVar);
        if (obj == efx.E) {
            if (elqVar == null) {
                ehd ehdVar = this.k;
                if (ehdVar != null) {
                    ehdVar.d = null;
                    return;
                }
                return;
            }
            ehu ehuVar = new ehu(elqVar);
            this.k = ehuVar;
            ehuVar.h(this);
            i(this.k);
        }
    }

    @Override // defpackage.ejh, defpackage.egi
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        List list = this.l;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            RectF rectF2 = this.m;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((ejh) list.get(size)).c(rectF2, this.a, true);
            rectF.union(rectF2);
        }
    }

    @Override // defpackage.ejh
    public final void j(Canvas canvas, Matrix matrix, int i) {
        ejk ejkVar = this.c;
        float f = ejkVar.n;
        RectF rectF = this.n;
        rectF.set(0.0f, 0.0f, f, ejkVar.o);
        matrix.mapRect(rectF);
        canvas.save();
        List list = this.l;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                canvas.restore();
                efa.a();
                return;
            } else if ((!this.j && "__container".equals(ejkVar.c)) || rectF.isEmpty() || canvas.clipRect(rectF)) {
                ((ejh) list.get(size)).b(canvas, matrix, i);
            }
        }
    }

    @Override // defpackage.ejh
    public final void l(eia eiaVar, int i, List list, eia eiaVar2) {
        int i2 = 0;
        while (true) {
            List list2 = this.l;
            if (i2 >= list2.size()) {
                return;
            }
            ((ejh) list2.get(i2)).e(eiaVar, i, list, eiaVar2);
            i2++;
        }
    }

    @Override // defpackage.ejh
    public final void m(float f) {
        super.m(f);
        if (this.k != null) {
            float fB = this.b.a.b() + 0.01f;
            efh efhVar = this.c.b;
            f = ((((Float) this.k.e()).floatValue() * efhVar.j) - efhVar.h) / fB;
        }
        if (this.k == null) {
            ejk ejkVar = this.c;
            f -= ejkVar.m / ejkVar.b.b();
        }
        ejk ejkVar2 = this.c;
        float f2 = ejkVar2.l;
        if (f2 != 0.0f && !"__container".equals(ejkVar2.c)) {
            f /= f2;
        }
        List list = this.l;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((ejh) list.get(size)).m(f);
            }
        }
    }
}
