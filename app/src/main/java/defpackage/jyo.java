package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jyo implements kbr {
    private static final sgv c = sgv.g("jyo");
    public final kbr a;
    public final lat b;
    private final Handler d;

    public jyo(kbr kbrVar, Handler handler, lat latVar) {
        this.a = kbrVar;
        this.d = handler;
        this.b = latVar;
        gzi gziVar = haa.a;
    }

    @Override // defpackage.kbr
    public final int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.kbr
    public final synchronized void b(pdk pdkVar, kfl kflVar, int i, kbz kbzVar, kbq kbqVar) throws Throwable {
        jyo jyoVar;
        try {
            try {
                jyoVar = this;
            } catch (NullPointerException e) {
                e = e;
                jyoVar = this;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
            try {
                jyoVar.d.postDelayed(new jnw(kbqVar, new jyn(jyoVar, pdkVar, kflVar, kbzVar, i), 14, null), 100L);
                return;
            } catch (NullPointerException e2) {
                e = e2;
                NullPointerException nullPointerException = e;
                ((sgt) ((sgt) c.b().i(nullPointerException)).M(3168)).v("Failed creating lazy image: %s", nullPointerException);
                kbqVar.b(nullPointerException);
                return;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
        throw th;
    }

    @Override // defpackage.kbr
    public final boolean c(pdk pdkVar, lat latVar) {
        return this.a.c(pdkVar, latVar);
    }
}
