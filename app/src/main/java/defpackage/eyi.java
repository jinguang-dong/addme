package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eyi {
    public final epu a;
    public final List b;
    final epl c;
    public boolean d;
    public boolean e;
    public Bitmap f;
    public int g;
    public int h;
    public int i;
    public ezx j;
    public ezx k;
    public ezx l;
    private final Handler m;
    private final ete n;
    private boolean o;
    private epj p;

    public eyi(eox eoxVar, epu epuVar, int i, int i2, eqq eqqVar, Bitmap bitmap) {
        ete eteVar = eoxVar.a;
        epl eplVarC = eox.c(eoxVar.a());
        epj epjVarB = eox.c(eoxVar.a()).b().f(((ezs) ((ezs) ezs.b(esh.b).J()).I()).r(i, i2));
        this.b = new ArrayList();
        this.c = eplVarC;
        Handler handler = new Handler(Looper.getMainLooper(), new eyh(this));
        this.n = eteVar;
        this.m = handler;
        this.p = epjVarB;
        this.a = epuVar;
        d(eqqVar, bitmap);
    }

    final int a() {
        return ((epy) this.a).f.c;
    }

    public final void b() {
        int i;
        if (!this.d || this.o) {
            return;
        }
        ezx ezxVar = this.l;
        if (ezxVar != null) {
            this.l = null;
            f(ezxVar);
            return;
        }
        this.o = true;
        epu epuVar = this.a;
        epy epyVar = (epy) epuVar;
        epw epwVar = epyVar.f;
        int i2 = epwVar.c;
        int i3 = 0;
        if (i2 > 0 && (i = epyVar.e) >= 0) {
            i3 = i < i2 ? ((epv) epwVar.e.get(i)).i : -1;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() + i3;
        epuVar.b();
        this.k = new ezx(this.m, epyVar.e, jUptimeMillis);
        epj epjVarE = this.p.f((ezs) new ezs().v(new fai(Double.valueOf(Math.random())))).e(epuVar);
        epjVarE.j(this.k, null, epjVarE, fap.a);
    }

    public final void c() {
        Bitmap bitmap = this.f;
        if (bitmap != null) {
            this.n.d(bitmap);
            this.f = null;
        }
    }

    final void d(eqq eqqVar, Bitmap bitmap) {
        eoz.k(eqqVar);
        eoz.k(bitmap);
        this.f = bitmap;
        this.p = this.p.f(new ezs().x(eqqVar));
        this.g = fax.a(bitmap);
        this.h = bitmap.getWidth();
        this.i = bitmap.getHeight();
    }

    public final void e() {
        this.d = false;
    }

    final void f(ezx ezxVar) {
        this.o = false;
        if (this.e) {
            this.m.obtainMessage(2, ezxVar).sendToTarget();
            return;
        }
        if (!this.d) {
            this.l = ezxVar;
            return;
        }
        if (ezxVar.b != null) {
            c();
            ezx ezxVar2 = this.j;
            this.j = ezxVar;
            List list = this.b;
            for (int size = list.size() - 1; size >= 0; size--) {
                eyd eydVar = (eyd) list.get(size);
                Object callback = eydVar.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    eydVar.stop();
                    eydVar.invalidateSelf();
                } else {
                    eydVar.invalidateSelf();
                    ezx ezxVar3 = eydVar.a.a.j;
                    if ((ezxVar3 != null ? ezxVar3.a : -1) == r5.a() - 1) {
                        eydVar.c++;
                    }
                    if (eydVar.d != -1 && eydVar.c >= 0) {
                        eydVar.stop();
                    }
                }
            }
            if (ezxVar2 != null) {
                this.m.obtainMessage(2, ezxVar2).sendToTarget();
            }
        }
        b();
    }
}
