package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ejp extends ejh {
    private ehd A;
    private ehd B;
    private ehd C;
    private ehd D;
    private final StringBuilder j;
    private final RectF k;
    private final Matrix l;
    private final Paint m;
    private final Paint n;
    private final Map o;
    private final zb p;
    private final List q;
    private final ehs r;
    private final efs s;
    private final efh t;
    private ehd u;
    private ehd v;
    private ehd w;
    private ehd x;
    private ehd y;
    private ehd z;

    public ejp(efs efsVar, ejk ejkVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        super(efsVar, ejkVar);
        this.j = new StringBuilder(2);
        this.k = new RectF();
        this.l = new Matrix();
        this.m = new ejo(null);
        this.n = new ejo();
        this.o = new HashMap();
        this.p = new zb();
        this.q = new ArrayList();
        this.s = efsVar;
        this.t = ejkVar.b;
        ehs ehsVarA = ejkVar.p.a();
        this.r = ehsVarA;
        ehsVarA.h(this);
        i(ehsVarA);
        gga ggaVar = ejkVar.w;
        if (ggaVar != null && (obj4 = ggaVar.a) != null) {
            ehd ehdVarA = ((eie) obj4).a();
            this.u = ehdVarA;
            ehdVarA.h(this);
            i(this.u);
        }
        if (ggaVar != null && (obj3 = ggaVar.b) != null) {
            ehd ehdVarA2 = ((eie) obj3).a();
            this.w = ehdVarA2;
            ehdVarA2.h(this);
            i(this.w);
        }
        if (ggaVar != null && (obj2 = ggaVar.d) != null) {
            ehd ehdVarA3 = ((eif) obj2).a();
            this.y = ehdVarA3;
            ehdVarA3.h(this);
            i(this.y);
        }
        if (ggaVar == null || (obj = ggaVar.c) == null) {
            return;
        }
        ehd ehdVarA4 = ((eif) obj).a();
        this.A = ehdVarA4;
        ehdVarA4.h(this);
        i(this.A);
    }

    private final List s(String str, float f, ehy ehyVar, float f2, float f3, boolean z) {
        float f4;
        float fMeasureText;
        int i = 0;
        float f5 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        float f6 = 0.0f;
        int i4 = 0;
        float f7 = 0.0f;
        while (i < str.length()) {
            int i5 = i + 1;
            char cCharAt = str.charAt(i);
            if (z) {
                f4 = 0.0f;
                ehz ehzVar = (ehz) aac.a(this.t.d, ehz.a(cCharAt, ehyVar.a, ehyVar.c));
                if (ehzVar != null) {
                    fMeasureText = ((float) ehzVar.b) * f2 * eln.a();
                } else {
                    i = i5;
                }
            } else {
                f4 = 0.0f;
                fMeasureText = this.m.measureText(str.substring(i, i5));
            }
            float f8 = fMeasureText + f3;
            if (cCharAt == ' ') {
                z2 = true;
                f7 = f8;
            } else {
                if (z2) {
                    f6 = f8;
                    i4 = i;
                } else {
                    f6 += f8;
                }
                z2 = false;
            }
            f5 += f8;
            if (f > f4 && f5 >= f && cCharAt != ' ') {
                i2++;
                fux fuxVarX = x(i2);
                if (i4 == i3) {
                    fuxVarX.a(str.substring(i3, i).trim(), (f5 - f8) - ((r10.length() - r8.length()) * f7));
                    f5 = f8;
                    f6 = f5;
                    i3 = i;
                    i4 = i3;
                } else {
                    fuxVarX.a(str.substring(i3, i4 - 1).trim(), ((f5 - f6) - ((r3.length() - r5.length()) * f7)) - f7);
                    f5 = f6;
                    i3 = i4;
                }
            }
            i = i5;
        }
        if (f5 > 0.0f) {
            i2++;
            x(i2).a(str.substring(i3), f5);
        }
        return this.q.subList(0, i2);
    }

    private static final void t(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private static final void u(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private static final List v(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private static final void w(Canvas canvas, ehx ehxVar, int i, float f) {
        PointF pointF = ehxVar.k;
        PointF pointF2 = ehxVar.l;
        float fA = eln.a();
        float f2 = pointF == null ? 0.0f : (ehxVar.e * fA) + pointF.y;
        float f3 = i * ehxVar.e * fA;
        float f4 = pointF == null ? 0.0f : pointF.x;
        float f5 = pointF2 != null ? pointF2.x : 0.0f;
        int i2 = ehxVar.m;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        float f6 = f3 + f2;
        if (i3 == 0) {
            canvas.translate(f4, f6);
        } else if (i3 == 1) {
            canvas.translate((f4 + f5) - f, f6);
        } else {
            if (i3 != 2) {
                return;
            }
            canvas.translate((f4 + (f5 / 2.0f)) - (f / 2.0f), f6);
        }
    }

    private final fux x(int i) {
        List list = this.q;
        for (int size = list.size(); size < i; size++) {
            list.add(new fux(null));
        }
        return (fux) list.get(i - 1);
    }

    @Override // defpackage.ejh, defpackage.eib
    public final void a(Object obj, elq elqVar) {
        super.a(obj, elqVar);
        if (obj == efx.a) {
            ehd ehdVar = this.v;
            if (ehdVar != null) {
                k(ehdVar);
            }
            if (elqVar == null) {
                this.v = null;
                return;
            }
            ehu ehuVar = new ehu(elqVar);
            this.v = ehuVar;
            ehuVar.h(this);
            i(this.v);
            return;
        }
        if (obj == efx.b) {
            ehd ehdVar2 = this.x;
            if (ehdVar2 != null) {
                k(ehdVar2);
            }
            if (elqVar == null) {
                this.x = null;
                return;
            }
            ehu ehuVar2 = new ehu(elqVar);
            this.x = ehuVar2;
            ehuVar2.h(this);
            i(this.x);
            return;
        }
        if (obj == efx.s) {
            ehd ehdVar3 = this.z;
            if (ehdVar3 != null) {
                k(ehdVar3);
            }
            if (elqVar == null) {
                this.z = null;
                return;
            }
            ehu ehuVar3 = new ehu(elqVar);
            this.z = ehuVar3;
            ehuVar3.h(this);
            i(this.z);
            return;
        }
        if (obj == efx.t) {
            ehd ehdVar4 = this.B;
            if (ehdVar4 != null) {
                k(ehdVar4);
            }
            if (elqVar == null) {
                this.B = null;
                return;
            }
            ehu ehuVar4 = new ehu(elqVar);
            this.B = ehuVar4;
            ehuVar4.h(this);
            i(this.B);
            return;
        }
        if (obj == efx.F) {
            ehd ehdVar5 = this.C;
            if (ehdVar5 != null) {
                k(ehdVar5);
            }
            if (elqVar == null) {
                this.C = null;
                return;
            }
            ehu ehuVar5 = new ehu(elqVar);
            this.C = ehuVar5;
            ehuVar5.h(this);
            i(this.C);
            return;
        }
        if (obj != efx.M) {
            if (obj == efx.O) {
                this.r.d = new ehr(new elp(), elqVar, new ehx());
                return;
            }
            return;
        }
        ehd ehdVar6 = this.D;
        if (ehdVar6 != null) {
            k(ehdVar6);
        }
        if (elqVar == null) {
            this.D = null;
            return;
        }
        ehu ehuVar6 = new ehu(elqVar);
        this.D = ehuVar6;
        ehuVar6.h(this);
        i(this.D);
    }

    @Override // defpackage.ejh, defpackage.egi
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        efh efhVar = this.t;
        rectF.set(0.0f, 0.0f, efhVar.g.width(), efhVar.g.height());
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0127  */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.ejh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(android.graphics.Canvas r27, android.graphics.Matrix r28, int r29) {
        /*
            Method dump skipped, instructions count: 1137
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejp.j(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
