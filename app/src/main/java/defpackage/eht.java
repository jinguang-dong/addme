package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eht {
    public ehd a;
    public ehd b;
    public ehd c;
    public ehd d;
    public ehd e;
    public ehh f;
    public ehh g;
    public ehd h;
    public ehd i;
    private final Matrix j = new Matrix();
    private final Matrix k;
    private final Matrix l;
    private final Matrix m;
    private final float[] n;

    public eht(eio eioVar) {
        eii eiiVar = eioVar.a;
        this.a = eiiVar == null ? null : eiiVar.a();
        eip eipVar = eioVar.b;
        this.b = eipVar == null ? null : eipVar.a();
        eik eikVar = eioVar.c;
        this.c = eikVar == null ? null : eikVar.a();
        eif eifVar = eioVar.d;
        this.d = eifVar == null ? null : eifVar.a();
        eif eifVar2 = eioVar.f;
        ehh ehhVar = (ehh) (eifVar2 == null ? null : eifVar2.a());
        this.f = ehhVar;
        if (ehhVar != null) {
            this.k = new Matrix();
            this.l = new Matrix();
            this.m = new Matrix();
            this.n = new float[9];
        } else {
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
        }
        eif eifVar3 = eioVar.g;
        this.g = (ehh) (eifVar3 == null ? null : eifVar3.a());
        eih eihVar = eioVar.e;
        if (eihVar != null) {
            this.e = eihVar.a();
        }
        eif eifVar4 = eioVar.h;
        if (eifVar4 != null) {
            this.h = eifVar4.a();
        } else {
            this.h = null;
        }
        eif eifVar5 = eioVar.i;
        if (eifVar5 != null) {
            this.i = eifVar5.a();
        } else {
            this.i = null;
        }
    }

    private final void f() {
        for (int i = 0; i < 9; i++) {
            this.n[i] = 0.0f;
        }
    }

    public final Matrix a() {
        PointF pointF;
        PointF pointF2;
        Matrix matrix = this.j;
        matrix.reset();
        ehd ehdVar = this.b;
        if (ehdVar != null && (pointF2 = (PointF) ehdVar.e()) != null && (pointF2.x != 0.0f || pointF2.y != 0.0f)) {
            matrix.preTranslate(pointF2.x, pointF2.y);
        }
        ehd ehdVar2 = this.d;
        if (ehdVar2 != null) {
            float fFloatValue = ehdVar2 instanceof ehu ? ((Float) ehdVar2.e()).floatValue() : ((ehh) ehdVar2).k();
            if (fFloatValue != 0.0f) {
                matrix.preRotate(fFloatValue);
            }
        }
        if (this.f != null) {
            float fCos = this.g == null ? 0.0f : (float) Math.cos(Math.toRadians((-r4.k()) + 90.0f));
            float fSin = this.g == null ? 1.0f : (float) Math.sin(Math.toRadians((-r6.k()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r1.k()));
            f();
            float[] fArr = this.n;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f = -fSin;
            fArr[3] = f;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.k;
            matrix2.setValues(fArr);
            f();
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.l;
            matrix3.setValues(fArr);
            f();
            fArr[0] = fCos;
            fArr[1] = f;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.m;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        ehd ehdVar3 = this.c;
        if (ehdVar3 != null) {
            elr elrVar = (elr) ehdVar3.e();
            float f2 = elrVar.a;
            if (f2 != 1.0f || elrVar.b != 1.0f) {
                matrix.preScale(f2, elrVar.b);
            }
        }
        ehd ehdVar4 = this.a;
        if (ehdVar4 != null && (((pointF = (PointF) ehdVar4.e()) != null && pointF.x != 0.0f) || pointF.y != 0.0f)) {
            matrix.preTranslate(-pointF.x, -pointF.y);
        }
        return matrix;
    }

    public final Matrix b(float f) {
        ehd ehdVar = this.b;
        PointF pointF = ehdVar == null ? null : (PointF) ehdVar.e();
        ehd ehdVar2 = this.c;
        elr elrVar = ehdVar2 == null ? null : (elr) ehdVar2.e();
        Matrix matrix = this.j;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (elrVar != null) {
            double d = f;
            matrix.preScale((float) Math.pow(elrVar.a, d), (float) Math.pow(elrVar.b, d));
        }
        ehd ehdVar3 = this.d;
        if (ehdVar3 != null) {
            float fFloatValue = ((Float) ehdVar3.e()).floatValue();
            ehd ehdVar4 = this.a;
            PointF pointF2 = ehdVar4 != null ? (PointF) ehdVar4.e() : null;
            matrix.preRotate(fFloatValue * f, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return matrix;
    }

    public final void c(ejh ejhVar) {
        ejhVar.i(this.e);
        ejhVar.i(this.h);
        ejhVar.i(this.i);
        ejhVar.i(this.a);
        ejhVar.i(this.b);
        ejhVar.i(this.c);
        ejhVar.i(this.d);
        ejhVar.i(this.f);
        ejhVar.i(this.g);
    }

    public final void d(egy egyVar) {
        ehd ehdVar = this.e;
        if (ehdVar != null) {
            ehdVar.h(egyVar);
        }
        ehd ehdVar2 = this.h;
        if (ehdVar2 != null) {
            ehdVar2.h(egyVar);
        }
        ehd ehdVar3 = this.i;
        if (ehdVar3 != null) {
            ehdVar3.h(egyVar);
        }
        ehd ehdVar4 = this.a;
        if (ehdVar4 != null) {
            ehdVar4.h(egyVar);
        }
        ehd ehdVar5 = this.b;
        if (ehdVar5 != null) {
            ehdVar5.h(egyVar);
        }
        ehd ehdVar6 = this.c;
        if (ehdVar6 != null) {
            ehdVar6.h(egyVar);
        }
        ehd ehdVar7 = this.d;
        if (ehdVar7 != null) {
            ehdVar7.h(egyVar);
        }
        ehh ehhVar = this.f;
        if (ehhVar != null) {
            ehhVar.h(egyVar);
        }
        ehh ehhVar2 = this.g;
        if (ehhVar2 != null) {
            ehhVar2.h(egyVar);
        }
    }

    public final boolean e(Object obj, elq elqVar) {
        if (obj == efx.f) {
            ehd ehdVar = this.a;
            if (ehdVar == null) {
                this.a = new ehu(elqVar, new PointF());
                return true;
            }
            ehdVar.d = elqVar;
            return true;
        }
        if (obj == efx.g) {
            ehd ehdVar2 = this.b;
            if (ehdVar2 == null) {
                this.b = new ehu(elqVar, new PointF());
                return true;
            }
            ehdVar2.d = elqVar;
            return true;
        }
        if (obj == efx.h) {
            ehd ehdVar3 = this.b;
            if (ehdVar3 instanceof ehq) {
                ehq ehqVar = (ehq) ehdVar3;
                elq elqVar2 = ehqVar.e;
                ehqVar.e = elqVar;
                return true;
            }
        }
        if (obj == efx.i) {
            ehd ehdVar4 = this.b;
            if (ehdVar4 instanceof ehq) {
                ehq ehqVar2 = (ehq) ehdVar4;
                elq elqVar3 = ehqVar2.f;
                ehqVar2.f = elqVar;
                return true;
            }
        }
        if (obj == efx.o) {
            ehd ehdVar5 = this.c;
            if (ehdVar5 == null) {
                this.c = new ehu(elqVar, new elr());
                return true;
            }
            ehdVar5.d = elqVar;
            return true;
        }
        if (obj == efx.p) {
            ehd ehdVar6 = this.d;
            if (ehdVar6 == null) {
                this.d = new ehu(elqVar, Float.valueOf(0.0f));
                return true;
            }
            ehdVar6.d = elqVar;
            return true;
        }
        if (obj == efx.c) {
            ehd ehdVar7 = this.e;
            if (ehdVar7 == null) {
                this.e = new ehu(elqVar, 100);
                return true;
            }
            ehdVar7.d = elqVar;
            return true;
        }
        if (obj == efx.C) {
            ehd ehdVar8 = this.h;
            if (ehdVar8 == null) {
                this.h = new ehu(elqVar, Float.valueOf(100.0f));
                return true;
            }
            ehdVar8.d = elqVar;
            return true;
        }
        if (obj == efx.D) {
            ehd ehdVar9 = this.i;
            if (ehdVar9 == null) {
                this.i = new ehu(elqVar, Float.valueOf(100.0f));
                return true;
            }
            ehdVar9.d = elqVar;
            return true;
        }
        if (obj == efx.q) {
            if (this.f == null) {
                this.f = new ehh(Collections.singletonList(new elo(Float.valueOf(0.0f))));
            }
            this.f.d = elqVar;
            return true;
        }
        if (obj != efx.r) {
            return false;
        }
        if (this.g == null) {
            this.g = new ehh(Collections.singletonList(new elo(Float.valueOf(0.0f))));
        }
        this.g.d = elqVar;
        return true;
    }
}
