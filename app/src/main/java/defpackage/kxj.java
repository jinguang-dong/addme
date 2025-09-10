package defpackage;

import com.google.android.apps.camera.optionsbar.view.OptionsEntryButtonImpl;
import com.google.ar.core.ImageMetadata;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kxj implements paq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kxj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, les] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object, mmg] */
    /* JADX WARN: Type inference failed for: r11v16, types: [imj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, kgd] */
    /* JADX WARN: Type inference failed for: r11v42, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, kgd] */
    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        switch (this.b) {
            case 0:
                this.a.a();
                break;
            case 1:
                ((OptionsEntryButtonImpl) this.a).setImportantForAccessibility(0);
                break;
            case 2:
                this.a.close();
                break;
            case 3:
                this.a.close();
                break;
            case 4:
                ((lit) this.a).i.a(false);
                break;
            case 5:
                lit litVar = (lit) this.a;
                if (!litVar.q.compareAndSet(true, false)) {
                    ((sgt) lit.c.c().M(4164)).s("Already unbound.");
                }
                litVar.e();
                litVar.v.close();
                break;
            case 6:
                ?? r11 = this.a;
                rwc rwcVar = ((lit) r11).n;
                if (rwcVar.h()) {
                    ((mlw) rwcVar.c()).g(r11);
                    break;
                }
                break;
            case 7:
                lit litVar2 = (lit) this.a;
                litVar2.r.setVisibility(8);
                ljd ljdVar = litVar2.g;
                ljdVar.c.a(false);
                ljdVar.a.a(false);
                litVar2.i.a(false);
                mwq mwqVar = litVar2.y;
                ((imi) mwqVar.b).f(mwqVar.a);
                break;
            case 8:
                ljj ljjVar = (ljj) this.a;
                ljjVar.j.setVisibility(8);
                ljjVar.k.setVisibility(8);
                ljjVar.m = false;
                break;
            case 9:
                ljj ljjVar2 = (ljj) this.a;
                if (!ljjVar2.i.compareAndSet(true, false)) {
                    ((sgt) ljj.c.c().M(4173)).s("Already unbound.");
                }
                ljjVar2.e();
                ljjVar2.n.close();
                break;
            case 10:
                lka lkaVar = (lka) this.a;
                if (!lkaVar.b.compareAndSet(true, false)) {
                    ((sgt) lka.a.c().M(4179)).s("Already unbound.");
                }
                lkaVar.i.close();
                break;
            case 11:
                ((lka) this.a).g.setVisibility(8);
                break;
            case 12:
                lkn lknVar = (lkn) this.a;
                lknVar.j.setVisibility(8);
                lknVar.m = false;
                lknVar.k.setVisibility(8);
                break;
            case 13:
                lkn lknVar2 = (lkn) this.a;
                if (!lknVar2.h.compareAndSet(true, false)) {
                    ((sgt) lkn.c.c().M(4183)).s("Already unbound.");
                }
                lknVar2.e();
                lknVar2.n.close();
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                mhe mheVar = (mhe) this.a;
                sbp sbpVarG = mheVar.C.g();
                mdy mdyVar = mheVar.G;
                mdyVar.k(sbpVarG);
                int i = mheVar.t;
                if (i > 0) {
                    tpc tpcVarM = sod.a.m();
                    long j = mdyVar.e;
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    tph tphVar = tpcVarM.b;
                    sod sodVar = (sod) tphVar;
                    sodVar.b |= 134217728;
                    sodVar.y = j;
                    if (!tphVar.C()) {
                        tpcVarM.o();
                    }
                    sod sodVar2 = (sod) tpcVarM.b;
                    sodVar2.d |= 131072;
                    sodVar2.as = i;
                    mdyVar.I(tpcVarM);
                }
                int i2 = mheVar.u;
                if (i2 > 0) {
                    tpc tpcVarM2 = sod.a.m();
                    long j2 = mdyVar.e;
                    if (!tpcVarM2.b.C()) {
                        tpcVarM2.o();
                    }
                    tph tphVar2 = tpcVarM2.b;
                    sod sodVar3 = (sod) tphVar2;
                    sodVar3.b = 134217728 | sodVar3.b;
                    sodVar3.y = j2;
                    if (!tphVar2.C()) {
                        tpcVarM2.o();
                    }
                    sod sodVar4 = (sod) tpcVarM2.b;
                    sodVar4.d |= ImageMetadata.LENS_APERTURE;
                    sodVar4.au = i2;
                    mdyVar.I(tpcVarM2);
                }
                mheVar.g();
                mheVar.h();
                mheVar.h.a = false;
                mheVar.b.a(mhg.INACTIVE);
                mheVar.D.close();
                hbj hbjVar = mheVar.H;
                if (((Integer) hbjVar.a(gzy.c).get()).intValue() == -1) {
                    if (hbjVar.p(gzy.o)) {
                        luj lujVar = mheVar.F;
                        lus lusVar = luf.aF;
                        if (((Integer) lujVar.b(lusVar)).intValue() == mhh.ON.d) {
                            mheVar.E.d(lusVar, Integer.valueOf(mhh.AUTO.d));
                        }
                    }
                    mheVar.a.a(mhh.a(((Boolean) mheVar.F.b(luf.r)).booleanValue()));
                }
                mheVar.f.a(Boolean.FALSE);
                mheVar.o = null;
                mheVar.p = null;
                mheVar.q = false;
                mheVar.r = false;
                mheVar.s = false;
                mheVar.w = false;
                mheVar.x = false;
                mheVar.y = false;
                mheVar.t = 0;
                mheVar.u = 0;
                mheVar.B = 0;
                break;
            case 15:
                Object obj = this.a;
                ((mis) obj).a.a(obj);
                break;
            case 16:
                ((mje) this.a).I = null;
                break;
            case 17:
                mje mjeVar = (mje) this.a;
                mjeVar.n.a(false);
                mjeVar.b.set(false);
                break;
            case 18:
                this.a.a(false);
                break;
            case 19:
                ((naw) this.a).b();
                break;
            default:
                mkr mkrVar = (mkr) this.a;
                mkrVar.e.B(mkrVar.J);
                break;
        }
    }
}
