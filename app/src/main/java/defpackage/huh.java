package defpackage;

import com.google.android.apps.camera.jni.serengeti.SerengetiNative;
import com.google.googlex.gcam.InterleavedImageU8;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class huh extends uht implements uiu {
    int a;
    final /* synthetic */ hui b;
    final /* synthetic */ pas c;
    final /* synthetic */ iog d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public huh(hui huiVar, pas pasVar, iog iogVar, uhb uhbVar) {
        super(2, uhbVar);
        this.b = huiVar;
        this.c = pasVar;
        this.d = iogVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((huh) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) throws hss {
        uhi uhiVar = uhi.a;
        int i = this.a;
        rnt.aN(obj);
        if (i == 0) {
            hui huiVar = this.b;
            File file = new File(huiVar.n, "debug");
            if (!file.exists()) {
                file.mkdirs();
            }
            gzi gziVar = gzp.a;
            SerengetiNative serengetiNative = huiVar.t;
            pas pasVar = this.c;
            iog iogVar = this.d;
            tpc tpcVarM = iof.a.m();
            tpcVarM.getClass();
            ezh.L(huiVar.f, tpcVarM);
            ezh.M(4, tpcVarM);
            tpc tpcVarM2 = ioi.a.m();
            tpcVarM2.getClass();
            int i2 = huiVar.h.a(true).h;
            if (i2 == 0) {
                throw null;
            }
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            ((ioi) tpcVarM2.b).c = a.as(i2);
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            ((ioi) tpcVarM2.b).d = false;
            String path = file.getPath();
            path.getClass();
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            tph tphVar = tpcVarM2.b;
            ((ioi) tphVar).e = path;
            int i3 = pasVar.a;
            if (!tphVar.C()) {
                tpcVarM2.o();
            }
            tph tphVar2 = tpcVarM2.b;
            ((ioi) tphVar2).f = i3;
            int i4 = pasVar.b;
            if (!tphVar2.C()) {
                tpcVarM2.o();
            }
            ((ioi) tpcVarM2.b).g = i4;
            hbj hbjVar = huiVar.w;
            boolean zP = hbjVar.p(gzp.m);
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            ((ioi) tpcVarM2.b).i = zP;
            Object objB = huiVar.u.b(luf.aU);
            objB.getClass();
            boolean zBooleanValue = ((Boolean) objB).booleanValue();
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            ((ioi) tpcVarM2.b).j = zBooleanValue;
            float fFloatValue = ((Number) hbjVar.e(gzp.n).get()).floatValue();
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            tph tphVar3 = tpcVarM2.b;
            ((ioi) tphVar3).k = fFloatValue;
            iogVar.getClass();
            if (!tphVar3.C()) {
                tpcVarM2.o();
            }
            ioi ioiVar = (ioi) tpcVarM2.b;
            ioiVar.l = iogVar;
            ioiVar.b |= 2;
            hux huxVar = huiVar.g;
            tpc tpcVarM3 = iol.a.m();
            tpcVarM3.getClass();
            long jE = InterleavedImageU8.e(huxVar.d);
            if (!tpcVarM3.b.C()) {
                tpcVarM3.o();
            }
            tph tphVar4 = tpcVarM3.b;
            ((iol) tphVar4).b = jE;
            pas pasVar2 = huxVar.a;
            if (!tphVar4.C()) {
                tpcVarM3.o();
            }
            int i5 = pasVar2.a;
            tph tphVar5 = tpcVarM3.b;
            ((iol) tphVar5).c = i5;
            if (!tphVar5.C()) {
                tpcVarM3.o();
            }
            int i6 = pasVar2.b;
            tph tphVar6 = tpcVarM3.b;
            ((iol) tphVar6).d = i6;
            pas pasVar3 = huxVar.b;
            if (!tphVar6.C()) {
                tpcVarM3.o();
            }
            int i7 = pasVar3.a;
            tph tphVar7 = tpcVarM3.b;
            ((iol) tphVar7).e = i7;
            if (!tphVar7.C()) {
                tpcVarM3.o();
            }
            int i8 = pasVar3.b;
            tph tphVar8 = tpcVarM3.b;
            ((iol) tphVar8).f = i8;
            float f = huxVar.c;
            if (!tphVar8.C()) {
                tpcVarM3.o();
            }
            ((iol) tpcVarM3.b).g = f;
            tph tphVarL = tpcVarM3.l();
            tphVarL.getClass();
            iol iolVar = (iol) tphVarL;
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            tph tphVar9 = tpcVarM2.b;
            ioi ioiVar2 = (ioi) tphVar9;
            ioiVar2.h = iolVar;
            ioiVar2.b |= 1;
            if (!tphVar9.C()) {
                tpcVarM2.o();
            }
            tph tphVar10 = tpcVarM2.b;
            ((ioi) tphVar10).m = false;
            if (!tphVar10.C()) {
                tpcVarM2.o();
            }
            tph tphVar11 = tpcVarM2.b;
            ((ioi) tphVar11).n = f;
            float f2 = huiVar.j;
            if (!tphVar11.C()) {
                tpcVarM2.o();
            }
            ioi ioiVar3 = (ioi) tpcVarM2.b;
            ioiVar3.o = f2;
            DesugarCollections.unmodifiableList(ioiVar3.p).getClass();
            List list = huiVar.r;
            ArrayList arrayList = new ArrayList(ske.bq(list, 10));
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw null;
            }
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            ioi ioiVar4 = (ioi) tpcVarM2.b;
            tpn tpnVar = ioiVar4.p;
            if (!tpnVar.c()) {
                ioiVar4.p = tph.t(tpnVar);
            }
            tnq.e(arrayList, ioiVar4.p);
            tph tphVarL2 = tpcVarM2.l();
            tphVarL2.getClass();
            ioi ioiVar5 = (ioi) tphVarL2;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            iof iofVar = (iof) tpcVarM.b;
            iofVar.f = ioiVar5;
            iofVar.b |= 2;
            iof iofVarK = ezh.K(tpcVarM);
            this.a = 1;
            obj = serengetiNative.a(iofVarK, this);
            if (obj == uhiVar) {
                return uhiVar;
            }
        }
        iom iomVar = (iom) obj;
        int iJ = ezh.J(iomVar.c);
        if (iJ != 0 && iJ == 3) {
            return Boolean.valueOf(this.b.o.w());
        }
        this.b.c();
        int i9 = iomVar.b;
        int iJ2 = ezh.J(iomVar.c);
        throw new hss("Failed to start panorama sessionId=" + i9 + " status=" + ((Object) Integer.toString((iJ2 != 0 ? iJ2 : 1) - 2)));
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        return new huh(this.b, this.c, this.d, uhbVar);
    }
}
