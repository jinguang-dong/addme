package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import com.google.android.play.core.install.rwb.GAQqzWiWWcYOgy;
import com.google.ar.core.ImageMetadata;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdr extends fvj implements jhh, jhf, jhg, lre {
    private static volatile Boolean i;
    public ssc a;
    public boolean b;
    public final mec c;
    public final mdy d;
    public final hbj e;
    public final cxb f;
    public final cxb g;
    private final owq j;
    private final CameraActivityTiming k;
    private final Executor l;
    private final pbn m;
    private final Context n;
    private final lrh o;
    private final boolean p;
    private final iuo q;
    private final hdp r;
    private long s;
    private long t;
    private lrf u;
    private long v;
    private final hdm w;
    private final mdi x;
    private final gox y;

    public fdr(Context context, cxb cxbVar, mdy mdyVar, CameraActivityTiming cameraActivityTiming, cxb cxbVar2, mec mecVar, Executor executor, pbn pbnVar, owq owqVar, hdm hdmVar, ktx ktxVar, gox goxVar, lrh lrhVar, iuo iuoVar, mdi mdiVar, hdp hdpVar, hbj hbjVar) {
        super(sxo.a);
        this.a = ssc.UNKNOWN_MODE;
        this.n = context;
        this.f = cxbVar;
        mdyVar.getClass();
        this.d = mdyVar;
        this.k = cameraActivityTiming;
        cxbVar2.getClass();
        this.g = cxbVar2;
        this.l = executor;
        owqVar.getClass();
        this.j = owqVar;
        this.c = mecVar;
        this.m = pbnVar;
        this.w = hdmVar;
        this.o = lrhVar;
        this.y = goxVar;
        this.p = ktxVar.a;
        this.q = iuoVar;
        this.x = mdiVar;
        this.r = hdpVar;
        this.e = hbjVar;
    }

    private final int i() {
        int iA = this.c.a() - 1;
        if (iA == 0) {
            return 2;
        }
        if (iA == 1) {
            return 5;
        }
        if (iA != 2) {
            return iA != 3 ? 1 : 4;
        }
        return 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    @Override // defpackage.jhf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ej() {
        /*
            r7 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r7.s
            long r2 = r0 - r2
            r4 = 2000(0x7d0, double:9.88E-321)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L31
            r7.s = r0
            mdy r0 = r7.d
            java.util.UUID r1 = java.util.UUID.randomUUID()
            long r1 = r1.getLeastSignificantBits()
            r0.e = r1
            java.util.concurrent.Executor r0 = r7.l
            pbn r1 = r7.m
            ea r2 = new ea
            r3 = 18
            r4 = 0
            r2.<init>(r7, r3, r4)
            java.lang.String r3 = "logForegroundStat"
            java.lang.Runnable r1 = r1.c(r3, r2)
            r0.execute(r1)
        L31:
            lrh r0 = r7.o
            java.lang.Object r1 = r0.e
            monitor-enter(r1)
            java.util.Set r2 = r0.i     // Catch: java.lang.Throwable -> L82
            r2.add(r7)     // Catch: java.lang.Throwable -> L82
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L82
            j$.util.stream.Stream r7 = j$.util.Collection.EL.stream(r2)     // Catch: java.lang.Throwable -> L7f
            hkp r2 = new hkp     // Catch: java.lang.Throwable -> L7f
            r3 = 3
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L7f
            j$.util.stream.IntStream r7 = r7.mapToInt(r2)     // Catch: java.lang.Throwable -> L7f
            j$.util.OptionalInt r7 = r7.min()     // Catch: java.lang.Throwable -> L7f
            r2 = -1
            int r7 = r7.orElse(r2)     // Catch: java.lang.Throwable -> L7f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7f
            boolean r2 = r0.j     // Catch: java.lang.Throwable -> L82
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L5f
            r0.j = r3     // Catch: java.lang.Throwable -> L82
            r0.k = r7     // Catch: java.lang.Throwable -> L82
            goto L6a
        L5f:
            int r2 = r0.k     // Catch: java.lang.Throwable -> L82
            if (r2 == r7) goto L69
            r0.k = r7     // Catch: java.lang.Throwable -> L82
            r6 = r4
            r4 = r3
            r3 = r6
            goto L6a
        L69:
            r3 = r4
        L6a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L82
            if (r3 == 0) goto L79
            java.util.concurrent.Executor r1 = r0.b
            kpl r2 = new kpl
            r3 = 2
            r2.<init>(r0, r7, r3)
            r1.execute(r2)
            return
        L79:
            if (r4 == 0) goto L7e
            r0.b(r7)
        L7e:
            return
        L7f:
            r7 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7f
            throw r7     // Catch: java.lang.Throwable -> L82
        L82:
            r7 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L82
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdr.ej():void");
    }

    @Override // defpackage.fvj
    public final void f() {
    }

    @Override // defpackage.lre
    public final void g(lrf lrfVar) {
        this.v = SystemClock.elapsedRealtimeNanos();
        this.u = lrfVar;
        this.o.a(this);
    }

    @Override // defpackage.lre
    public final /* synthetic */ void h() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v40, types: [rwc] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r4v16, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.jhg
    public final void eu() {
        long j;
        int i2;
        rwc rwcVarJ;
        LinkedHashMap linkedHashMap;
        long j2;
        String string;
        boolean zEquals;
        iuo iuoVar = this.q;
        ((iun) iuoVar.b).a().c();
        syu syuVarB = iuoVar.b(null);
        if (syuVarB != null) {
            syuVarB.cancel(false);
        }
        long jA = mel.d().a();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.t >= 2000) {
            if (i == null) {
                synchronized (fdr.class) {
                    if (i == null) {
                        Context context = this.n;
                        PackageManager packageManager = context.getPackageManager();
                        rwc rwcVarF = jsv.F(packageManager, new Intent("android.media.action.STILL_IMAGE_CAMERA"), false);
                        if (!rwcVarF.h()) {
                            rwcVarF = jsv.F(packageManager, new Intent("android.media.action.STILL_IMAGE_CAMERA_SECURE"), false);
                        }
                        if (!rwcVarF.h()) {
                            rwcVarF = jsv.F(packageManager, new Intent("android.media.action.STILL_IMAGE_CAMERA"), true);
                        }
                        if (rwcVarF.h()) {
                            String str = ((ApplicationInfo) rwcVarF.c()).packageName;
                            String str2 = context.getApplicationInfo().packageName;
                            zEquals = context.getApplicationInfo().packageName.equals(str);
                        } else {
                            zEquals = false;
                        }
                        i = Boolean.valueOf(zEquals);
                    }
                }
            }
            boolean zBooleanValue = i.booleanValue();
            this.t = jElapsedRealtime;
            CameraActivityTiming cameraActivityTiming = this.k;
            nkw nkwVarA = cameraActivityTiming.a();
            ssc sscVar = this.a;
            ssc sscVar2 = ssc.UNKNOWN_MODE;
            if (sscVar != sscVar2) {
                if (sscVar == ssc.FILMSTRIP) {
                    this.b = true;
                }
                this.a = sscVar2;
            } else {
                sscVar = ((nkw) this.j.dL()).v;
            }
            rvk rvkVar = rvk.a;
            int i3 = sbp.d;
            List listA = sex.a;
            int i4 = 16;
            if (!cameraActivityTiming.e() || cameraActivityTiming.f()) {
                j = 0;
                if (!nkwVarA.e()) {
                    i2 = 5;
                } else if (cameraActivityTiming.e()) {
                    i2 = cameraActivityTiming.i;
                    if (i2 == 0) {
                        i2 = 1;
                    }
                } else {
                    i2 = 2;
                }
                tpc tpcVarM = sqy.a.m();
                ssc sscVar3 = nkwVarA.v;
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                sqy sqyVar = (sqy) tpcVarM.b;
                sqyVar.c = sscVar3.T;
                sqyVar.b |= 1;
                int i5 = i();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                tph tphVar = tpcVarM.b;
                sqy sqyVar2 = (sqy) tphVar;
                sqyVar2.d = i5 - 1;
                sqyVar2.b |= 2;
                if (!tphVar.C()) {
                    tpcVarM.o();
                }
                tph tphVar2 = tpcVarM.b;
                sqy sqyVar3 = (sqy) tphVar2;
                sqyVar3.e = i2 - 1;
                sqyVar3.b |= 4;
                if (!tphVar2.C()) {
                    tpcVarM.o();
                }
                sqy sqyVar4 = (sqy) tpcVarM.b;
                sqyVar4.b |= 8;
                sqyVar4.f = zBooleanValue;
                rwcVarJ = rwc.j((sqy) tpcVarM.l());
                if (i2 == 2) {
                    this.r.a();
                }
            } else {
                long j3 = this.c.a() == 1 ? cameraActivityTiming.m : 0L;
                tpc tpcVarM2 = srj.a.m();
                j = 0;
                long activityOnCreateStartNs = cameraActivityTiming.getActivityOnCreateStartNs();
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                srj srjVar = (srj) tpcVarM2.b;
                srjVar.b |= 1;
                srjVar.c = activityOnCreateStartNs;
                long permissionStartupTaskTimeStartNs = cameraActivityTiming.getPermissionStartupTaskTimeStartNs();
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                srj srjVar2 = (srj) tpcVarM2.b;
                srjVar2.b |= 128;
                srjVar2.j = permissionStartupTaskTimeStartNs;
                long permissionStartupTaskTimeEndNs = cameraActivityTiming.getPermissionStartupTaskTimeEndNs();
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                srj srjVar3 = (srj) tpcVarM2.b;
                srjVar3.b |= 256;
                srjVar3.k = permissionStartupTaskTimeEndNs;
                long waitForCameraDevicesTaskTimeStartNs = cameraActivityTiming.getWaitForCameraDevicesTaskTimeStartNs();
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                srj srjVar4 = (srj) tpcVarM2.b;
                srjVar4.b |= 2048;
                srjVar4.l = waitForCameraDevicesTaskTimeStartNs;
                long waitForCameraDevicesTaskTimeEndNs = cameraActivityTiming.getWaitForCameraDevicesTaskTimeEndNs();
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                srj srjVar5 = (srj) tpcVarM2.b;
                srjVar5.b |= 4096;
                srjVar5.m = waitForCameraDevicesTaskTimeEndNs;
                long activityInitializeStartNs = cameraActivityTiming.getActivityInitializeStartNs();
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                srj srjVar6 = (srj) tpcVarM2.b;
                srjVar6.b |= 2097152;
                srjVar6.u = activityInitializeStartNs;
                long uiWireStartNs = cameraActivityTiming.getUiWireStartNs();
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                srj srjVar7 = (srj) tpcVarM2.b;
                srjVar7.b |= 4194304;
                srjVar7.v = uiWireStartNs;
                long uiWireEndNs = cameraActivityTiming.getUiWireEndNs();
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                srj srjVar8 = (srj) tpcVarM2.b;
                srjVar8.b |= 8388608;
                srjVar8.w = uiWireEndNs;
                long activityInitializedNs = cameraActivityTiming.getActivityInitializedNs();
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                srj srjVar9 = (srj) tpcVarM2.b;
                srjVar9.b |= 4;
                srjVar9.e = activityInitializedNs;
                long firstPreviewFrameReceivedNs = cameraActivityTiming.getFirstPreviewFrameReceivedNs();
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                srj srjVar10 = (srj) tpcVarM2.b;
                srjVar10.b |= 2;
                srjVar10.d = firstPreviewFrameReceivedNs;
                long firstPreviewFrameRenderedNs = cameraActivityTiming.getFirstPreviewFrameRenderedNs();
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                srj srjVar11 = (srj) tpcVarM2.b;
                srjVar11.b |= 64;
                srjVar11.i = firstPreviewFrameRenderedNs;
                long firstVfePreviewFrameRenderedNs = cameraActivityTiming.getFirstVfePreviewFrameRenderedNs();
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                srj srjVar12 = (srj) tpcVarM2.b;
                srjVar12.b |= 131072;
                srjVar12.r = firstVfePreviewFrameRenderedNs;
                long jI = cameraActivityTiming.i(mej.ONE_CAMERA_CREATION_START);
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                srj srjVar13 = (srj) tpcVarM2.b;
                srjVar13.b |= ImageMetadata.SHADING_MODE;
                srjVar13.t = jI;
                long shutterButtonFirstEnabledNs = cameraActivityTiming.getShutterButtonFirstEnabledNs();
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                srj srjVar14 = (srj) tpcVarM2.b;
                srjVar14.b |= 16;
                srjVar14.g = shutterButtonFirstEnabledNs;
                long shutterButtonFirstDrawnNs = cameraActivityTiming.getShutterButtonFirstDrawnNs();
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                tph tphVar3 = tpcVarM2.b;
                srj srjVar15 = (srj) tphVar3;
                srjVar15.b |= 8;
                srjVar15.f = shutterButtonFirstDrawnNs;
                if (!tphVar3.C()) {
                    tpcVarM2.o();
                }
                srj srjVar16 = (srj) tpcVarM2.b;
                srjVar16.b |= 32;
                srjVar16.h = j3;
                long nanos = TimeUnit.MILLISECONDS.toNanos(Process.getStartElapsedRealtime());
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                srj srjVar17 = (srj) tpcVarM2.b;
                srjVar17.b |= 262144;
                srjVar17.s = nanos;
                int i6 = i();
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                tph tphVar4 = tpcVarM2.b;
                srj srjVar18 = (srj) tphVar4;
                srjVar18.q = i6 - 1;
                srjVar18.b |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                if (!tphVar4.C()) {
                    tpcVarM2.o();
                }
                tph tphVar5 = tpcVarM2.b;
                srj srjVar19 = (srj) tphVar5;
                srjVar19.b |= 8192;
                srjVar19.n = zBooleanValue;
                ssc sscVar4 = nkwVarA.v;
                if (!tphVar5.C()) {
                    tpcVarM2.o();
                }
                srj srjVar20 = (srj) tpcVarM2.b;
                srjVar20.x = sscVar4.T;
                srjVar20.b |= 16777216;
                lrf lrfVar = this.u;
                if (lrfVar != null) {
                    long j4 = this.v;
                    if (j4 != 0) {
                        tpc tpcVarM3 = sth.a.m();
                        if (!tpcVarM3.b.C()) {
                            tpcVarM3.o();
                        }
                        tph tphVar6 = tpcVarM3.b;
                        sth sthVar = (sth) tphVar6;
                        sthVar.b |= 1;
                        sthVar.c = j4;
                        if (!tphVar6.C()) {
                            tpcVarM3.o();
                        }
                        float f = lrfVar.a;
                        tph tphVar7 = tpcVarM3.b;
                        sth sthVar2 = (sth) tphVar7;
                        sthVar2.b |= 2;
                        sthVar2.d = f;
                        float f2 = lrfVar.b;
                        if (!tphVar7.C()) {
                            tpcVarM3.o();
                        }
                        tph tphVar8 = tpcVarM3.b;
                        sth sthVar3 = (sth) tphVar8;
                        sthVar3.b |= 4;
                        sthVar3.e = f2;
                        float f3 = lrfVar.c;
                        if (!tphVar8.C()) {
                            tpcVarM3.o();
                        }
                        sth sthVar4 = (sth) tpcVarM3.b;
                        sthVar4.b |= 8;
                        sthVar4.f = f3;
                        sth sthVar5 = (sth) tpcVarM3.l();
                        if (!tpcVarM2.b.C()) {
                            tpcVarM2.o();
                        }
                        srj srjVar21 = (srj) tpcVarM2.b;
                        sthVar5.getClass();
                        srjVar21.p = sthVar5;
                        srjVar21.b |= 32768;
                        int iJ = jsv.j(pao.b((int) this.u.c), this.p) - 1;
                        int i7 = iJ != 0 ? iJ != 1 ? iJ != 2 ? 5 : 4 : 3 : 2;
                        if (!tpcVarM2.b.C()) {
                            tpcVarM2.o();
                        }
                        srj srjVar22 = (srj) tpcVarM2.b;
                        srjVar22.o = i7 - 1;
                        srjVar22.b |= 16384;
                    }
                }
                if (jA != -1) {
                    if (!tpcVarM2.b.C()) {
                        tpcVarM2.o();
                    }
                    srj srjVar23 = (srj) tpcVarM2.b;
                    srjVar23.b |= 33554432;
                    srjVar23.y = jA;
                    Duration.ofNanos(cameraActivityTiming.getActivityOnCreateStartNs() - jA).toMillis();
                }
                ?? J = rwc.j((srj) tpcVarM2.l());
                listA = this.w.a();
                rvkVar = J;
                rwcVarJ = rvkVar;
            }
            gox goxVar = this.y;
            tpc tpcVarM4 = soj.a.m();
            boolean zBooleanValue2 = ((Boolean) ((luj) goxVar.b).b(luf.an)).booleanValue();
            if (!tpcVarM4.b.C()) {
                tpcVarM4.o();
            }
            soj sojVar = (soj) tpcVarM4.b;
            sojVar.b |= 1;
            sojVar.c = zBooleanValue2;
            boolean z = goxVar.c.getString(luf.Q.a, null) != null;
            if (!tpcVarM4.b.C()) {
                tpcVarM4.o();
            }
            soj sojVar2 = (soj) tpcVarM4.b;
            sojVar2.b |= 2;
            sojVar2.d = z;
            boolean zBooleanValue3 = ((Boolean) goxVar.a.dL()).booleanValue();
            if (!tpcVarM4.b.C()) {
                tpcVarM4.o();
            }
            soj sojVar3 = (soj) tpcVarM4.b;
            sojVar3.b |= 16;
            sojVar3.e = zBooleanValue3;
            rwc rwcVarJ2 = rwc.j((soj) tpcVarM4.l());
            mdi mdiVar = this.x;
            mdiVar.i = true;
            long j5 = j;
            mdiVar.j = j5;
            mdiVar.l = 0;
            mdiVar.m = j5;
            mdiVar.k = new ArrayList();
            mdiVar.n = -1;
            mdiVar.c.a();
            mdiVar.c = pbp.a;
            mdiVar.h = 0;
            mdiVar.e = j5;
            mdiVar.d = j5;
            mdiVar.g = j5;
            mdiVar.f = j5;
            mdy mdyVar = this.d;
            rwc rwcVarI = rwc.i(this.q.a());
            int i8 = sscVar.T;
            hbj hbjVar = mdyVar.B;
            if (hbjVar.p(gzo.bJ)) {
                List list = mdyVar.x;
                Iterable$EL.forEach(list, new lji(mdyVar, i4));
                list.clear();
            }
            LinkedHashMap linkedHashMap2 = mdyVar.p;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            Iterator it = linkedHashMap2.keySet().iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (((jea) linkedHashMap2.get(str3)) != null && jElapsedRealtime2 > 30000) {
                    rwc rwcVar = rwcVarJ;
                    tpc tpcVarM5 = sod.a.m();
                    rwc rwcVar2 = rwcVarJ2;
                    soc socVar = soc.PHOTO_INTERACTION;
                    rwc rwcVar3 = rwcVarI;
                    if (!tpcVarM5.b.C()) {
                        tpcVarM5.o();
                    }
                    sod sodVar = (sod) tpcVarM5.b;
                    sodVar.f = socVar.aJ;
                    sodVar.b |= 1;
                    tpc tpcVarM6 = srv.a.m();
                    if (!tpcVarM6.b.C()) {
                        tpcVarM6.o();
                    }
                    srv srvVar = (srv) tpcVarM6.b;
                    hbj hbjVar2 = hbjVar;
                    srvVar.c = 6;
                    srvVar.b |= 1;
                    jje jjeVar = mdyVar.f;
                    synchronized (jjeVar.c) {
                        linkedHashMap = linkedHashMap2;
                        byte[] bArrDigest = jjeVar.b.digest(str3.getBytes(jje.a));
                        StringBuilder sb = new StringBuilder();
                        int length = bArrDigest.length;
                        int i9 = 0;
                        while (i9 < length) {
                            int i10 = i9;
                            sb.append(Integer.toString((bArrDigest[i10] & 255) + 256, 16).substring(1));
                            i9 = i10 + 1;
                            jElapsedRealtimeNanos = jElapsedRealtimeNanos;
                        }
                        j2 = jElapsedRealtimeNanos;
                        string = sb.toString();
                    }
                    String strSubstring = string.substring(0, 10);
                    if (!tpcVarM6.b.C()) {
                        tpcVarM6.o();
                    }
                    tph tphVar9 = tpcVarM6.b;
                    srv srvVar2 = (srv) tphVar9;
                    strSubstring.getClass();
                    srvVar2.b |= 8;
                    srvVar2.d = strSubstring;
                    if (!tphVar9.C()) {
                        tpcVarM6.o();
                    }
                    tph tphVar10 = tpcVarM6.b;
                    srv srvVar3 = (srv) tphVar10;
                    srvVar3.b |= 32;
                    srvVar3.f = 0.0f;
                    if (!tphVar10.C()) {
                        tpcVarM6.o();
                    }
                    srv srvVar4 = (srv) tpcVarM6.b;
                    srvVar4.b |= 16;
                    srvVar4.e = 0.0f;
                    if (!tpcVarM5.b.C()) {
                        tpcVarM5.o();
                    }
                    sod sodVar2 = (sod) tpcVarM5.b;
                    srv srvVar5 = (srv) tpcVarM6.l();
                    srvVar5.getClass();
                    sodVar2.j = srvVar5;
                    sodVar2.b |= 32;
                    mdyVar.I(tpcVarM5);
                    it.remove();
                    rwcVarJ2 = rwcVar2;
                    rwcVarJ = rwcVar;
                    rwcVarI = rwcVar3;
                    hbjVar = hbjVar2;
                    linkedHashMap2 = linkedHashMap;
                    jElapsedRealtimeNanos = j2;
                }
            }
            rwc rwcVar4 = rwcVarJ;
            rwc rwcVar5 = rwcVarJ2;
            rwc rwcVar6 = rwcVarI;
            hbj hbjVar3 = hbjVar;
            long j6 = jElapsedRealtimeNanos;
            tpc tpcVarM7 = sns.a.m();
            if (listA != null && !listA.isEmpty()) {
                if (!tpcVarM7.b.C()) {
                    tpcVarM7.o();
                }
                sns snsVar = (sns) tpcVarM7.b;
                tpw tpwVar = snsVar.f;
                if (!tpwVar.c()) {
                    snsVar.f = tph.v(tpwVar);
                }
                tnq.e(listA, snsVar.f);
            }
            if (rvkVar.h()) {
                Object objC = rvkVar.c();
                if (!tpcVarM7.b.C()) {
                    tpcVarM7.o();
                }
                sns snsVar2 = (sns) tpcVarM7.b;
                snsVar2.c = (srj) objC;
                snsVar2.b |= 2;
            }
            if (rwcVar4.h()) {
                Object objC2 = rwcVar4.c();
                if (!tpcVarM7.b.C()) {
                    tpcVarM7.o();
                }
                sns snsVar3 = (sns) tpcVarM7.b;
                snsVar3.h = (sqy) objC2;
                snsVar3.b |= 32;
            }
            Object obj = ((rwg) rwcVar5).a;
            if (!tpcVarM7.b.C()) {
                tpcVarM7.o();
            }
            sns snsVar4 = (sns) tpcVarM7.b;
            snsVar4.g = (soj) obj;
            snsVar4.b |= 8;
            List list2 = mdyVar.i;
            if (list2.contains(null)) {
                ((sgt) mdy.a.c().M(4736)).s(GAQqzWiWWcYOgy.EwgjkTSjEY);
            } else {
                if (!tpcVarM7.b.C()) {
                    tpcVarM7.o();
                }
                sns snsVar5 = (sns) tpcVarM7.b;
                tpw tpwVar2 = snsVar5.d;
                if (!tpwVar2.c()) {
                    snsVar5.d = tph.v(tpwVar2);
                }
                tnq.e(list2, snsVar5.d);
            }
            list2.clear();
            if (sscVar == ssc.PHOTO_CAPTURE) {
                if (mdyVar.k) {
                    if (!tpcVarM7.b.C()) {
                        tpcVarM7.o();
                    }
                    sns snsVar6 = (sns) tpcVarM7.b;
                    snsVar6.b |= 4;
                    snsVar6.e = -1.0f;
                } else {
                    long j7 = j6 - mdyVar.l;
                    if (!tpcVarM7.b.C()) {
                        tpcVarM7.o();
                    }
                    sns snsVar7 = (sns) tpcVarM7.b;
                    snsVar7.b |= 4;
                    snsVar7.e = j7 / 1.0E9f;
                }
            }
            if (!hbjVar3.b().isEmpty()) {
                tpc tpcVarM8 = ssr.a.m();
                Set setB = hbjVar3.b();
                if (!tpcVarM8.b.C()) {
                    tpcVarM8.o();
                }
                ssr ssrVar = (ssr) tpcVarM8.b;
                tpw tpwVar3 = ssrVar.b;
                if (!tpwVar3.c()) {
                    ssrVar.b = tph.v(tpwVar3);
                }
                tnq.e(setB, ssrVar.b);
                ssr ssrVar2 = (ssr) tpcVarM8.l();
                if (!tpcVarM7.b.C()) {
                    tpcVarM7.o();
                }
                sns snsVar8 = (sns) tpcVarM7.b;
                ssrVar2.getClass();
                snsVar8.i = ssrVar2;
                snsVar8.b |= 64;
            }
            mdyVar.k = true;
            mdyVar.l = 0L;
            tpc tpcVarM9 = sod.a.m();
            soc socVar2 = soc.BACKGROUND_EVENT;
            if (!tpcVarM9.b.C()) {
                tpcVarM9.o();
            }
            tph tphVar11 = tpcVarM9.b;
            sod sodVar3 = (sod) tphVar11;
            sodVar3.f = socVar2.aJ;
            sodVar3.b |= 1;
            if (!tphVar11.C()) {
                tpcVarM9.o();
            }
            sod sodVar4 = (sod) tpcVarM9.b;
            sns snsVar9 = (sns) tpcVarM7.l();
            snsVar9.getClass();
            sodVar4.o = snsVar9;
            sodVar4.b |= 8192;
            if (rwcVar6.h() && ((srg) rwcVar6.c()).d.size() > 0) {
                srg srgVar = (srg) rwcVar6.c();
                if (!tpcVarM9.b.C()) {
                    tpcVarM9.o();
                }
                sod sodVar5 = (sod) tpcVarM9.b;
                sodVar5.aE = srgVar;
                sodVar5.e |= 1;
            }
            mdyVar.I(tpcVarM9);
            this.o.a(this);
        }
    }
}
