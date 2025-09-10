package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class djv {
    public float c;
    public float e;
    public float f;
    public float g;
    public final Paint h;
    public final Path i;
    public final Path j;
    public djm k;
    public float l;
    public String a = "";
    public boolean b = true;
    public long d = cid.a;
    private final bbb n = new azv(0.0f);
    private final bbb o = new azv(0.0f);
    private bbo m = new azz(null, bap.c);

    public djv() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFlags(paint.getFlags() | 192);
        this.h = paint;
        this.i = new Path();
        this.j = new Path();
    }

    public final float a() {
        return this.o.e();
    }

    public final float b() {
        return this.n.e();
    }

    public final void c(cfd cfdVar, cfp cfpVar, cfj cfjVar, cfk cfkVar, ayc aycVar, int i) {
        int i2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-936433771);
        if (i3 == 0) {
            i2 = (true != aycVarC.B(cfdVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.B(cfpVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != aycVarC.B(cfjVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != aycVarC.B(cfkVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != aycVarC.D(this) ? 8192 : 16384;
        }
        if (aycVarC.H((i2 & 9363) != 9362, i2 & 1)) {
            qqq qqqVar = (qqq) aycVarC.e(bze.e);
            boolean z = (i2 & 14) == 4;
            boolean z2 = (i2 & ScriptIntrinsicBLAS.TRANSPOSE) == 32;
            boolean zB = aycVarC.B(qqqVar) | z | z2 | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            if (zB || objR == ayb.a) {
                au auVar = new au(qqqVar, cfdVar, cfpVar, 5);
                pmg pmgVar = bbj.a;
                objR = new ayv(auVar, null);
                aygVar.ac(objR);
            }
            this.m = (bbo) objR;
            e();
        } else {
            aycVarC.r();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new awb(this, cfdVar, cfpVar, cfjVar, cfkVar, i, 2);
        }
    }

    public final void d() {
        Rect rect = new Rect();
        String str = this.a;
        int length = str.length();
        Paint paint = this.h;
        paint.getTextBounds(str, 0, length, rect);
        this.n.i(rect.width());
        float f = paint.getFontMetrics().descent - paint.getFontMetrics().ascent;
        float f2 = this.f;
        float f3 = f2 >= 0.0f ? f2 - f : 0.0f;
        float f4 = -paint.getFontMetrics().ascent;
        float f5 = f3 / 2.0f;
        float f6 = paint.getFontMetrics().descent + f5;
        float f7 = f4 + f5;
        this.o.i(f7 + f6);
        if (true == this.b) {
            f6 = f7;
        }
        this.g = f6;
    }

    public final void e() {
        Typeface typeface = (Typeface) this.m.a();
        Paint paint = this.h;
        if (a.ao(typeface, paint.getTypeface())) {
            return;
        }
        paint.setTypeface(typeface);
        d();
        this.k = null;
    }
}
