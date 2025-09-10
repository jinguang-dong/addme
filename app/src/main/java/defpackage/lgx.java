package defpackage;

import com.google.android.apps.camera.jni.facebeautification.GFS.CZAHo;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgx implements npl {
    private static final sgv a = sgv.g("lgx");
    private final int b;
    private final lgw c;

    public lgx(lgw lgwVar, int i) {
        shl shlVar = shx.a;
        this.c = lgwVar;
        this.b = i;
    }

    @Override // defpackage.npl
    public final npk b(pdk pdkVar, peo peoVar, pdk pdkVar2) {
        poj pojVarE;
        poj pojVarE2;
        npk npkVar;
        lgw lgwVar = this.c;
        synchronized (lgwVar) {
            if (!lgwVar.c.isDone()) {
                ((sgt) ((sgt) a.c().h(shx.a, "MilkViewfinderEffect")).M(4150)).s("Pipeline is not ready. Skip processing.");
                return npk.SKIPPED;
            }
            poj pojVarE3 = pdkVar2.e(peoVar);
            try {
                Iterator it = pdkVar.c().d().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        pojVarE = pdkVar.e(peoVar);
                        break;
                    }
                    peo peoVar2 = (peo) it.next();
                    if (peoVar2 != peoVar && peoVar2.a() == peoVar.a() && peoVar2.b().equals(peoVar.b()) && peoVar2.d().equals(peoVar.d())) {
                        pojVarE = pdkVar.e(peoVar2);
                        break;
                    }
                }
                try {
                    Iterator it2 = pdkVar.c().d().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            pojVarE2 = null;
                            break;
                        }
                        peo peoVar3 = (peo) it2.next();
                        if (peoVar3.a() == this.b) {
                            pojVarE2 = pdkVar.e(peoVar3);
                            break;
                        }
                    }
                    try {
                        if (pojVarE3 == null) {
                            ((sgt) ((sgt) a.c().h(shx.a, "MilkViewfinderEffect")).M(4149)).s("Output image is null.");
                            npkVar = npk.SKIPPED;
                            if (pojVarE2 != null) {
                                pojVarE2.close();
                            }
                            if (pojVarE != null) {
                                pojVarE.close();
                            }
                        } else if (pojVarE == null) {
                            ((sgt) ((sgt) a.c().h(shx.a, "MilkViewfinderEffect")).M(4148)).s("Input image is null.");
                            npkVar = npk.SKIPPED;
                            if (pojVarE2 != null) {
                                pojVarE2.close();
                            }
                            pojVarE3.close();
                        } else {
                            npkVar = lgwVar.a(pojVarE, pdkVar.d(), pojVarE2, pojVarE3) ? npk.APPLIED : npk.SKIPPED;
                            if (pojVarE2 != null) {
                                pojVarE2.close();
                            }
                            pojVarE.close();
                            pojVarE3.close();
                        }
                        return npkVar;
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        }
    }

    @Override // defpackage.npl
    public final npm c() {
        return npm.MILK;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        shl shlVar = shx.a;
        lgw lgwVar = this.c;
        synchronized (lgwVar) {
            lgwVar.close();
        }
    }

    @Override // defpackage.npl
    public final /* synthetic */ qin d() {
        return null;
    }

    @Override // defpackage.npl
    public final /* synthetic */ String e() {
        return jsv.A(this);
    }

    @Override // defpackage.npl
    public final boolean q() {
        return true;
    }

    @Override // defpackage.npl
    public final /* synthetic */ npk s(qjn qjnVar, qim qimVar) {
        return jsv.B();
    }

    @Override // defpackage.npl
    public final npk a(poj pojVar, poj pojVar2) {
        throw new UnsupportedOperationException(CZAHo.ppCUQ);
    }
}
