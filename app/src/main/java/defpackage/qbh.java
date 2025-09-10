package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.StatFs;
import android.util.Pair;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qbh {
    public final Context a;
    public final rww b;
    public final qdf c;
    public final rwc d;
    public final qbv e;
    public final Executor f;
    public final puu g;
    final HashMap h = new HashMap();
    public final lat i;
    private final tql j;

    public qbh(Context context, rww rwwVar, lat latVar, qdf qdfVar, rwc rwcVar, qbv qbvVar, Executor executor, puu puuVar) {
        this.a = context;
        this.b = rwwVar;
        this.i = latVar;
        this.c = qdfVar;
        this.d = rwcVar;
        this.e = qbvVar;
        this.f = executor;
        this.g = puuVar;
        this.j = tql.g(executor);
    }

    public static void e(Context context, String str, long j, pve pveVar, puu puuVar) throws pul {
        float fMin;
        if (puuVar.M()) {
            if (qsp.ad(str, new sfm("inlinefile")) && j == 0) {
                return;
            }
            StatFs statFs = new StatFs(context.getFilesDir().getAbsolutePath());
            long blockCount = statFs.getBlockCount();
            long blockSize = statFs.getBlockSize();
            long availableBlocks = statFs.getAvailableBlocks();
            long blockSize2 = statFs.getBlockSize();
            float f = blockCount * blockSize;
            double dMin = Math.min(puuVar.a() * f, puuVar.b());
            if (pveVar != null) {
                int iAx = a.ax(pveVar.c);
                if (iAx == 0) {
                    iAx = 1;
                }
                int i = iAx - 1;
                if (i == 1) {
                    fMin = Math.min(f * puuVar.a(), puuVar.d());
                } else if (i == 2) {
                    fMin = Math.min(f * puuVar.a(), puuVar.c());
                }
                dMin = fMin;
            }
            if ((availableBlocks * blockSize2) - j > dMin) {
                return;
            }
            tfm tfmVarA = pul.a();
            tfmVarA.b = puk.LOW_DISK_ERROR;
            throw tfmVarA.c();
        }
    }

    public final syu a(String str, Uri uri, qbg qbgVar, sxi sxiVar) {
        syu syuVarC;
        syv syvVar = new syv(new ire(19));
        qdp qdpVarE = qdp.e(syvVar);
        Executor executor = this.f;
        byte[] bArr = null;
        qdp qdpVarD = qdpVarE.g(sxiVar, executor).g(new pzn(qbgVar, uri, 10, bArr), executor).d(Exception.class, new pzn(this, qbgVar, 11, bArr), executor);
        if (this.g.G()) {
            syuVarC = this.j.c(str, qdpVarD);
        } else {
            this.h.put(uri, qdpVarD);
            syuVarC = syq.a;
        }
        qdp qdpVarG = qdp.e(syuVarC).g(new pzn(syvVar, qdpVarD, 12, bArr), executor);
        qdpVarG.c(new lqd(this, str, uri, 20, (boolean[]) null), executor);
        return qdpVarG;
    }

    public final syu b(String str, Uri uri) {
        return !this.g.G() ? ske.M(rwc.i((syu) this.h.get(uri))) : this.j.e(str);
    }

    public final syu c(String str, Uri uri) {
        if (this.g.G()) {
            return this.j.f(str);
        }
        syu syuVar = (syu) this.h.remove(uri);
        return syuVar != null ? syuVar : syq.a;
    }

    public final syu d(final String str, final pvl pvlVar, final int i, final long j, final String str2, final Uri uri, final String str3, final long j2, final pve pveVar, final qbg qbgVar, final int i2, final List list, final tnw tnwVar) {
        return qsz.n(b(str, uri), new sxi() { // from class: qbd
            @Override // defpackage.sxi
            public final syu a(Object obj) {
                rwc rwcVar = (rwc) obj;
                if (rwcVar.h()) {
                    return (syu) rwcVar.c();
                }
                final tnw tnwVar2 = tnwVar;
                final List list2 = list;
                final int i3 = i2;
                final pve pveVar2 = pveVar;
                final long j3 = j2;
                final String str4 = str3;
                final String str5 = str2;
                final long j4 = j;
                final int i4 = i;
                final pvl pvlVar2 = pvlVar;
                qbg qbgVar2 = qbgVar;
                final Uri uri2 = uri;
                String str6 = str;
                final qbh qbhVar = this.a;
                return qbhVar.a(str6, uri2, qbgVar2, new sxi() { // from class: qbf
                    @Override // defpackage.sxi
                    public final syu a(Object obj2) {
                        long jK;
                        int iAx;
                        pve pveVar3 = pveVar2;
                        long j5 = j3;
                        Uri uri3 = uri2;
                        qbh qbhVar2 = qbhVar;
                        String str7 = str4;
                        if (str7.startsWith("http") && qbhVar2.g.B() && !str7.startsWith("https")) {
                            qbu.d("%s: File url = %s is not secure", "MddFileDownloader", str7);
                            tfm tfmVarA = pul.a();
                            tfmVarA.b = puk.INSECURE_URL_ERROR;
                            return ske.L(tfmVarA.c());
                        }
                        try {
                            jK = qbhVar2.i.k(uri3);
                        } catch (IOException unused) {
                            jK = 0;
                        }
                        try {
                            qbh.e(qbhVar2.a, str7, j5 - jK, pveVar3, qbhVar2.g);
                            pvl pvlVar3 = pvlVar2;
                            if (qbhVar2.g.O()) {
                                qdf qdfVar = qbhVar2.c;
                                qbv qbvVar = qbhVar2.e;
                                tpc tpcVarM = pvg.a.m();
                                if (!tpcVarM.b.C()) {
                                    tpcVarM.o();
                                }
                                tph tphVar = tpcVarM.b;
                                pvg pvgVar = (pvg) tphVar;
                                pvlVar3.getClass();
                                pvgVar.c = pvlVar3;
                                pvgVar.b |= 1;
                                if (!tphVar.C()) {
                                    tpcVarM.o();
                                }
                                long j6 = j4;
                                tph tphVar2 = tpcVarM.b;
                                pvg pvgVar2 = (pvg) tphVar2;
                                pvgVar2.b |= 2;
                                pvgVar2.d = j6;
                                if (!tphVar2.C()) {
                                    tpcVarM.o();
                                }
                                String str8 = str5;
                                tph tphVar3 = tpcVarM.b;
                                pvg pvgVar3 = (pvg) tphVar3;
                                str8.getClass();
                                pvgVar3.b |= 4;
                                pvgVar3.e = str8;
                                if (!tphVar3.C()) {
                                    tpcVarM.o();
                                }
                                int i5 = i4;
                                pvg pvgVar4 = (pvg) tpcVarM.b;
                                pvgVar4.b |= 8;
                                pvgVar4.f = i5;
                                pvg pvgVar5 = (pvg) tpcVarM.l();
                                synchronized (qdfVar.b) {
                                    HashMap map = qdfVar.c;
                                    if (!map.containsKey(pvgVar5)) {
                                        qde qdeVar = new qde(qdfVar.a, qbvVar, pvgVar5);
                                        prh prhVar = qdfVar.e;
                                        map.put(pvgVar5, new rdj(qdeVar, new qdd(0), 10L, TimeUnit.SECONDS));
                                    }
                                    qdfVar.d.put(uri3, (rdj) map.get(pvgVar5));
                                }
                            } else {
                                qbu.h("%s: NetworkUsageMonitor is disabled", "MddFileDownloader");
                            }
                            rwc rwcVar2 = qbhVar2.d;
                            if (rwcVar2.h()) {
                                qdc qdcVar = (qdc) rwcVar2.c();
                                String str9 = pvlVar3.c;
                                synchronized (qdc.class) {
                                    qdcVar.c.put(uri3, str9);
                                }
                            }
                            pxd pxdVarA = pxe.a();
                            pxdVarA.e(uri3);
                            pxdVarA.g(str7);
                            if (pveVar3 == null || (iAx = a.ax(pveVar3.d)) == 0 || iAx != 2) {
                                pxdVarA.c(pxc.b);
                            } else {
                                pxdVarA.c(pxc.c);
                            }
                            int i6 = i3;
                            if (i6 > 0) {
                                pxdVarA.f(i6);
                            }
                            List<pvf> list3 = list2;
                            int i7 = sbp.d;
                            sbk sbkVar = new sbk();
                            for (pvf pvfVar : list3) {
                                sbkVar.h(Pair.create(pvfVar.b, pvfVar.c));
                            }
                            tnw tnwVar3 = tnwVar2;
                            pxdVarA.d(sbkVar.g());
                            pxdVarA.b(tnwVar3);
                            return ((pxf) qbhVar2.b.fr()).a(pxdVarA.a());
                        } catch (pul e) {
                            qbu.d("%s: Not enough space to download file %s", "MddFileDownloader", str7);
                            return ske.L(e);
                        }
                    }
                });
            }
        }, this.f);
    }

    public final void f(String str, Uri uri) {
        qsz.n(b(str, uri), new qab(this, uri, str, 3), this.f);
    }
}
