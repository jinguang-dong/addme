package defpackage;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gkm implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;
    private final /* synthetic */ int g;

    public gkm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i) {
        this.g = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        pdv pdvVar;
        switch (this.g) {
            case 0:
                tzx tzxVar = this.c;
                tzx tzxVar2 = this.b;
                Context contextB = ((imm) this.a).b();
                pjo pjoVarA = ((ggi) tzxVar2).a();
                hbj hbjVar = (hbj) tzxVar.a();
                Executor executor = (Executor) this.d.a();
                pbn pbnVar = (pbn) this.e.a();
                our ourVar = (our) this.f.a();
                pbs pbsVar = new pbs(executor, pbnVar, "SmartCaptureFQS");
                rvk rvkVar = rvk.a;
                lol lolVarB = lol.b(contextB, hbjVar, pjoVarA, pbsVar, pbnVar, false, rvkVar, rvkVar, rvkVar, rvkVar, rvkVar, rvkVar);
                ourVar.d(lolVarB);
                return lolVarB;
            case 1:
                hbj hbjVar2 = (hbj) this.e.a();
                nkw nkwVarA = ((kid) this.a).a();
                pjo pjoVarA2 = ((kiv) this.f).a();
                jvc jvcVar = (jvc) this.d.a();
                owf owfVar = (owf) this.b.a();
                owf owfVar2 = (owf) this.c.a();
                CaptureRequest.Key key = (CaptureRequest.Key) jvcVar.a.orElse(null);
                owf owfVarCm = (hbjVar2.p(gzo.bq) && nkwVarA == nkw.COTTAGE && key != null && kzz.g(key, pjoVarA2)) ? qpt.cm(key, owl.h(owl.a(owfVar, owfVar2), new fhy(0))) : new owi(qpt.cl());
                owfVarCm.getClass();
                return owfVarCm;
            case 2:
                pnq pnqVar = (pnq) this.a.a();
                pnp pnpVar = (pnp) this.b.a();
                lwq lwqVar = (lwq) this.f.a();
                return new hbj(pnqVar, pnpVar, lwqVar, ((gzf) this.d).a(), ((hbi) this.c).a());
            case 3:
                return new htw((kfg) this.b.a(), (pdv) this.a.a(), (lat) this.f.a(), (pkc) this.d.a(), (hbj) this.c.a(), (owf) this.e.a());
            case 4:
                return new kcu((pau) this.f.a(), (hzs) this.c.a(), (fuf) this.d.a(), (ojl) this.b.a(), (our) this.a.a(), (owq) this.e.a());
            case 5:
                final ovx ovxVar = (ovx) this.d.a();
                final owf owfVar3 = (owf) this.b.a();
                final idt idtVar = (idt) this.c.a();
                tzx tzxVar3 = this.f;
                final nkw nkwVarA2 = ((kid) this.a).a();
                final our ourVar2 = (our) tzxVar3.a();
                int i = kok.a;
                return new fre() { // from class: koj
                    @Override // defpackage.fre
                    public final /* synthetic */ int a() {
                        return 0;
                    }

                    @Override // defpackage.fre
                    public final syu b() {
                        int i2 = kok.a;
                        ovx ovxVar2 = ovxVar;
                        paq paqVarDK = owfVar3.dK(new gcf(ovxVar2, idtVar, nkwVarA2, 11, null), sxo.a);
                        our ourVar3 = ourVar2;
                        ourVar3.d(paqVarDK);
                        ourVar3.d(new jkf(ovxVar2, 18));
                        return ske.M(true);
                    }

                    @Override // defpackage.fre
                    public final /* synthetic */ String c() {
                        return gsn.Z(this);
                    }
                };
            case 6:
                rwc rwcVar = (rwc) this.c.a();
                Map map = (Map) this.f.a();
                our ourVar3 = (our) this.d.a();
                lat latVarA = ((kzj) this.a).a();
                owf owfVar4 = (owf) this.b.a();
                int i2 = kok.a;
                if (rwcVar.h()) {
                    pdvVar = (pdv) rwcVar.c();
                } else {
                    pdvVar = (pdv) map.get(lcz.RAW_WIDE);
                    pdvVar.getClass();
                }
                kzi kziVarD = latVarA.d(pdvVar, -1, owl.h(owfVar4, new kve(lcy.WIDE, 13)));
                ourVar3.d(kziVarD);
                return kziVarD;
            case 7:
                return new kpx((hzs) this.d.a(), (Executor) this.b.a(), (owq) this.a.a(), ((hyb) this.c).a(), (pau) this.e.a(), ((kpo) this.f).a());
            case 8:
                return new kyh((hzs) this.c.a(), ((kiv) this.b).a(), ((kqr) this.f).a(), new hgc(), (pbn) this.e.a(), ((kxn) this.d).a(), (lat) this.a.a());
            default:
                ((jdg) this.b).b();
                pwt pwtVar = (pwt) this.f.a();
                ren renVar = (ren) this.a.a();
                Executor executor2 = (Executor) this.d.a();
                return new pzs(pwtVar, renVar, executor2);
        }
    }

    public gkm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, byte[] bArr) {
        this.g = i;
        this.e = tzxVar;
        this.a = tzxVar2;
        this.f = tzxVar3;
        this.d = tzxVar4;
        this.b = tzxVar5;
        this.c = tzxVar6;
    }

    public gkm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, char[] cArr) {
        this.g = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.f = tzxVar3;
        this.e = tzxVar4;
        this.d = tzxVar5;
        this.c = tzxVar6;
    }

    public gkm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, float[] fArr) {
        this.g = i;
        this.c = tzxVar;
        this.f = tzxVar2;
        this.e = tzxVar3;
        this.d = tzxVar4;
        this.a = tzxVar5;
        this.b = tzxVar6;
    }

    public gkm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, int[] iArr) {
        this.g = i;
        this.f = tzxVar;
        this.c = tzxVar2;
        this.d = tzxVar3;
        this.b = tzxVar4;
        this.a = tzxVar5;
        this.e = tzxVar6;
    }

    public gkm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, short[] sArr) {
        this.g = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.f = tzxVar3;
        this.d = tzxVar4;
        this.c = tzxVar5;
        this.e = tzxVar6;
    }

    public gkm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, boolean[] zArr) {
        this.g = i;
        this.d = tzxVar;
        this.b = tzxVar2;
        this.e = tzxVar3;
        this.c = tzxVar4;
        this.a = tzxVar5;
        this.f = tzxVar6;
    }

    public gkm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, byte[][] bArr) {
        this.g = i;
        this.d = tzxVar;
        this.b = tzxVar2;
        this.a = tzxVar3;
        this.c = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
    }

    public gkm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, char[][] cArr) {
        this.g = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.f = tzxVar3;
        this.e = tzxVar4;
        this.d = tzxVar5;
        this.a = tzxVar6;
    }

    public gkm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, short[][] sArr) {
        this.g = i;
        this.b = tzxVar;
        this.e = tzxVar2;
        this.f = tzxVar3;
        this.a = tzxVar4;
        this.d = tzxVar5;
        this.c = tzxVar6;
    }
}
