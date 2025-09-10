package defpackage;

import android.media.MediaMuxer;
import android.net.Uri;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class qaz implements sxi {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ qaz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.sxi
    public final syu a(Object obj) throws Throwable {
        rwc rwcVarI;
        rwc rwcVarI2;
        rwc rwcVarI3;
        MediaMuxer mediaMuxer;
        MediaMuxer mediaMuxer2 = null;
        int i = 1;
        switch (this.b) {
            case 0:
                ((pul) this.a).addSuppressed((IOException) obj);
                return syq.a;
            case 1:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    Object obj2 = this.a;
                    if (!it.hasNext()) {
                        return qsp.N(arrayList).g(new pwe(list, arrayList, 6), ((qaj) obj2).a);
                    }
                    arrayList.add(((qaj) obj2).g((pvl) it.next()));
                }
            case 2:
                return ske.L((Throwable) this.a);
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    return syq.a;
                }
                qbu.d("%s: Unable to write back download info for file entry with %s", "DownloaderCallbackImpl", this.a);
                tfm tfmVarA = pul.a();
                tfmVarA.b = puk.UNABLE_TO_UPDATE_FILE_STATE_ERROR;
                return ske.L(tfmVarA.c());
            case 4:
                ((pul) this.a).addSuppressed((IOException) obj);
                return syq.a;
            case 5:
                return ske.L((Throwable) this.a);
            case 6:
                pvr pvrVar = (pvr) obj;
                if (pvrVar != null) {
                    return ske.M(pvrVar);
                }
                qbu.d("%s: Shared file not found, newFileKey = %s", "DownloaderCallbackImpl", this.a);
                tfm tfmVarA2 = pul.a();
                tfmVarA2.b = puk.SHARED_FILE_NOT_FOUND_ERROR;
                return ske.L(tfmVarA2.c());
            case 7:
                throw ((Throwable) this.a);
            case 8:
                return ((qbo) this.a).e((Map) obj);
            case 9:
                pvo pvoVar = (pvo) obj;
                pvq pvqVar = pvoVar.f;
                if (pvqVar == null) {
                    pvqVar = pvq.a;
                }
                if ((pvqVar.b & 1) != 0) {
                    pvq pvqVar2 = pvoVar.f;
                    if (pvqVar2 == null) {
                        pvqVar2 = pvq.a;
                    }
                    return ske.M(pvqVar2);
                }
                Object obj3 = this.a;
                pzu pzuVar = new pzu(obj3, 18);
                qcd qcdVar = (qcd) obj3;
                Executor executor = qcdVar.a;
                int i2 = 10;
                return qdp.e(qcdVar.c.b(pzuVar, executor)).g(new qaz(obj3, i2), executor).f(new pzw(i2), executor);
            case 10:
                return ((qcd) this.a).c.a();
            case 11:
                puh puhVar = (puh) obj;
                Object obj4 = this.a;
                try {
                    tpc tpcVar = (tpc) puhVar.a(5, null);
                    tpcVar.r(puhVar);
                    if (!tpcVar.b.C()) {
                        tpcVar.o();
                    }
                    puh puhVar2 = (puh) tpcVar.b;
                    puh puhVar3 = puh.a;
                    trb trbVar = trb.a;
                    puhVar2.c = trbVar;
                    for (puf pufVar : puhVar.c) {
                        tpc tpcVar2 = (tpc) pufVar.a(5, null);
                        tpcVar2.r(pufVar);
                        if (!tpcVar2.b.C()) {
                            tpcVar2.o();
                        }
                        puf pufVar2 = (puf) tpcVar2.b;
                        puf pufVar3 = puf.a;
                        pufVar2.c = null;
                        pufVar2.b &= -3;
                        pud pudVar = pufVar.c;
                        if (pudVar == null) {
                            pudVar = pud.a;
                        }
                        tpc tpcVar3 = (tpc) pudVar.a(5, null);
                        tpcVar3.r(pudVar);
                        if (!tpcVar3.b.C()) {
                            tpcVar3.o();
                        }
                        ((pud) tpcVar3.b).f = trbVar;
                        pud pudVar2 = pufVar.c;
                        if (pudVar2 == null) {
                            pudVar2 = pud.a;
                        }
                        for (puc pucVar : pudVar2.f) {
                            Uri uriBuild = (pucVar.b & 2) != 0 ? new Uri.Builder().scheme("asset").path(pucVar.d).build() : new Uri.Builder().scheme("asset").appendPath("mdd").appendPath(((qdi) obj4).a).appendPath(((qdi) obj4).b).appendPath(pucVar.c).build();
                            tpc tpcVar4 = (tpc) pucVar.a(5, null);
                            tpcVar4.r(pucVar);
                            tpe tpeVar = (tpe) tpcVar4;
                            String string = uriBuild.toString();
                            if (!tpeVar.b.C()) {
                                tpeVar.o();
                            }
                            puc pucVar2 = (puc) tpeVar.b;
                            string.getClass();
                            pucVar2.b |= 2;
                            pucVar2.d = string;
                            puc pucVar3 = (puc) tpeVar.l();
                            if (!tpcVar3.b.C()) {
                                tpcVar3.o();
                            }
                            pud pudVar3 = (pud) tpcVar3.b;
                            pucVar3.getClass();
                            pudVar3.b();
                            pudVar3.f.add(pucVar3);
                        }
                        if (!tpcVar2.b.C()) {
                            tpcVar2.o();
                        }
                        puf pufVar4 = (puf) tpcVar2.b;
                        pud pudVar4 = (pud) tpcVar3.l();
                        pudVar4.getClass();
                        pufVar4.c = pudVar4;
                        pufVar4.b |= 2;
                        tpcVar.aC(tpcVar2);
                    }
                    return ske.M((puh) tpcVar.l());
                } catch (RuntimeException e) {
                    puk pukVar = puk.EMBEDDED_ASSET_MANIFEST_POPULATOR_REWRITE_DOWNLOAD_URLS_ERROR;
                    tfm tfmVarA3 = pul.a();
                    tfmVarA3.d = e;
                    tfmVarA3.b = pukVar;
                    return ske.L(tfmVarA3.c());
                }
            case 12:
                tfm tfmVarA4 = pul.a();
                tfmVarA4.d = (Throwable) obj;
                tfmVarA4.b = this.a;
                return ske.L(tfmVarA4.c());
            case 13:
                return ((qay) this.a).a((List) obj);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj5 = this.a;
                try {
                    rwcVarI = rwc.i((Integer) ske.U(((qlu) obj5).b));
                    rwcVarI2 = rwc.i((Float) ske.U(((qlu) obj5).c));
                    rwcVarI3 = rwc.i((Float) ske.U(((qlu) obj5).d));
                    qth qthVar = (qth) ske.U(((qlu) obj5).a);
                    Object obj6 = qthVar.a;
                    mediaMuxer = new MediaMuxer((FileDescriptor) ((rwg) qthVar.b).a, 0);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (rwcVarI.h()) {
                        mediaMuxer.setOrientationHint(((Integer) rwcVarI.c()).intValue());
                    }
                    if (rwcVarI2.h() && rwcVarI3.h()) {
                        mediaMuxer.setLocation(((Float) rwcVarI2.c()).floatValue(), ((Float) rwcVarI3.c()).floatValue());
                    }
                    return ske.M(mediaMuxer);
                } catch (Throwable th2) {
                    th = th2;
                    mediaMuxer2 = mediaMuxer;
                    Log.e("MuxerImpl", "Error trying to construct MediaMuxer.", th);
                    qlu qluVar = (qlu) obj5;
                    if (!qluVar.i && mediaMuxer2 != null) {
                        mediaMuxer2.release();
                        qluVar.i = true;
                    }
                    return ske.L(th);
                }
            case 15:
                return ((qoa) this.a).a((qny) obj);
            case 16:
                sbp sbpVar = (sbp) obj;
                if (sbpVar.isEmpty()) {
                    return syq.a;
                }
                Object obj7 = this.a;
                qsg qsgVar = (qsg) obj7;
                uxm uxmVar = (uxm) qsgVar.i.a();
                tpc tpcVarM = uxl.a.m();
                int size = sbpVar.size();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                tph tphVar = tpcVarM.b;
                uxl uxlVar = (uxl) tphVar;
                uxlVar.b |= 2;
                uxlVar.e = size;
                if (!tphVar.C()) {
                    tpcVarM.o();
                }
                uxl uxlVar2 = (uxl) tpcVarM.b;
                uxmVar.getClass();
                uxlVar2.d = uxmVar;
                uxlVar2.b |= 1;
                HashSet hashSet = new HashSet();
                for (int i3 = 0; i3 < uxmVar.b.size(); i3++) {
                    int iK = ujk.k(uxmVar.b.d(i3));
                    if (iK == 0) {
                        iK = 1;
                    }
                    hashSet.add(Integer.valueOf(iK - 1));
                }
                int size2 = sbpVar.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    uxk uxkVar = (uxk) sbpVar.get(i4);
                    int iK2 = ujk.k(uxkVar.d);
                    if (iK2 == 0) {
                        iK2 = 1;
                    }
                    if (hashSet.contains(Integer.valueOf(iK2 - 1))) {
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        uxl uxlVar3 = (uxl) tpcVarM.b;
                        uxkVar.getClass();
                        tpw tpwVar = uxlVar3.c;
                        if (!tpwVar.c()) {
                            uxlVar3.c = tph.v(tpwVar);
                        }
                        uxlVar3.c.add(uxkVar);
                    }
                }
                uxl uxlVar4 = (uxl) tpcVarM.l();
                qqp qqpVar = qsgVar.a;
                qql qqlVarA = qqm.a();
                tpc tpcVarM2 = uzu.a.m();
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                uzu uzuVar = (uzu) tpcVarM2.b;
                uxlVar4.getClass();
                uzuVar.m = uxlVar4;
                uzuVar.b |= 131072;
                qqlVarA.f((uzu) tpcVarM2.l());
                return swz.i(qqpVar.b(qqlVarA.a()), new qwl(obj7, sbpVar, i), qsgVar.e);
            case 17:
                int i5 = ((qya) obj).a;
                if (i5 == 29501 || i5 == 29537 || i5 == 29538 || i5 == 29539 || i5 == 29540 || i5 == 29541 || i5 == 29542 || i5 == 29543 || i5 == 29544) {
                    qzm qzmVar = (qzm) this.a;
                    if (!qzmVar.h.c()) {
                        qzmVar.a();
                    }
                }
                return syq.a;
            case 18:
                return ((rah) this.a).b((rai) obj);
            case 19:
                return ske.N((syu) ((rak) this.a).g.fr());
            default:
                Object obj8 = this.a;
                try {
                    ((rdf) obj8).f.p(((rdf) obj8).b);
                    return syq.a;
                } catch (IOException e2) {
                    return ske.L(e2);
                }
        }
    }
}
