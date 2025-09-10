package defpackage;

import android.app.Activity;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.DisplayMetrics;
import com.google.android.apps.camera.stats.Instrumentation;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgo implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final /* synthetic */ int d;
    private final Object e;

    public mgo(pfl pflVar, tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i) {
        this.d = i;
        this.e = pflVar;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.b = tzxVar3;
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v56, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r9v56, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r9v67, types: [java.lang.Object, tzx] */
    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        Object owiVar;
        switch (this.d) {
            case 0:
                return new mgp((mfs) this.e.a(), (Executor) this.a.a(), (pbn) this.b.a(), (hbj) this.c.a());
            case 1:
                return new med((mdz) this.a.a(), (Instrumentation) this.c.a(), (pql) this.e.a(), (pbn) this.b.a());
            case 2:
                mgt mgtVar = (mgt) this.a.a();
                tzx tzxVar = this.b;
                pjo pjoVarA = ((kiv) this.e).a();
                lkk lkkVar = (lkk) tzxVar.a();
                hbj hbjVar = (hbj) this.c.a();
                sgv sgvVar = mhf.a;
                Object sfmVar = (hbjVar.p(gzy.j) && pjoVarA.l() == pka.BACK && lkkVar.equals(lkk.AUTO)) ? new sfm(mgtVar) : sfd.a;
                sfmVar.getClass();
                return sfmVar;
            case 3:
                owf owfVar = (owf) this.b.a();
                lkk lkkVar2 = (lkk) this.a.a();
                jwh jwhVar = (jwh) this.c.a();
                hbj hbjVar2 = (hbj) this.e.a();
                sgv sgvVar2 = mhf.a;
                if (hbjVar2.p(gzy.j)) {
                    Optional optional = jwhVar.a;
                    if (optional.isEmpty()) {
                        ((sgt) mhf.a.b().M(4765)).s("Camera framework flag for Macro Focus was not found.");
                        owiVar = new owi(qpt.cl());
                    } else {
                        owiVar = !lkkVar2.equals(lkk.AUTO) ? new owi(qpt.ci((CaptureRequest.Key) optional.get(), mhf.b)) : qpt.cm((CaptureRequest.Key) optional.get(), owl.h(owfVar, new leb(17)));
                    }
                } else {
                    Optional optional2 = jwhVar.a;
                    owiVar = optional2.isPresent() ? new owi(qpt.ci((CaptureRequest.Key) optional2.get(), mhf.b)) : new owi(qpt.cl());
                }
                owiVar.getClass();
                return owiVar;
            case 4:
                return new mli((mni) this.e.a(), ((imm) this.a).b(), (DisplayMetrics) this.b.a(), (pnq) this.c.a());
            case 5:
                return new mnm((mni) this.e.a(), (luj) this.b.a(), ((imm) this.a).b(), (hbj) this.c.a());
            case 6:
                return new mof(((imm) this.e).b(), (luj) this.c.a(), (luj) this.b.a(), (Executor) this.a.a());
            case 7:
                return new mtm((syj) this.c.a(), (owq) this.b.a(), (mwq) this.a.a(), ((mmm) this.e).a());
            case 8:
                final luj lujVar = (luj) this.b.a();
                final hbj hbjVar3 = (hbj) this.a.a();
                final nkw nkwVarA = ((nkv) this.e).a();
                final tzx tzxVar2 = this.c;
                return new nkm() { // from class: myf
                    @Override // defpackage.nkm
                    public final void a() {
                        nkw nkwVar;
                        lujVar.d(luf.aN, false);
                        if (!hbjVar3.p(gzo.bn) || (nkwVar = nkwVarA) == nkw.IMAGE_INTENT || nkwVar == nkw.VIDEO_INTENT) {
                            return;
                        }
                        myi myiVar = (myi) tzxVar2.a();
                        myiVar.i = myl.a(myiVar.c, myiVar.a);
                        ojl.ck(myiVar.i, new iyn(myiVar, 8), myiVar.f);
                    }
                };
            case 9:
                tzx tzxVar3 = this.c;
                return new ngb(((imn) this.e).a(), ((ngl) this.a).a(), ((tzz) this.b).a(), (out) tzxVar3.a());
            case 10:
                return new njn((gtm) this.a.a(), (imi) this.b.a(), (uem) this.e, (hbj) this.c.a(), 1);
            case 11:
                return new njn((mtm) this.b.a(), this.a, ((imm) this.c).b(), ((ixw) this.e).a(), 0);
            case 12:
                return new njn((mua) this.a.a(), (mua) this.b.a(), (uem) this.e, (hbj) this.c.a(), 2);
            case 13:
                return new njn(((ixv) this.e).a(), this.c, this.a, this.b, 3);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new njn(this.a, ((ixw) this.e).a(), (luj) this.b.a(), (out) this.c.a(), 4);
            case 15:
                tzx tzxVar4 = this.c;
                Object obj = this.e;
                Activity activityA = ((imn) this.a).a();
                return new nmm(activityA, ((ixv) obj).a(), (tdy) qsy.l(activityA).f.a(), (Executor) tzxVar4.a(), (out) this.b.a());
            case 16:
                Set setA = ((tzz) this.a).a();
                Handler handler = (Handler) this.c.a();
                pbn pbnVar = (pbn) this.b.a();
                HashSet hashSet = new HashSet(setA);
                hashSet.add(((pdt) ((pfl) this.e).a).o);
                return new pew(pdr.b(hashSet, pbnVar, "FSGlobalFrameListener"), new pbs(new oup(handler), pbnVar, "FrameListeners"));
            case 17:
                return new pfq((qqq) this.a.a(), ((pfm) this.e).b(), (pgq) this.b.a(), ((pba) this.c).a());
            case 18:
                tzx tzxVar5 = this.a;
                tzx tzxVar6 = this.c;
                Object objA = this.b.a();
                pjp pjpVarA = ((pab) tzxVar6).a();
                return new pfw((pfx) objA, pjpVarA);
            case 19:
                our ourVar = (our) this.b.a();
                tzx tzxVar7 = this.c;
                pbc pbcVarA = ((pba) this.a).a();
                ((pfn) this.e).a();
                return new pgk(ourVar, pbcVarA);
            default:
                tzx tzxVar8 = this.c;
                return new pmv(this.a, (uem) this.e, this.b, tzxVar8);
        }
    }

    public mgo(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i) {
        this.d = i;
        this.a = tzxVar;
        this.e = tzxVar2;
        this.b = tzxVar3;
        this.c = tzxVar4;
    }

    public mgo(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, byte[] bArr) {
        this.d = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.e = tzxVar3;
        this.b = tzxVar4;
    }

    public mgo(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, float[] fArr) {
        this.d = i;
        this.e = tzxVar;
        this.c = tzxVar2;
        this.b = tzxVar3;
        this.a = tzxVar4;
    }

    public mgo(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, int[] iArr) {
        this.d = i;
        this.e = tzxVar;
        this.a = tzxVar2;
        this.b = tzxVar3;
        this.c = tzxVar4;
    }

    public mgo(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, short[] sArr) {
        this.d = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.c = tzxVar3;
        this.e = tzxVar4;
    }

    public mgo(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, boolean[] zArr) {
        this.d = i;
        this.e = tzxVar;
        this.b = tzxVar2;
        this.a = tzxVar3;
        this.c = tzxVar4;
    }

    public mgo(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, byte[][] bArr) {
        this.d = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.a = tzxVar3;
        this.e = tzxVar4;
    }

    public mgo(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, char[][] cArr) {
        this.d = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.e = tzxVar3;
        this.c = tzxVar4;
    }

    public mgo(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, float[][] fArr) {
        this.d = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.e = tzxVar3;
        this.c = tzxVar4;
    }

    public mgo(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, byte[][][] bArr) {
        this.d = i;
        this.e = tzxVar;
        this.c = tzxVar2;
        this.a = tzxVar3;
        this.b = tzxVar4;
    }

    public mgo(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, short[][][] sArr) {
        this.d = i;
        this.a = tzxVar;
        this.e = tzxVar2;
        this.c = tzxVar3;
        this.b = tzxVar4;
    }

    public mgo(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, boolean[][][] zArr) {
        this.d = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.a = tzxVar3;
        this.e = tzxVar4;
    }
}
