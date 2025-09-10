package defpackage;

import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.StrictMode;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qzm implements Comparable {
    public static final qzl a = new qzl();
    public final qxf b;
    public final String c;
    public final boolean f;
    public final rah h;
    private final Set k;
    public final String d = "";
    public final boolean e = false;
    public final boolean g = false;
    public volatile uwt j = null;
    public final qqe i = new qqe();

    public qzm(qxf qxfVar, String str, boolean z, Set set) {
        this.b = qxfVar;
        this.c = str;
        this.f = z;
        this.k = set;
        this.h = new rah(qxfVar, str, "", z);
    }

    public final void a() {
        final rah rahVar = this.h;
        syu syuVarA = rahVar.a(this.d);
        sxi sxiVar = new sxi() { // from class: qzj
            @Override // defpackage.sxi
            public final syu a(Object obj) {
                return rahVar.b((rai) obj);
            }
        };
        qxf qxfVar = this.b;
        swz.j(syuVarA, sxiVar, qxfVar.b()).c(new pev(this, syuVarA, 17), qxfVar.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e A[Catch: CancellationException | ExecutionException -> 0x0048, CancellationException | ExecutionException -> 0x0048, TryCatch #1 {CancellationException | ExecutionException -> 0x0048, blocks: (B:2:0x0000, B:4:0x0016, B:21:0x003e, B:21:0x003e, B:14:0x0023, B:14:0x0023, B:15:0x0024, B:15:0x0024, B:17:0x002e, B:17:0x002e, B:19:0x003a, B:19:0x003a), top: B:29:0x0000 }] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void b(defpackage.syu r4) {
        /*
            r3 = this;
            java.lang.Object r4 = defpackage.ske.U(r4)     // Catch: java.lang.Throwable -> L48
            rai r4 = (defpackage.rai) r4     // Catch: java.lang.Throwable -> L48
            rag r0 = new rag     // Catch: java.lang.Throwable -> L48
            r1 = 6
            r2 = 2
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L48
            uwt r1 = new uwt     // Catch: java.lang.Throwable -> L48
            r1.<init>(r4, r0)     // Catch: java.lang.Throwable -> L48
            uwt r4 = r3.j     // Catch: java.lang.Throwable -> L48
            if (r4 != 0) goto L24
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L48
            uwt r4 = r3.j     // Catch: java.lang.Throwable -> L21
            if (r4 != 0) goto L1f
            r3.j = r1     // Catch: java.lang.Throwable -> L21
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
            goto L3e
        L1f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
            goto L24
        L21:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
            throw r4     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L48
        L24:
            java.lang.Object r4 = r4.d     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L48
            java.lang.Object r0 = r1.d     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L48
            boolean r4 = defpackage.ujp.aA(r4, r0)     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L48
            if (r4 != 0) goto L3e
            qxf r4 = r3.b     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L48
            rww r4 = r4.d     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L48
            java.lang.Object r4 = r4.fr()     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L48
            qzx r4 = (defpackage.qzx) r4     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L48
            if (r4 == 0) goto L6b
            r4.a()     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L48
            return
        L3e:
            qqe r4 = r3.i     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L48
            java.lang.Object r4 = r4.a     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L48
            java.util.concurrent.atomic.AtomicInteger r4 = (java.util.concurrent.atomic.AtomicInteger) r4     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L48
            r4.incrementAndGet()     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L48
            return
        L48:
            r4 = move-exception
            java.lang.Throwable r0 = r4.getCause()
            boolean r0 = r0 instanceof java.lang.SecurityException
            if (r0 != 0) goto L6b
            java.lang.String r3 = r3.c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to update local snapshot for "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = ", may result in stale flags."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "FlagStore"
            android.util.Log.w(r0, r3, r4)
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qzm.b(syu):void");
    }

    public final void c() {
        syu syuVarB;
        qxw qxwVar;
        uwt uwtVarD = d();
        Object obj = uwtVarD.b;
        qxf qxfVar = this.b;
        rac racVarB = qxfVar.e.b(this.f);
        if (racVarB.h) {
            String str = (String) obj;
            if (rnt.V(str) && !racVarB.g) {
                syu syuVar = syq.a;
                return;
            }
            tpc tpcVarM = qxx.a.m();
            rag ragVar = (rag) uwtVarD.c;
            if (ragVar.a) {
                qxwVar = qxw.a;
            } else {
                tpc tpcVarM2 = qxw.a.m();
                int i = ragVar.b;
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                qxw qxwVar2 = (qxw) tpcVarM2.b;
                qxwVar2.c = a.as(i);
                qxwVar2.b |= 1;
                int i2 = ragVar.c;
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                qxw qxwVar3 = (qxw) tpcVarM2.b;
                qxwVar3.d = i2 - 2;
                qxwVar3.b |= 2;
                qxwVar = (qxw) tpcVarM2.l();
            }
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            qxx qxxVar = (qxx) tpcVarM.b;
            qxwVar.getClass();
            qxxVar.d = qxwVar;
            qxxVar.b |= 2;
            if (!rnt.V(str)) {
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                qxx qxxVar2 = (qxx) tpcVarM.b;
                obj.getClass();
                qxxVar2.b |= 1;
                qxxVar2.c = str;
            }
            if (racVarB.g) {
                String str2 = this.c;
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                qxx qxxVar3 = (qxx) tpcVarM.b;
                str2.getClass();
                qxxVar3.b |= 4;
                qxxVar3.e = str2;
            }
            qqe qqeVarE = qxfVar.e();
            qxx qxxVar4 = (qxx) tpcVarM.l();
            qxxVar4.getClass();
            ogw ogwVar = new ogw();
            ogwVar.a = new ojb(qxxVar4, 3);
            ogwVar.b = new odl[]{onc.a};
            ogwVar.b();
            ogx ogxVarA = ogwVar.a();
            Object obj2 = qqeVarE.a;
            syuVarB = qqe.d(((oet) obj2).f(ogxVarA).b(sxo.a, new onl((onm) obj2, qxxVar4, 0)));
        } else {
            String str3 = (String) obj;
            if (rnt.V(str3)) {
                syu syuVar2 = syq.a;
                return;
            }
            syuVarB = qxfVar.e().b(str3);
        }
        swf.j(syuVarB, qya.class, new qaz(this, 17), qxfVar.b());
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.d.compareTo((String) obj);
    }

    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.Object, rww] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, rww] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final uwt d() {
        uwt uwtVar;
        Object objSubstring;
        int i;
        raf rafVar;
        uwt uwtVar2;
        uwt uwtVar3 = this.j;
        if (uwtVar3 != null) {
            return uwtVar3;
        }
        synchronized (this) {
            uwtVar = this.j;
            if (uwtVar == null) {
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                try {
                    rah rahVar = this.h;
                    boolean z = rahVar.a;
                    int i2 = 9;
                    if (z || !prt.f(((qxf) rahVar.b).c)) {
                        Object obj = rahVar.b;
                        rac racVarB = ((qxf) obj).e.b(z);
                        tag tagVar = tag.FILE;
                        Object obj2 = rahVar.d;
                        int i3 = qxc.a;
                        int iIndexOf = ((String) obj2).indexOf("#");
                        if (iIndexOf >= 0) {
                            objSubstring = ((String) obj2).substring(0, iIndexOf);
                        } else {
                            if (((String) obj2).contains("@")) {
                                throw new IllegalArgumentException("Invalid package name: ".concat(String.valueOf(obj2)));
                            }
                            objSubstring = obj2;
                        }
                        tagVar.getClass();
                        objSubstring.getClass();
                        if (!racVarB.f) {
                            i = 14;
                        } else if (!racVarB.a(tagVar)) {
                            i = 3;
                        } else if (racVarB.a.t()) {
                            i = 4;
                        } else {
                            List list = racVarB.d;
                            i = (list.isEmpty() || list.contains(objSubstring)) ? racVarB.e.contains(objSubstring) ? 6 : 0 : 5;
                        }
                        if (i != 0) {
                            rafVar = new raf(null, new rag(i));
                        } else {
                            try {
                                String str = racVarB.c;
                                if (str.isEmpty()) {
                                    rwc rwcVar = (rwc) ((qxf) obj).f.fr();
                                    if (rwcVar.h()) {
                                        if (z) {
                                            int i4 = prt.a;
                                            str = ((ApplicationInfo) rwcVar.c()).deviceProtectedDataDir;
                                        } else {
                                            str = ((ApplicationInfo) rwcVar.c()).dataDir;
                                        }
                                        String str2 = str + File.separator + racVarB.b;
                                        lat latVar = new lat(racVarB.a, (String) obj2, (String) rahVar.e);
                                        Uri uriBuild = new Uri.Builder().scheme("file").appendEncodedPath(File.separator + str2 + File.separator + new File(((String) latVar.b.fr()) + "/" + ((String) latVar.c.fr()) + ".pb").toString()).build();
                                        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                                        try {
                                            try {
                                                rafVar = new raf((qyk) ((qxf) obj).f().m(uriBuild, new rae()), new rag(5, 2));
                                            } catch (FileNotFoundException unused) {
                                                qpt.x(Level.INFO, ((qxf) rahVar.b).b(), "Shared storage file not found for %s", rahVar.d);
                                                rafVar = new raf(null, new rag(8));
                                            } catch (tpz e) {
                                                qpt.w(Level.SEVERE, ((qxf) rahVar.b).b(), e, "Failed to parse snapshot from shared storage for %s", rahVar.d);
                                                rafVar = new raf(null, new rag(9));
                                            }
                                        } finally {
                                            StrictMode.setThreadPolicy(threadPolicy);
                                        }
                                    } else {
                                        qpt.x(Level.WARNING, ((qxf) obj).b(), "Unable to get GMS application info, using defaults.", new Object[0]);
                                        rafVar = new raf(qyk.a, new rag(3, 7));
                                    }
                                } else {
                                    String str22 = str + File.separator + racVarB.b;
                                    lat latVar2 = new lat(racVarB.a, (String) obj2, (String) rahVar.e);
                                    Uri uriBuild2 = new Uri.Builder().scheme("file").appendEncodedPath(File.separator + str22 + File.separator + new File(((String) latVar2.b.fr()) + "/" + ((String) latVar2.c.fr()) + ".pb").toString()).build();
                                    StrictMode.ThreadPolicy threadPolicy2 = StrictMode.getThreadPolicy();
                                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy2).permitDiskReads().build());
                                    rafVar = new raf((qyk) ((qxf) obj).f().m(uriBuild2, new rae()), new rag(5, 2));
                                }
                            } catch (Exception e2) {
                                qpt.w(Level.WARNING, ((qxf) rahVar.b).b(), e2, "Failed to read shared file for %s", rahVar.d);
                                rafVar = new raf(qyk.a, new rag(3, 10));
                            }
                        }
                        qyk qykVar = rafVar.a;
                        if (qykVar != null) {
                            int i5 = rab.a;
                            rab.a(14903855);
                            uwtVar2 = new uwt(qykVar, rafVar.b);
                        } else {
                            int i6 = rab.a;
                            rab.a(14903854);
                            try {
                                uwtVar2 = new uwt((rai) ((qxf) rahVar.b).f().m((Uri) rahVar.c, rdm.b(rai.a)), new rag(4, rafVar.b.c));
                            } catch (IOException | RuntimeException unused2) {
                                qpt.x(Level.INFO, ((qxf) rahVar.b).b(), "Unable to retrieve flag snapshot for %s, using defaults.", rahVar.d);
                                uwtVar2 = rahVar.c() ? new uwt(qyk.a, new rag(3, 16)) : new uwt(rai.a, new rag(3, 11));
                            }
                        }
                    } else {
                        uwtVar2 = new uwt(rai.a, new rag(3, 17));
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    Object obj3 = uwtVar2.c;
                    if (((rag) obj3).c != 17) {
                        qxf qxfVar = this.b;
                        rak rakVar = qxfVar.e;
                        if (!prt.f(rakVar.c) && rakVar.a().g + TimeUnit.HOURS.toMillis(24L) < System.currentTimeMillis()) {
                            syx syxVar = (syx) rakVar.e.fr();
                            syxVar.getClass();
                            swz.j(syn.v(ske.N((syu) rakVar.h.fr())), new qaz(rakVar, 19), syxVar);
                        } else {
                            syu syuVar = syq.a;
                        }
                        rah rahVar2 = this.h;
                        if (rahVar2.c() || !((String) uwtVar2.b).isEmpty()) {
                            qxfVar.b().execute(new qly(this, 8));
                            qqq qqqVar = qxfVar.h;
                            Object obj4 = uwtVar2.a;
                            Set<String> set = this.k;
                            String str3 = this.c;
                            if (!set.isEmpty() && !((AtomicBoolean) qqqVar.c).getAndSet(true)) {
                                ocq.a().b(new qzg(qqqVar));
                            }
                            byte[] bArrU = ((toj) obj4).u();
                            byte[][] bArr = onb.a;
                            qzf qzfVar = new qzf(new onb("", bArrU, bArr, bArr, bArr, bArr, null, null, null, null), str3);
                            qqqVar.b.put(str3, qzfVar);
                            for (String str4 : set) {
                                ?? r9 = qqqVar.d;
                                Set set2 = (Set) r9.putIfAbsent(str4, new sfm(qzfVar));
                                if (set2 != null) {
                                    scl sclVar = new scl();
                                    sclVar.j(set2);
                                    sclVar.d(qzfVar);
                                    r9.put(str4, sclVar.g());
                                }
                            }
                            if (!this.d.equals("")) {
                                qxfVar.b().execute(new pgr(this, 13));
                            }
                            if (rahVar2.c()) {
                                qxfVar.b().execute(new qly(this, i2));
                            }
                            uwtVar = uwtVar2;
                            this.j = uwtVar;
                        } else {
                            qxfVar.b().execute(new qly(this, 7));
                            uwtVar = new uwt(rai.a, (rag) obj3);
                            this.j = uwtVar;
                        }
                    } else {
                        uwtVar = uwtVar2;
                        this.j = uwtVar;
                    }
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            }
        }
        return uwtVar;
    }
}
