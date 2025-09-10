package defpackage;

import com.google.android.apps.camera.imax.cyclops.audio.xcIh.cdVQ;
import com.google.googlex.gcam.AeResults;
import com.google.googlex.gcam.BurstSpec;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ldr implements hzi, iac, iam, iab {
    public static final sgv a = sgv.g("ldr");
    private static final scn f = scn.I(Integer.valueOf(idz.DEBLUR.ordinal()), Integer.valueOf(idz.ZOOM.ordinal()), Integer.valueOf(idz.e.ordinal()));
    private static final scn g = new sfm(Integer.valueOf(idz.ZOOM.ordinal()));
    public final rwc b;
    public final lez c;
    public final boolean d;
    public final ibj e;
    private final hxv h;
    private final Executor i;
    private final HashMap j = new HashMap();
    private final tzj k;
    private final iey l;
    private final boolean m;
    private final tgq n;
    private final iso o;
    private final cxb p;

    public ldr(hxv hxvVar, rwc rwcVar, tzj tzjVar, Executor executor, iso isoVar, lez lezVar, iey ieyVar, tzj tzjVar2, hbj hbjVar, tgq tgqVar, ibj ibjVar) {
        this.h = hxvVar;
        this.b = rwcVar;
        this.k = tzjVar;
        this.i = executor;
        this.o = isoVar;
        this.c = lezVar;
        this.l = ieyVar;
        this.p = new cxb(tzjVar2);
        this.m = hbjVar.p(gzc.R);
        rnt.L(rwcVar.h());
        this.n = tgqVar;
        this.d = hbjVar.p(gzc.U);
        this.e = ibjVar;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [sgt, shi] */
    private static void j(iak iakVar, ial ialVar, Throwable th) {
        if (th == null) {
            th = new Throwable();
        }
        iag iagVar = new iag(th);
        if (iakVar != null) {
            iakVar.b(iagVar);
        }
        if (ialVar != null) {
            ((sgt) ((sgt) a.c().i(iagVar)).M((char) 4019)).v("Error getting RGB image from secondary shot: %s", iagVar.getMessage());
            ((ldp) ialVar).a(null, null, null);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, lss] */
    @Override // defpackage.hzi
    public final synchronized void a(ltd ltdVar) {
        iby ibyVar;
        HashMap map = this.j;
        Iterator it = map.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                ibyVar = null;
                break;
            } else {
                ibyVar = (iby) it.next();
                if (ibyVar.x.b.l().equals(ltdVar)) {
                    break;
                }
            }
        }
        if (ibyVar != null) {
            ((sgt) a.c().M(4022)).t("Aborting shot %s", ibyVar.a());
            ldi ldiVar = (ldi) map.remove(ibyVar);
            if (ldiVar != null) {
                ldiVar.b();
            }
        }
    }

    @Override // defpackage.hzi
    public final synchronized void b(iby ibyVar, lau lauVar) {
        lauVar.b();
        ibyVar.a();
        ldq ldqVar = (ldq) this.j.get(ibyVar);
        if (ldqVar != null) {
            ldqVar.c(lauVar);
            return;
        }
        lauVar.b();
        ibyVar.a();
        lauVar.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (defpackage.ldr.g.contains(java.lang.Integer.valueOf(r3.ordinal())) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        r0.put(r9, new defpackage.ldq(r8, r9.x, r8.h.a(), r10, r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (defpackage.ldr.f.contains(java.lang.Integer.valueOf(r3.ordinal())) == false) goto L19;
     */
    @Override // defpackage.hzi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void c(defpackage.iby r9, com.google.googlex.gcam.BurstSpec r10, defpackage.poe r11) throws java.lang.Throwable {
        /*
            r8 = this;
            monitor-enter(r8)
            r9.a()     // Catch: java.lang.Throwable -> L59
            java.util.HashMap r0 = r8.j     // Catch: java.lang.Throwable -> L59
            boolean r1 = r0.containsKey(r9)     // Catch: java.lang.Throwable -> L59
            r2 = 1
            r1 = r1 ^ r2
            defpackage.rnt.L(r1)     // Catch: java.lang.Throwable -> L59
            iea r1 = r9.p     // Catch: java.lang.Throwable -> L59
            idz r3 = r1.a()     // Catch: java.lang.Throwable -> L59
            int r1 = r1.c     // Catch: java.lang.Throwable -> L59
            if (r1 != r2) goto L2e
            scn r1 = defpackage.ldr.f     // Catch: java.lang.Throwable -> L2a
            int r2 = r3.ordinal()     // Catch: java.lang.Throwable -> L2a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L2a
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto L41
            goto L56
        L2a:
            r0 = move-exception
            r9 = r0
            r3 = r8
            goto L5c
        L2e:
            r2 = 2
            if (r1 != r2) goto L56
            scn r1 = defpackage.ldr.g     // Catch: java.lang.Throwable -> L59
            int r2 = r3.ordinal()     // Catch: java.lang.Throwable -> L59
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L59
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L56
        L41:
            gga r4 = r9.x     // Catch: java.lang.Throwable -> L59
            hxv r1 = r8.h     // Catch: java.lang.Throwable -> L59
            ldq r2 = new ldq     // Catch: java.lang.Throwable -> L59
            hxu r5 = r1.a()     // Catch: java.lang.Throwable -> L59
            r3 = r8
            r6 = r10
            r7 = r11
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L5e
            r0.put(r9, r2)     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r3)
            return
        L56:
            r3 = r8
            monitor-exit(r3)
            return
        L59:
            r0 = move-exception
            r3 = r8
        L5b:
            r9 = r0
        L5c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5e
            throw r9
        L5e:
            r0 = move-exception
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ldr.c(iby, com.google.googlex.gcam.BurstSpec, poe):void");
    }

    @Override // defpackage.hzi
    public final synchronized void d(iby ibyVar, BurstSpec burstSpec) throws Throwable {
        ldr ldrVar;
        Throwable th;
        try {
            try {
                ibyVar.a();
                ldq ldqVar = (ldq) this.j.get(ibyVar);
                if (ldqVar != null) {
                    this.i.execute(new dwq(this, ibyVar, ldqVar, burstSpec, 9));
                    return;
                }
                try {
                    ((sgt) a.c().M(4032)).t(cdVQ.mOCuBcBldbbbYq, ibyVar.a());
                } catch (Throwable th2) {
                    th = th2;
                    ldrVar = this;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                ldrVar = this;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    @Override // defpackage.hzi
    public final /* synthetic */ void e(iby ibyVar) {
    }

    @Override // defpackage.iac
    public final synchronized void f(iby ibyVar, int i, long j, poe poeVar) {
        ibyVar.a();
        ldq ldqVar = (ldq) this.j.get(ibyVar);
        if (ldqVar == null) {
            ((sgt) a.c().M(4053)).t("Shot %s hasn't been started yet or was aborted!", ibyVar.a());
            return;
        }
        ldqVar.l.e(Integer.valueOf(i));
        ldqVar.a.e(Long.valueOf(j));
    }

    @Override // defpackage.iab
    public final void g(iby ibyVar, AeResults aeResults) {
        ldq ldqVar;
        synchronized (this) {
            ldqVar = (ldq) this.j.get(ibyVar);
        }
        if (ldqVar == null) {
            ibyVar.a();
            return;
        }
        cxb cxbVar = this.p;
        if (cxbVar.C()) {
            ldqVar.a(new hzr(aeResults.a(tbi.a) * ((Float) cxbVar.B()).floatValue(), aeResults.a(tbi.b) * ((Float) cxbVar.B()).floatValue()));
        } else {
            ldqVar.a(new hzr(-1.0f, -1.0f));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:183|(5:178|3|(1:5)(1:6)|7|(1:13)(1:12))|(1:15)(1:(2:17|18)(5:125|126|355|130|(2:160|161)(1:199)))|188|19|(4:21|22|65|26)(3:30|(1:32)(2:33|(2:34|(2:36|(2:198|38)(1:39))(2:197|40)))|(4:42|43|cb|47)(3:51|(1:56)|(4:58|59|196|63)(6:67|(1:72)(1:71)|73|(1:75)|76|(11:93|94|(1:96)(1:97)|293|101|(1:105)|(1:107)(1:(1:109)(1:110))|111|112|325|116)(5:84|(2:(2:88|(1:90)(1:91))(1:87)|92)(0)|94|(0)(0)|293))))|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0339, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x033a, code lost:
    
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x036c, code lost:
    
        if ((r0 instanceof java.lang.InterruptedException) != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x036e, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0375, code lost:
    
        j(r4, r9, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0378, code lost:
    
        r25.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x037b, code lost:
    
        monitor-enter(r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x037c, code lost:
    
        r0 = (defpackage.ldq) r23.j.remove(r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0385, code lost:
    
        r1 = 4039;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x038d, code lost:
    
        r0 = defpackage.ldr.a;
        ((defpackage.sgt) r0.c().M(4035)).s("Secondary shot didn't proceed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x03a8, code lost:
    
        if (r24.p.a() != defpackage.idz.e) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03aa, code lost:
    
        ((defpackage.sgt) r0.c().M(4037)).s("Notifying error.");
        j(r6, r9, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03be, code lost:
    
        r25.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x03c1, code lost:
    
        monitor-enter(r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03c2, code lost:
    
        r0 = (defpackage.ldq) r23.j.remove(r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x03cb, code lost:
    
        r1 = 4036;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0294 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0264 A[Catch: hht | InterruptedException | CancellationException | ExecutionException -> 0x0339, hht | InterruptedException | CancellationException | ExecutionException -> 0x0339, hht | InterruptedException | CancellationException | ExecutionException -> 0x0339, hht | InterruptedException | CancellationException | ExecutionException -> 0x0339, all -> 0x0365, hhg -> 0x038d, TryCatch #4 {all -> 0x0365, blocks: (B:3:0x0007, B:7:0x0015, B:9:0x001d, B:15:0x002b, B:19:0x003f, B:21:0x0049, B:30:0x0076, B:32:0x0084, B:42:0x00c5, B:51:0x00dc, B:54:0x010b, B:58:0x0186, B:67:0x01a7, B:69:0x01da, B:71:0x01e2, B:73:0x01f3, B:75:0x01f9, B:76:0x0209, B:78:0x0214, B:80:0x021c, B:82:0x0223, B:84:0x0229, B:92:0x0251, B:94:0x026d, B:96:0x0287, B:98:0x0293, B:101:0x02a3, B:103:0x02a7, B:105:0x02b1, B:107:0x02c3, B:111:0x02dd, B:109:0x02cc, B:110:0x02d3, B:122:0x0338, B:88:0x0248, B:90:0x024c, B:91:0x024f, B:93:0x0264, B:56:0x0112, B:33:0x0095, B:34:0x009d, B:36:0x00a3, B:38:0x00af, B:138:0x036a, B:140:0x036e, B:141:0x0375, B:151:0x038d, B:153:0x03aa, B:17:0x0037, B:125:0x033c), top: B:183:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0287 A[Catch: hht | InterruptedException | CancellationException | ExecutionException -> 0x0339, hht | InterruptedException | CancellationException | ExecutionException -> 0x0339, hht | InterruptedException | CancellationException | ExecutionException -> 0x0339, hht | InterruptedException | CancellationException | ExecutionException -> 0x0339, all -> 0x0365, hhg -> 0x038d, TryCatch #4 {all -> 0x0365, blocks: (B:3:0x0007, B:7:0x0015, B:9:0x001d, B:15:0x002b, B:19:0x003f, B:21:0x0049, B:30:0x0076, B:32:0x0084, B:42:0x00c5, B:51:0x00dc, B:54:0x010b, B:58:0x0186, B:67:0x01a7, B:69:0x01da, B:71:0x01e2, B:73:0x01f3, B:75:0x01f9, B:76:0x0209, B:78:0x0214, B:80:0x021c, B:82:0x0223, B:84:0x0229, B:92:0x0251, B:94:0x026d, B:96:0x0287, B:98:0x0293, B:101:0x02a3, B:103:0x02a7, B:105:0x02b1, B:107:0x02c3, B:111:0x02dd, B:109:0x02cc, B:110:0x02d3, B:122:0x0338, B:88:0x0248, B:90:0x024c, B:91:0x024f, B:93:0x0264, B:56:0x0112, B:33:0x0095, B:34:0x009d, B:36:0x00a3, B:38:0x00af, B:138:0x036a, B:140:0x036e, B:141:0x0375, B:151:0x038d, B:153:0x03aa, B:17:0x0037, B:125:0x033c), top: B:183:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0291  */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, lss] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void h(defpackage.iby r24, defpackage.ldq r25, com.google.googlex.gcam.BurstSpec r26) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ldr.h(iby, ldq, com.google.googlex.gcam.BurstSpec):void");
    }

    @Override // defpackage.hzi
    public final synchronized void i(ltd ltdVar) {
        ibz ibzVarF = this.o.f(ltdVar);
        ibzVarF.a(this);
        ibzVarF.f(this);
        if (this.p.C()) {
            if (ibzVarF.f == null) {
                ibzVarF.f = new scl();
            }
            ibzVarF.f.d(this);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, lss] */
    @Override // defpackage.iam
    public final synchronized void m(iby ibyVar) {
        a(ibyVar.x.b.l());
    }

    @Override // defpackage.iam
    public final /* synthetic */ void o(iby ibyVar, mdr mdrVar) {
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, lss] */
    @Override // defpackage.iam
    public final synchronized void p(iby ibyVar, iag iagVar) {
        a(ibyVar.x.b.l());
    }
}
