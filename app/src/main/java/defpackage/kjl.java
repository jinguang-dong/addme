package defpackage;

import android.content.Context;
import androidx.wear.ambient.AmbientModeSupport;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.channels.SelectableChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kjl implements sxi {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ kjl(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, pxi] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, puu] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v68, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v69, types: [java.lang.Object, pzc] */
    /* JADX WARN: Type inference failed for: r1v75, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.lang.Object, qai] */
    /* JADX WARN: Type inference failed for: r3v35, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, pzc] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.sxi
    public final syu a(Object obj) throws NumberFormatException {
        syu syuVarM;
        long j;
        tnw tnwVar;
        int i = 20;
        int i2 = 0;
        switch (this.c) {
            case 0:
                lmg lmgVar = (lmg) this.b;
                poj pojVar = lmgVar.a;
                long jD = pojVar.d();
                kjo kjoVar = ((kjn) this.a).d;
                return ((hke) kjoVar.c.a()).a(new hkk(pojVar, lmgVar.i, (poe) obj, rwc.i(kjoVar.f.a(jD)), (rwc) rvk.a));
            case 1:
                Object obj2 = this.a;
                Object obj3 = ((fxy) obj2).e;
                Object obj4 = this.b;
                synchronized (obj3) {
                    ((fxy) obj2).j();
                    ((fxy) obj2).m((gbt) obj4);
                    ((fxy) obj2).k("Recording stopped.");
                    syuVarM = ske.M(((fxy) obj2).y);
                }
                return syuVarM;
            case 2:
                nzb nzbVar = ((nzo) this.b).d.e;
                if (nzbVar == null) {
                    return syq.a;
                }
                return swz.i(nzbVar.a(), new kve(this.a, 9), sxo.a);
            case 3:
                AmbientModeSupport.AmbientController ambientController = ((nzo) this.a).d.g;
                if (ambientController == null) {
                    return ske.M(null);
                }
                ((URI) this.b).toString();
                return ske.M(ambientController.a.a());
            case 4:
                Object obj5 = this.a;
                Pattern pattern = nzo.a;
                nzd nzdVar = (nzd) obj5;
                if (nzdVar.a() != 206) {
                    j = 0;
                } else {
                    List list = (List) nzdVar.b().get("Content-Range");
                    nzo.a((list == null || list.isEmpty()) ? false : true, "Host returned 206/PARTIAL response code but didn't provide a 'Content-Range' response header", new Object[0]);
                    list.getClass();
                    String str = (String) list.get(0);
                    Pattern pattern2 = nzo.a;
                    Matcher matcher = pattern2.matcher(str);
                    nzo.a(matcher.matches() && matcher.groupCount() > 0, "Content-Range response header didn't match expected pattern. Was '%s', expected '%s'", str, pattern2.pattern());
                    String strGroup = matcher.group(1);
                    strGroup.getClass();
                    j = Long.parseLong(strGroup);
                }
                long j2 = j;
                List list2 = (List) nzdVar.b().get("ETag");
                String str2 = (list2 == null || list2.isEmpty()) ? "" : (String) list2.get(0);
                Object obj6 = this.b;
                nzj nzjVar = new nzj(str2, nzo.c(nzdVar));
                rnt.B(true, "Received null metadata to store");
                rdf rdfVar = (rdf) obj6;
                return qsz.n(rdfVar.b(), new pzy(obj6, j2, nzjVar, 2), rdfVar.c);
            case 5:
                WritableByteChannel writableByteChannel = (WritableByteChannel) obj;
                ((nzo) this.b).g.a(writableByteChannel);
                if (writableByteChannel instanceof SelectableChannel) {
                    rnt.M(((SelectableChannel) writableByteChannel).isBlocking(), "Target channels used by UrlEngine must be in blocking mode to ensure writes happen correctly; call SelectableChannel#configureBlocking(true).");
                }
                Object obj7 = this.a;
                rnt.L(writableByteChannel.isOpen());
                nzd nzdVar2 = (nzd) obj7;
                nzdVar2.c.a = writableByteChannel;
                nzdVar2.a.read(ByteBuffer.allocateDirect(131072));
                return nzdVar2.b;
            case 6:
                return ((nzv) this.b).a((nzl) this.a);
            case 7:
                return ((nzv) this.b).a((nzl) this.a);
            case 8:
                och ochVar = (och) obj;
                ?? r2 = this.b;
                if (ochVar != null) {
                    return r2;
                }
                syu syuVar = ((oca) this.a).j;
                return syuVar == null ? ske.M(null) : syuVar;
            case 9:
                tfm tfmVarA = pul.a();
                tfmVarA.b = this.a;
                tfmVarA.c = this.b;
                tfmVarA.d = (Throwable) obj;
                return ske.L(tfmVarA.c());
            case 10:
                pwr pwrVar = (pwr) this.b;
                return qsz.m(pwrVar.d.e((pvl) this.a, true), new kve((pvc) obj, i), pwrVar.f);
            case 11:
                ((syv) this.b).run();
                return this.a;
            case 12:
                sbv sbvVar = (sbv) obj;
                for (pva pvaVar : this.b) {
                    String str3 = pvaVar.c;
                    long j3 = pvaVar.e;
                    long j4 = pvaVar.j;
                    if ((pvaVar.b & 8192) != 0) {
                        tnw tnwVar2 = pvaVar.q;
                        if (tnwVar2 == null) {
                            tnwVar2 = tnw.a;
                        }
                        tnwVar = tnwVar2;
                    } else {
                        tnwVar = null;
                    }
                    ((tpc) this.a).A(pwr.j(str3, j3, j4, null, tnwVar, sbvVar.containsKey(pvaVar) && sbvVar.get(pvaVar) == pvk.DOWNLOAD_COMPLETE, pvaVar.g));
                }
                return syq.a;
            case 13:
                long j5 = ((nzp) obj).a;
                int i3 = qbu.a;
                pxr pxrVar = (pxr) this.b;
                return qsz.k(pxrVar.b.g(((pxe) this.a).a), Exception.class, new kjm(13), pxrVar.a);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                AtomicInteger atomicInteger = new AtomicInteger(0);
                ArrayList arrayList3 = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (true) {
                    Object obj8 = this.a;
                    if (!it.hasNext()) {
                        qav qavVar = (qav) obj8;
                        if (qavVar.d.H()) {
                            ArrayList arrayList4 = new ArrayList();
                            syu syuVarC = qavVar.h.c();
                            hve hveVar = new hve(obj8, arrayList4, 11);
                            ?? r0 = qavVar.g;
                            arrayList3.add(qsz.m(qsz.m(syuVarC, hveVar, r0), new pyb(arrayList, 3), r0));
                        } else {
                            arrayList.add(qsp.aj((Context) qavVar.i, qavVar.a));
                        }
                        return qsp.N(arrayList3).f(new pyd(qavVar, atomicInteger, arrayList2, arrayList, 0), qavVar.g);
                    }
                    ?? r4 = this.b;
                    pvp pvpVar = (pvp) it.next();
                    if (r4.contains(pvpVar)) {
                        qav qavVar2 = (qav) obj8;
                        arrayList3.add(qsz.m(((qag) qavVar2.e).d(pvpVar), new pyb(arrayList, 2), qavVar2.g));
                    } else {
                        qav qavVar3 = (qav) obj8;
                        arrayList3.add(qsz.n(qavVar3.j.e(pvpVar), new pyj(qavVar3, arrayList2, pvpVar, atomicInteger, 1), qavVar3.g));
                    }
                }
            case 15:
                Object obj9 = this.a;
                qav qavVar4 = (qav) obj9;
                return qsz.n(qavVar4.h.m(this.b), new jmx(obj9, i), qavVar4.g);
            case 16:
                ArrayList arrayList5 = new ArrayList();
                Iterator it2 = ((List) obj).iterator();
                while (true) {
                    Object obj10 = this.a;
                    if (!it2.hasNext()) {
                        return qsp.N(arrayList5).f(new ire(10), ((pzb) obj10).g);
                    }
                    pvl pvlVar = (pvl) it2.next();
                    if (!pvlVar.e.isEmpty()) {
                        if (!((scn) this.b).contains(pvlVar.e)) {
                            pzb pzbVar = (pzb) obj10;
                            arrayList5.add(pzbVar.r(pzbVar.d.g(pvlVar), new pyn(obj10, (tph) pvlVar, i2)));
                        }
                    }
                }
            case 17:
                qbu.d("%s: Encountered SharedFileMissingException for group: %s", "FileGroupManager", ((pvc) this.a).d);
                ((pzb) this.b).c.a();
                return ske.M(pvk.NONE);
            case 18:
                pvc pvcVar = (pvc) obj;
                tph tphVar = (tph) this.a;
                tpc tpcVar = (tpc) tphVar.a(5, null);
                tpcVar.r(tphVar);
                if (!tpcVar.b.C()) {
                    tpcVar.o();
                }
                Object obj11 = this.b;
                pvl pvlVar2 = (pvl) tpcVar.b;
                pvl pvlVar3 = pvl.a;
                pvlVar2.b |= 8;
                pvlVar2.f = false;
                return ((pzb) obj11).d.l((pvl) tpcVar.l(), pvcVar);
            case 19:
                pvc pvcVar2 = (pvc) this.a;
                qbu.j((pul) obj, "%s: Unable to correct isolated structure, returning null instead of group %s", "FileGroupManager", pvcVar2.d);
                ((pzb) this.b).b.p(pzb.w(pvcVar2), 5);
                return syq.a;
            default:
                ((pzb) this.b).b.p(pzb.w((pvc) this.a), 4);
                return syq.a;
        }
    }

    public /* synthetic */ kjl(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ kjl(puk pukVar, int i) {
        this.c = i;
        this.a = pukVar;
        this.b = "Failed to parse the manifest file.";
    }
}
