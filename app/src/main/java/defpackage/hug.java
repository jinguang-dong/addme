package defpackage;

import com.google.android.apps.camera.jni.serengeti.SerengetiNative;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedImageS16;
import com.google.googlex.gcam.InterleavedImageU16;
import com.google.googlex.gcam.InterleavedReadViewS16;
import com.google.googlex.gcam.ShotMetadata;
import j$.util.DesugarCollections;
import java.lang.ref.Reference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hug extends uht implements uiu {
    int a;
    final /* synthetic */ hui b;
    final /* synthetic */ iby c;
    final /* synthetic */ ShotMetadata d;
    final /* synthetic */ ShotMetadata e;
    final /* synthetic */ float[] f;
    final /* synthetic */ InterleavedImageU16 g;
    final /* synthetic */ ggg h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hug(hui huiVar, iby ibyVar, ggg gggVar, ShotMetadata shotMetadata, ShotMetadata shotMetadata2, float[] fArr, InterleavedImageU16 interleavedImageU16, uhb uhbVar) {
        super(2, uhbVar);
        this.b = huiVar;
        this.c = ibyVar;
        this.h = gggVar;
        this.d = shotMetadata;
        this.e = shotMetadata2;
        this.f = fArr;
        this.g = interleavedImageU16;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hug) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        Object objA;
        uhi uhiVar = uhi.a;
        int i = this.a;
        rnt.aN(obj);
        if (i != 0) {
            objA = obj;
        } else {
            hui huiVar = this.b;
            iby ibyVar = this.c;
            huiVar.d.f("ChromaDenoisedCallback#" + ibyVar.a());
            ibyVar.a();
            huiVar.q = huiVar.q + 1;
            InterleavedImageS16 interleavedImageS16 = (InterleavedImageS16) this.h.a;
            long j = new InterleavedReadViewS16(GcamModuleJNI.InterleavedImageS16_read_view(interleavedImageS16.a, interleavedImageS16)).a;
            ShotMetadata shotMetadata = this.d;
            ShotMetadata shotMetadata2 = this.e;
            float[] fArr = this.f;
            InterleavedImageU16 interleavedImageU16 = this.g;
            uev uevVarB = huiVar.b(fArr, hue.a);
            Iterable iterable = (Iterable) uevVarB.a;
            Iterable iterable2 = (Iterable) uevVarB.b;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            tpc tpcVarM = iof.a.m();
            tpcVarM.getClass();
            ezh.L(huiVar.f, tpcVarM);
            ezh.M(5, tpcVarM);
            tpc tpcVarM2 = ion.a.m();
            tpcVarM2.getClass();
            int iA = ibyVar.a();
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            tph tphVar = tpcVarM2.b;
            ((ion) tphVar).c = iA;
            if (!tphVar.C()) {
                tpcVarM2.o();
            }
            tph tphVar2 = tpcVarM2.b;
            ion ionVar = (ion) tphVar2;
            ionVar.b |= 1;
            ionVar.d = j;
            long jA = ShotMetadata.a(shotMetadata);
            if (!tphVar2.C()) {
                tpcVarM2.o();
            }
            ion ionVar2 = (ion) tpcVarM2.b;
            ionVar2.b |= 2;
            ionVar2.e = jA;
            DesugarCollections.unmodifiableList(ionVar2.f).getClass();
            iterable.getClass();
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            ion ionVar3 = (ion) tpcVarM2.b;
            tpm tpmVar = ionVar3.f;
            if (!tpmVar.c()) {
                ionVar3.f = tph.s(tpmVar);
            }
            tnq.e(iterable, ionVar3.f);
            DesugarCollections.unmodifiableList(((ion) tpcVarM2.b).g).getClass();
            iterable2.getClass();
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            ion ionVar4 = (ion) tpcVarM2.b;
            tpm tpmVar2 = ionVar4.g;
            if (!tpmVar2.c()) {
                ionVar4.g = tph.s(tpmVar2);
            }
            tnq.e(iterable2, ionVar4.g);
            tpc tpcVarM3 = ioe.a.m();
            tpcVarM3.getClass();
            DesugarCollections.unmodifiableList(((ioe) tpcVarM3.b).b).getClass();
            if (!tpcVarM3.b.C()) {
                tpcVarM3.o();
            }
            ioe ioeVar = (ioe) tpcVarM3.b;
            tpw tpwVar = ioeVar.b;
            if (!tpwVar.c()) {
                ioeVar.b = tph.v(tpwVar);
            }
            tnq.e(arrayList, ioeVar.b);
            DesugarCollections.unmodifiableList(((ioe) tpcVarM3.b).c).getClass();
            if (!tpcVarM3.b.C()) {
                tpcVarM3.o();
            }
            ioe ioeVar2 = (ioe) tpcVarM3.b;
            tpw tpwVar2 = ioeVar2.c;
            if (!tpwVar2.c()) {
                ioeVar2.c = tph.v(tpwVar2);
            }
            tnq.e(arrayList2, ioeVar2.c);
            tph tphVarL = tpcVarM3.l();
            tphVarL.getClass();
            ioe ioeVar3 = (ioe) tphVarL;
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            ion ionVar5 = (ion) tpcVarM2.b;
            ionVar5.h = ioeVar3;
            ionVar5.b |= 4;
            if (interleavedImageU16 != null) {
                long j2 = interleavedImageU16.b().a;
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                ((ion) tpcVarM2.b).j = j2;
            }
            long jA2 = ShotMetadata.a(shotMetadata2);
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            ion ionVar6 = (ion) tpcVarM2.b;
            ionVar6.b |= 8;
            ionVar6.i = jA2;
            tph tphVarL2 = tpcVarM2.l();
            tphVarL2.getClass();
            ion ionVar7 = (ion) tphVarL2;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            SerengetiNative serengetiNative = huiVar.t;
            iof iofVar = (iof) tpcVarM.b;
            iofVar.e = ionVar7;
            iofVar.b |= 1;
            iof iofVarK = ezh.K(tpcVarM);
            this.a = 1;
            objA = serengetiNative.a(iofVarK, this);
            if (objA == uhiVar) {
                return uhiVar;
            }
        }
        iom iomVar = (iom) objA;
        Reference.reachabilityFence(this.h);
        int iJ = ezh.J(iomVar.c);
        if (iJ != 0 && iJ == 3) {
            int i2 = iomVar.b;
            this.c.a();
        } else {
            ((sgt) hui.a.c().M(1591)).w("Failed to add linear image for sessionId=%d, shot_id = %d", iomVar.b, this.c.a());
        }
        hui huiVar2 = this.b;
        huiVar2.d.g();
        iby ibyVar2 = this.c;
        synchronized (huiVar2) {
            huiVar2.l.remove(new Integer(ibyVar2.a()));
            huiVar2.e();
        }
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        return new hug(this.b, this.c, this.h, this.d, this.e, this.f, this.g, uhbVar);
    }
}
