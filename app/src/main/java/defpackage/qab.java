package defpackage;

import android.net.Uri;
import androidx.wear.ambient.AmbientModeSupport;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class qab implements sxi {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ qab(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, sxi] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r10v25, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, java.util.concurrent.Future, syu] */
    /* JADX WARN: Type inference failed for: r9v26, types: [java.lang.Object, sxi] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, qai] */
    @Override // defpackage.sxi
    public final syu a(Object obj) {
        String string;
        switch (this.d) {
            case 0:
                String str = (String) obj;
                int iAx = a.ax(((pvp) this.b).f);
                return ((qag) this.a).i(iAx != 0 ? iAx : 1, str, ((pva) this.c).g);
            case 1:
                Object obj2 = this.a;
                pvk pvkVar = pvk.DOWNLOAD_IN_PROGRESS;
                tpc tpcVar = (tpc) obj2;
                if (!tpcVar.b.C()) {
                    tpcVar.o();
                }
                Object obj3 = this.c;
                Object obj4 = this.b;
                pvr pvrVar = (pvr) tpcVar.b;
                pvr pvrVar2 = pvr.a;
                pvrVar.d = pvkVar.h;
                pvrVar.b |= 2;
                return ((qag) obj4).c.h((pvp) obj3, (pvr) tpcVar.l());
            case 2:
                pvr pvrVar3 = (pvr) obj;
                tpc tpcVar2 = (tpc) pvrVar3.a(5, null);
                tpcVar2.r(pvrVar3);
                if (!tpcVar2.b.C()) {
                    tpcVar2.o();
                }
                Object obj5 = this.c;
                pvr pvrVar4 = (pvr) tpcVar2.b;
                pvr pvrVar5 = pvr.a;
                pvk pvkVar2 = (pvk) obj5;
                pvrVar4.d = pvkVar2.h;
                pvrVar4.b |= 2;
                if (pvkVar2.equals(pvk.CORRUPTED)) {
                    int i = pvrVar3.h + 1;
                    if (!tpcVar2.b.C()) {
                        tpcVar2.o();
                    }
                    pvr pvrVar6 = (pvr) tpcVar2.b;
                    pvrVar6.b |= 32;
                    pvrVar6.h = i;
                }
                return this.a.h((pvp) this.b, (pvr) tpcVar2.l());
            case 3:
                rwc rwcVar = (rwc) obj;
                if (!rwcVar.h()) {
                    qbu.h("%s: stopDownloading on non-existent download", "MddFileDownloader");
                    return syq.a;
                }
                Object obj6 = this.a;
                Object obj7 = this.c;
                Object obj8 = this.b;
                int i2 = qbu.a;
                ((syu) rwcVar.c()).cancel(true);
                return ((qbh) obj8).c((String) obj6, (Uri) obj7);
            case 4:
                List listL = (List) obj;
                qzs qzsVar = (qzs) this.b;
                if (!qzsVar.e) {
                    listL = sbp.l("");
                }
                int i3 = sbp.d;
                sbk sbkVar = new sbk();
                Iterator it = listL.iterator();
                while (true) {
                    Object obj9 = this.c;
                    if (!it.hasNext()) {
                        return ske.E(sbkVar.g()).a(new qbl(6), ((qxf) obj9).b());
                    }
                    Object obj10 = this.a;
                    String str2 = (String) it.next();
                    AmbientModeSupport.AmbientController ambientController = qzz.b;
                    if (ambientController == null || !ambientController.f((String) obj10, str2)) {
                        qxf qxfVar = (qxf) obj9;
                        rah rahVar = new rah(qxfVar, (String) obj10, str2, qzsVar.c);
                        if (qzsVar.d) {
                            string = qsz.a(qxfVar.c).getString(qzsVar.a, "");
                        } else {
                            string = str2;
                        }
                        syu syuVarA = rahVar.a(string);
                        sbkVar.h(swz.j(swz.j(syn.v(syuVarA), new qaz(rahVar, 18), qxfVar.b()), new pyj(qxfVar, syuVarA, qzsVar, str2, 11), qxfVar.b()));
                    }
                }
                break;
            case 5:
                ?? r0 = this.b;
                final ?? r1 = this.a;
                boolean zEquals = ske.U(r0).equals(ske.U(r1));
                Object obj11 = this.c;
                if (zEquals) {
                    return ske.M(obj);
                }
                final rel relVar = (rel) obj11;
                syu syuVarJ = swz.j(r1, rsx.c(new sxi() { // from class: rej
                    @Override // defpackage.sxi
                    public final syu a(Object obj12) throws IOException {
                        rel relVar2 = relVar;
                        relVar2.c((Uri) ske.U(relVar2.b), obj12);
                        syu syuVar = r1;
                        synchronized (relVar2.e) {
                            relVar2.f = syuVar;
                        }
                        return ske.M(obj12);
                    }
                }), relVar.c);
                synchronized (relVar.e) {
                }
                return syuVarJ;
            case 6:
                return ((ren) this.c).e.d(this.b, this.a);
            default:
                return ((ren) ((AmbientModeSupport.AmbientController) this.c).a).e.d(this.b, this.a);
        }
    }

    public /* synthetic */ qab(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ qab(pvk pvkVar, qai qaiVar, pvp pvpVar, int i) {
        this.d = i;
        this.c = pvkVar;
        this.a = qaiVar;
        this.b = pvpVar;
    }

    public /* synthetic */ qab(qag qagVar, pvp pvpVar, pva pvaVar, int i) {
        this.d = i;
        this.a = qagVar;
        this.b = pvpVar;
        this.c = pvaVar;
    }

    public /* synthetic */ qab(qbh qbhVar, Uri uri, String str, int i) {
        this.d = i;
        this.b = qbhVar;
        this.c = uri;
        this.a = str;
    }
}
