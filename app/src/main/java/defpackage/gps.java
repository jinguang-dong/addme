package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gps {
    public static final long a = TimeUnit.SECONDS.toMicros(120);
    public static final String[] b = {"BarhopperV2", "DocumentCornerFixedInputShapeClient", "MobileIcaV2ClassifierEmbedder"};
    private static final long e = TimeUnit.SECONDS.toMicros(1) / 24;
    private static final long f = TimeUnit.SECONDS.toMicros(1) / 12;
    public final Context c;
    public final hbj d;
    private final List g = new ArrayList();
    private final cxb h;

    public gps(hbj hbjVar, cxb cxbVar, Context context) {
        this.d = hbjVar;
        this.c = context;
        this.h = cxbVar;
    }

    private final sbp i() {
        long micros = TimeUnit.SECONDS.toMicros(1L) / ((Integer) this.d.a(gzw.a).get()).intValue();
        rgo rgoVar = rgo.a;
        tpc tpcVarM = rgoVar.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        rgo.b((rgo) tpcVarM.b);
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        rgo rgoVar2 = (rgo) tphVar;
        rgoVar2.b |= 8;
        rgoVar2.e = micros;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        rgo rgoVar3 = (rgo) tpcVarM.b;
        rgoVar3.b |= 4;
        rgoVar3.d = micros;
        long micros2 = TimeUnit.SECONDS.toMicros(15L);
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        rgo rgoVar4 = (rgo) tpcVarM.b;
        rgoVar4.b |= 2;
        rgoVar4.c = micros2;
        rgo rgoVar5 = (rgo) tpcVarM.l();
        tpc tpcVarM2 = rgoVar.m();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        rgo.b((rgo) tpcVarM2.b);
        long micros3 = TimeUnit.MILLISECONDS.toMicros(1000L);
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        rgo rgoVar6 = (rgo) tpcVarM2.b;
        rgoVar6.b |= 8;
        rgoVar6.e = micros3;
        long micros4 = TimeUnit.MILLISECONDS.toMicros(1000L);
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        rgo rgoVar7 = (rgo) tpcVarM2.b;
        rgoVar7.b |= 4;
        rgoVar7.d = micros4;
        long micros5 = TimeUnit.SECONDS.toMicros(15L);
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        rgo rgoVar8 = (rgo) tpcVarM2.b;
        rgoVar8.b |= 2;
        rgoVar8.c = micros5;
        rgo rgoVar9 = (rgo) tpcVarM2.l();
        tpc tpcVarM3 = rgoVar.m();
        if (!tpcVarM3.b.C()) {
            tpcVarM3.o();
        }
        rgo.b((rgo) tpcVarM3.b);
        long micros6 = TimeUnit.MILLISECONDS.toMicros(1500L);
        if (!tpcVarM3.b.C()) {
            tpcVarM3.o();
        }
        rgo rgoVar10 = (rgo) tpcVarM3.b;
        rgoVar10.b |= 8;
        rgoVar10.e = micros6;
        long micros7 = TimeUnit.MILLISECONDS.toMicros(1500L);
        if (!tpcVarM3.b.C()) {
            tpcVarM3.o();
        }
        rgo rgoVar11 = (rgo) tpcVarM3.b;
        rgoVar11.b |= 4;
        rgoVar11.d = micros7;
        return sbp.n(rgoVar5, rgoVar9, (rgo) tpcVarM3.l());
    }

    private static final rhb j() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("CoarseClassifierTexto128V2_3");
        arrayList.add("BarcodeReader");
        tpc tpcVarM = rhb.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        rhb rhbVar = (rhb) tphVar;
        rhbVar.b |= 2;
        rhbVar.e = true;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        rhb rhbVar2 = (rhb) tpcVarM.b;
        rhbVar2.b |= 1;
        rhbVar2.c = "EarlyPipeline";
        tpcVarM.M(arrayList);
        return (rhb) tpcVarM.l();
    }

    private static final tpc k() {
        tpc tpcVarM = rhc.a.m();
        tpcVarM.L(j());
        tpc tpcVarM2 = rhb.a.m();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tph tphVar = tpcVarM2.b;
        rhb rhbVar = (rhb) tphVar;
        rhbVar.b |= 2;
        rhbVar.e = false;
        if (!tphVar.C()) {
            tpcVarM2.o();
        }
        rhb rhbVar2 = (rhb) tpcVarM2.b;
        rhbVar2.b |= 1;
        rhbVar2.c = "LazyPipeline";
        tpcVarM.L((rhb) tpcVarM2.l());
        return tpcVarM;
    }

    public final synchronized AssetFileDescriptor a(String str) {
        AssetFileDescriptor assetFileDescriptorOpenFd;
        assetFileDescriptorOpenFd = ((Context) this.h.a).getAssets().openFd(str);
        this.g.add(assetFileDescriptorOpenFd);
        return assetFileDescriptorOpenFd;
    }

    public final synchronized void b() {
        List list = this.g;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AssetFileDescriptor) it.next()).close();
        }
        list.clear();
    }

    public final boolean c() {
        hbj hbjVar = this.d;
        return hbjVar.p(gzw.d) && hbjVar.p(gzw.c);
    }

    public final rgy d(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            tpc tpcVarM = rgy.a.m();
            tpc tpcVarM2 = rgn.a.m();
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            rgn.b((rgn) tpcVarM2.b);
            tpcVarM2.K("CoarseClassifierTexto128V2_3");
            tpcVarM2.K("BarcodeReader");
            long j = a;
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            rgn rgnVar = (rgn) tpcVarM2.b;
            rgnVar.b |= 2;
            rgnVar.e = j;
            rgo rgoVar = rgo.a;
            tpc tpcVarM3 = rgoVar.m();
            if (!tpcVarM3.b.C()) {
                tpcVarM3.o();
            }
            rgo.b((rgo) tpcVarM3.b);
            long j2 = e;
            if (!tpcVarM3.b.C()) {
                tpcVarM3.o();
            }
            tph tphVar = tpcVarM3.b;
            rgo rgoVar2 = (rgo) tphVar;
            rgoVar2.b |= 8;
            rgoVar2.e = j2;
            if (!tphVar.C()) {
                tpcVarM3.o();
            }
            rgo rgoVar3 = (rgo) tpcVarM3.b;
            rgoVar3.b |= 4;
            rgoVar3.d = j2;
            long micros = TimeUnit.SECONDS.toMicros(10L);
            if (!tpcVarM3.b.C()) {
                tpcVarM3.o();
            }
            rgo rgoVar4 = (rgo) tpcVarM3.b;
            rgoVar4.b |= 2;
            rgoVar4.c = micros;
            rgo rgoVar5 = (rgo) tpcVarM3.l();
            tpc tpcVarM4 = rgoVar.m();
            if (!tpcVarM4.b.C()) {
                tpcVarM4.o();
            }
            rgo.b((rgo) tpcVarM4.b);
            long j3 = f;
            if (!tpcVarM4.b.C()) {
                tpcVarM4.o();
            }
            tph tphVar2 = tpcVarM4.b;
            rgo rgoVar6 = (rgo) tphVar2;
            rgoVar6.b |= 8;
            rgoVar6.e = j3;
            if (!tphVar2.C()) {
                tpcVarM4.o();
            }
            rgo rgoVar7 = (rgo) tpcVarM4.b;
            rgoVar7.b |= 4;
            rgoVar7.d = j3;
            tpcVarM2.J(sbp.m(rgoVar5, (rgo) tpcVarM4.l()));
            tpc tpcVarM5 = rgp.a.m();
            tpcVarM5.aF(tpcVarM2);
            rgp rgpVar = (rgp) tpcVarM5.l();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            rgy rgyVar = (rgy) tpcVarM.b;
            rgpVar.getClass();
            rgyVar.c = rgpVar;
            rgyVar.b |= 2;
            tpc tpcVarK = k();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            rgy rgyVar2 = (rgy) tpcVarM.b;
            rhc rhcVar = (rhc) tpcVarK.l();
            rhcVar.getClass();
            rgyVar2.d = rhcVar;
            rgyVar2.b |= 8;
            return (rgy) tpcVarM.l();
        }
        if (i2 == 2) {
            tpc tpcVarM6 = rgy.a.m();
            tpc tpcVarM7 = rgn.a.m();
            if (!tpcVarM7.b.C()) {
                tpcVarM7.o();
            }
            rgn.b((rgn) tpcVarM7.b);
            tpcVarM7.K("CoarseClassifierTexto128V2_3");
            tpcVarM7.K("BarcodeReader");
            long j4 = a;
            if (!tpcVarM7.b.C()) {
                tpcVarM7.o();
            }
            rgn rgnVar2 = (rgn) tpcVarM7.b;
            rgnVar2.b |= 2;
            rgnVar2.e = j4;
            tpcVarM7.J(i());
            tpc tpcVarM8 = rgp.a.m();
            tpcVarM8.aF(tpcVarM7);
            rgp rgpVar2 = (rgp) tpcVarM8.l();
            if (!tpcVarM6.b.C()) {
                tpcVarM6.o();
            }
            rgy rgyVar3 = (rgy) tpcVarM6.b;
            rgpVar2.getClass();
            rgyVar3.c = rgpVar2;
            rgyVar3.b |= 2;
            tpc tpcVarK2 = k();
            if (!tpcVarM6.b.C()) {
                tpcVarM6.o();
            }
            rgy rgyVar4 = (rgy) tpcVarM6.b;
            rhc rhcVar2 = (rhc) tpcVarK2.l();
            rhcVar2.getClass();
            rgyVar4.d = rhcVar2;
            rgyVar4.b |= 8;
            return (rgy) tpcVarM6.l();
        }
        tpc tpcVarM9 = rgy.a.m();
        tpc tpcVarM10 = rgn.a.m();
        if (!tpcVarM10.b.C()) {
            tpcVarM10.o();
        }
        rgn.b((rgn) tpcVarM10.b);
        tpcVarM10.K("CoarseClassifierTexto128V2_3");
        tpcVarM10.K("BarcodeReader");
        tpcVarM10.K("DocumentClassifier");
        long j5 = a;
        if (!tpcVarM10.b.C()) {
            tpcVarM10.o();
        }
        rgn rgnVar3 = (rgn) tpcVarM10.b;
        rgnVar3.b |= 2;
        rgnVar3.e = j5;
        tpcVarM10.J(i());
        tpc tpcVarM11 = rgp.a.m();
        tpcVarM11.aF(tpcVarM10);
        rgp rgpVar3 = (rgp) tpcVarM11.l();
        if (!tpcVarM9.b.C()) {
            tpcVarM9.o();
        }
        rgy rgyVar5 = (rgy) tpcVarM9.b;
        rgpVar3.getClass();
        rgyVar5.c = rgpVar3;
        rgyVar5.b |= 2;
        tpc tpcVarM12 = rhc.a.m();
        tpcVarM12.L(j());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DocumentClassifier");
        arrayList.add("DocumentCornerFixedInputShapeClient");
        tpc tpcVarM13 = rhb.a.m();
        tpcVarM13.M(arrayList);
        if (!tpcVarM13.b.C()) {
            tpcVarM13.o();
        }
        tph tphVar3 = tpcVarM13.b;
        rhb rhbVar = (rhb) tphVar3;
        rhbVar.b = 2 | rhbVar.b;
        rhbVar.e = false;
        if (!tphVar3.C()) {
            tpcVarM13.o();
        }
        rhb rhbVar2 = (rhb) tpcVarM13.b;
        rhbVar2.b |= 1;
        rhbVar2.c = "LazyPipeline";
        tpcVarM12.L((rhb) tpcVarM13.l());
        if (!tpcVarM9.b.C()) {
            tpcVarM9.o();
        }
        rgy rgyVar6 = (rgy) tpcVarM9.b;
        rhc rhcVar3 = (rhc) tpcVarM12.l();
        rhcVar3.getClass();
        rgyVar6.d = rhcVar3;
        rgyVar6.b |= 8;
        return (rgy) tpcVarM9.l();
    }

    public final rgu e(tpe tpeVar) {
        tpc tpcVarM = rgu.a.m();
        gzi gziVar = gzw.a;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        rgu rguVar = (rgu) tphVar;
        rguVar.b |= 2;
        rguVar.f = false;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        rgu rguVar2 = (rgu) tpcVarM.b;
        rgx rgxVar = (rgx) tpeVar.l();
        rgxVar.getClass();
        rguVar2.e = rgxVar;
        rguVar2.b |= 1;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        rgu rguVar3 = (rgu) tpcVarM.b;
        rguVar3.c = 6;
        rguVar3.d = true;
        return (rgu) tpcVarM.l();
    }

    public final tpe f() {
        tpe tpeVar = (tpe) rgx.a.m();
        if (!tpeVar.b.C()) {
            tpeVar.o();
        }
        rgx rgxVar = (rgx) tpeVar.b;
        rgxVar.b |= 1024;
        rgxVar.g = true;
        gzi gziVar = gzw.a;
        return tpeVar;
    }

    public final void g(tpe tpeVar) {
        tpc tpcVarM = rhf.a.m();
        tpcVarM.N(8);
        tpcVarM.N(7);
        tpcVarM.N(10);
        tpcVarM.N(11);
        tpcVarM.N(12);
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        rhf rhfVar = (rhf) tpcVarM.b;
        rhfVar.d = 2;
        rhfVar.b |= 4;
        rhf rhfVar2 = (rhf) tpcVarM.l();
        if (!tpeVar.b.C()) {
            tpeVar.o();
        }
        rgx rgxVar = (rgx) tpeVar.b;
        rgx rgxVar2 = rgx.a;
        rhfVar2.getClass();
        rgxVar.e = rhfVar2;
        rgxVar.b |= 2;
    }

    public final void h(tpe tpeVar) {
        hbj hbjVar = this.d;
        boolean zP = hbjVar.p(gzw.f);
        float fFloatValue = ((Float) hbjVar.e(gzw.g).get()).floatValue();
        int iIntValue = ((Integer) hbjVar.a(gzw.a).get()).intValue();
        tpc tpcVarM = rgl.a.m();
        if (zP) {
            float f2 = iIntValue * fFloatValue;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            tph tphVar = tpcVarM.b;
            rgl rglVar = (rgl) tphVar;
            rglVar.b |= 1;
            rglVar.c = (int) f2;
            if (!tphVar.C()) {
                tpcVarM.o();
            }
            rgl rglVar2 = (rgl) tpcVarM.b;
            tpw tpwVar = rglVar2.d;
            if (!tpwVar.c()) {
                rglVar2.d = tph.v(tpwVar);
            }
            rglVar2.d.add("barcode");
        }
        rgl rglVar3 = (rgl) tpcVarM.l();
        if (!tpeVar.b.C()) {
            tpeVar.o();
        }
        rgx rgxVar = (rgx) tpeVar.b;
        rgx rgxVar2 = rgx.a;
        rglVar3.getClass();
        rgxVar.d = rglVar3;
        rgxVar.b |= 1;
    }
}
