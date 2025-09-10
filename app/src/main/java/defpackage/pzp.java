package defpackage;

import android.net.Uri;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pzp implements sxi {
    public final /* synthetic */ long a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    private final /* synthetic */ int i;

    public /* synthetic */ pzp(jng jngVar, mfo mfoVar, InputStream inputStream, lsu lsuVar, rwc rwcVar, long j, String str, mdm mdmVar, int i) {
        this.i = i;
        this.d = jngVar;
        this.e = mfoVar;
        this.h = inputStream;
        this.c = lsuVar;
        this.f = rwcVar;
        this.a = j;
        this.b = str;
        this.g = mdmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, sxi] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, mdm] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, qbg] */
    @Override // defpackage.sxi
    public final syu a(Object obj) throws NoSuchAlgorithmException {
        int i = this.i;
        if (i == 0) {
            ?? r15 = this.e;
            Object obj2 = this.c;
            sbp sbpVarA = pzr.a(r15);
            final pzb pzbVar = ((pzr) obj2).d;
            qev qevVar = new qev(pzbVar.b, 2);
            Object obj3 = this.g;
            final String str = this.b;
            final long j = this.a;
            final pvl pvlVar = (pvl) this.d;
            final rwc rwcVar = (rwc) obj3;
            syu syuVarR = pzbVar.r(pzbVar.q(pzbVar.d.c(), new rvu() { // from class: pyx
                @Override // defpackage.rvu
                public final Object apply(Object obj4) {
                    rwc rwcVarJ;
                    for (qao qaoVar : (List) obj4) {
                        pvl pvlVar2 = pvlVar;
                        pvc pvcVar = qaoVar.b;
                        pvl pvlVar3 = qaoVar.a;
                        if (pvlVar3.e.equals(pvlVar2.e)) {
                            if (pvcVar.s != j) {
                                int i2 = qbu.a;
                            } else if (str.equals(pvcVar.t)) {
                                if ((pvcVar.b & 16) != 0) {
                                    tnw tnwVar = pvcVar.g;
                                    if (tnwVar == null) {
                                        tnwVar = tnw.a;
                                    }
                                    rwcVarJ = rwc.j(tnwVar);
                                } else {
                                    rwcVarJ = rvk.a;
                                }
                                if (!rwcVarJ.equals(rwcVar)) {
                                    int i3 = qbu.a;
                                } else {
                                    if (pvlVar2.c.equals(pvlVar3.c)) {
                                        return qaoVar;
                                    }
                                    String str2 = pvlVar2.c;
                                    int i4 = qbu.a;
                                }
                            } else {
                                int i5 = qbu.a;
                            }
                        } else {
                            int i6 = qbu.a;
                        }
                    }
                    return null;
                }
            }), new pzy(pvlVar, j, str, 1));
            qdp qdpVarE = qdp.e(syuVarR);
            pyu pyuVar = new pyu(pzbVar, sbpVarA, qevVar, 0);
            Executor executor = pzbVar.g;
            return qdpVarE.g(pyuVar, executor).g(new pyi(pzbVar, syuVarR, pvlVar, (sbv) this.f, (sxi) this.h, qevVar, 2), executor).d(Exception.class, new sxi() { // from class: pyv
                @Override // defpackage.sxi
                public final syu a(Object obj4) {
                    Exception exc = (Exception) obj4;
                    boolean z = exc instanceof pul;
                    long j2 = j;
                    pzb pzbVar2 = pzbVar;
                    String str2 = str;
                    pvl pvlVar2 = pvlVar;
                    syu syuVarR2 = syq.a;
                    if (z) {
                        pul pulVar = (pul) exc;
                        puk pukVar = pulVar.a;
                        int i2 = qbu.a;
                        syuVarR2 = pzbVar2.r(syuVarR2, new pys(pzbVar2, pvlVar2, pulVar, j2, str2, 0));
                    } else if (exc instanceof ptv) {
                        int i3 = qbu.a;
                        sbp sbpVar = ((ptv) exc).a;
                        int i4 = ((sex) sbpVar).c;
                        for (int i5 = 0; i5 < i4; i5++) {
                            Throwable th = (Throwable) sbpVar.get(i5);
                            if (th instanceof pul) {
                                syuVarR2 = pzbVar2.r(syuVarR2, new pys(pzbVar2, pvlVar2, (pul) th, j2, str2, 2));
                            } else {
                                qbu.h("%s: Expecting DownloadExceptions in AggregateException", "FileGroupManager");
                            }
                        }
                    }
                    return pzbVar2.r(syuVarR2, new pyg(exc, 8));
                }
            }, executor);
        }
        if (i == 1) {
            jnz jnzVar = ((jng) this.d).b;
            ?? r8 = this.g;
            String str2 = this.b;
            long j2 = this.a;
            Object obj4 = this.f;
            Object obj5 = this.c;
            return jnzVar.b((mfo) this.e, (InputStream) this.h, (lsu) obj5, (rwc) obj4, j2, str2, r8);
        }
        rwc rwcVar2 = (rwc) obj;
        if (rwcVar2.h()) {
            return (syu) rwcVar2.c();
        }
        Object obj6 = this.c;
        Object obj7 = this.g;
        final long j3 = this.a;
        final String str3 = this.b;
        ?? r9 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.h;
        final qbh qbhVar = (qbh) this.f;
        final Uri uri = (Uri) obj8;
        final pve pveVar = (pve) obj7;
        final put putVar = (put) obj6;
        return qbhVar.a((String) obj9, uri, r9, new sxi() { // from class: qbe
            @Override // defpackage.sxi
            public final syu a(Object obj10) {
                String str4 = str3;
                long j4 = j3;
                pve pveVar2 = pveVar;
                qbh qbhVar2 = qbhVar;
                try {
                    qbh.e(qbhVar2.a, str4, j4, pveVar2, qbhVar2.g);
                    put putVar2 = putVar;
                    Uri uri2 = uri;
                    pxd pxdVarA = pxe.a();
                    pxdVarA.g(str4);
                    pxdVarA.e(uri2);
                    pxdVarA.a = rwc.j(new pxg(putVar2));
                    return ((pxf) qbhVar2.b.fr()).a(pxdVarA.a());
                } catch (pul e) {
                    qbu.d("%s: Not enough space to download file %s", "MddFileDownloader", str4);
                    return ske.L(e);
                }
            }
        });
    }

    public /* synthetic */ pzp(pzr pzrVar, pvl pvlVar, long j, String str, sbp sbpVar, sbv sbvVar, rwc rwcVar, sxi sxiVar, int i) {
        this.i = i;
        this.c = pzrVar;
        this.d = pvlVar;
        this.a = j;
        this.b = str;
        this.e = sbpVar;
        this.f = sbvVar;
        this.g = rwcVar;
        this.h = sxiVar;
    }

    public /* synthetic */ pzp(qbh qbhVar, String str, Uri uri, qbg qbgVar, String str2, long j, pve pveVar, put putVar, int i) {
        this.i = i;
        this.f = qbhVar;
        this.h = str;
        this.d = uri;
        this.e = qbgVar;
        this.b = str2;
        this.a = j;
        this.g = pveVar;
        this.c = putVar;
    }
}
