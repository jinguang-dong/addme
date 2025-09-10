package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.wearable.MessageOptions;
import j$.time.Duration;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nss {
    public static final sgv a = sgv.g("nss");
    private static final Duration f = Duration.ofSeconds(1);
    private static final Duration g = Duration.ofSeconds(5);
    public oon c;
    public int d;
    public final oet e;
    private final Executor h;
    private final opu i;
    private final Executor j = Executors.newSingleThreadExecutor();
    private final Executor k = Executors.newSingleThreadExecutor();
    private final MessageOptions l = new MessageOptions(1);
    private final MessageOptions m = new MessageOptions(0);
    public String b = null;

    public nss(Executor executor, oet oetVar, opu opuVar) {
        this.h = executor;
        this.i = opuVar;
        this.e = oetVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [sgt, shi] */
    private final Set g() {
        final szh szhVar = new szh();
        this.i.a().i(this.j, new oom() { // from class: nsr
            /* JADX WARN: Type inference failed for: r1v1, types: [sgt, shi] */
            @Override // defpackage.oom
            public final void a(oor oorVar) {
                sgv sgvVar = nss.a;
                szh szhVar2 = szhVar;
                try {
                    opv opvVar = (opv) oorVar.d();
                    if (opvVar == null) {
                        szhVar2.e(null);
                        return;
                    }
                    if (opvVar.a() != null) {
                        opvVar.a().size();
                    }
                    szhVar2.e(opvVar.a());
                } catch (ooq e) {
                    ((sgt) ((sgt) nss.a.c().i(e)).M((char) 5517)).s("getNodesByCapabilitySync() - Fail to getCapability");
                    szhVar2.e(null);
                }
            }
        });
        try {
            return (Set) szhVar.t(g.toSeconds(), TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((sgt) ((sgt) a.c().i(e)).M((char) 5515)).s("getNodesByCapabilitySync() - Fail to getCapability");
            return null;
        }
    }

    public final String a() {
        SystemClock.uptimeMillis();
        Set<ota> setG = g();
        String str = null;
        if (setG != null && !setG.isEmpty()) {
            setG.size();
            for (ota otaVar : setG) {
                String str2 = otaVar.a;
                if (!TextUtils.isEmpty(str2) && otaVar.d) {
                    String str3 = otaVar.b;
                    int i = otaVar.c;
                    if (str == null) {
                        str = str2;
                    }
                }
            }
            SystemClock.uptimeMillis();
        }
        return str;
    }

    public final void b(String str) {
        this.h.execute(new mzq(this, str, 14));
    }

    public final void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b = str;
    }

    public final void d(String str, byte[] bArr) {
        if (TextUtils.isEmpty(this.b)) {
            this.b = a();
        }
        String str2 = this.b;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        e(str2, str, bArr);
    }

    public final void e(String str, String str2, byte[] bArr) {
        f(str, str2, bArr, f.toMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void f(final java.lang.String r10, final java.lang.String r11, final byte[] r12, long r13) {
        /*
            r9 = this;
            szh r0 = new szh
            r0.<init>()
            int r1 = r11.hashCode()
            r2 = -354612671(0xffffffffeadd0a41, float:-1.3361051E26)
            r3 = 0
            r4 = 2
            java.lang.String r5 = "/preview"
            java.lang.String r6 = "/sending_time"
            r7 = 1
            if (r1 == r2) goto L32
            r2 = -10477383(0xffffffffff6020b9, float:-2.9791698E38)
            if (r1 == r2) goto L2a
            r2 = 995325703(0x3b537707, float:0.003226699)
            if (r1 == r2) goto L20
            goto L3a
        L20:
            java.lang.String r1 = "/empty_preview"
            boolean r1 = r11.equals(r1)
            if (r1 == 0) goto L3a
            r1 = r7
            goto L3b
        L2a:
            boolean r1 = r11.equals(r5)
            if (r1 == 0) goto L3a
            r1 = r3
            goto L3b
        L32:
            boolean r1 = r11.equals(r6)
            if (r1 == 0) goto L3a
            r1 = r4
            goto L3b
        L3a:
            r1 = -1
        L3b:
            if (r1 == 0) goto L44
            if (r1 == r7) goto L44
            if (r1 == r4) goto L44
            com.google.android.gms.wearable.MessageOptions r1 = r9.m
            goto L46
        L44:
            com.google.android.gms.wearable.MessageOptions r1 = r9.l
        L46:
            oet r2 = r9.e
            ogw r4 = new ogw
            r4.<init>()
            osw r8 = new osw
            r8.<init>()
            r4.a = r8
            r10 = 24020(0x5dd4, float:3.3659E-41)
            r4.c = r10
            odl[] r10 = new defpackage.odl[r7]
            odl r12 = defpackage.oqd.x
            r10[r3] = r12
            r4.b = r10
            ogx r10 = r4.a()
            oor r10 = r2.f(r10)
            java.util.concurrent.Executor r12 = r9.k
            nsq r1 = new nsq
            r1.<init>()
            r10.i(r12, r1)
            oon r9 = r9.c
            if (r9 == 0) goto L79
            r10.k(r12, r9)
        L79:
            boolean r9 = r11.equals(r6)
            if (r9 != 0) goto L82
            r11.equals(r5)
        L82:
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r9 = r0.t(r13, r9)     // Catch: java.lang.Throwable -> L8a
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch: java.lang.Throwable -> L8a
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nss.f(java.lang.String, java.lang.String, byte[], long):void");
    }
}
