package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class egm extends egf {
    private final String d;
    private final boolean e;
    private final zb f;
    private final zb g;
    private final RectF h;
    private final int i;
    private final ehd j;
    private final ehd k;
    private final ehd l;
    private ehu m;
    private final int n;

    public egm(efs efsVar, ejh ejhVar, eiu eiuVar) {
        super(efsVar, ejhVar, gsn.an(eiuVar.l), gsn.am(eiuVar.m), eiuVar.g, eiuVar.c, eiuVar.f, eiuVar.h, eiuVar.i);
        this.f = new zb();
        this.g = new zb();
        this.h = new RectF();
        this.d = eiuVar.a;
        this.n = eiuVar.k;
        this.e = eiuVar.j;
        this.i = (int) (efsVar.a.a() / 32.0f);
        ehd ehdVarA = eiuVar.b.a();
        this.j = ehdVarA;
        ehdVarA.h(this);
        ejhVar.i(ehdVarA);
        ehd ehdVarA2 = eiuVar.d.a();
        this.k = ehdVarA2;
        ehdVarA2.h(this);
        ejhVar.i(ehdVarA2);
        ehd ehdVarA3 = eiuVar.e.a();
        this.l = ehdVarA3;
        ehdVarA3.h(this);
        ejhVar.i(ehdVarA3);
    }

    private final int h() {
        float f = this.k.c;
        float f2 = this.i;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.l.c * f2);
        int iRound3 = Math.round(this.j.c * f2);
        int i = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    private final int[] i(int[] iArr) {
        ehu ehuVar = this.m;
        if (ehuVar != null) {
            Integer[] numArr = (Integer[]) ehuVar.e();
            int length = iArr.length;
            int length2 = numArr.length;
            int i = 0;
            if (length == length2) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[length2];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.egf, defpackage.eib
    public final void a(Object obj, elq elqVar) {
        super.a(obj, elqVar);
        if (obj == efx.L) {
            ehu ehuVar = this.m;
            if (ehuVar != null) {
                this.a.k(ehuVar);
            }
            if (elqVar == null) {
                this.m = null;
                return;
            }
            ehu ehuVar2 = new ehu(elqVar);
            this.m = ehuVar2;
            ehuVar2.h(this);
            this.a.i(this.m);
        }
    }

    @Override // defpackage.egf, defpackage.egi
    public final void b(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        Shader radialGradient;
        if (this.e) {
            return;
        }
        c(this.h, matrix, false);
        if (this.n == 1) {
            int iH = h();
            zb zbVar = this.f;
            long j = iH;
            shader = (LinearGradient) zbVar.d(j);
            if (shader == null) {
                PointF pointF = (PointF) this.k.e();
                PointF pointF2 = (PointF) this.l.e();
                jod jodVar = (jod) this.j.e();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, i((int[]) jodVar.b), (float[]) jodVar.a, Shader.TileMode.CLAMP);
                zbVar.g(j, radialGradient);
                shader = radialGradient;
            }
        } else {
            int iH2 = h();
            zb zbVar2 = this.g;
            long j2 = iH2;
            shader = (RadialGradient) zbVar2.d(j2);
            if (shader == null) {
                PointF pointF3 = (PointF) this.k.e();
                PointF pointF4 = (PointF) this.l.e();
                jod jodVar2 = (jod) this.j.e();
                int[] iArrI = i((int[]) jodVar2.b);
                Object obj = jodVar2.a;
                radialGradient = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), iArrI, (float[]) obj, Shader.TileMode.CLAMP);
                zbVar2.g(j2, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        this.b.setShader(shader);
        super.b(canvas, matrix, i);
    }

    @Override // defpackage.egg
    public final String g() {
        return this.d;
    }
}
