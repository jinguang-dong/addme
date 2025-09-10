package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.wear.ambient.AmbientMode;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dju extends djk {
    private final String a;
    private final boolean b;
    private final uiu c;
    private djv e;
    private djw f;
    private bte g;
    private float h;

    public dju(String str, boolean z, uiu uiuVar) {
        this.a = str;
        this.b = z;
        this.c = uiuVar;
    }

    @Override // defpackage.djk
    public final float a(float f, float f2, long j) {
        this.h = f2;
        return f;
    }

    @Override // defpackage.djk
    public final float b(float f) {
        djv djvVar = this.e;
        if (djvVar == null) {
            ujp.c("delegate");
            djvVar = null;
        }
        return djvVar.a();
    }

    @Override // defpackage.djk
    public final dkd c(float f, float f2) {
        djv djvVar = this.e;
        djv djvVar2 = null;
        if (djvVar == null) {
            ujp.c("delegate");
            djvVar = null;
        }
        float f3 = f - djvVar.g;
        djv djvVar3 = this.e;
        if (djvVar3 == null) {
            ujp.c("delegate");
            djvVar3 = null;
        }
        float fB = djvVar3.b() / f3;
        djv djvVar4 = this.e;
        if (djvVar4 == null) {
            ujp.c("delegate");
        } else {
            djvVar2 = djvVar4;
        }
        return new dkd(fB, f, djvVar2.a(), f3);
    }

    @Override // defpackage.djk
    public final void d(bmv bmvVar) {
        String strSubstring;
        djv djvVar = this.e;
        if (djvVar == null) {
            ujp.c("delegate");
            djvVar = null;
        }
        djm djmVarO = o();
        djmVarO.getClass();
        float f = this.h;
        djw djwVar = this.f;
        if (djwVar == null) {
            ujp.c("actualStyle");
            djwVar = null;
        }
        djw djwVar2 = this.f;
        if (djwVar2 == null) {
            ujp.c("actualStyle");
            djwVar2 = null;
        }
        djvVar.e();
        if (!a.ao(djmVarO, djvVar.k) || Math.abs(djvVar.l - f) > 1.0E-4d) {
            djvVar.k = djmVarO;
            djvVar.l = f;
            float f2 = true != djvVar.b ? -1.0f : 1.0f;
            float fA = AmbientMode.AmbientCallback.a(Math.min(djmVarO.a, f));
            long j = djmVarO.d;
            int i = (int) (4294967295L & j);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat(i);
            Path path = djvVar.i;
            path.reset();
            float f3 = djmVarO.b;
            float f4 = djmVarO.f;
            float fA2 = AmbientMode.AmbientCallback.a(f4);
            float fL = ukc.l(fA, 360.0f);
            path.arcTo(fIntBitsToFloat - f3, fIntBitsToFloat2 - f3, fIntBitsToFloat + f3, f3 + fIntBitsToFloat2, fA2, fL, false);
            float f5 = djmVarO.g;
            path.arcTo(fIntBitsToFloat - f5, fIntBitsToFloat2 - f5, fIntBitsToFloat + f5, fIntBitsToFloat2 + f5, AmbientMode.AmbientCallback.a(f4) + fL, -fL, false);
            path.close();
            Path path2 = djvVar.j;
            path2.reset();
            float f6 = djmVarO.e;
            path2.addArc(fIntBitsToFloat - f6, fIntBitsToFloat2 - f6, fIntBitsToFloat + f6, fIntBitsToFloat2 + f6, AmbientMode.AmbientCallback.a(f4) + (true != djvVar.b ? fL : 0.0f), f2 * fL);
        }
        long j2 = djwVar2.a;
        bku bkuVarB = bmvVar.o().b();
        if (j2 != 16 && !a.q(j2, bkv.e)) {
            Paint paint = djvVar.h;
            paint.setColor(bko.h(j2));
            bkk.a(bkuVarB).drawPath(djvVar.i, paint);
        }
        long j3 = djwVar.b;
        Paint paint2 = djvVar.h;
        paint2.setColor(bko.h(j3));
        if (djmVarO.a <= 0.001f + f || a.p(1, 3)) {
            strSubstring = djvVar.a;
        } else {
            String str = djvVar.a;
            TextPaint textPaint = new TextPaint(paint2);
            boolean zP = a.p(1, 2);
            int iX = ukj.x(f * djmVarO.e);
            if (zP) {
                strSubstring = TextUtils.ellipsize(str, textPaint, iX, TextUtils.TruncateAt.END).toString();
            } else {
                strSubstring = str.substring(0, StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, iX).setEllipsize(null).setMaxLines(1).build().getLineEnd(0));
                strSubstring.getClass();
            }
        }
        bkk.a(bkuVarB).drawTextOnPath(strSubstring, djvVar.j, 0.0f, 0.0f, paint2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e4  */
    @Override // defpackage.djk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(defpackage.djo r17, java.util.Iterator r18) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dju.e(djo, java.util.Iterator):void");
    }

    @Override // defpackage.djk
    public final void f(btd btdVar) {
        bte bteVar = this.g;
        if (bteVar == null) {
            ujp.c("placeable");
            bteVar = null;
        }
        bte bteVar2 = bteVar;
        djm djmVarO = o();
        djmVarO.getClass();
        float f = this.h;
        float f2 = bteVar2.a;
        float f3 = djmVarO.b;
        float f4 = f2 / 2.0f;
        float fSqrt = (float) Math.sqrt(ukc.k((f3 * f3) - (f4 * f4), 0.0f));
        float f5 = bteVar2.b;
        long j = djmVarO.d;
        float f6 = djmVarO.f + (f / 2.0f);
        double d = f6;
        float f7 = fSqrt - (f5 / 2.0f);
        btd.v(btdVar, bteVar2, ukj.x((Float.intBitsToFloat((int) (j >> 32)) + (((float) Math.cos(d)) * f7)) - (bteVar2.a / 2.0f)), ukj.x((Float.intBitsToFloat((int) (j & 4294967295L)) + (f7 * ((float) Math.sin(d)))) - (bteVar2.b / 2.0f)), new dqg(f6 + 3.1415927f, 1), 4);
    }

    @Override // defpackage.djk
    public final void h(kbz kbzVar, ayc aycVar, int i) {
        int i2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(761993261);
        if (i3 == 0) {
            i2 = (true != aycVarC.B(kbzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.D(this) ? 16 : 32;
        }
        if (aycVarC.H((i2 & 19) != 18, 1 & i2)) {
            this.f = djx.a.a((djw) this.c.a(aycVarC, 0));
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            Object obj = ayb.a;
            if (objR == obj) {
                objR = new djv();
                aygVar.ac(objR);
            }
            djv djvVar = (djv) objR;
            this.e = djvVar;
            djw djwVar = null;
            if (djvVar == null) {
                ujp.c("delegate");
                djvVar = null;
            }
            djw djwVar2 = this.f;
            if (djwVar2 == null) {
                ujp.c("actualStyle");
                djwVar2 = null;
            }
            djw djwVar3 = this.f;
            if (djwVar3 == null) {
                ujp.c("actualStyle");
                djwVar3 = null;
            }
            djw djwVar4 = this.f;
            if (djwVar4 == null) {
                ujp.c("actualStyle");
                djwVar4 = null;
            }
            djw djwVar5 = this.f;
            if (djwVar5 == null) {
                ujp.c("actualStyle");
            } else {
                djwVar = djwVar5;
            }
            djvVar.c(djwVar2.d, djwVar3.e, djwVar4.f, djwVar.g, aycVarC, 0);
            kbz kbzVarA = kbzVar.a(new kbz(this.a, 6));
            bih bihVar = bik.c;
            boolean zB = aycVarC.B(kbzVarA);
            Object objR2 = aygVar.R();
            if (zB || objR2 == obj) {
                objR2 = new asj(kbzVarA, 17);
                aygVar.ac(objR2);
            }
            aku.b(cbp.b(bihVar, false, (uiq) objR2), aycVarC, 0);
        } else {
            aycVarC.r();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new aqb(this, kbzVar, i, 8, null);
        }
    }
}
