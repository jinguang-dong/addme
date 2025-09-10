package defpackage;

import android.os.Trace;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class loa implements hpb {
    private static final sgv a = sgv.g("loa");
    private final lnt b;
    private final lob c;
    private final hpa d;
    private final joc e;
    private final rwc f;
    private final rwc g;
    private long h = -1;

    public loa(lnt lntVar, lob lobVar, hpa hpaVar, joc jocVar, owq owqVar, hbj hbjVar, uem uemVar) {
        boolean z;
        this.b = lntVar;
        this.c = lobVar;
        this.d = hpaVar;
        this.e = jocVar;
        if (((Boolean) owqVar.dL()).booleanValue()) {
            z = true;
        } else {
            gzi gziVar = gzb.a;
            z = false;
        }
        if (hbjVar.p(gzb.e)) {
            if (z) {
                this.f = rvk.a;
                this.g = rwc.j((hps) uemVar.a());
                return;
            }
        } else if (z) {
            this.f = rwc.j((hpv) uemVar.a());
            this.g = rvk.a;
            return;
        }
        rvk rvkVar = rvk.a;
        this.f = rvkVar;
        this.g = rvkVar;
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [hps, java.lang.Object] */
    public final synchronized void b(long j) {
        lnl lnlVarA;
        poj pojVarD = this.e.d(j);
        if (pojVarD == null) {
            return;
        }
        try {
            lob lobVar = this.c;
            if (lobVar.a(j) == null && (lnlVarA = this.d.a(j)) != null) {
                rwc rwcVar = this.g;
                if (!rwcVar.h() || lnlVarA.r.length <= 0 || rwcVar.c().a(j) != null) {
                    Trace.beginSection("frameQualityScorer.getFrameScore");
                    lnx lnxVarA = this.b.a(pojVarD, lnlVarA);
                    Trace.endSection();
                    if (j <= this.h) {
                        ((sgt) a.b().M(4262)).s("Out of order frame scores detected!");
                    }
                    lobVar.d(lnxVarA);
                    rwc rwcVar2 = this.f;
                    if (rwcVar2.h()) {
                        rwc rwcVar3 = lnxVarA.p;
                        if (rwcVar3.h()) {
                            Object objC = rwcVar2.c();
                            Object objC2 = rwcVar3.c();
                            ArrayList arrayList = new ArrayList();
                            for (loh lohVar : ((loi) objC2).a) {
                                hpp hppVarA = hpq.a();
                                hppVarA.d(lohVar.a);
                                hppVarA.a = lohVar.b;
                                hppVarA.c(lohVar.c);
                                hppVarA.b = lohVar.i;
                                hppVarA.b(lohVar.j);
                                arrayList.add(hppVarA.a());
                            }
                            ((hpv) objC).c(new hpr(((loi) objC2).f, arrayList));
                        }
                    }
                    this.h = j;
                }
            }
            pojVarD.close();
        } finally {
        }
    }

    @Override // defpackage.hpb
    public final synchronized void ey(lnl lnlVar) {
        b(lnlVar.c);
    }
}
