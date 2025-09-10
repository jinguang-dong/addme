package defpackage;

import android.util.Pair;
import com.google.googlex.gcam.BurstSpec;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kzd implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    public /* synthetic */ kzd(kze kzeVar, lau lauVar, iby ibyVar, poe poeVar, pfz pfzVar, BurstSpec burstSpec, paq paqVar, int i) {
        this.h = i;
        this.a = kzeVar;
        this.b = lauVar;
        this.c = ibyVar;
        this.d = poeVar;
        this.g = pfzVar;
        this.e = burstSpec;
        this.f = paqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, pdv] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, poe] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, paq] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, uem] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.h != 0) {
            Object obj = this.b;
            hrm hrmVar = (hrm) ((gad) obj).b().c();
            ?? r2 = this.f;
            paq paqVarA = hrmVar.a((pas) this.a, rwc.j((joc) r2.a()), rwc.j((hsb) this.g.a()), rwc.j((hpj) this.d.a()));
            our ourVar = (our) this.c;
            ourVar.d(paqVarA);
            ourVar.d(((joc) r2.a()).b(new jqf(obj, 1), (Executor) this.e.a()));
            return;
        }
        Object obj2 = this.a;
        kze kzeVar = (kze) obj2;
        pbn pbnVar = kzeVar.b;
        pbnVar.f(ezh.ai("PslFramesAsyncFetcher#start#lambda"));
        pbnVar.f("startPslAsync");
        pbnVar.f("PostShutterCptCtlr_frameServer#createFrameStream");
        lcu lcuVar = kzeVar.d;
        lfc lfcVar = kzeVar.c;
        lau lauVar = (lau) this.b;
        kzeVar.e = kzeVar.g.g(lfcVar.b(lauVar), lcuVar.fr().c());
        scn scnVar = ((pgb) kzeVar.e).c;
        lauVar.l();
        pbnVar.g();
        pdv pdvVar = kzeVar.e;
        Object obj3 = this.e;
        Object obj4 = this.g;
        Pair pairC = kzeVar.c((iby) this.c, this.d, pdvVar, (pfz) obj4, (BurstSpec) obj3);
        synchronized (obj2) {
            szh szhVar = ((kze) obj2).a;
            if (szhVar.isCancelled()) {
                kze.f(pairC);
            } else {
                szhVar.e(pairC);
            }
        }
        ?? r9 = this.f;
        pbn pbnVar2 = kzeVar.b;
        pbnVar2.g();
        pbnVar2.g();
        r9.close();
    }

    public /* synthetic */ kzd(our ourVar, uem uemVar, pas pasVar, uem uemVar2, uem uemVar3, uem uemVar4, uem uemVar5, int i) {
        this.h = i;
        this.c = ourVar;
        this.b = uemVar;
        this.a = pasVar;
        this.f = uemVar2;
        this.g = uemVar3;
        this.d = uemVar4;
        this.e = uemVar5;
    }
}
