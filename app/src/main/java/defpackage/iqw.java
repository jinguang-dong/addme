package defpackage;

import android.content.Intent;
import j$.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iqw implements syf {
    public final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Enum c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public iqw(fwn fwnVar, gnm gnmVar, pbp pbpVar, syu syuVar, int i) {
        this.e = i;
        this.c = gnmVar;
        this.d = pbpVar;
        this.b = syuVar;
        this.a = fwnVar;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, pbp] */
    @Override // defpackage.syf
    public final /* synthetic */ void b(Object obj) {
        if (this.e == 0) {
            ((iqy) this.a).g.e(true);
            ((ira) this.d).f.put(this.b, true);
            return;
        }
        fxm fxmVar = (fxm) obj;
        Object obj2 = this.a;
        synchronized (((fwn) obj2).q) {
            int i = fxmVar.r;
            if (i != ((fwn) obj2).o) {
                ((sgt) fwn.a.c().M(437)).w("Capture session %d doesn't match expected session %d", i, ((fwn) obj2).o);
                return;
            }
            Object obj3 = ((ovx) ((fwn) obj2).k.g).d;
            gas gasVar = gas.INITIATING;
            if (obj3 != gasVar) {
                ((sgt) fwn.a.c().M(436)).E("Expecting %s but got %s", gasVar, ((ovx) ((fwn) obj2).k.g).d);
                return;
            }
            if (this.c == gnm.FALLBACK) {
                gtm gtmVar = ((fwn) obj2).x;
                pka pkaVarA = ((fwn) obj2).c.a();
                pka pkaVar = pka.BACK;
                if (pkaVarA == pkaVar) {
                    pkaVar = pka.FRONT;
                }
                gtmVar.a(pkaVar, 2, 3);
            }
            fxmVar.g();
            ((fwn) obj2).j = fxmVar;
            fxm fxmVar2 = ((fwn) obj2).j;
            if (fxmVar2 != null) {
                fxmVar2.f.addAll(((fwn) obj2).p);
            }
            ((fwn) obj2).j.E = ((fwn) obj2).r;
            Collection.EL.stream(((fwn) obj2).p).forEach(new fkj(7));
            ((fwn) obj2).k.a(gas.CAPTURE_SESSION_ACTIVE);
            mez mezVar = ((fwn) obj2).e;
            mey meyVar = mey.CAPTURE_SESSION_STARTED;
            mezVar.j(meyVar);
            gnl gnlVar = ((fwn) obj2).n;
            gnlVar.getClass();
            gnlVar.i = 2;
            gnlVar.c(mezVar.a(mey.CAPTURE_SESSION_STARTING, meyVar));
            cxb cxbVar = ((fwn) obj2).w;
            boolean zR = fdo.r(cxbVar);
            ((fwn) obj2).l = zR;
            if ((((fwn) obj2).m || zR) && !((Boolean) ((ovx) ((fwn) obj2).k.i).d).booleanValue()) {
                Intent intentG = cxbVar.g();
                if (intentG != null) {
                    fdo.e(intentG);
                }
                ((fwn) obj2).b.execute(new foh(this, 15));
            }
            this.d.a();
        }
    }

    public iqw(ira iraVar, iqy iqyVar, isj isjVar, iqz iqzVar, int i) {
        this.e = i;
        this.a = iqyVar;
        this.b = isjVar;
        this.c = iqzVar;
        this.d = iraVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3 A[Catch: all -> 0x00c1, TryCatch #0 {, blocks: (B:6:0x000c, B:8:0x002d, B:9:0x005b, B:11:0x005f, B:15:0x0078, B:17:0x007e, B:19:0x008b, B:21:0x0093, B:22:0x00b3, B:23:0x00ba, B:24:0x00bf), top: B:31:0x000c }] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, pbp] */
    @Override // defpackage.syf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Throwable r9) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqw.a(java.lang.Throwable):void");
    }
}
