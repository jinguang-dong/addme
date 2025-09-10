package defpackage;

import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uv implements tzx {
    private final int a;
    private final kyz b;
    private final kgu c;

    public uv(kyz kyzVar, kgu kguVar, int i) {
        this.b = kyzVar;
        this.c = kguVar;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.uem, defpackage.uel
    public final Object a() {
        switch (this.a) {
            case 0:
                kgu kguVar = this.c;
                sm smVar = (sm) kguVar.k.a();
                uem uemVar = kguVar.d;
                return new vp((pl) ((ocq) kguVar.s).a, smVar, (wh) uemVar.a(), (wb) uemVar.a(), (wq) kguVar.m.a(), (wr) kguVar.r.a(), (sl) kguVar.p.a(), (byi) kguVar.l.a(), (wk) kguVar.b.a(), (wy) kguVar.f.a(), (wx) kguVar.g.a(), (rnn) this.b.t.a(), (po) kguVar.a.a(), (ocq) kguVar.j.a(), (ocq) kguVar.c.a());
            case 1:
                kgu kguVar2 = this.c;
                qrh qrhVar = (qrh) kguVar2.o.a();
                qrhVar.getClass();
                return qrhVar.n(((pl) ((ocq) kguVar2.s).a).a);
            case 2:
                kyz kyzVar = this.b;
                cey ceyVar = (cey) kyzVar.s.a();
                byi byiVar = (byi) kyzVar.q.a();
                ceyVar.getClass();
                byiVar.getClass();
                Object obj = ceyVar.b;
                obj.getClass();
                return obj;
            case 3:
                qrh qrhVar2 = (qrh) this.b.h.a();
                kgu kguVar3 = this.c;
                return new wh(qrhVar2, (po) kguVar3.a.a(), (pl) ((ocq) kguVar3.s).a, (wk) kguVar3.b.a(), (List) kguVar3.h.a());
            case 4:
                return new po("CameraGraph-" + po.a.b());
            case 5:
                return new wk();
            case 6:
                kgu kguVar4 = this.c;
                wk wkVar = (wk) kguVar4.b.a();
                wy wyVar = (wy) kguVar4.f.a();
                wkVar.getClass();
                wyVar.getClass();
                List listBn = ske.bn(wkVar);
                listBn.add(wkVar);
                listBn.add(wyVar);
                listBn.addAll(((pl) ((ocq) kguVar4.s).a).j);
                return listBn;
            case 7:
                kgu kguVar5 = this.c;
                ocq ocqVar = (ocq) kguVar5.e.a();
                wx wxVar = (wx) kguVar5.g.a();
                ocqVar.getClass();
                wxVar.getClass();
                return new wy(ocqVar.a, wxVar);
            case 8:
                kgu kguVar6 = this.c;
                rg rgVar = (rg) kguVar6.m.a();
                new byi((qrh) this.b.h.a());
                return new ocq((pl) ((ocq) kguVar6.s).a, rgVar);
            case 9:
                kgu kguVar7 = this.c;
                return new wq((sm) kguVar7.k.a(), (pl) ((ocq) kguVar7.s).a);
            case 10:
                kgu kguVar8 = this.c;
                po poVar = (po) kguVar8.a.a();
                qrh qrhVar3 = (qrh) kguVar8.o.a();
                byi byiVar2 = (byi) this.b.q.a();
                wh whVar = (wh) kguVar8.d.a();
                rg rgVar2 = (rg) kguVar8.m.a();
                wr wrVar = (wr) kguVar8.r.a();
                poVar.getClass();
                qrhVar3.getClass();
                byiVar2.getClass();
                whVar.getClass();
                rgVar2.getClass();
                wrVar.getClass();
                ut utVar = new ut(poVar, (pl) ((ocq) kguVar8.s).a, whVar, (wq) rgVar2, wrVar, qrhVar3);
                det detVar = (det) qrhVar3.f;
                detVar.b = utVar;
                rnt.aR(detVar.b, ut.class);
                sl slVar = (sl) new uh((kyz) detVar.a, (ut) detVar.b).c.a();
                synchronized (qrhVar3.c) {
                    qrhVar3.e.add(slVar);
                }
                slVar.getClass();
                return slVar;
            case 11:
                kgu kguVar9 = this.c;
                wq wqVar = (wq) kguVar9.m.a();
                py pyVar = (py) this.b.p.a();
                ocq ocqVar2 = (ocq) kguVar9.e.a();
                wqVar.getClass();
                pyVar.getClass();
                ocqVar2.getClass();
                return new wr(wqVar, kguVar9.p, pyVar, ocqVar2.a);
            case 12:
                return new wx();
            case 13:
                return new byi();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                kgu kguVar10 = this.c;
                return new ocq((ocq) kguVar10.c.a(), (wh) kguVar10.d.a(), (und) kguVar10.q.a());
            case 15:
                return new ocq((short[]) null, (byte[]) null, (byte[]) null);
            case 16:
                qrh qrhVar4 = (qrh) this.b.h.a();
                qrhVar4.getClass();
                return ung.j(((ugx) qrhVar4.c).plus(new unc("CXCP-Graph")));
            case 17:
                kgu kguVar11 = this.c;
                return new vn((ocq) kguVar11.j.a(), (vp) kguVar11.n.a(), (po) kguVar11.a.a(), (kk) kguVar11.i.a());
            default:
                kgu kguVar12 = this.c;
                return new kk((vp) kguVar12.n.a(), (und) kguVar12.q.a());
        }
    }
}
