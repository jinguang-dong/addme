package defpackage;

import android.os.Handler;
import android.util.Pair;
import com.google.googlex.gcam.BurstSpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hyi implements pau {
    private static final sgv c = sgv.g("hyi");
    public final int a;
    public Pair b;
    private final Handler d;

    public hyi(Handler handler, our ourVar, hbj hbjVar) {
        this.d = handler;
        this.a = ((Integer) hbjVar.a(gzs.f).orElse(615)).intValue();
        ourVar.d(new ffy(this, 19));
    }

    public static void c(pdk pdkVar) {
        if (pdkVar == null || pdkVar.f()) {
            return;
        }
        pdkVar.b();
        pdkVar.close();
    }

    public final synchronized Pair b(long j) {
        pdk pdkVarA;
        Pair pair = this.b;
        if (pair != null) {
            pdk pdkVar = (pdk) pair.first;
            Pair pair2 = this.b;
            pair2.getClass();
            BurstSpec burstSpec = (BurstSpec) pair2.second;
            if (!pdkVar.f() && pdkVar.b() != null) {
                pdo pdoVarB = pdkVar.b();
                pdoVarB.getClass();
                if (j - pdoVarB.b < this.a && (pdkVarA = pdkVar.a()) != null) {
                    return Pair.create(pdkVarA, burstSpec);
                }
                pdkVar.getClass();
                pdkVar.close();
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[Catch: all -> 0x0059, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000e, B:9:0x0012, B:11:0x001c, B:12:0x0028, B:14:0x003d, B:20:0x005d), top: B:27:0x0003 }] */
    @Override // defpackage.pau
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(android.util.Pair r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 == 0) goto L5b
            java.lang.Object r0 = r5.first     // Catch: java.lang.Throwable -> L59
            pdk r0 = (defpackage.pdk) r0     // Catch: java.lang.Throwable -> L59
            boolean r0 = r0.f()     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto Le
            goto L5b
        Le:
            android.util.Pair r0 = r4.b     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L28
            java.lang.Object r0 = r0.first     // Catch: java.lang.Throwable -> L59
            pdk r0 = (defpackage.pdk) r0     // Catch: java.lang.Throwable -> L59
            boolean r0 = r0.f()     // Catch: java.lang.Throwable -> L59
            if (r0 != 0) goto L28
            android.util.Pair r0 = r4.b     // Catch: java.lang.Throwable -> L59
            r0.getClass()     // Catch: java.lang.Throwable -> L59
            java.lang.Object r0 = r0.first     // Catch: java.lang.Throwable -> L59
            pdk r0 = (defpackage.pdk) r0     // Catch: java.lang.Throwable -> L59
            r0.close()     // Catch: java.lang.Throwable -> L59
        L28:
            r4.b = r5     // Catch: java.lang.Throwable -> L59
            android.os.Handler r0 = r4.d     // Catch: java.lang.Throwable -> L59
            hvm r1 = new hvm     // Catch: java.lang.Throwable -> L59
            r2 = 8
            r3 = 0
            r1.<init>(r5, r2, r3)     // Catch: java.lang.Throwable -> L59
            int r2 = r4.a     // Catch: java.lang.Throwable -> L59
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L59
            boolean r0 = r0.postDelayed(r1, r2)     // Catch: java.lang.Throwable -> L59
            if (r0 != 0) goto L63
            sgv r0 = defpackage.hyi.c     // Catch: java.lang.Throwable -> L59
            shi r0 = r0.c()     // Catch: java.lang.Throwable -> L59
            r1 = 1707(0x6ab, float:2.392E-42)
            shi r0 = r0.M(r1)     // Catch: java.lang.Throwable -> L59
            sgt r0 = (defpackage.sgt) r0     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = "Cannot post delayed Frame closure, closing now."
            r0.s(r1)     // Catch: java.lang.Throwable -> L59
            java.lang.Object r5 = r5.first     // Catch: java.lang.Throwable -> L59
            pdk r5 = (defpackage.pdk) r5     // Catch: java.lang.Throwable -> L59
            r5.close()     // Catch: java.lang.Throwable -> L59
            monitor-exit(r4)
            return
        L59:
            r5 = move-exception
            goto L61
        L5b:
            if (r5 == 0) goto L63
            java.lang.Object r5 = r5.first     // Catch: java.lang.Throwable -> L59
            monitor-exit(r4)
            return
        L61:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L59
            throw r5
        L63:
            monitor-exit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hyi.a(android.util.Pair):void");
    }
}
