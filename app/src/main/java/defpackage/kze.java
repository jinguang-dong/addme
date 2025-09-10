package defpackage;

import android.util.Pair;
import com.google.googlex.gcam.BurstSpec;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kze {
    private static final sgv h = sgv.g("kze");
    public final szh a = new szh();
    public final pbn b;
    public final lfc c;
    public final lcu d;
    public pdv e;
    public BurstSpec f;
    public final pfu g;
    private final hzs i;
    private final kxv j;
    private final ExecutorService k;

    public kze(hzs hzsVar, kxv kxvVar, pbn pbnVar, lfc lfcVar, lcu lcuVar, pfu pfuVar, ExecutorService executorService) {
        this.i = hzsVar;
        this.j = kxvVar;
        this.b = pbnVar;
        this.c = lfcVar;
        this.d = lcuVar;
        this.g = pfuVar;
        this.k = executorService;
    }

    public static final void f(Pair pair) {
        Iterator it = ((List) pair.second).iterator();
        while (it.hasNext()) {
            ((pfy) it.next()).close();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sgt, shi] */
    public final Pair a() {
        try {
            return (Pair) this.a.s();
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            ((sgt) ((sgt) h.b().i(e)).M((char) 3822)).s("Error getting PSL frames.");
            return Pair.create(new ArrayList(), new ArrayList());
        }
    }

    public final synchronized void b() {
        szh szhVar = this.a;
        if (szhVar.isDone()) {
            f(a());
        } else {
            szhVar.cancel(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x019d A[Catch: all -> 0x01e5, pco -> 0x01ec, TryCatch #3 {pco -> 0x01ec, all -> 0x01e5, blocks: (B:3:0x0004, B:5:0x001b, B:8:0x0048, B:10:0x006d, B:12:0x0083, B:19:0x0111, B:21:0x0117, B:31:0x0155, B:42:0x019d, B:44:0x01b9, B:43:0x01a1, B:28:0x0143, B:30:0x0149, B:40:0x0193, B:48:0x01c7, B:50:0x01cd, B:51:0x01d9, B:52:0x01e4, B:14:0x00e9, B:15:0x00ef, B:17:0x00f5, B:23:0x0123, B:24:0x012f, B:26:0x0135, B:33:0x0160, B:34:0x0166, B:35:0x0179, B:39:0x0186), top: B:60:0x0004, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a1 A[Catch: all -> 0x01e5, pco -> 0x01ec, TryCatch #3 {pco -> 0x01ec, all -> 0x01e5, blocks: (B:3:0x0004, B:5:0x001b, B:8:0x0048, B:10:0x006d, B:12:0x0083, B:19:0x0111, B:21:0x0117, B:31:0x0155, B:42:0x019d, B:44:0x01b9, B:43:0x01a1, B:28:0x0143, B:30:0x0149, B:40:0x0193, B:48:0x01c7, B:50:0x01cd, B:51:0x01d9, B:52:0x01e4, B:14:0x00e9, B:15:0x00ef, B:17:0x00f5, B:23:0x0123, B:24:0x012f, B:26:0x0135, B:33:0x0160, B:34:0x0166, B:35:0x0179, B:39:0x0186), top: B:60:0x0004, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair c(defpackage.iby r17, defpackage.poe r18, defpackage.pdv r19, defpackage.pfz r20, com.google.googlex.gcam.BurstSpec r21) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kze.c(iby, poe, pdv, pfz, com.google.googlex.gcam.BurstSpec):android.util.Pair");
    }

    public final BurstSpec d(iby ibyVar, poe poeVar, lau lauVar, hxu hxuVar) {
        try {
            poj pojVarP = lauVar.p();
            try {
                pbm pbmVar = new pbm(this.b, "PckPostShutterCaptureController#buildBurstSpec");
                try {
                    BurstSpec burstSpecB = this.i.B(ibyVar, pojVarP, poeVar, true, false, hxuVar, Optional.empty(), Optional.empty());
                    pbmVar.close();
                    if (pojVarP != null) {
                        pojVarP.close();
                    }
                    return burstSpecB;
                } finally {
                }
            } finally {
            }
        } catch (pco e) {
            ((sgt) h.b().M(3820)).v("Unable to build payloadBurstSpec %s", e);
            return null;
        }
    }

    public final synchronized boolean e(iby ibyVar, lau lauVar, poe poeVar, pfz pfzVar, paq paqVar, hxu hxuVar) {
        boolean z = false;
        if (this.a.isCancelled()) {
            paqVar.close();
            return false;
        }
        BurstSpec burstSpecD = d(ibyVar, poeVar, lauVar, hxuVar);
        if (burstSpecD != null && !burstSpecD.c().e()) {
            z = true;
        }
        if (z) {
            burstSpecD.getClass();
            this.f = burstSpecD;
            try {
                this.k.execute(new kzd(this, lauVar, ibyVar, poeVar, pfzVar, burstSpecD, paqVar, 0));
            } catch (RejectedExecutionException unused) {
                ((sgt) h.c().M(3834)).s("Error executing the async PSL request.");
                paqVar.close();
            }
        } else {
            paqVar.close();
            this.a.e(Pair.create(new ArrayList(), new ArrayList()));
        }
        return z;
    }
}
