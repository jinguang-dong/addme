package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ejn extends ejh {
    private final RectF j;
    private final Paint k;
    private final float[] l;
    private final Path m;
    private final ejk n;
    private ehd o;

    public ejn(efs efsVar, ejk ejkVar) {
        super(efsVar, ejkVar);
        this.j = new RectF();
        ege egeVar = new ege();
        this.k = egeVar;
        this.l = new float[8];
        this.m = new Path();
        this.n = ejkVar;
        egeVar.setAlpha(0);
        egeVar.setStyle(Paint.Style.FILL);
        egeVar.setColor(ejkVar.k);
    }

    @Override // defpackage.ejh, defpackage.eib
    public final void a(Object obj, elq elqVar) {
        super.a(obj, elqVar);
        if (obj == efx.K) {
            if (elqVar == null) {
                this.o = null;
            } else {
                this.o = new ehu(elqVar);
            }
        }
    }

    @Override // defpackage.ejh, defpackage.egi
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        ejk ejkVar = this.n;
        float f = ejkVar.i;
        float f2 = ejkVar.j;
        RectF rectF2 = this.j;
        rectF2.set(0.0f, 0.0f, f, f2);
        this.a.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // defpackage.ejh
    public final void j(Canvas canvas, Matrix matrix, int i) {
        ejk ejkVar = this.n;
        int iAlpha = Color.alpha(ejkVar.k);
        if (iAlpha == 0) {
            return;
        }
        ehd ehdVar = this.g.e;
        int iIntValue = ehdVar == null ? 100 : ((Integer) ehdVar.e()).intValue();
        Paint paint = this.k;
        int i2 = (int) ((i / 255.0f) * (((iAlpha / 255.0f) * iIntValue) / 100.0f) * 255.0f);
        paint.setAlpha(i2);
        ehd ehdVar2 = this.o;
        if (ehdVar2 != null) {
            paint.setColorFilter((ColorFilter) ehdVar2.e());
        }
        if (i2 > 0) {
            float[] fArr = this.l;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = ejkVar.i;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = ejkVar.j;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = f2;
            matrix.mapPoints(fArr);
            Path path = this.m;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, paint);
        }
    }
}
