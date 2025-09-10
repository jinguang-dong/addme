package defpackage;

import android.content.Context;
import android.graphics.Rect;
import com.google.android.libraries.vision.smartcapture.FrequentFacesProcessor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class hpo implements hpu, job, hpb, paq {
    private static final sgv i = sgv.g("hpo");
    public final Context a;
    public final String b;
    public FrequentFacesProcessor d;
    public joc e;
    public hpa f;
    public hpv g;
    public final hbj h;
    public final AtomicBoolean c = new AtomicBoolean(false);
    private final Map j = new HashMap();

    public hpo(rwc rwcVar, Context context, hbj hbjVar) {
        a.I(rwcVar.h());
        this.a = context;
        this.h = hbjVar;
        this.b = true != hbjVar.p(gzb.d) ? "" : "FaceFamiliarityProcessorVMImpl";
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [sgt, shi] */
    private final synchronized void g(long j) {
        joc jocVar;
        hpa hpaVar;
        hpv hpvVar;
        FrequentFacesProcessor frequentFacesProcessor;
        poj pojVarD;
        boolean z;
        tup tupVarA;
        rwc rwcVarJ;
        float f;
        synchronized (this) {
            jocVar = this.e;
            hpaVar = this.f;
            hpvVar = this.g;
            frequentFacesProcessor = this.d;
        }
        if (jocVar == null || hpaVar == null || hpvVar == null || frequentFacesProcessor == null) {
            ((sgt) i.c().M(1425)).s("No video framestore or metadata framestore attached");
            return;
        }
        if (hpvVar.a(j) == null && (pojVarD = jocVar.d(j)) != null) {
            try {
                lnl lnlVarA = hpaVar.a(pojVarD.d());
                if (lnlVarA != null) {
                    boolean andSet = this.c.getAndSet(false);
                    lno[] lnoVarArr = lnlVarA.r;
                    if (lnoVarArr == null) {
                        ((sgt) i.c().M(1424)).v("Failure in FF analysis -- null face metadata: %b", true);
                        tpc tpcVarM = tup.a.m();
                        long j2 = lnlVarA.c;
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        tup tupVar = (tup) tpcVarM.b;
                        tupVar.b = 2 | tupVar.b;
                        tupVar.d = j2;
                        tupVarA = (tup) tpcVarM.l();
                        z = true;
                    } else {
                        float fC = pojVarD.c();
                        Rect rect = lnlVarA.v;
                        float fWidth = fC / rect.width();
                        float fB = pojVarD.b() / rect.height();
                        tpc tpcVarM2 = tuy.a.m();
                        if (!tpcVarM2.b.C()) {
                            tpcVarM2.o();
                        }
                        tuy tuyVar = (tuy) tpcVarM2.b;
                        tuyVar.b |= 1;
                        tuyVar.c = andSet;
                        tuy tuyVar2 = (tuy) tpcVarM2.l();
                        tpc tpcVarM3 = tuj.a.m();
                        int i2 = (360 - lnlVarA.u) % 360;
                        if (!tpcVarM3.b.C()) {
                            tpcVarM3.o();
                        }
                        tuj tujVar = (tuj) tpcVarM3.b;
                        tujVar.b |= 4;
                        tujVar.d = i2;
                        tuj tujVar2 = (tuj) tpcVarM3.l();
                        tpc tpcVarM4 = tup.a.m();
                        long j3 = lnlVarA.c;
                        if (!tpcVarM4.b.C()) {
                            tpcVarM4.o();
                        }
                        tup tupVar2 = (tup) tpcVarM4.b;
                        tupVar2.b |= 2;
                        tupVar2.d = j3;
                        tto ttoVarAb = ezh.ab(lnlVarA, fWidth, fB);
                        if (!tpcVarM4.b.C()) {
                            tpcVarM4.o();
                        }
                        tph tphVar = tpcVarM4.b;
                        tup tupVar3 = (tup) tphVar;
                        ttoVarAb.getClass();
                        tupVar3.g = ttoVarAb;
                        tupVar3.b |= 64;
                        boolean z2 = lnlVarA.t;
                        if (!tphVar.C()) {
                            tpcVarM4.o();
                        }
                        tph tphVar2 = tpcVarM4.b;
                        tup tupVar4 = (tup) tphVar2;
                        tupVar4.b |= 512;
                        tupVar4.i = z2;
                        if (!tphVar2.C()) {
                            tpcVarM4.o();
                        }
                        tph tphVar3 = tpcVarM4.b;
                        tup tupVar5 = (tup) tphVar3;
                        tujVar2.getClass();
                        tupVar5.f = tujVar2;
                        tupVar5.b |= 32;
                        if (!tphVar3.C()) {
                            tpcVarM4.o();
                        }
                        tup tupVar6 = (tup) tpcVarM4.b;
                        tuyVar2.getClass();
                        tupVar6.n = tuyVar2;
                        tupVar6.b |= 2097152;
                        tup tupVar7 = (tup) tpcVarM4.l();
                        if (lnoVarArr.length != 0) {
                            try {
                                List listG = pojVarD.g();
                                poi poiVar = (poi) listG.get(0);
                                poi poiVar2 = (poi) listG.get(1);
                                poi poiVar3 = (poi) listG.get(2);
                                z = true;
                                tupVarA = frequentFacesProcessor.a(poiVar.getBuffer(), poiVar.getPixelStride(), poiVar.getRowStride(), poiVar2.getBuffer(), poiVar2.getPixelStride(), poiVar2.getRowStride(), poiVar3.getBuffer(), poiVar3.getPixelStride(), poiVar3.getRowStride(), pojVarD.c(), pojVarD.b(), tupVar7);
                            } catch (IllegalStateException e) {
                                z = true;
                                ((sgt) ((sgt) i.b().i(e)).M((char) 1423)).s("Couldn't get planes for analysis.");
                                tupVarA = tup.a;
                            }
                        } else {
                            z = true;
                            tupVarA = tupVar7;
                        }
                    }
                    tto ttoVar = tupVarA.g;
                    if (ttoVar == null) {
                        ttoVar = tto.a;
                    }
                    rnt.L(ttoVar.b.size() == lnlVarA.r.length ? z : false);
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 0; i3 < ttoVar.b.size(); i3++) {
                        ttn ttnVar = (ttn) ttoVar.b.get(i3);
                        tql tqlVar = tuw.j;
                        ttnVar.i(tqlVar);
                        Object objK = ttnVar.r.k((tpg) tqlVar.c);
                        if (objK == null) {
                            objK = tqlVar.b;
                        } else {
                            tqlVar.b(objK);
                        }
                        tuw tuwVar = (tuw) objK;
                        boolean z3 = (tuwVar.b & 64) != 0 ? z : false;
                        hpp hppVarA = hpq.a();
                        hppVarA.d(ttnVar.j);
                        hppVarA.a = rwc.j(Long.valueOf(ttnVar.k));
                        hppVarA.c(tuwVar.e);
                        if (z3) {
                            tux tuxVar = tuwVar.i;
                            if (tuxVar == null) {
                                tuxVar = tux.a;
                            }
                            rwcVarJ = rwc.j(sbp.j(tuxVar.c));
                        } else {
                            rwcVarJ = rvk.a;
                        }
                        hppVarA.b = rwcVarJ;
                        if (z3) {
                            tux tuxVar2 = tuwVar.i;
                            if (tuxVar2 == null) {
                                tuxVar2 = tux.a;
                            }
                            f = tuxVar2.d;
                        } else {
                            f = 0.0f;
                        }
                        hppVarA.b(f);
                        arrayList.add(hppVarA.a());
                    }
                    hpr hprVar = new hpr(pojVarD.d(), arrayList);
                    hpvVar.c(hprVar);
                    synchronized (this) {
                        for (Map.Entry entry : this.j.entrySet()) {
                            try {
                                ((Executor) entry.getValue()).execute(new hdk(entry, hprVar, 10, null));
                            } catch (RejectedExecutionException e2) {
                                ((sgt) ((sgt) i.b().i(e2)).M(1426)).s("Cannot execute onFrequentFacesAvailable");
                            }
                        }
                    }
                }
                pojVarD.close();
            } finally {
            }
        }
    }

    public final synchronized void b(joc jocVar, hpa hpaVar, hpv hpvVar, FrequentFacesProcessor frequentFacesProcessor) {
        if (this.e == jocVar) {
            this.e = null;
        }
        if (this.f == hpaVar) {
            this.f = null;
        }
        if (this.g == hpvVar) {
            this.g = null;
        }
        frequentFacesProcessor.close();
        if (this.d == frequentFacesProcessor) {
            this.d = null;
        }
    }

    @Override // defpackage.hpu
    public final void c() {
        this.c.set(true);
    }

    @Override // defpackage.job
    public final void d(long j) {
        g(j);
    }

    public final synchronized void e(loa loaVar, Executor executor) {
        this.j.put(loaVar, executor);
    }

    @Override // defpackage.hpb
    public final void ey(lnl lnlVar) {
        g(lnlVar.c);
    }

    public final synchronized void f(loa loaVar) {
        Map map = this.j;
        if (map.containsKey(loaVar)) {
            map.remove(loaVar);
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
    }
}
