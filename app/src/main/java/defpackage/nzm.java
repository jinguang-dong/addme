package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nzm implements sxi {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ nzm(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r2v43, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.sxi
    public final syu a(Object obj) throws pxv {
        boolean zAc;
        Object obj2;
        tnw tnwVar;
        int i = 5;
        int i2 = 8;
        int i3 = 0;
        switch (this.d) {
            case 0:
                Object obj3 = this.a;
                nzj nzjVar = (nzj) obj;
                try {
                    String str = nzjVar.a;
                    long j = nzjVar.b;
                    if (str.isEmpty()) {
                        if (j <= 0) {
                            throw new IllegalArgumentException();
                        }
                        synchronized (nzo.c) {
                            str = nzo.b.format(new Date(TimeUnit.SECONDS.toMillis(j)));
                        }
                    }
                    Object obj4 = this.b;
                    obu obuVar = (obu) this.c;
                    obuVar.g("Range", "bytes=" + obj4 + "-");
                    obuVar.g("If-Range", str);
                    return syq.a;
                } catch (IllegalArgumentException unused) {
                    return ((nzo) obj3).d.f.a();
                }
            case 1:
                Long l = (Long) obj;
                if (l.longValue() <= 0) {
                    return syq.a;
                }
                Object obj5 = this.c;
                Object obj6 = this.b;
                Object obj7 = this.a;
                ((URI) obj6).toString();
                nzo nzoVar = (nzo) obj7;
                rdf rdfVar = nzoVar.d.f;
                return swz.j(rdfVar.d.b(new gea(rdfVar, 17), rdfVar.c), new nzm(obj7, obj5, l, i3), nzoVar.e);
            case 2:
                Object obj8 = this.c;
                pvl pvlVar = (pvl) obj8;
                String str2 = pvlVar.c;
                String str3 = pvlVar.d;
                int i4 = qbu.a;
                pwr pwrVar = (pwr) this.a;
                pzr pzrVar = pwrVar.d;
                return qsz.n(pzrVar.f(), new pyu(pzrVar, (tph) obj8, pwrVar.i, 15), pzrVar.k);
            case 3:
                pwr pwrVar2 = (pwr) this.b;
                pvc pvcVar = (pvc) obj;
                return pwr.p(pvcVar, pwr.k((pvl) this.a, pvcVar, pwrVar2.e), null, 2, ((pun) this.c).j, pwrVar2.d, pwrVar2.f, pwrVar2.m);
            case 4:
                return ((pwr) this.c).b.b((String) this.b, rvk.a, (rwc) this.a);
            case 5:
                Throwable cause = (Exception) obj;
                if (cause instanceof ExecutionException) {
                    ExecutionException executionException = (ExecutionException) cause;
                    if (executionException.getCause() != null) {
                        cause = executionException.getCause();
                    }
                }
                Object obj9 = this.a;
                Object obj10 = this.b;
                Object obj11 = this.c;
                cause.getClass();
                pwr pwrVar3 = (pwr) obj11;
                return qdp.e(pwrVar3.b.b((String) obj10, rwc.j(cause), (rwc) obj9)).g(new jmx(cause, 12), pwrVar3.f);
            case 6:
                pvc pvcVar2 = (pvc) obj;
                if (pvcVar2 == null) {
                    int i5 = qbu.a;
                } else {
                    int i6 = qbu.a;
                }
                Object obj12 = this.a;
                Object obj13 = this.c;
                Object obj14 = this.b;
                pwr pwrVar4 = (pwr) obj14;
                pvl pvlVar2 = (pvl) obj12;
                rwc rwcVarK = pwr.k(pvlVar2, pvcVar2, pwrVar4.e);
                String str4 = (pvlVar2.b & 4) != 0 ? pvlVar2.e : null;
                boolean z = ((puv) obj13).d;
                pzr pzrVar2 = pwrVar4.d;
                Executor executor = pwrVar4.f;
                return qsz.m(pwr.p(pvcVar2, rwcVarK, str4, 2, z, pzrVar2, executor, pwrVar4.m), new kve(obj14, 19), executor);
            case 7:
                sbv sbvVar = (sbv) obj;
                ?? r0 = this.b;
                Object obj15 = this.c;
                for (pva pvaVar : r0) {
                    if (!sbvVar.containsKey(pvaVar)) {
                        tfm tfmVarA = pul.a();
                        tfmVarA.b = puk.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                        tfmVarA.c = "getDataFileUris() resolved to null";
                        return ske.L(tfmVarA.c());
                    }
                    Uri uri = (Uri) sbvVar.get(pvaVar);
                    try {
                        zAc = qsp.ac(pvaVar);
                        obj2 = this.a;
                    } catch (IOException e) {
                        qbu.f(e, "Failed to list files under directory:".concat(String.valueOf(String.valueOf(uri))));
                    }
                    if (zAc && ((lat) obj15).s(uri)) {
                        String path = uri.getPath();
                        if (path != null) {
                            List listO = pwr.o((lat) obj15, uri, path);
                            if (!((tpc) obj2).b.C()) {
                                ((tpc) obj2).o();
                            }
                            pts ptsVar = (pts) ((tpc) obj2).b;
                            pts ptsVar2 = pts.a;
                            ptsVar.b();
                            tnq.e(listO, ptsVar.h);
                        }
                    } else {
                        String str5 = pvaVar.c;
                        long j2 = pvaVar.e;
                        long j3 = pvaVar.j;
                        String string = uri.toString();
                        if ((pvaVar.b & 8192) != 0) {
                            tnw tnwVar2 = pvaVar.q;
                            if (tnwVar2 == null) {
                                tnwVar2 = tnw.a;
                            }
                            tnwVar = tnwVar2;
                        } else {
                            tnwVar = null;
                        }
                        ((tpc) obj2).A(pwr.j(str5, j2, j3, string, tnwVar, true, pvaVar.g));
                    }
                }
                return syq.a;
            case 8:
                if (((Boolean) obj).booleanValue()) {
                    return this.b;
                }
                Object obj16 = this.c;
                ((pzb) this.a).b.l(1036);
                return ske.L(new IOException("Failed to write updated group: ".concat(String.valueOf(((pvl) obj16).c))));
            case 9:
                if (!((Boolean) obj).booleanValue()) {
                    Object obj17 = this.a;
                    Object obj18 = this.c;
                    Object obj19 = this.b;
                    pva pvaVar2 = (pva) obj18;
                    pvc pvcVar3 = (pvc) obj17;
                    qbu.e("%s: Failed to set new state for file %s, filegroup %s", "FileGroupManager", pvaVar2.c, pvcVar3.d);
                    pzb.C(((pzb) obj19).b, pvcVar3, pvaVar2, 14);
                }
                return syq.a;
            case 10:
                rwc rwcVar = ((pzb) this.b).i;
                if (rwcVar.h()) {
                    pvc pvcVar4 = (pvc) this.c;
                    int iW = qsp.w(pvcVar4.r);
                    if (iW != 0 && iW != 1) {
                        Object obj20 = this.a;
                        qdt qdtVar = (qdt) ((rww) rwcVar.c()).fr();
                        int i7 = pvcVar4.r;
                        String str6 = ((pvl) obj20).c;
                        return qdtVar.a();
                    }
                }
                return ske.M(true);
            case 11:
                Exception exc = (Exception) obj;
                pvc pvcVar5 = (pvc) ((AtomicReference) this.b).get();
                if (pvcVar5 == null) {
                    pvcVar5 = pvc.a;
                }
                pvc pvcVar6 = pvcVar5;
                Object obj21 = this.c;
                Object obj22 = this.a;
                boolean z2 = exc instanceof pul;
                syu syuVarR = syq.a;
                if (z2) {
                    pul pulVar = (pul) exc;
                    puk pukVar = pulVar.a;
                    int i8 = qbu.a;
                    syuVarR = ((pzb) obj22).r(syuVarR, new pyj(obj22, (tph) obj21, (Object) pulVar, (Object) pvcVar6, 3));
                } else if (exc instanceof ptv) {
                    int i9 = qbu.a;
                    sbp sbpVar = ((ptv) exc).a;
                    int i10 = ((sex) sbpVar).c;
                    while (i3 < i10) {
                        Throwable th = (Throwable) sbpVar.get(i3);
                        if (th instanceof pul) {
                            syuVarR = ((pzb) obj22).r(syuVarR, new pyj(obj22, (tph) obj21, th, (Object) pvcVar6, 4));
                        } else {
                            qbu.c("%s: Expecting DownloadException's in AggregateException", "FileGroupManager");
                        }
                        i3++;
                    }
                }
                return ((pzb) obj22).r(syuVarR, new pyg(exc, i));
            case 12:
                sbv sbvVar2 = (sbv) obj;
                ?? r2 = this.b;
                Object obj23 = this.a;
                Object obj24 = this.c;
                for (pva pvaVar3 : r2) {
                    try {
                        Uri uri2 = (Uri) ((sbv) obj23).get(pvaVar3);
                        uri2.getClass();
                        Uri uri3 = (Uri) sbvVar2.get(pvaVar3);
                        uri3.getClass();
                        Uri uri4 = Uri.parse(uri2.toString().substring(0, uri2.toString().lastIndexOf("/")));
                        lat latVar = ((pzb) obj24).m;
                        if (!latVar.r(uri4)) {
                            latVar.n(uri4);
                        }
                        qcw.b(((pzb) obj24).a, uri2, uri3);
                    } catch (IOException | NullPointerException e2) {
                        tfm tfmVarA2 = pul.a();
                        tfmVarA2.b = puk.UNABLE_TO_CREATE_SYMLINK_STRUCTURE;
                        tfmVarA2.c = "Unable to create symlink";
                        tfmVarA2.d = e2;
                        return ske.L(tfmVarA2.c());
                    }
                }
                return syq.a;
            case 13:
                return ((pzb) this.b).f((pvr) obj, (pva) this.c, (pvc) this.a);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                pva pvaVar4 = (pva) this.c;
                String str7 = pvaVar4.c;
                pvc pvcVar7 = (pvc) this.a;
                String str8 = pvcVar7.d;
                int i11 = qbu.a;
                pzb.C(((pzb) this.b).b, pvcVar7, pvaVar4, ((qco) obj).a);
                return syq.a;
            case 15:
                return ((pzb) this.b).d.l((pvl) this.a, (pvc) this.c);
            case 16:
                pvc pvcVar8 = (pvc) obj;
                Object obj25 = this.b;
                if (pvcVar8 != null) {
                    int i12 = pvcVar8.f;
                    tpc tpcVar = (tpc) obj25;
                    if (!tpcVar.b.C()) {
                        tpcVar.o();
                    }
                    suv suvVar = (suv) tpcVar.b;
                    suv suvVar2 = suv.a;
                    suvVar.b |= 2;
                    suvVar.d = i12;
                }
                ((pzb) this.a).b.q(rkf.u(((pul) this.c).a.aF), (suv) ((tpc) obj25).l(), a.aA(r0.b - 1));
                return syq.a;
            case 17:
                Object obj26 = this.b;
                pzb pzbVar = (pzb) obj26;
                pzc pzcVar = pzbVar.d;
                Object obj27 = this.a;
                qdp qdpVarE = qdp.e(pzcVar.g((pvl) obj27));
                mdv mdvVar = new mdv(18);
                Executor executor2 = pzbVar.g;
                qdp qdpVarF = qdpVarE.f(mdvVar, executor2);
                return qdpVarF.g(new pyu(obj26, (tph) obj27, (tph) this.c, 7), executor2).g(new nzm(obj26, obj27, qdpVarF, i2), executor2);
            case 18:
                pvc pvcVar9 = (pvc) obj;
                Object obj28 = this.c;
                if (pvcVar9 != null) {
                    return ske.M(pzb.a((pvc) obj28, pvcVar9));
                }
                tph tphVar = (tph) this.a;
                tpc tpcVar2 = (tpc) tphVar.a(5, null);
                tpcVar2.r(tphVar);
                if (!tpcVar2.b.C()) {
                    tpcVar2.o();
                }
                Object obj29 = this.b;
                pvl pvlVar3 = (pvl) tpcVar2.b;
                pvl pvlVar4 = pvl.a;
                pvlVar3.b |= 8;
                pvlVar3.f = true;
                pzb pzbVar2 = (pzb) obj29;
                return pzbVar2.r(pzbVar2.d.g((pvl) tpcVar2.l()), new pyg(obj28, 3));
            case 19:
                pvm pvmVar = (pvm) obj;
                if (pvmVar == null) {
                    pvmVar = pvm.a;
                }
                if (pvmVar.b) {
                    return ske.M(null);
                }
                Object obj30 = this.c;
                Object obj31 = this.a;
                Object obj32 = this.b;
                pvl pvlVar5 = (pvl) obj31;
                String str9 = pvlVar5.c;
                String str10 = pvlVar5.d;
                int i13 = qbu.a;
                pzb.B(1055, ((pzb) obj32).b, (pvc) obj30);
                throw new pxv();
            default:
                Object obj33 = this.a;
                tph tphVar2 = (tph) obj33;
                tpc tpcVar3 = (tpc) tphVar2.a(5, null);
                tpcVar3.r(tphVar2);
                if (!tpcVar3.b.C()) {
                    tpcVar3.o();
                }
                Object obj34 = this.c;
                Object obj35 = this.b;
                pvl pvlVar6 = (pvl) tpcVar3.b;
                pvl pvlVar7 = pvl.a;
                pvlVar6.b |= 8;
                pvlVar6.f = false;
                pzb pzbVar3 = (pzb) obj35;
                return pzbVar3.r(pzbVar3.d.g((pvl) tpcVar3.l()), new nzm(obj35, obj34, obj33, 18, (char[]) null));
        }
    }

    public /* synthetic */ nzm(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ nzm(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ nzm(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ nzm(Object obj, pvl pvlVar, Object obj2, int i) {
        this.d = i;
        this.b = obj;
        this.a = pvlVar;
        this.c = obj2;
    }
}
