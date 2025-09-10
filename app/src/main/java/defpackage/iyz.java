package defpackage;

import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CameraAccessException;
import android.os.Parcelable;
import android.os.Trace;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class iyz implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ iyz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v42, types: [java.lang.Object, jhh] */
    /* JADX WARN: Type inference failed for: r8v48, types: [fre, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v49, types: [java.lang.Object, paq] */
    /* JADX WARN: Type inference failed for: r8v57, types: [java.lang.Object, jhh] */
    @Override // java.lang.Runnable
    public final void run() throws CameraAccessException {
        fqb hcnVar;
        boolean z = false;
        switch (this.b) {
            case 0:
                int i = izb.a;
                Trace.beginSection("retrievePhenotypeFlags");
                kua.a(((iza) this.a).a);
                Trace.endSection();
                return;
            case 1:
                iyu iyuVar = (iyu) this.a;
                if (iyuVar.s || iyuVar.t) {
                    return;
                }
                mac macVar = (mac) iyuVar.m.c();
                Parcelable parcelable = iyuVar.v;
                fqd fqdVar = (fqd) iyuVar.w;
                fqc fqcVar = (fqc) parcelable;
                if (fqd.b.equals(fqdVar)) {
                    hcl hclVar = macVar.e;
                    Context context = hclVar.a;
                    hcnVar = new hck(hclVar.b, fqcVar, hclVar.d, ltg.MEDIA_STORE);
                } else if (!fqd.VIDEO.equals(fqdVar)) {
                    ((sgt) mac.a.c().M(4560)).E("%sopen: failed to open due to invalid type, type= %s", macVar.h, fqdVar);
                    return;
                } else {
                    pmv pmvVar = macVar.l;
                    Object obj = pmvVar.a;
                    hcnVar = new hcn((hcb) pmvVar.c, fqcVar, ltg.MEDIA_STORE);
                }
                fqb fqbVarE = macVar.j.m(hcnVar).e(hcnVar);
                fqc fqcVarA = fqbVarE.a();
                if (fqcVarA.k() && fqcVarA.i().isEmpty()) {
                    boolean zEquals = fqcVarA.i().equals(fqcVar.i());
                    if (fqcVarA.e().equals(fqcVar.e()) && zEquals) {
                        ((sgt) mac.a.c().M(4561)).E("%sopen: failed to open due to item data broken, data= %s", macVar.h, fqbVarE.a());
                        return;
                    }
                }
                if (macVar.d) {
                    lqc lqcVar = macVar.k;
                    fqc fqcVarA2 = fqbVarE.a();
                    fqd fqdVarB = fqbVarE.b();
                    Intent intent = new Intent(lqcVar.a, (Class<?>) lqcVar.c);
                    intent.putExtra("open_socialshare", true);
                    intent.putExtra("filmstrip_item_data", fqcVarA2);
                    intent.putExtra("filmstrip_item_type", fqdVarB);
                    lqcVar.b(intent, false);
                    return;
                }
                if (macVar.c.g(fqbVarE) != 1) {
                    ((mau) macVar.b.a()).j();
                    return;
                }
                ((sgt) mac.a.c().M(4555)).E("%sopen: ready to open share page. filmstripItem= %s", macVar.h, fqbVarE);
                fqc fqcVarA3 = fqbVarE.a();
                ltd ltdVarD = fqcVarA3.d();
                lss lssVarA = ltdVarD != null ? macVar.i.a(ltdVarD) : null;
                if (lssVarA != null && lssVarA.a().e >= 100) {
                    z = true;
                }
                boolean zK = fqcVarA3.k();
                if (lssVarA != null) {
                    lssVarA.a();
                }
                if (!zK || z) {
                    ((mau) macVar.b.a()).f(fqbVarE);
                    return;
                } else {
                    ((mau) macVar.b.a()).h(fqbVarE);
                    return;
                }
            case 2:
                int i2 = izb.a;
                ((iza) this.a).a();
                return;
            case 3:
                int i3 = izb.a;
                Trace.beginSection("prewarmSensorService");
                ((iza) this.a).a.getSystemService("sensor");
                Trace.endSection();
                return;
            case 4:
                jbc jbcVar = (jbc) this.a;
                pbn pbnVar = jbcVar.d;
                pbnVar.f("resume#startHotshot");
                jbcVar.y.m();
                pbnVar.g();
                return;
            case 5:
                ((fqf) this.a).eB();
                return;
            case 6:
                Object obj2 = this.a;
                gnt gntVar = ((jbc) obj2).i;
                gntVar.h(new imf(obj2, gntVar.a(), 14));
                return;
            case 7:
                ((jbc) this.a).k(true);
                return;
            case 8:
                ((fqf) this.a).n();
                return;
            case 9:
                jbc jbcVar2 = (jbc) this.a;
                pbn pbnVar2 = jbcVar2.d;
                pbnVar2.f("changeCamera#startHotshot");
                jbcVar2.y.m();
                pbnVar2.g();
                return;
            case 10:
                Object obj3 = this.a;
                jjn jjnVar = (jjn) obj3;
                jjnVar.m.d(owb.a(jjnVar.f).dK(new jaq(obj3, 17), jjnVar.c));
                return;
            case 11:
                ?? r8 = this.a;
                ((jjn) r8).i.k(r8);
                return;
            case 12:
                sgv sgvVar = jjn.a;
                ((jju) this.a).e.d();
                return;
            case 13:
                ((jjn) this.a).y();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                this.a.b();
                return;
            case 15:
                this.a.close();
                return;
            case 16:
                owm owmVar = ((knd) this.a).d;
                rnt.x(owmVar);
                owmVar.a();
                return;
            case 17:
                Object obj4 = this.a;
                synchronized (((pnk) obj4).c) {
                    ((pnk) obj4).h++;
                    ((pnk) obj4).d.enable();
                }
                return;
            case 18:
                ?? r82 = this.a;
                final kud kudVar = (kud) r82;
                kua.a(kudVar.a);
                kudVar.c.a(new fqk() { // from class: kuc
                    @Override // defpackage.fqk
                    public final void a(Throwable th) {
                        kudVar.a();
                    }
                });
                ins.f(kudVar.d, kudVar.b, r82);
                return;
            case 19:
                if (kub.a.compareAndSet(false, true)) {
                    kub kubVar = (kub) this.a;
                    pbn pbnVar3 = kubVar.b;
                    pbnVar3.f("ProcessStable#Access");
                    kubVar.c.p(gzo.bI);
                    pbnVar3.g();
                    return;
                }
                return;
            default:
                kvl kvlVar = (kvl) this.a;
                kvlVar.a.c(kvlVar.c);
                szh szhVar = kvlVar.b;
                if (szhVar != null) {
                    szhVar.e(null);
                    return;
                }
                return;
        }
    }

    public iyz(kvl kvlVar, int i) {
        this.b = i;
        this.a = kvlVar;
    }
}
