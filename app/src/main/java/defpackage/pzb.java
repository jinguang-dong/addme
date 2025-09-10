package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.camera.backup.cNHl.ibINv;
import com.google.common.io.ByteStreams;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pzb {
    public final Context a;
    public final qbq b;
    public final pwt c;
    public final pzc d;
    public final qag e;
    public final rwc f;
    public final Executor g;
    public final rwc h;
    public final rwc i;
    public final qbj j;
    public final puu k;
    public final qaq l = new qaq((byte[]) null);
    public final lat m;
    public final prh n;
    private final Executor o;

    public pzb(Context context, qbq qbqVar, pwt pwtVar, pzc pzcVar, qag qagVar, prh prhVar, rwc rwcVar, Executor executor, rwc rwcVar2, lat latVar, rwc rwcVar3, qbj qbjVar, puu puuVar, Executor executor2) {
        this.a = context;
        this.b = qbqVar;
        this.c = pwtVar;
        this.d = pzcVar;
        this.e = qagVar;
        this.n = prhVar;
        this.f = rwcVar;
        this.g = executor;
        this.o = executor2;
        this.h = rwcVar2;
        this.m = latVar;
        this.i = rwcVar3;
        this.j = qbjVar;
        this.k = puuVar;
    }

    public static void B(int i, qbq qbqVar, pvc pvcVar) {
        qbqVar.m(i, pvcVar.d, pvcVar.f, pvcVar.s, pvcVar.t);
    }

    public static void C(qbq qbqVar, pvc pvcVar, pva pvaVar, int i) {
        tpc tpcVarM = suy.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        suy suyVar = (suy) tpcVarM.b;
        suyVar.c = rkf.v(i);
        suyVar.b |= 1;
        String str = pvcVar.d;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        suy suyVar2 = (suy) tphVar;
        str.getClass();
        suyVar2.b |= 2;
        suyVar2.d = str;
        int i2 = pvcVar.f;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        suy suyVar3 = (suy) tphVar2;
        suyVar3.b |= 4;
        suyVar3.e = i2;
        long j = pvcVar.s;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        tph tphVar3 = tpcVarM.b;
        suy suyVar4 = (suy) tphVar3;
        suyVar4.b |= 128;
        suyVar4.i = j;
        String str2 = pvcVar.t;
        if (!tphVar3.C()) {
            tpcVarM.o();
        }
        tph tphVar4 = tpcVarM.b;
        suy suyVar5 = (suy) tphVar4;
        str2.getClass();
        suyVar5.b |= 256;
        suyVar5.j = str2;
        String str3 = pvaVar.c;
        if (!tphVar4.C()) {
            tpcVarM.o();
        }
        suy suyVar6 = (suy) tpcVarM.b;
        str3.getClass();
        suyVar6.b |= 8;
        suyVar6.f = str3;
        qbqVar.e((suy) tpcVarM.l());
    }

    public static rwc a(pvc pvcVar, pvc pvcVar2) {
        if (pvcVar2.s != pvcVar.s) {
            return rwc.j(svq.NEW_BUILD_ID);
        }
        if (!pvcVar2.t.equals(pvcVar.t)) {
            return rwc.j(svq.NEW_VARIANT_ID);
        }
        if (pvcVar2.f != pvcVar.f) {
            return rwc.j(svq.NEW_VERSION_NUMBER);
        }
        if (!t(pvcVar, pvcVar2)) {
            return rwc.j(svq.DIFFERENT_FILES);
        }
        tnw tnwVar = pvcVar2.h;
        if (tnwVar == null) {
            tnwVar = tnw.a;
        }
        tnw tnwVar2 = pvcVar.h;
        if (tnwVar2 == null) {
            tnwVar2 = tnw.a;
        }
        if (!tnwVar.equals(tnwVar2)) {
            return rwc.j(svq.DIFFERENT_CUSTOM_METADATA);
        }
        if (pvcVar2.k != pvcVar.k) {
            return rwc.j(svq.DIFFERENT_STALE_LIFETIME);
        }
        if (pvcVar2.l != pvcVar.l) {
            return rwc.j(svq.DIFFERENT_EXPIRATION_DATE);
        }
        pve pveVar = pvcVar2.m;
        if (pveVar == null) {
            pveVar = pve.a;
        }
        pve pveVar2 = pvcVar.m;
        if (pveVar2 == null) {
            pveVar2 = pve.a;
        }
        if (!pveVar.equals(pveVar2)) {
            return rwc.j(svq.DIFFERENT_DOWNLOAD_CONDITIONS);
        }
        int iAx = a.ax(pvcVar2.j);
        if (iAx == 0) {
            iAx = 1;
        }
        int iAx2 = a.ax(pvcVar.j);
        if (iAx2 == 0) {
            iAx2 = 1;
        }
        if (iAx != iAx2) {
            return rwc.j(svq.DIFFERENT_ALLOWED_READERS);
        }
        int iW = qsp.w(pvcVar2.r);
        if (iW == 0) {
            iW = 1;
        }
        int iW2 = qsp.w(pvcVar.r);
        if (iW != (iW2 != 0 ? iW2 : 1)) {
            return rwc.j(svq.k);
        }
        vac vacVar = pvcVar2.v;
        if (vacVar == null) {
            vacVar = vac.a;
        }
        vac vacVar2 = pvcVar.v;
        if (vacVar2 == null) {
            vacVar2 = vac.a;
        }
        return !vacVar.equals(vacVar2) ? rwc.j(svq.DIFFERENT_EXPERIMENT_INFO) : rvk.a;
    }

    public static boolean t(pvc pvcVar, pvc pvcVar2) {
        return pvcVar.o.equals(pvcVar2.o);
    }

    public static boolean v(pvr pvrVar, long j) {
        return j > pvrVar.f;
    }

    public static final suv w(pvc pvcVar) {
        tpc tpcVarM = suv.a.m();
        String str = pvcVar.d;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        suv suvVar = (suv) tphVar;
        str.getClass();
        suvVar.b |= 1;
        suvVar.c = str;
        String str2 = pvcVar.e;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        suv suvVar2 = (suv) tphVar2;
        str2.getClass();
        suvVar2.b |= 4;
        suvVar2.e = str2;
        int i = pvcVar.f;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        tph tphVar3 = tpcVarM.b;
        suv suvVar3 = (suv) tphVar3;
        suvVar3.b |= 2;
        suvVar3.d = i;
        long j = pvcVar.s;
        if (!tphVar3.C()) {
            tpcVarM.o();
        }
        tph tphVar4 = tpcVarM.b;
        suv suvVar4 = (suv) tphVar4;
        suvVar4.b |= 64;
        suvVar4.i = j;
        String str3 = pvcVar.t;
        if (!tphVar4.C()) {
            tpcVarM.o();
        }
        suv suvVar5 = (suv) tpcVarM.b;
        str3.getClass();
        suvVar5.b |= 128;
        suvVar5.j = str3;
        return (suv) tpcVarM.l();
    }

    public static final void x(List list, pvl pvlVar) throws pul {
        qbu.e("%s downloadFileGroup %s %s can't finish!", "FileGroupManager", pvlVar.c, pvlVar.d);
        ptv.b(list, "Failed to download file group %s", pvlVar.c);
        qbu.c("%s: An unknown error has occurred during download", "FileGroupManager");
        tfm tfmVarA = pul.a();
        tfmVarA.b = puk.UNKNOWN_ERROR;
        throw tfmVarA.c();
    }

    public final syu A(final pvc pvcVar, final pva pvaVar, pvr pvrVar, final pvp pvpVar, final String str, long j, final int i) {
        if (pvrVar.e && !v(pvrVar, j)) {
            C(this.b, pvcVar, pvaVar, i);
            return ske.M(true);
        }
        final long jMax = Math.max(j, pvrVar.f);
        final Context context = this.a;
        final lat latVar = this.m;
        return r(qsz.l(new sxh() { // from class: qcm
            @Override // defpackage.sxh
            public final syu a() throws IOException, qco {
                String message;
                int i2;
                message = "";
                Context context2 = context;
                String str2 = str;
                long j2 = jMax;
                lat latVar2 = latVar;
                pva pvaVar2 = pvaVar;
                pvc pvcVar2 = pvcVar;
                try {
                    int i3 = rcp.a;
                    OutputStream outputStream = (OutputStream) latVar2.m(qsp.g(String.valueOf(str2).concat(".lease"), context2.getPackageName(), j2), new rdr());
                    i2 = 0;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } catch (IOException unused) {
                    qbu.e("%s: Failed to acquire lease for file %s, file group %s", "AndroidSharingUtil", pvaVar2.c, pvcVar2.d);
                    message = String.format("Error while acquiring lease for file %s, group %s", pvaVar2.c, pvcVar2.d);
                    i2 = 20;
                } catch (rct unused2) {
                    qbu.e("%s: Failed to share after download for file %s, file group %s due to LimitExceededException", "AndroidSharingUtil", pvaVar2.c, pvcVar2.d);
                    message = String.format("System limit exceeded for file %s, group %s", pvaVar2.c, pvcVar2.d);
                    i2 = 25;
                } catch (rcu unused3) {
                    qbu.e("%s: Malformed lease uri file %s, file group %s", "AndroidSharingUtil", pvaVar2.c, pvcVar2.d);
                    message = String.format("Malformed lease Uri for file %s, group %s", pvaVar2.c, pvcVar2.d);
                    i2 = 18;
                } catch (rcw e) {
                    message = TextUtils.isEmpty(e.getMessage()) ? "" : e.getMessage();
                    String str3 = pvaVar2.c;
                    String str4 = pvcVar2.d;
                    int i4 = qbu.a;
                    message = "UnsupportedFileStorageOperation was thrown: ".concat(String.valueOf(message));
                    i2 = 24;
                }
                if (i2 == 0) {
                    return syq.a;
                }
                throw new qco(i2, message);
            }
        }, this.o), new sxi() { // from class: pyh
            @Override // defpackage.sxi
            public final syu a(Object obj) {
                tpc tpcVarM = pvr.a.m();
                pvk pvkVar = pvk.DOWNLOAD_COMPLETE;
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                String str2 = str;
                tph tphVar = tpcVarM.b;
                pvr pvrVar2 = (pvr) tphVar;
                pvrVar2.d = pvkVar.h;
                pvrVar2.b |= 2;
                if (!tphVar.C()) {
                    tpcVarM.o();
                }
                String strValueOf = String.valueOf(str2);
                tph tphVar2 = tpcVarM.b;
                pvr pvrVar3 = (pvr) tphVar2;
                pvrVar3.b |= 1;
                pvrVar3.c = "android_shared_".concat(strValueOf);
                if (!tphVar2.C()) {
                    tpcVarM.o();
                }
                tph tphVar3 = tpcVarM.b;
                pvr pvrVar4 = (pvr) tphVar3;
                pvrVar4.b |= 4;
                pvrVar4.e = true;
                if (!tphVar3.C()) {
                    tpcVarM.o();
                }
                final long j2 = jMax;
                tph tphVar4 = tpcVarM.b;
                pvr pvrVar5 = (pvr) tphVar4;
                pvrVar5.b |= 8;
                pvrVar5.f = j2;
                if (!tphVar4.C()) {
                    tpcVarM.o();
                }
                final pzb pzbVar = this.a;
                final int i2 = i;
                final pvc pvcVar2 = pvcVar;
                final pva pvaVar2 = pvaVar;
                pvp pvpVar2 = pvpVar;
                pvr pvrVar6 = (pvr) tpcVarM.b;
                str2.getClass();
                pvrVar6.b |= 16;
                pvrVar6.g = str2;
                return pzbVar.r(pzbVar.e.c.h(pvpVar2, (pvr) tpcVarM.l()), new sxi() { // from class: pyq
                    @Override // defpackage.sxi
                    public final syu a(Object obj2) {
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        pzb pzbVar2 = pzbVar;
                        pvc pvcVar3 = pvcVar2;
                        pva pvaVar3 = pvaVar2;
                        if (!zBooleanValue) {
                            qbu.e("%s: Failed to set new state for file %s, filegroup %s", "FileGroupManager", pvaVar3.c, pvcVar3.d);
                            pzb.C(pzbVar2.b, pvcVar3, pvaVar3, 15);
                            return ske.M(false);
                        }
                        qbq qbqVar = pzbVar2.b;
                        tpc tpcVarM2 = suy.a.m();
                        if (!tpcVarM2.b.C()) {
                            tpcVarM2.o();
                        }
                        int i3 = i2;
                        suy suyVar = (suy) tpcVarM2.b;
                        suyVar.c = rkf.v(i3);
                        suyVar.b |= 1;
                        String str3 = pvcVar3.d;
                        if (!tpcVarM2.b.C()) {
                            tpcVarM2.o();
                        }
                        tph tphVar5 = tpcVarM2.b;
                        suy suyVar2 = (suy) tphVar5;
                        str3.getClass();
                        suyVar2.b |= 2;
                        suyVar2.d = str3;
                        int i4 = pvcVar3.f;
                        if (!tphVar5.C()) {
                            tpcVarM2.o();
                        }
                        tph tphVar6 = tpcVarM2.b;
                        suy suyVar3 = (suy) tphVar6;
                        suyVar3.b |= 4;
                        suyVar3.e = i4;
                        long j3 = pvcVar3.s;
                        if (!tphVar6.C()) {
                            tpcVarM2.o();
                        }
                        tph tphVar7 = tpcVarM2.b;
                        suy suyVar4 = (suy) tphVar7;
                        suyVar4.b |= 128;
                        suyVar4.i = j3;
                        String str4 = pvcVar3.t;
                        if (!tphVar7.C()) {
                            tpcVarM2.o();
                        }
                        tph tphVar8 = tpcVarM2.b;
                        suy suyVar5 = (suy) tphVar8;
                        str4.getClass();
                        suyVar5.b |= 256;
                        suyVar5.j = str4;
                        String str5 = pvaVar3.c;
                        if (!tphVar8.C()) {
                            tpcVarM2.o();
                        }
                        tph tphVar9 = tpcVarM2.b;
                        suy suyVar6 = (suy) tphVar9;
                        str5.getClass();
                        suyVar6.b |= 8;
                        suyVar6.f = str5;
                        if (!tphVar9.C()) {
                            tpcVarM2.o();
                        }
                        tph tphVar10 = tpcVarM2.b;
                        suy suyVar7 = (suy) tphVar10;
                        suyVar7.b |= 16;
                        suyVar7.g = true;
                        if (!tphVar10.C()) {
                            tpcVarM2.o();
                        }
                        long j4 = j2;
                        suy suyVar8 = (suy) tpcVarM2.b;
                        suyVar8.b |= 32;
                        suyVar8.h = j4;
                        qbqVar.e((suy) tpcVarM2.l());
                        return ske.M(true);
                    }
                });
            }
        });
    }

    final syu D(pvl pvlVar, final pvc pvcVar, final boolean z, final sxi sxiVar, final qev qevVar) {
        String str = pvcVar.d;
        int i = qbu.a;
        tpc tpcVar = (tpc) pvlVar.a(5, null);
        tpcVar.r(pvlVar);
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        pvl pvlVar2 = (pvl) tpcVar.b;
        pvl pvlVar3 = pvl.a;
        pvlVar2.b |= 8;
        pvlVar2.f = true;
        final pvl pvlVar4 = (pvl) tpcVar.l();
        tpc tpcVar2 = (tpc) pvlVar.a(5, null);
        tpcVar2.r(pvlVar);
        if (!tpcVar2.b.C()) {
            tpcVar2.o();
        }
        pvl pvlVar5 = (pvl) tpcVar2.b;
        pvlVar5.b |= 8;
        pvlVar5.f = false;
        final pvl pvlVar6 = (pvl) tpcVar2.l();
        pvb pvbVar = pvcVar.c;
        if (pvbVar == null) {
            pvbVar = pvb.a;
        }
        final boolean z2 = (pvbVar.b & 4) != 0;
        long jQ = prh.q();
        pvb pvbVar2 = pvcVar.c;
        if (pvbVar2 == null) {
            pvbVar2 = pvb.a;
        }
        tpc tpcVar3 = (tpc) pvbVar2.a(5, null);
        tpcVar3.r(pvbVar2);
        if (!tpcVar3.b.C()) {
            tpcVar3.o();
        }
        pvb pvbVar3 = (pvb) tpcVar3.b;
        pvbVar3.b |= 4;
        pvbVar3.e = jQ;
        pvb pvbVar4 = (pvb) tpcVar3.l();
        tpc tpcVar4 = (tpc) pvcVar.a(5, null);
        tpcVar4.r(pvcVar);
        if (!tpcVar4.b.C()) {
            tpcVar4.o();
        }
        pvc pvcVar2 = (pvc) tpcVar4.b;
        pvbVar4.getClass();
        pvcVar2.c = pvbVar4;
        pvcVar2.b |= 1;
        final pvc pvcVar3 = (pvc) tpcVar4.l();
        qdp qdpVarE = qdp.e(h(pvcVar));
        sxi sxiVar2 = new sxi() { // from class: pyt
            @Override // defpackage.sxi
            public final syu a(Object obj) {
                final qev qevVar2 = qevVar;
                pvc pvcVar4 = pvcVar;
                pza pzaVar = (pza) obj;
                pza pzaVar2 = pza.FAILED;
                if (pzaVar == pzaVar2) {
                    qevVar2.a(pvcVar4);
                    return ske.M(pzaVar2);
                }
                pza pzaVar3 = pza.PENDING;
                if (pzaVar == pzaVar3) {
                    if (qevVar2.a - 1 != 0) {
                        qevVar2.c(1112, pvcVar4);
                    } else {
                        qevVar2.c(1007, pvcVar4);
                    }
                    return ske.M(pzaVar3);
                }
                final boolean z3 = z2;
                final pvc pvcVar5 = pvcVar3;
                pvl pvlVar7 = pvlVar4;
                sxi sxiVar3 = sxiVar;
                boolean z4 = z;
                pvl pvlVar8 = pvlVar6;
                pzb pzbVar = this.a;
                a.I(pzaVar == pza.DOWNLOADED);
                qdp qdpVarE2 = qdp.e(sxiVar3.a(new qao(pvlVar8, pvcVar4)));
                pym pymVar = new pym(pzbVar, qevVar2, pvcVar4, z4, pvlVar8, 2);
                Executor executor = pzbVar.g;
                return qdpVarE2.g(pymVar, executor).g(new pyn((Object) pzbVar, (tph) pvcVar4, 5), executor).g(new nzm((Object) pzbVar, pvlVar7, (Object) pvcVar5, 17), executor).g(new pyk(pzbVar, z4, pvlVar8, 2), executor).g(new pyg(pzbVar, 6), executor).f(new rvu() { // from class: pyp
                    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Object, qbq] */
                    @Override // defpackage.rvu
                    public final Object apply(Object obj2) {
                        qev qevVar3 = qevVar2;
                        if (!z3 || qevVar3.a == 2) {
                            pvc pvcVar6 = pvcVar5;
                            int i2 = qevVar3.a;
                            if (i2 - 1 != 0) {
                                qevVar3.c(1114, pvcVar6);
                            } else {
                                qevVar3.c(1009, pvcVar6);
                                if (i2 == 1) {
                                    tpc tpcVarM = suv.a.m();
                                    String str2 = pvcVar6.e;
                                    if (!tpcVarM.b.C()) {
                                        tpcVarM.o();
                                    }
                                    tph tphVar = tpcVarM.b;
                                    suv suvVar = (suv) tphVar;
                                    str2.getClass();
                                    suvVar.b |= 4;
                                    suvVar.e = str2;
                                    String str3 = pvcVar6.d;
                                    if (!tphVar.C()) {
                                        tpcVarM.o();
                                    }
                                    tph tphVar2 = tpcVarM.b;
                                    suv suvVar2 = (suv) tphVar2;
                                    str3.getClass();
                                    suvVar2.b |= 1;
                                    suvVar2.c = str3;
                                    int i3 = pvcVar6.f;
                                    if (!tphVar2.C()) {
                                        tpcVarM.o();
                                    }
                                    suv suvVar3 = (suv) tpcVarM.b;
                                    suvVar3.b |= 2;
                                    suvVar3.d = i3;
                                    int size = pvcVar6.o.size();
                                    if (!tpcVarM.b.C()) {
                                        tpcVarM.o();
                                    }
                                    tph tphVar3 = tpcVarM.b;
                                    suv suvVar4 = (suv) tphVar3;
                                    suvVar4.b |= 8;
                                    suvVar4.f = size;
                                    long j = pvcVar6.s;
                                    if (!tphVar3.C()) {
                                        tpcVarM.o();
                                    }
                                    tph tphVar4 = tpcVarM.b;
                                    suv suvVar5 = (suv) tphVar4;
                                    suvVar5.b |= 64;
                                    suvVar5.i = j;
                                    String str4 = pvcVar6.t;
                                    if (!tphVar4.C()) {
                                        tpcVarM.o();
                                    }
                                    suv suvVar6 = (suv) tpcVarM.b;
                                    str4.getClass();
                                    suvVar6.b |= 128;
                                    suvVar6.j = str4;
                                    suv suvVar7 = (suv) tpcVarM.l();
                                    pvb pvbVar5 = pvcVar6.c;
                                    if (pvbVar5 == null) {
                                        pvbVar5 = pvb.a;
                                    }
                                    long j2 = pvbVar5.d;
                                    long j3 = pvbVar5.f;
                                    long j4 = pvbVar5.e;
                                    tpc tpcVarM2 = sva.a.m();
                                    int i4 = pvbVar5.g;
                                    if (!tpcVarM2.b.C()) {
                                        tpcVarM2.o();
                                    }
                                    tph tphVar5 = tpcVarM2.b;
                                    sva svaVar = (sva) tphVar5;
                                    svaVar.b = 1 | svaVar.b;
                                    svaVar.c = i4;
                                    long j5 = j4 - j3;
                                    if (!tphVar5.C()) {
                                        tpcVarM2.o();
                                    }
                                    tph tphVar6 = tpcVarM2.b;
                                    sva svaVar2 = (sva) tphVar6;
                                    svaVar2.b = 2 | svaVar2.b;
                                    svaVar2.d = j5;
                                    long j6 = j4 - j2;
                                    if (!tphVar6.C()) {
                                        tpcVarM2.o();
                                    }
                                    tph tphVar7 = tpcVarM2.b;
                                    sva svaVar3 = (sva) tphVar7;
                                    svaVar3.b |= 4;
                                    svaVar3.e = j6;
                                    pvb pvbVar6 = pvcVar6.c;
                                    if (pvbVar6 == null) {
                                        pvbVar6 = pvb.a;
                                    }
                                    boolean z5 = pvbVar6.i;
                                    if (!tphVar7.C()) {
                                        tpcVarM2.o();
                                    }
                                    sva svaVar4 = (sva) tpcVarM2.b;
                                    svaVar4.b |= 8;
                                    svaVar4.f = z5;
                                    qevVar3.b.f(suvVar7, (sva) tpcVarM2.l());
                                }
                            }
                        }
                        return pza.DOWNLOADED;
                    }
                }, executor);
            }
        };
        Executor executor = this.g;
        return qdpVarE.g(sxiVar2, executor).g(new pyn((Object) this, (tph) pvcVar, 7), executor);
    }

    public final sbv b(pvc pvcVar) {
        sbr sbrVar = new sbr();
        Uri uriZ = qsp.Z(this.a, this.h, pvcVar);
        for (pva pvaVar : pvcVar.o) {
            sbrVar.f(pvaVar, qsp.Y(uriZ, pvaVar));
        }
        return sbrVar.e();
    }

    public final sbv c(sbv sbvVar, sbv sbvVar2) {
        sbr sbrVar = new sbr();
        sgj sgjVarListIterator = sbvVar2.entrySet().listIterator();
        while (sgjVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) sgjVarListIterator.next();
            if (entry.getValue() != null && sbvVar.containsKey(entry.getKey())) {
                Uri uri = (Uri) sbvVar.get(entry.getKey());
                Uri uri2 = (Uri) entry.getValue();
                try {
                    if (this.m.r(uri)) {
                        try {
                            if (qcw.a(this.a, uri).toString().equals(uri2.toString())) {
                                sbrVar.f((pva) entry.getKey(), uri);
                            } else {
                                qbu.e("%s verifyIsolatedFileUris isolated file uri does match expected on-device uri! %s %s", "FileGroupManager", uri, uri2);
                            }
                        } catch (IOException unused) {
                            qbu.e("%s verifyIsolatedFileUris unable to read symlink using isolated file uri! %s %s", "FileGroupManager", uri, uri2);
                        }
                    } else {
                        qbu.e("%s verifyIsolatedFileUris isolated uri does not exist -- unable to verify it matches the expected target! %s %s", "FileGroupManager", uri, uri2);
                    }
                } catch (IOException unused2) {
                    qbu.e("%s verifyIsolatedFileUris unable to check if isolated uri exists! %s %s", "FileGroupManager", uri, uri2);
                }
            }
        }
        return sbrVar.e();
    }

    public final syu d(pvc pvcVar) {
        if (!pvcVar.n) {
            return syq.a;
        }
        try {
            qsp.au(this.a, this.h, pvcVar, this.m);
            tpw tpwVar = pvcVar.o;
            if (ujp.aO(tpwVar, new pqr(2)).h()) {
                return ske.L(new UnsupportedOperationException("Preserve File Paths is invalid with Android Blob Sharing"));
            }
            sbv sbvVarB = b(pvcVar);
            syu syuVarK = k(pvcVar);
            nzm nzmVar = new nzm((Object) this, (Object) tpwVar, (Object) sbvVarB, 12, (byte[]) null);
            Executor executor = this.g;
            syu syuVarN = qsz.n(syuVarK, nzmVar, executor);
            qsz.o(syuVarN, new fpc((Object) this, (Object) pvcVar, 13, (byte[]) null), executor);
            return syuVarN;
        } catch (IOException e) {
            tfm tfmVarA = pul.a();
            tfmVarA.b = puk.UNABLE_TO_REMOVE_SYMLINK_STRUCTURE;
            tfmVarA.c = "Unable to cleanup symlink structure";
            tfmVarA.d = e;
            return ske.L(tfmVarA.c());
        }
    }

    public final syu e(pvl pvlVar, pve pveVar, sxi sxiVar) {
        AtomicReference atomicReference = new AtomicReference();
        return qsz.k(r(g(pvlVar, false), new pwj(this, pvlVar, atomicReference, pveVar, sxiVar, 2)), Exception.class, new nzm(this, atomicReference, pvlVar, 11, (short[]) null), this.g);
    }

    public final syu f(pvr pvrVar, pva pvaVar, pvc pvcVar) {
        if (pvrVar.e) {
            return ske.M(pyz.FILE_ALREADY_SHARED);
        }
        if (pvaVar.o.isEmpty()) {
            return ske.M(pyz.FILE_SHARING_CHECKSUM_NOT_PROVIDED);
        }
        Context context = this.a;
        String str = pvaVar.o;
        lat latVar = this.m;
        return q(qsz.l(new qdg(context, str, latVar, pvaVar, pvcVar, 1), this.o), new mdv(17));
    }

    public final syu g(pvl pvlVar, boolean z) {
        tpc tpcVar = (tpc) pvlVar.a(5, null);
        tpcVar.r(pvlVar);
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        pvl pvlVar2 = (pvl) tpcVar.b;
        pvl pvlVar3 = pvl.a;
        pvlVar2.b |= 8;
        pvlVar2.f = z;
        return this.d.g((pvl) tpcVar.l());
    }

    public final syu h(pvc pvcVar) {
        return i(pvcVar, false, false, 0, pvcVar.o.size());
    }

    public final syu i(final pvc pvcVar, final boolean z, final boolean z2, final int i, final int i2) {
        if (i >= i2) {
            return z ? ske.M(pza.FAILED) : z2 ? ske.M(pza.PENDING) : ske.M(pza.DOWNLOADED);
        }
        final pva pvaVar = (pva) pvcVar.o.get(i);
        return qsp.ag(pvaVar) ? i(pvcVar, z, z2, i + 1, i2) : qdp.e(j(pvaVar, pvcVar)).g(new sxi() { // from class: pyy
            @Override // defpackage.sxi
            public final syu a(Object obj) {
                pzb pzbVar = this.a;
                pvc pvcVar2 = pvcVar;
                boolean z3 = z;
                boolean z4 = z2;
                int i3 = i + 1;
                pva pvaVar2 = pvaVar;
                int i4 = i2;
                pvk pvkVar = (pvk) obj;
                if (pvkVar == pvk.DOWNLOAD_COMPLETE) {
                    String str = pvaVar2.c;
                    String str2 = pvcVar2.d;
                    int i5 = qbu.a;
                    return pzbVar.i(pvcVar2, z3, z4, i3, i4);
                }
                if (pvkVar == pvk.SUBSCRIBED || pvkVar == pvk.DOWNLOAD_IN_PROGRESS) {
                    String str3 = pvaVar2.c;
                    String str4 = pvcVar2.d;
                    int i6 = qbu.a;
                    return pzbVar.i(pvcVar2, z3, true, i3, i4);
                }
                String str5 = pvaVar2.c;
                String str6 = pvcVar2.d;
                int i7 = qbu.a;
                return pzbVar.i(pvcVar2, true, z4, i3, i4);
            }
        }, this.g);
    }

    public final syu j(pva pvaVar, pvc pvcVar) {
        int iAx = a.ax(pvcVar.j);
        if (iAx == 0) {
            iAx = 1;
        }
        return qdp.e(this.e.c(qsp.at(pvaVar, iAx))).d(qah.class, new kjl(this, pvcVar, 17, null), this.g);
    }

    final syu k(pvc pvcVar) {
        sbr sbrVar = new sbr();
        sbr sbrVar2 = new sbr();
        for (pva pvaVar : pvcVar.o) {
            if (qsp.ag(pvaVar)) {
                sbrVar.f(pvaVar, Uri.parse(pvaVar.d));
            } else {
                int iAx = a.ax(pvcVar.j);
                if (iAx == 0) {
                    iAx = 1;
                }
                sbrVar2.f(pvaVar, qsp.at(pvaVar, iAx));
            }
        }
        sbv sbvVarE = sbrVar2.e();
        return qdp.e(this.e.e(scn.F(sbvVarE.values()))).f(new hve(sbvVarE, sbrVar, 14, null), this.g);
    }

    public final syu l(pvc pvcVar, pva pvaVar, pvp pvpVar) {
        return qsz.k(this.e.f(pvpVar), qah.class, new pyj(this, pvpVar, pvcVar, pvaVar, 6), this.g);
    }

    public final syu m(sxi sxiVar) {
        return r(this.d.d(), new pyu(this, new ArrayList(), sxiVar, 3));
    }

    public final syu n(pvl pvlVar, pul pulVar, long j, String str) {
        tpc tpcVarM = suv.a.m();
        String str2 = pvlVar.c;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        suv suvVar = (suv) tphVar;
        str2.getClass();
        suvVar.b |= 1;
        suvVar.c = str2;
        String str3 = pvlVar.d;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        suv suvVar2 = (suv) tphVar2;
        str3.getClass();
        suvVar2.b |= 4;
        suvVar2.e = str3;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        tph tphVar3 = tpcVarM.b;
        suv suvVar3 = (suv) tphVar3;
        suvVar3.b |= 64;
        suvVar3.i = j;
        if (!tphVar3.C()) {
            tpcVarM.o();
        }
        suv suvVar4 = (suv) tpcVarM.b;
        str.getClass();
        suvVar4.b |= 128;
        suvVar4.j = str;
        pzc pzcVar = this.d;
        tpc tpcVar = (tpc) pvlVar.a(5, null);
        tpcVar.r(pvlVar);
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        pvl pvlVar2 = (pvl) tpcVar.b;
        pvlVar2.b |= 8;
        pvlVar2.f = false;
        return r(pzcVar.g((pvl) tpcVar.l()), new nzm(this, tpcVarM, pulVar, 16, (short[]) null));
    }

    public final syu o(pvc pvcVar) {
        return p(pvcVar, 0, pvcVar.o.size());
    }

    public final syu p(pvc pvcVar, int i, int i2) {
        if (i >= i2) {
            return ske.M(true);
        }
        pva pvaVar = (pva) pvcVar.o.get(i);
        if (qsp.ag(pvaVar)) {
            return p(pvcVar, i + 1, i2);
        }
        int iAx = a.ax(pvcVar.j);
        pvp pvpVarAt = qsp.at(pvaVar, iAx != 0 ? iAx : 1);
        qag qagVar = this.e;
        return r(qsz.n(qagVar.c.e(pvpVarAt), new pzn(qagVar, pvpVarAt, 5, null), qagVar.k), new qbx(this, pvcVar, i, i2, 1));
    }

    public final syu q(syu syuVar, rvu rvuVar) {
        return qsz.m(syuVar, rvuVar, this.g);
    }

    public final syu r(syu syuVar, sxi sxiVar) {
        return qsz.n(syuVar, sxiVar, this.g);
    }

    public final syu s(pvc pvcVar, pva pvaVar, pvp pvpVar, long j) {
        qag qagVar = this.e;
        return r(qsz.n(qagVar.f(pvpVar), new pzy(qagVar, j, pvpVar, 0), qagVar.k), new nzm(this, pvaVar, pvcVar, 9, (char[]) null));
    }

    public final boolean u(String str) throws PackageManager.NameNotFoundException {
        try {
            this.a.getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final syu y(pvc pvcVar, pva pvaVar, pvp pvpVar, pvr pvrVar, int i) {
        return r(A(pvcVar, pvaVar, pvrVar, pvpVar, pvaVar.o, pvcVar.l, i), new pyr(this, i, pvcVar, pvaVar, pvpVar, 0));
    }

    public final syu z(final pvc pvcVar, final pva pvaVar, final pvp pvpVar, final pvr pvrVar, final int i) throws qco {
        final String str = pvaVar.o;
        final long j = pvcVar.l;
        int iAx = a.ax(pvpVar.f);
        if (iAx == 0) {
            iAx = 1;
        }
        final Context context = this.a;
        final Uri uriAm = qsp.am(context, iAx, pvrVar.c, pvaVar.g, this.c, this.h, false);
        if (uriAm == null) {
            qbu.c("%s: Failed to get file uri!", "FileGroupManager");
            throw new qco(28, "Failed to get local file uri");
        }
        final lat latVar = this.m;
        return qdp.e(qsz.l(new sxh() { // from class: qcn
            @Override // defpackage.sxh
            public final syu a() throws IOException, qco {
                String message;
                int i2;
                Uri uriAk;
                InputStream inputStream;
                message = "";
                String str2 = ibINv.EEJYPL;
                Context context2 = context;
                lat latVar2 = latVar;
                String str3 = str;
                Uri uri = uriAm;
                pva pvaVar2 = pvaVar;
                pvc pvcVar2 = pvcVar;
                try {
                    uriAk = qsp.ak(context2, str3);
                    inputStream = (InputStream) latVar2.m(uri, new rdn());
                } catch (rcu unused) {
                    qbu.e("%s: Malformed lease uri file %s, file group %s", str2, pvaVar2.c, pvcVar2.d);
                    message = String.format("Malformed blob Uri for file %s, group %s", pvaVar2.c, pvcVar2.d);
                    i2 = 17;
                } catch (IOException unused2) {
                    qbu.e("%s: Failed to copy to the blobstore after download for file %s, file group %s", str2, pvaVar2.c, pvcVar2.d);
                    message = String.format("Error while copying file %s, group %s, to the shared blob storage", pvaVar2.c, pvcVar2.d);
                    i2 = 22;
                } catch (rct unused3) {
                    qbu.e("%s: Failed to share after download for file %s, file group %s due to LimitExceededException", str2, pvaVar2.c, pvcVar2.d);
                    message = String.format("System limit exceeded for file %s, group %s", pvaVar2.c, pvcVar2.d);
                    i2 = 25;
                } catch (rcw e) {
                    message = TextUtils.isEmpty(e.getMessage()) ? "" : e.getMessage();
                    String str4 = pvaVar2.c;
                    String str5 = pvcVar2.d;
                    int i3 = qbu.a;
                    message = "UnsupportedFileStorageOperation was thrown: ".concat(String.valueOf(message));
                    i2 = 24;
                }
                try {
                    OutputStream outputStream = (OutputStream) latVar2.m(uriAk, new rdr());
                    try {
                        ByteStreams.copy(inputStream, outputStream);
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        i2 = 0;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (i2 == 0) {
                            return syq.a;
                        }
                        throw new qco(i2, message);
                    } finally {
                    }
                } finally {
                }
            }
        }, this.o)).g(new sxi() { // from class: pyo
            @Override // defpackage.sxi
            public final syu a(Object obj) {
                final pzb pzbVar = this.a;
                final int i2 = i;
                final pvc pvcVar2 = pvcVar;
                final pva pvaVar2 = pvaVar;
                pvr pvrVar2 = pvrVar;
                final pvp pvpVar2 = pvpVar;
                String str2 = str;
                final long j2 = j;
                return pzbVar.r(pzbVar.A(pvcVar2, pvaVar2, pvrVar2, pvpVar2, str2, j2, i2), new sxi() { // from class: pyl
                    @Override // defpackage.sxi
                    public final syu a(Object obj2) {
                        if (((Boolean) obj2).booleanValue() || i2 == 6) {
                            return syq.a;
                        }
                        long j3 = j2;
                        pvp pvpVar3 = pvpVar2;
                        pva pvaVar3 = pvaVar2;
                        return pzbVar.s(pvcVar2, pvaVar3, pvpVar3, j3);
                    }
                });
            }
        }, this.g);
    }
}
