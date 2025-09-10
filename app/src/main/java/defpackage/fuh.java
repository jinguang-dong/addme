package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fuh implements pec {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fuh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [sgt, shi] */
    @Override // defpackage.pec
    public final void a(final pdk pdkVar) {
        CaptureResult.Key key;
        int i = this.b;
        if (i == 0) {
            final fuj fujVar = (fuj) this.a;
            fujVar.f.execute(new Runnable() { // from class: fui
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:149:0x0442  */
                /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, pjo] */
                /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, java.util.List] */
                /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object, java.util.List] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 1189
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.fui.run():void");
                }
            });
            return;
        }
        if (i == 1) {
            Object obj = this.a;
            ((fgk) obj).d.execute(new eao(obj, pdkVar, 20, (char[]) null));
            return;
        }
        if (i == 2) {
            Object obj2 = this.a;
            synchronized (((gbp) obj2).f) {
                try {
                    peo peoVar = ((gbp) obj2).e;
                    if (peoVar == null) {
                        pdkVar.close();
                        return;
                    }
                    try {
                        poj pojVarE = pdkVar.e(peoVar);
                        if (pojVarE != null) {
                            poe poeVarD = pdkVar.d();
                            poeVarD.getClass();
                            Long l = (Long) poeVarD.a(CaptureResult.SENSOR_TIMESTAMP);
                            l.getClass();
                            ((gbp) obj2).a.n(pojVarE, TimeUnit.NANOSECONDS.toMicros(l.longValue() - ((gbp) obj2).c), !((gbp) obj2).b);
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                    pdkVar.close();
                    return;
                } finally {
                }
            }
        }
        if (i != 3) {
            if (i == 4) {
                ((ley) this.a).b(pdkVar);
                return;
            }
            Object obj3 = this.a;
            mkt mktVar = (mkt) obj3;
            mktVar.e.getAndIncrement();
            poe poeVarD2 = pdkVar.d();
            if (poeVarD2 == null) {
                ((sgt) mkt.a.c().M(4905)).s("metadata is null");
            } else {
                Long l2 = (Long) poeVarD2.a(CaptureResult.SENSOR_TIMESTAMP);
                if (l2 == null || l2.longValue() <= 0) {
                    ((sgt) mkt.a.c().M(4904)).s("timestamp not exist");
                } else {
                    AtomicLong atomicLong = mktVar.c;
                    if (atomicLong.get() == 0 || l2.longValue() < atomicLong.get()) {
                        atomicLong.set(l2.longValue());
                    }
                    AtomicLong atomicLong2 = mktVar.d;
                    if (atomicLong2.get() == 0 || l2.longValue() > atomicLong2.get()) {
                        atomicLong2.set(l2.longValue());
                    }
                }
            }
            pdkVar.close();
            if (mktVar.b.getAndSet(true)) {
                return;
            }
            mktVar.h.execute(new mjh(obj3, 13));
            return;
        }
        if (pdkVar.d() == null) {
            ((sgt) kcu.a.c().M(3240)).s("metadata is null");
            pdkVar.close();
            return;
        }
        kcu kcuVar = (kcu) this.a;
        if (!kcuVar.e.a(nkw.TIME_LAPSE)) {
            pdkVar.close();
            return;
        }
        poe poeVarD3 = pdkVar.d();
        poeVarD3.getClass();
        try {
            String strB = (String) poeVarD3.a(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
            if (rnt.V(strB)) {
                strB = poeVarD3.b();
            }
            strB.getClass();
            kcuVar.d.p(pjr.b(strB), poeVarD3);
            kcuVar.c.a(poeVarD3);
        } catch (IllegalArgumentException e) {
            ((sgt) ((sgt) kcu.a.c().i(e)).M((char) 3241)).s("Error getting physical camera ID");
        }
        if (!kcuVar.f.b() && (key = nvo.A) != null && poeVarD3.a(key) != null) {
            Float f = (Float) poeVarD3.a(key);
            f.getClass();
            kcuVar.g.a(Float.valueOf((f.floatValue() * kcu.b) + 0.028f));
        }
        kcuVar.h.a(poeVarD3);
        pdkVar.close();
    }
}
