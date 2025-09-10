package defpackage;

import android.app.KeyguardManager;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;
import com.google.ar.core.R;
import j$.lang.Iterable$EL;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iup implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;
    private final /* synthetic */ int g;

    public iup(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i) {
        this.g = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
    }

    /* JADX WARN: Type inference failed for: r1v83, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r7v29, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object, owf] */
    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        Object sfmVar;
        kmz kmzVar;
        switch (this.g) {
            case 0:
                hbj hbjVar = (hbj) this.a.a();
                rwc rwcVar = (rwc) this.b.a();
                ((ixw) this.d).a();
                ((ixv) this.e).a();
                if (rwcVar.h()) {
                    jea.b(hbjVar);
                }
                return new rwz(null);
            case 1:
                return new iqv(((imm) this.d).b(), (mni) this.e.a(), (pnq) this.c.a(), (owf) this.f.a(), (owf) this.b.a(), (owf) this.a.a());
            case 2:
                owq owqVar = (owq) this.d.a();
                ixm ixmVar = (ixm) this.e.a();
                Object sfmVar2 = !ixmVar.c() ? sfd.a : new sfm(new frf(new hym((our) this.a.a(), (owf) this.b.a(), (icd) this.f.a(), ixmVar, owqVar, (Executor) this.c.a(), 4), "LaylaScene", 0));
                sfmVar2.getClass();
                return sfmVar2;
            case 3:
                tzx tzxVar = this.a;
                tzx tzxVar2 = this.e;
                tzx tzxVar3 = this.d;
                return new lqc(((iya) this.c).a(), ((imn) tzxVar2).a(), this.b, ((Boolean) tzxVar.a()).booleanValue(), CameraActivity.class, (KeyguardManager) ((imm) tzxVar3).b().getSystemService("keyguard"), (luj) this.f.a());
            case 4:
                jho jhoVar = (jho) this.d.a();
                luj lujVar = (luj) this.c.a();
                tzx tzxVar4 = this.a;
                tzx tzxVar5 = this.e;
                tzj tzjVarB = tzs.b(tzxVar4);
                final imi imiVar = (imi) tzxVar5.a();
                final owf owfVar = (owf) this.b.a();
                boolean z = jhoVar.b;
                final rwc rwcVarB = ((jaf) this.f).b();
                if (z) {
                    owq owqVar2 = jhoVar.a;
                    Integer numValueOf = Integer.valueOf(lts.DEFAULT.c);
                    ksa ksaVar = ksa.CAPTURE_RESOLUTION_DEFAULT;
                    Integer numValueOf2 = Integer.valueOf(lts.HI_RES.c);
                    ksa ksaVar2 = ksa.CAPTURE_RESOLUTION_HI_RES;
                    final krp krpVar = new krp(owqVar2, numValueOf, numValueOf, ksaVar, numValueOf2, ksaVar2);
                    glx glxVar = new glx(jhoVar, 4);
                    final owq owqVarA = lujVar.a(luf.an);
                    Consumer consumer = new Consumer() { // from class: jhq
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void d(Object obj) {
                            krj krjVar = (krj) obj;
                            our ourVar = krjVar.L;
                            owq owqVar3 = krpVar;
                            glc glcVar = new glc(owqVar3, krjVar, 16, null);
                            sxo sxoVar = sxo.a;
                            ourVar.d(owqVarA.dK(glcVar, sxoVar));
                            imi imiVar2 = imiVar;
                            rwc rwcVar2 = rwcVarB;
                            iyl iylVar = new iyl(owqVar3, krjVar, imiVar2, rwcVar2, 2);
                            owf owfVar2 = owfVar;
                            ourVar.d(owfVar2.dK(iylVar, sxoVar));
                            ourVar.d(owqVar3.dK(new kzk(owfVar2, owqVar3, krjVar, imiVar2, rwcVar2, 1), sxoVar));
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                            return Consumer$CC.$default$andThen(this, consumer2);
                        }
                    };
                    fvk fvkVar = new fvk(krpVar, 3);
                    ksh kshVarM = ksi.m();
                    kshVarM.n(krs.CAPTURE_RESOLUTION);
                    kshVarM.a = krpVar;
                    kshVarM.o(kry.PRO);
                    kshVarM.h(R.string.lobster_option_name);
                    kshVarM.c(R.string.lobster_option_desc);
                    kshVarM.m(ksaVar, ksaVar2);
                    Integer numValueOf3 = Integer.valueOf(R.string.lobster_option_default);
                    Integer numValueOf4 = Integer.valueOf(R.string.lobster_option_hires);
                    kshVarM.j(numValueOf3, numValueOf4);
                    kshVarM.e(numValueOf3, numValueOf4);
                    kshVarM.g(Integer.valueOf(R.drawable.gs_12mp_fill1_vd_theme_24), Integer.valueOf(R.drawable.gs_50mp_fill1_vd_theme_24));
                    kshVarM.b = glxVar;
                    kshVarM.e = consumer;
                    kshVarM.k((ksb) tzjVarB.a());
                    kshVarM.f = fvkVar;
                    sfmVar = new sfm(kshVarM.a());
                } else {
                    sfmVar = sfd.a;
                }
                sfmVar.getClass();
                return sfmVar;
            case 5:
                mhq mhqVar = (mhq) this.a.a();
                tzx tzxVar6 = this.b;
                mhp mhpVarB = ((mia) this.f).b();
                ovx ovxVar = (ovx) tzxVar6.a();
                return ((hbj) this.e.a()).p(han.c) ? new kue(new eml((fqg) this.d.a(), mhqVar, (out) this.c.a(), mhpVarB, ovxVar, 5), 2) : hgd.a;
            case 6:
                return new joo((jpp) this.b.a(), (jqb) this.f.a(), (rwc) this.e.a(), (our) this.c.a(), (hbj) this.d.a(), ((pba) this.a).a());
            case 7:
                owq owqVar3 = (owq) this.b.a();
                tzx tzxVar7 = this.a;
                mhp mhpVarB2 = ((mia) this.f).b();
                return ((hbj) this.e.a()).p(gzz.B) ? new kue(new eml((fqg) this.d.a(), (mhq) tzxVar7.a(), (out) this.c.a(), mhpVarB2, owqVar3, 6), 2) : hgd.a;
            case 8:
                return new hjb(((imm) this.d).b(), (mwq) this.e.a(), (owf) this.a.a(), (owf) this.c.a(), this.f, (owf) this.b.a());
            case 9:
                return new juh((hbj) this.c.a(), (luj) this.f.a(), ((ngx) this.e).a(), (out) this.b.a(), (owf) this.d.a(), ((ims) this.a).b());
            case 10:
                gox goxVarA = ((jyg) this.e).a();
                tzx tzxVar8 = this.a;
                tzx tzxVar9 = this.b;
                tzj tzjVarB2 = tzs.b(tzxVar8);
                kan kanVar = (kan) tzxVar9.a();
                jzq jzqVar = (jzq) this.d.a();
                mwq mwqVar = (mwq) this.f.a();
                hbj hbjVar2 = (hbj) this.c.a();
                lny lnyVar = (lny) goxVarA.b.a();
                lnyVar.getClass();
                ((lns) goxVarA.a).a();
                pbn pbnVar = (pbn) goxVarA.c.a();
                pbnVar.getClass();
                tzjVarB2.getClass();
                kanVar.getClass();
                jzqVar.getClass();
                mwqVar.getClass();
                hbjVar2.getClass();
                return new pgx(lnyVar, pbnVar, tzjVarB2, kanVar, jzqVar, mwqVar);
            case 11:
                return new kan((hpa) this.b.a(), ((kiv) this.e).a(), (hbj) this.d.a(), (jsf) this.a.a(), (hyh) this.c.a(), (pbn) this.f.a());
            case 12:
                return new kbf((hbj) this.c.a(), (jzv) this.b.a(), (jys) this.d.a(), ((jzo) this.e).a(), tzs.b(this.f), (lat) this.a.a());
            case 13:
                return new kdd((mtm) this.c.a(), (imi) this.b.a(), ((imm) this.d).b(), ((ims) this.f).b(), (owf) this.e.a(), (hbj) this.a.a());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new kef((out) this.b.a(), (mbj) this.c.a(), ((imm) this.a).b(), this.e, (mwq) this.d.a(), (luj) this.f.a());
            case 15:
                return new kgp((pci) this.e.a(), ((jtk) this.d).a(), (pkc) this.b.a(), (ngk) this.f.a(), (hbj) this.a.a(), (hfy) this.c.a());
            case 16:
                return new mns(((jtk) this.e).a(), (qqq) this.f.a(), (syu) this.d.a(), (hbj) this.c.a(), (out) this.b.a(), ((ixw) this.a).a());
            case 17:
                tzx tzxVar10 = this.e;
                return new pmv(tzs.b(this.a), tzs.b(this.c), tzs.b(this.b), (Executor) tzxVar10.a(), ((hco) this.d).a(), (pbn) this.f.a());
            case 18:
                tzx tzxVar11 = this.b;
                tzx tzxVar12 = this.a;
                owf owfVarB = ((ihb) this.c).b();
                owf owfVarB2 = ((ihb) tzxVar12).b();
                owf owfVar2 = (owf) tzxVar11.a();
                qrh qrhVar = (qrh) this.e.a();
                nkw nkwVar = (nkw) this.d.a();
                owf owfVar3 = (owf) this.f.a();
                if (knm.a.contains(nkwVar)) {
                    owfVarB = new owi(kox.OFF);
                }
                return new kow(owfVarB, owfVarB2, qrhVar.f, qrhVar.e, qrhVar.c, owfVar2, owfVar3);
            case 19:
                boolean zBooleanValue = ((koh) this.a).b().booleanValue();
                rwc rwcVar2 = (rwc) this.f.a();
                nkw nkwVarA = ((kid) this.e).a();
                if (zBooleanValue && nkwVarA != nkw.IMAGE_INTENT) {
                    kmzVar = (kmz) this.d.a();
                } else {
                    if (!rwcVar2.h()) {
                        throw new UnsupportedOperationException("Stream configuration not supported");
                    }
                    kmzVar = nkwVarA == nkw.IMAGE_INTENT ? (kmz) this.c.a() : (kmz) this.b.a();
                }
                kmzVar.getClass();
                return kmzVar;
            default:
                Map map = (Map) this.b.a();
                rwc rwcVar3 = (rwc) this.f.a();
                tzx tzxVar13 = this.d;
                final pjo pjoVarA = ((kiv) this.e).a();
                final hbj hbjVar3 = (hbj) tzxVar13.a();
                final lkk lkkVar = (lkk) this.a.a();
                final boolean zBooleanValue2 = ((Boolean) this.c.a()).booleanValue();
                final sbr sbrVar = new sbr();
                sbrVar.f(pjoVarA.j().a, lcy.LOGICAL);
                final HashMap map2 = new HashMap(map);
                if (rwcVar3.h()) {
                    map2.put(lcz.a, (peo) rwcVar3.c());
                }
                Iterable$EL.forEach(map2.keySet(), new Consumer() { // from class: kog
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void d(Object obj) {
                        Optional optionalEmpty;
                        lcz lczVar = (lcz) obj;
                        pka pkaVarL = pjoVarA.l();
                        if (!lcz.A.contains(lczVar) && !lczVar.equals(lcz.a)) {
                            throw new IllegalArgumentException(String.valueOf(String.valueOf(lczVar)).concat(" not a raw stream."));
                        }
                        boolean z2 = zBooleanValue2;
                        lkk lkkVar2 = lkkVar;
                        hbj hbjVar4 = hbjVar3;
                        int iOrdinal = lkkVar2.ordinal();
                        if (iOrdinal == 0) {
                            optionalEmpty = Optional.empty();
                        } else if (iOrdinal == 1) {
                            optionalEmpty = Optional.of((z2 && hbjVar4.p(han.j)) ? lcy.ULTRAWIDE_RM : lcy.ULTRAWIDE);
                        } else if (iOrdinal == 2) {
                            optionalEmpty = Optional.of((z2 && hbjVar4.p(han.h)) ? lcy.WIDE_RM : lcy.WIDE);
                        } else {
                            if (iOrdinal != 3) {
                                throw new RuntimeException(null, null);
                            }
                            optionalEmpty = Optional.of((z2 && hbjVar4.p(han.i)) ? lcy.TELE_RM : lcy.TELE);
                        }
                        lcz lczVar2 = lcz.a;
                        if (lczVar != lczVar2 || !optionalEmpty.isPresent()) {
                            int iOrdinal2 = pkaVarL.ordinal();
                            if (iOrdinal2 != 0) {
                                if (iOrdinal2 != 1) {
                                    optionalEmpty = Optional.empty();
                                } else {
                                    int iOrdinal3 = lczVar.ordinal();
                                    optionalEmpty = iOrdinal3 != 1 ? iOrdinal3 != 2 ? iOrdinal3 != 3 ? iOrdinal3 != 5 ? iOrdinal3 != 7 ? iOrdinal3 != 8 ? Optional.empty() : Optional.of(lcy.TELE_RM) : Optional.of(lcy.TELE) : Optional.of(lcy.WIDE_RM) : Optional.of(lcy.WIDE) : Optional.of(lcy.ULTRAWIDE_RM) : Optional.of(lcy.ULTRAWIDE);
                                }
                            } else if (hbjVar4.p(gzo.ab) && lczVar.equals(lczVar2)) {
                                optionalEmpty = Optional.of(lcy.FRONT_PHYSICAL);
                            } else if (hbjVar4.p(gza.a)) {
                                int iOrdinal4 = lczVar.ordinal();
                                optionalEmpty = iOrdinal4 != 1 ? iOrdinal4 != 3 ? Optional.empty() : Optional.of(lcy.FRONT_PHYSICAL) : Optional.of(lcy.FRONT_SECONDARY);
                            } else {
                                optionalEmpty = Optional.empty();
                            }
                        }
                        optionalEmpty.ifPresent(new kof(sbrVar, map2, lczVar, 0));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                });
                return sbrVar.b();
        }
    }

    public iup(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, byte[] bArr) {
        this.g = i;
        this.d = tzxVar;
        this.e = tzxVar2;
        this.c = tzxVar3;
        this.f = tzxVar4;
        this.b = tzxVar5;
        this.a = tzxVar6;
    }

    public iup(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, byte[] bArr, byte[] bArr2) {
        this.g = i;
        this.a = tzxVar;
        this.f = tzxVar2;
        this.b = tzxVar3;
        this.c = tzxVar4;
        this.d = tzxVar5;
        this.e = tzxVar6;
    }

    public iup(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, char[] cArr) {
        this.g = i;
        this.d = tzxVar;
        this.e = tzxVar2;
        this.b = tzxVar3;
        this.f = tzxVar4;
        this.a = tzxVar5;
        this.c = tzxVar6;
    }

    public iup(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, char[] cArr, byte[] bArr) {
        this.g = i;
        this.b = tzxVar;
        this.f = tzxVar2;
        this.e = tzxVar3;
        this.d = tzxVar4;
        this.a = tzxVar5;
        this.c = tzxVar6;
    }

    public iup(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, float[] fArr) {
        this.g = i;
        this.b = tzxVar;
        this.f = tzxVar2;
        this.e = tzxVar3;
        this.c = tzxVar4;
        this.d = tzxVar5;
        this.a = tzxVar6;
    }

    public iup(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, int[] iArr) {
        this.g = i;
        this.d = tzxVar;
        this.c = tzxVar2;
        this.a = tzxVar3;
        this.e = tzxVar4;
        this.b = tzxVar5;
        this.f = tzxVar6;
    }

    public iup(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, short[] sArr) {
        this.g = i;
        this.c = tzxVar;
        this.d = tzxVar2;
        this.e = tzxVar3;
        this.b = tzxVar4;
        this.a = tzxVar5;
        this.f = tzxVar6;
    }

    public iup(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, boolean[] zArr) {
        this.g = i;
        this.a = tzxVar;
        this.f = tzxVar2;
        this.b = tzxVar3;
        this.e = tzxVar4;
        this.c = tzxVar5;
        this.d = tzxVar6;
    }

    public iup(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, byte[][] bArr) {
        this.g = i;
        this.b = tzxVar;
        this.f = tzxVar2;
        this.a = tzxVar3;
        this.c = tzxVar4;
        this.e = tzxVar5;
        this.d = tzxVar6;
    }

    public iup(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, char[][] cArr) {
        this.g = i;
        this.d = tzxVar;
        this.e = tzxVar2;
        this.a = tzxVar3;
        this.c = tzxVar4;
        this.f = tzxVar5;
        this.b = tzxVar6;
    }

    public iup(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, float[][] fArr) {
        this.g = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.d = tzxVar3;
        this.e = tzxVar4;
        this.f = tzxVar5;
        this.a = tzxVar6;
    }

    public iup(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, int[][] iArr) {
        this.g = i;
        this.e = tzxVar;
        this.a = tzxVar2;
        this.b = tzxVar3;
        this.d = tzxVar4;
        this.f = tzxVar5;
        this.c = tzxVar6;
    }

    public iup(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, short[][] sArr) {
        this.g = i;
        this.c = tzxVar;
        this.f = tzxVar2;
        this.e = tzxVar3;
        this.b = tzxVar4;
        this.d = tzxVar5;
        this.a = tzxVar6;
    }

    public iup(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, boolean[][] zArr) {
        this.g = i;
        this.b = tzxVar;
        this.e = tzxVar2;
        this.d = tzxVar3;
        this.a = tzxVar4;
        this.c = tzxVar5;
        this.f = tzxVar6;
    }

    public iup(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, byte[][][] bArr) {
        this.g = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.d = tzxVar3;
        this.f = tzxVar4;
        this.e = tzxVar5;
        this.a = tzxVar6;
    }

    public iup(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, char[][][] cArr) {
        this.g = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.a = tzxVar3;
        this.e = tzxVar4;
        this.d = tzxVar5;
        this.f = tzxVar6;
    }

    public iup(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, float[][][] fArr) {
        this.g = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.b = tzxVar3;
        this.e = tzxVar4;
        this.d = tzxVar5;
        this.f = tzxVar6;
    }

    public iup(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, int[][][] iArr) {
        this.g = i;
        this.e = tzxVar;
        this.f = tzxVar2;
        this.d = tzxVar3;
        this.c = tzxVar4;
        this.b = tzxVar5;
        this.a = tzxVar6;
    }

    public iup(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, short[][][] sArr) {
        this.g = i;
        this.e = tzxVar;
        this.d = tzxVar2;
        this.b = tzxVar3;
        this.f = tzxVar4;
        this.a = tzxVar5;
        this.c = tzxVar6;
    }

    public iup(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, boolean[][][] zArr) {
        this.g = i;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.b = tzxVar3;
        this.e = tzxVar4;
        this.d = tzxVar5;
        this.f = tzxVar6;
    }
}
