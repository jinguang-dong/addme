package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgc {
    public hgc() {
    }

    public static void a() {
        paw.a(hgc.class, "gcastartup");
    }

    public static ScheduledExecutorService b() {
        return ojl.cc("shot-loss");
    }

    public static final void c(Canvas canvas, Drawable drawable, boolean z, float f, float f2, int i) {
        int width = canvas.getWidth();
        canvas.save();
        float f3 = width;
        float f4 = (f3 - f) / 2.0f;
        canvas.translate(f4, f4);
        float f5 = f / f3;
        canvas.scale(f5, f5);
        if (f2 > 0.0f) {
            if (z) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                int i2 = (int) (f2 * (1.0f - f5));
                if (i2 < 3) {
                    i2 = 3;
                }
                gradientDrawable.setStroke(i2, i);
            } else {
                ((GradientDrawable) drawable).setStroke((int) f2, i);
            }
        }
        drawable.draw(canvas);
        canvas.restore();
    }

    public static hlw d(final lpu lpuVar, final hms hmsVar, hlf hlfVar) {
        hls hlsVar = new hls(hmsVar);
        hlsVar.c = hlfVar;
        hlsVar.d(new hlv() { // from class: hlz
            @Override // defpackage.hlv
            public final void a(long j, poe poeVar) {
                hmsVar.e(j, lpuVar.a(poeVar));
            }
        });
        return hlsVar.a();
    }

    public static /* synthetic */ hms e(hlg hlgVar) {
        hmx hmxVar = new hmx(hlgVar);
        hmxVar.a = 1;
        hmxVar.c(TimeUnit.MINUTES);
        hmxVar.b();
        return hmxVar.a();
    }

    public static final hlg f(String str, ArrayList arrayList, ArrayList arrayList2) {
        hlg[] hlgVarArr = (hlg[]) arrayList.toArray(new hlg[0]);
        return new hlg(str, hlgVarArr);
    }

    public static void g(hld hldVar, pjo pjoVar) {
        hldVar.c(pjoVar);
    }

    public static final void h(lss lssVar) {
        lssVar.getClass();
        lssVar.j();
        lnj.a();
    }

    public static final void i(lss lssVar) {
        lssVar.getClass();
        lssVar.j();
        Set set = lnj.a;
        new lni(3, jma.b);
    }

    public static int j(int i) {
        if (i != 0) {
            return i != 2 ? 2 : 3;
        }
        return 1;
    }

    public static int k(hbj hbjVar, luj lujVar) {
        return hbjVar.p(gyo.g) ? ((Boolean) lujVar.b(luf.n)).booleanValue() ? 2 : 3 : j(((Integer) lujVar.b(luf.l)).intValue());
    }

    public static long l(long j) {
        return ((j + 500000) / 1000000) * 1000000;
    }

    public static void m(hpd hpdVar) {
        hpdVar.a.b();
    }

    public static boolean n(iso isoVar, qyc qycVar) {
        return isoVar.m() && qycVar.a;
    }

    public static void o(iso isoVar, qyc qycVar) {
        if (n(isoVar, qycVar)) {
            return;
        }
        gzg gzgVar = hap.a;
    }

    public hgc(byte[] bArr) {
        gzi gziVar = hau.a;
        gzi gziVar2 = gzo.a;
    }

    public hgc(owq owqVar, owq owqVar2, hbj hbjVar) {
        Math.max(0, ((Integer) hbjVar.a(gzq.a).orElse(5)).intValue());
        Math.max(0, ((Integer) hbjVar.a(gzq.b).orElse(3)).intValue());
        owl.a(owqVar, owqVar2);
    }

    public hgc(hbj hbjVar) {
        ((Float) hbjVar.e(gzq.f).orElse(Float.valueOf(0.0f))).floatValue();
        new HashMap();
    }
}
