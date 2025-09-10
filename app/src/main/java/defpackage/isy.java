package defpackage;

import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.FrameRequestVector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class isy {
    public static final sgv a = sgv.g("isy");
    public final long b;
    public final tzj c;
    public final Executor d;
    public final pbn e;
    public final jlm f;
    public final Map g = new HashMap();
    public final hbj h;
    public final hbp i;
    public final iso j;
    private final int k;

    public isy(hbj hbjVar, tzj tzjVar, iso isoVar, Executor executor, hbp hbpVar, pbn pbnVar, jlm jlmVar) {
        this.k = ((Integer) hbjVar.a(hac.i).get()).intValue();
        this.b = ((Integer) hbjVar.a(hac.k).orElse(100)).intValue();
        this.c = tzjVar;
        this.j = isoVar;
        this.d = executor;
        this.i = hbpVar;
        this.e = pbnVar;
        this.f = jlmVar;
        this.h = hbjVar;
    }

    public final synchronized void a(iby ibyVar) {
        shl shlVar = shx.a;
        ibyVar.a();
        isx isxVar = (isx) this.g.get(ibyVar);
        if (isxVar == null) {
            ((sgt) ((sgt) a.b().h(shx.a, "KeplerController")).M(2287)).t("Missing InflightSession for shot id %s", ibyVar.a());
        } else {
            b(isxVar);
        }
    }

    public final synchronized void b(isx isxVar) {
        Iterator it = isxVar.f.iterator();
        while (it.hasNext()) {
            ((ldi) it.next()).g();
        }
        isxVar.g.cancel(true);
        isxVar.h.cancel(true);
        isxVar.b.g();
        ite iteVar = isxVar.n;
        if (iteVar != null) {
            iteVar.c();
        }
        this.g.remove(isxVar.a);
    }

    public final synchronized void c(iby ibyVar, ldi ldiVar, int i, pos posVar, szh szhVar) {
        shl shlVar = shx.a;
        ibyVar.a();
        Map map = this.g;
        rnt.L(!map.containsKey(ibyVar));
        map.put(ibyVar, new isx(ibyVar, ldiVar, i, posVar, szhVar));
    }

    public final synchronized void d(final iby ibyVar) {
        final ArrayList arrayList;
        seo seoVarE;
        shl shlVar = shx.a;
        ibyVar.a();
        final isx isxVar = (isx) this.g.get(ibyVar);
        int i = 0;
        if (isxVar == null) {
            ((sgt) ((sgt) a.b().h(shx.a, "KeplerController")).M(2294)).t("Missing InflightSession for shot id %s", ibyVar.a());
            ske.M(false);
            return;
        }
        kmj kmjVar = new kmj();
        kmx kmxVar = new kmx();
        ldi ldiVar = isxVar.b;
        gga ggaVar = ldiVar.t;
        gga ggaVar2 = new gga(ggaVar.d, ggaVar.b, kmjVar, kmxVar);
        List listF = ldiVar.f();
        int i2 = ((sex) listF).c;
        int i3 = this.k;
        if (i2 < i3) {
            arrayList = new ArrayList();
        } else {
            BurstSpec burstSpec = ldiVar.o;
            if (burstSpec == null) {
                throw new IllegalStateException("PayloadBurstSpec not provided");
            }
            ArrayList arrayList2 = new ArrayList();
            int i4 = isxVar.o;
            while (i4 < i2) {
                int i5 = i4 + 1;
                if (burstSpec.c().b(i4).d() == tbq.c) {
                    int i6 = i3 - 1;
                    if (i4 < i3) {
                        seoVarE = seo.e(Integer.valueOf(i), Integer.valueOf(i6));
                    } else {
                        seoVarE = seo.e(Integer.valueOf((i4 - i3) + 1), Integer.valueOf(i4));
                        i4 = i6;
                    }
                    FrameRequestVector frameRequestVector = new FrameRequestVector();
                    for (int iIntValue = ((Integer) seoVarE.h()).intValue(); iIntValue <= ((Integer) seoVarE.i()).intValue(); iIntValue++) {
                        frameRequestVector.c(burstSpec.c().b(iIntValue));
                    }
                    BurstSpec burstSpec2 = new BurstSpec();
                    burstSpec2.e(frameRequestVector);
                    ldi ldiVar2 = new ldi(ggaVar2, ldiVar.s, burstSpec2, ldiVar.n);
                    ldiVar2.h(i4);
                    sbp sbpVarSubList = ((sbp) listF).subList(((Integer) seoVarE.h()).intValue(), ((Integer) seoVarE.i()).intValue() + 1);
                    Iterator it = sbpVarSubList.iterator();
                    while (it.hasNext()) {
                        lau lauVarK = ((lau) it.next()).k();
                        if (lauVarK != null) {
                            ldiVar2.c(lauVarK);
                        }
                    }
                    sbpVarSubList.size();
                    arrayList2.add(ldiVar2);
                }
                i4 = i5;
                i = 0;
            }
            isxVar.o = i4;
            arrayList = arrayList2;
        }
        isxVar.f.addAll(arrayList);
        final szh szhVar = new szh();
        this.d.execute(new Runnable() { // from class: isu
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
            
                ((defpackage.sgt) ((defpackage.sgt) defpackage.isy.a.c().h(defpackage.shx.a, "KeplerController")).M(2292)).t("Stop processing since shot id: %d already removed", r4.a.a());
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:144:0x0380 A[Catch: all -> 0x03c6, TryCatch #14 {all -> 0x03c6, blocks: (B:142:0x037c, B:144:0x0380, B:145:0x0387), top: B:162:0x037c }] */
            /* JADX WARN: Removed duplicated region for block: B:187:0x02f1 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:58:0x01e3 A[Catch: all -> 0x018d, TryCatch #16 {all -> 0x018d, blocks: (B:40:0x0187, B:58:0x01e3, B:59:0x01ff, B:56:0x01db), top: B:164:0x0187 }] */
            /* JADX WARN: Type inference failed for: r0v109, types: [rwc] */
            /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.Object, lss] */
            /* JADX WARN: Type inference failed for: r12v0 */
            /* JADX WARN: Type inference failed for: r12v1, types: [boolean] */
            /* JADX WARN: Type inference failed for: r12v14 */
            /* JADX WARN: Type inference failed for: r13v10 */
            /* JADX WARN: Type inference failed for: r13v11, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r13v15 */
            /* JADX WARN: Type inference failed for: r13v20, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r13v22 */
            /* JADX WARN: Type inference failed for: r6v17 */
            /* JADX WARN: Type inference failed for: r6v19 */
            /* JADX WARN: Type inference failed for: r6v22 */
            /* JADX WARN: Type inference failed for: r6v4, types: [java.util.Iterator] */
            /* JADX WARN: Type inference failed for: r6v8 */
            /* JADX WARN: Type inference failed for: r6v9, types: [paq] */
            /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, lss] */
            /* JADX WARN: Type inference failed for: r9v27, types: [rwc] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 975
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.isu.run():void");
            }
        });
    }
}
