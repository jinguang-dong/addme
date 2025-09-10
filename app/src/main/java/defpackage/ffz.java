package defpackage;

import android.content.Context;
import android.os.Trace;
import com.google.googlex.gcam.dirtylens.PrCd.SHXc;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ffz implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ ffz(cdo cdoVar, cib cibVar, List list, ccm ccmVar, chq chqVar, qqq qqqVar, int i) {
        this.g = i;
        this.f = cdoVar;
        this.b = cibVar;
        this.d = list;
        this.e = ccmVar;
        this.a = chqVar;
        this.c = qqqVar;
    }

    public /* synthetic */ ffz(fqg fqgVar, mhq mhqVar, out outVar, mhp mhpVar, ovx ovxVar, fgq fgqVar, int i) {
        this.g = i;
        this.f = fqgVar;
        this.a = mhqVar;
        this.b = outVar;
        this.c = mhpVar;
        this.d = ovxVar;
        this.e = fgqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [mhs] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r0v24, types: [hpb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, mhq] */
    /* JADX WARN: Type inference failed for: r1v8, types: [our] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, joc] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.function.Consumer] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r4v2, types: [ibi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v0, types: [chq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r5v4, types: [joc] */
    /* JADX WARN: Type inference failed for: r5v6, types: [hpa] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, paq] */
    /* JADX WARN: Type inference failed for: r9v10, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r9v19, types: [hpo] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        ibl iblVarB;
        int i = this.g;
        if (i == 0) {
            ?? mhsVar = new mhs();
            mhsVar.d("Boba");
            mhsVar.c(this.b);
            mhsVar.g((mhp) this.c);
            Object obj = this.d;
            mhsVar.f(new fem(obj, 5));
            mhsVar.e(new fem(obj, 6));
            paq paqVarD = this.a.d(mhsVar.a());
            ?? r1 = ((fqg) this.f).b;
            r1.d(paqVarD);
            r1.d(this.e);
            return;
        }
        int i2 = 1;
        if (i == 1) {
            Trace.beginSection(SHXc.KxWDYGHwBBXpfK);
            Object obj2 = this.c;
            ?? r5 = this.a;
            Object obj3 = this.e;
            try {
                cdo cdoVarJ = byx.j((cdo) this.f, (cib) this.b);
                Object obj4 = this.d;
                Object obj5 = obj4;
                if (obj4 == null) {
                    obj5 = ufw.a;
                }
                new ccx((ccm) obj3, cdoVarJ, obj5, r5, (qqq) obj2).a();
                return;
            } finally {
                Trace.endSection();
            }
        }
        int i3 = 2;
        if (i == 2) {
            Object obj6 = this.a;
            Object obj7 = this.e;
            ojl.ck(this.c, new hyr(this.f, this.b, this.d, (Context) obj7, (String) obj6, 0), sxo.a);
            return;
        }
        if (i != 3) {
            if (i == 4) {
                jpp jppVar = (jpp) this.b.a();
                our ourVar = (our) this.d.a();
                gzi gziVar = gzo.a;
                jqf jqfVar = new jqf(jppVar, i3);
                ?? r2 = this.f;
                ?? r4 = this.a;
                ourVar.d(r2.b(jqfVar, r4));
                rwc rwcVar = (rwc) this.c;
                if (rwcVar.h()) {
                    ((hgj) rwcVar.c()).j(jppVar);
                    ourVar.d(r2.b(new jqg(r2, rwcVar), r4));
                    return;
                }
                return;
            }
            ?? r0 = this.e;
            final our ourVar2 = (our) this.f;
            final loa loaVar = (loa) r0;
            job jobVar = new job() { // from class: lod
                @Override // defpackage.job
                public final void d(long j) {
                    if (ourVar2.b()) {
                        return;
                    }
                    loaVar.b(j);
                }
            };
            ?? r52 = (joc) this.b.a();
            ?? r6 = this.a;
            if (r52 != 0) {
                ourVar2.d(r52.b(jobVar, r6));
            }
            Object obj8 = this.c;
            ?? r9 = this.d;
            ((hpa) r9.a()).c(r0, r6);
            ourVar2.d(new loe(r9, r0, i2));
            rwc rwcVar2 = (rwc) obj8;
            if (rwcVar2.h()) {
                ((hpo) rwcVar2.c()).e(loaVar, r6);
                ourVar2.d(new loe(obj8, r0, 0));
                return;
            }
            return;
        }
        ibj ibjVar = (ibj) this.f;
        ibjVar.b.f("executePostProcessingImageSaverSession");
        Object obj9 = this.c;
        ?? r22 = this.d;
        Object obj10 = this.a;
        ?? r42 = this.e;
        try {
            iblVarB = obj9 == null ? r42.b((gga) obj10) : r42.d((gga) obj10, (iea) obj9);
        } catch (IllegalArgumentException e) {
            this.b.run();
            ((sgt) ((sgt) ibj.a.c().i(e)).M((char) 1800)).s("Unable to acquire post processing session.");
        }
        try {
            r22.d(iblVarB);
            iblVarB.close();
            ibjVar.b.g();
        } finally {
        }
    }

    public /* synthetic */ ffz(hbj hbjVar, uem uemVar, rwc rwcVar, joc jocVar, Executor executor, uem uemVar2, int i) {
        this.g = i;
        this.e = hbjVar;
        this.b = uemVar;
        this.c = rwcVar;
        this.f = jocVar;
        this.a = executor;
        this.d = uemVar2;
    }

    public /* synthetic */ ffz(ibj ibjVar, iea ieaVar, ibi ibiVar, gga ggaVar, Consumer consumer, Runnable runnable, int i) {
        this.g = i;
        this.f = ibjVar;
        this.c = ieaVar;
        this.e = ibiVar;
        this.a = ggaVar;
        this.d = consumer;
        this.b = runnable;
    }

    public /* synthetic */ ffz(our ourVar, loa loaVar, uem uemVar, ExecutorService executorService, uem uemVar2, rwc rwcVar, int i) {
        this.g = i;
        this.f = ourVar;
        this.e = loaVar;
        this.b = uemVar;
        this.a = executorService;
        this.d = uemVar2;
        this.c = rwcVar;
    }

    public /* synthetic */ ffz(syu syuVar, pbn pbnVar, uem uemVar, uem uemVar2, Context context, String str, int i) {
        this.g = i;
        this.c = syuVar;
        this.f = pbnVar;
        this.b = uemVar;
        this.d = uemVar2;
        this.e = context;
        this.a = str;
    }
}
