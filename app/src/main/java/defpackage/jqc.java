package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.media.MediaFormat;
import android.os.Handler;
import androidx.wear.ambient.AmbientDelegate;
import j$.util.Objects;
import j$.util.function.BiPredicate$CC;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.BiPredicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqc implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;
    private final tzx g;
    private final tzx h;
    private final tzx i;
    private final tzx j;
    private final tzx k;
    private final tzx l;
    private final /* synthetic */ int m;

    public jqc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, int i) {
        this.m = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
        this.g = tzxVar7;
        this.h = tzxVar8;
        this.i = tzxVar9;
        this.j = tzxVar10;
        this.k = tzxVar11;
        this.l = tzxVar12;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.m) {
            case 0:
                hws hwsVar = (hws) this.a.a();
                hbp hbpVar = (hbp) this.b.a();
                hpa hpaVar = (hpa) this.c.a();
                tzx tzxVar = this.f;
                tzx tzxVar2 = this.e;
                rwc rwcVarB = ((jaf) this.d).b();
                rwc rwcVarB2 = ((jaf) tzxVar2).b();
                Executor executor = (Executor) tzxVar.a();
                pas pasVar = (pas) this.g.a();
                lob lobVar = (lob) this.h.a();
                mwq mwqVar = (mwq) this.i.a();
                tzx tzxVar3 = this.k;
                jpw jpwVarA = ((jpx) this.j).a();
                ejt ejtVarA = ((jqd) tzxVar3).a();
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", "application/microvideo-meta-stream");
                mediaFormat.setInteger("oo.muxer.drop_initial_non_keyframes", 1);
                return new jqb(hwsVar, hbpVar, hpaVar, rwcVarB, rwcVarB2, executor, pasVar, lobVar, mwqVar, jpwVarA, ejtVarA, mediaFormat);
            case 1:
                return new iwz((ndj) this.k.a(), (nca) this.c.a(), (krj) this.j.a(), (mzz) this.l.a(), (fvu) this.e.a(), (owf) this.h.a(), (muu) this.i.a(), (owq) this.f.a(), (rwc) this.b.a(), (imi) this.a.a(), (rwc) this.g.a(), (iyu) this.d.a());
            case 2:
                hpa hpaVar2 = (hpa) this.c.a();
                tzx tzxVar4 = this.i;
                List listA = ((jsm) this.g).a();
                obu obuVar = (obu) tzxVar4.a();
                tzx tzxVar5 = this.h;
                iso isoVarA = ((hfg) this.d).a();
                hbj hbjVar = (hbj) tzxVar5.a();
                Executor executor2 = (Executor) this.a.a();
                ((imm) this.e).b();
                return new nhz(hpaVar2, listA, obuVar, isoVarA, hbjVar, executor2, (jsf) this.l.a(), (lny) this.j.a(), (jsv) this.b.a(), ((jaf) this.k).b(), ((jaf) this.f).b());
            case 3:
                return new jxx((iyu) this.e.a(), ((hoa) this.l).b(), (fyd) this.k.a(), (fvu) this.i.a(), ((fwo) this.f).a(), (gkv) this.j.a(), (ocq) this.b.a(), (hbj) this.h.a(), (jyb) this.c.a(), (mni) this.a.a(), (juh) this.d.a(), (nrc) this.g.a());
            case 4:
                hbj hbjVar2 = (hbj) this.a.a();
                luj lujVar = (luj) this.g.a();
                tzx tzxVar6 = this.d;
                final owf owfVarB = ((ihb) this.i).b();
                final hie hieVar = (hie) tzxVar6.a();
                final owf owfVar = (owf) this.l.a();
                final owf owfVar2 = (owf) this.b.a();
                owf owfVar3 = (owf) this.f.a();
                final fuf fufVar = (fuf) this.k.a();
                tzx tzxVar7 = this.j;
                nkw nkwVarA = ((nkv) this.c).a();
                owf owfVar4 = (owf) tzxVar7.a();
                final owq owqVar = (owq) this.e.a();
                final owf owfVar5 = (owf) this.h.a();
                sgv sgvVar = ktb.a;
                luu luuVar = luf.x;
                owq owqVarA = lujVar.a(luuVar);
                String str = (String) luuVar.d(hbjVar2);
                ksa ksaVar = ksa.PHOTO_FLASH_NS;
                ksa ksaVar2 = ksa.PHOTO_FLASH_AUTO;
                ksa ksaVar3 = ksa.PHOTO_FLASH_ON;
                ksa ksaVar4 = ksa.PHOTO_FLASH_OFF;
                final krp krpVar = new krp(owqVarA, str, ksaVar, ksaVar2, ksaVar3, ksaVar4, null);
                boolean zB = fufVar.b(nkwVarA);
                if (zB && ksaVar2.equals(krpVar.dL())) {
                    krpVar.a(ksaVar);
                } else if (!zB && ksaVar.equals(krpVar.dL())) {
                    krpVar.a(ksaVar4);
                }
                ksh kshVarA = hbjVar2.o(haf.c) ? ktb.a(zB, true, true) : ktb.b(zB, true, true);
                glx glxVar = new glx(owfVar4, 13);
                BiPredicate biPredicate = new BiPredicate() { // from class: ksv
                    public final /* synthetic */ BiPredicate and(BiPredicate biPredicate2) {
                        return BiPredicate$CC.$default$and(this, biPredicate2);
                    }

                    public final /* synthetic */ BiPredicate negate() {
                        return BiPredicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ BiPredicate or(BiPredicate biPredicate2) {
                        return BiPredicate$CC.$default$or(this, biPredicate2);
                    }

                    @Override // java.util.function.BiPredicate
                    public final boolean test(Object obj, Object obj2) {
                        kqy kqyVar = (kqy) obj;
                        ksa ksaVar5 = (ksa) obj2;
                        sgv sgvVar2 = ktb.a;
                        boolean zEquals = Objects.equals(ksaVar5, ksa.PHOTO_FLASH_NS);
                        fuf fufVar2 = fufVar;
                        if (zEquals && !((Boolean) fufVar2.e.dL()).booleanValue() && !((Boolean) owfVar5.dL()).booleanValue() && (!Objects.equals(krpVar.dL(), ksa.PHOTO_FLASH_ON) || owqVar.dL() != ltw.OFF)) {
                            return false;
                        }
                        if (!fufVar2.a(kqyVar.d()) || !Objects.equals(ksaVar5, ksa.PHOTO_FLASH_ON)) {
                            return true;
                        }
                        hie hieVar2 = hieVar;
                        boolean zBooleanValue = ((Boolean) owfVarB.dL()).booleanValue();
                        if (((Boolean) ((ovx) hieVar2.d).d).booleanValue()) {
                            owf owfVar6 = owfVar;
                            return ((jjq) owfVar6.dL()).b.isEmpty() && ((jjq) owfVar6.dL()).e.isEmpty() && !zBooleanValue && !((Boolean) owfVar2.dL()).booleanValue();
                        }
                        return false;
                    }
                };
                lca lcaVar = new lca(owfVar4, owfVarB, krpVar, fufVar, owfVar3, lujVar, 1);
                kshVarA.n(krs.FRONT_PHOTO_FLASH);
                kshVarA.a = krpVar;
                kshVarA.b = glxVar;
                kshVarA.d = biPredicate;
                kshVarA.e = lcaVar;
                return kshVarA.a();
            case 5:
                our ourVar = (our) this.j.a();
                rwc rwcVar = (rwc) this.c.a();
                rwc rwcVar2 = (rwc) this.k.a();
                rwc rwcVarB3 = ((lzr) this.a).b();
                kgw kgwVarA = ((kiu) this.f).a();
                Boolean bool = (Boolean) this.i.a();
                if (!kgwVarA.F()) {
                    return ((kvp) this.b).a();
                }
                if (!kgwVarA.l().equals(pka.BACK)) {
                    gzg gzgVar = gze.a;
                } else if (rwcVar.h() && rwcVar2.h() && rwcVarB3.h()) {
                    ourVar.d(((mlw) rwcVarB3.c()).b(rvk.a, (rwc) this.h.a()));
                    ((pdn) rwcVar.c()).l(new lxn(rwcVar2, rwcVarB3, 1));
                    if (bool.booleanValue()) {
                        kva kvaVarB = ((kvb) this.d).a();
                        ourVar.d(kvaVarB);
                        return kvaVarB;
                    }
                    kvv kvvVarB = ((kvw) this.g).a();
                    ourVar.d(kvvVarB);
                    return kvvVarB;
                }
                return ((kvm) this.l).a();
            case 6:
                final our ourVar2 = (our) this.f.a();
                final hbj hbjVar3 = (hbj) this.a.a();
                tzx tzxVar8 = this.j;
                tzx tzxVar9 = this.i;
                final tzj tzjVarB = tzs.b(tzxVar8);
                final pfu pfuVar = (pfu) tzxVar9.a();
                final rwc rwcVar3 = (rwc) this.k.a();
                rwc rwcVar4 = (rwc) this.h.a();
                rwc rwcVar5 = (rwc) this.g.a();
                final owf owfVar6 = (owf) this.b.a();
                final npt nptVar = (npt) this.c.a();
                rwc rwcVarB4 = ((ixr) this.d).b();
                nkw nkwVarA2 = ((kid) this.e).a();
                rwr rwrVar = (rwr) this.l.a();
                final scl sclVar = new scl();
                sclVar.d((peo) rwcVar3.c());
                if (nkwVarA2.equals(nkw.PORTRAIT) && rwrVar.a) {
                    if (rwcVar4.h()) {
                        sclVar.d((peo) rwcVar4.c());
                    }
                    if (rwcVar5.h()) {
                        sclVar.d((peo) rwcVar5.c());
                    }
                }
                return rwcVarB4.b(new rvu() { // from class: lbt
                    @Override // defpackage.rvu
                    public final Object apply(Object obj) {
                        npi npiVar = new npi();
                        pfu pfuVar2 = pfuVar;
                        npiVar.f(pfuVar2.a.c());
                        pdn pdnVarC = pfuVar2.c(pfuVar2.e(sclVar.g()), 1);
                        our ourVar3 = ourVar2;
                        ourVar3.d(pdnVarC);
                        npiVar.c(pdnVarC);
                        npiVar.d((peo) rwcVar3.c());
                        npiVar.b(owfVar6);
                        npiVar.b = nptVar;
                        npiVar.a = (byte) (npiVar.a | 8);
                        npiVar.e(hbjVar3);
                        npq npqVarB = ((noy) obj).b(npiVar.a(), new lbs(tzjVarB, 0));
                        ourVar3.d(npqVarB);
                        return npqVarB;
                    }
                });
            case 7:
                nkw nkwVar = (nkw) this.e.a();
                tzx tzxVar10 = this.a;
                tzx tzxVar11 = this.d;
                Object objA = tzxVar10.a();
                pjo pjoVar = (pjo) tzxVar11.a();
                rwc rwcVarB5 = ((ixr) this.g).b();
                pnq pnqVar = (pnq) this.f.a();
                boolean zBooleanValue = ((Boolean) this.c.a()).booleanValue();
                pjp pjpVarA = ((pab) this.i).a();
                lbb lbbVar = (lbb) this.b.a();
                peg pegVar = (peg) this.j.a();
                hbj hbjVar4 = (hbj) this.h.a();
                ldd lddVar = (ldd) this.l.a();
                lcs lcsVarA = ((lct) this.k).a();
                pjoVar.j();
                pjoVar.s();
                Long lValueOf = (Long) rwcVarB5.e(0L);
                if (pnqVar.a) {
                    lValueOf = Long.valueOf(lValueOf.longValue() | 48);
                }
                lcc lccVar = new lcc();
                lccVar.a = pjoVar.j();
                lccVar.d = true;
                pko pkoVarC = null;
                if (lValueOf.longValue() == 0) {
                    lValueOf = null;
                }
                lccVar.f = lValueOf;
                lccVar.h = zBooleanValue;
                lccVar.l = pegVar;
                lcz lczVar = lcz.a;
                lccVar.k = lddVar.b(lczVar);
                if (pjoVar.l().equals(pka.FRONT) && kzz.n(hbjVar4, nkwVar)) {
                    for (pjr pjrVar : pjoVar.C()) {
                        pkoVarC = lbb.a(37, pjpVarA.a(pjrVar), false);
                        pas pasVar2 = pkoVarC.b;
                        rwc rwcVarJ = rwc.j(pjrVar);
                        pasVar2.getClass();
                        lccVar.m.h(new pes(rwcVarJ, pasVar2));
                    }
                }
                if (pkoVarC == null) {
                    pkoVarC = lbbVar.c(lczVar, pjoVar, zBooleanValue);
                }
                lccVar.b = pkoVarC;
                lccVar.c = lcsVarA.a(pkoVarC);
                return lccVar.a();
            case 8:
                return new lvk((kgn) this.a.a(), (luk) this.k.a(), (pkc) this.c.a(), (pfw) this.h.a(), (luj) this.g.a(), (owq) this.f.a(), ((ixw) this.e).a(), (hbj) this.l.a(), (owf) this.j.a(), (jug) this.i.a(), ((ims) this.b).b(), (owf) this.d.a());
            default:
                tzx tzxVar12 = this.h;
                tzx tzxVar13 = this.g;
                Context contextB = ((imm) this.e).b();
                Object objA2 = tzxVar13.a();
                AmbientDelegate ambientDelegate = (AmbientDelegate) tzxVar12.a();
                hbw hbwVar = (hbw) this.d.a();
                tzx tzxVar14 = this.i;
                Object objA3 = this.c.a();
                Handler handler = (Handler) tzxVar14.a();
                ((nna) this.j).a();
                tzx tzxVar15 = this.l;
                tzx tzxVar16 = this.a;
                Resources resourcesB = ((hoa) this.b).b();
                may mayVarA = ((maj) tzxVar16).a();
                mal malVar = (mal) tzxVar15.a();
                return new maa(contextB, (mav) objA2, ambientDelegate, hbwVar, (mah) objA3, handler, resourcesB, mayVarA, malVar, (mbf) this.k.a());
        }
    }

    public jqc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, int i, byte[] bArr) {
        this.m = i;
        this.k = tzxVar;
        this.c = tzxVar2;
        this.j = tzxVar3;
        this.l = tzxVar4;
        this.e = tzxVar5;
        this.h = tzxVar6;
        this.i = tzxVar7;
        this.f = tzxVar8;
        this.b = tzxVar9;
        this.a = tzxVar10;
        this.g = tzxVar11;
        this.d = tzxVar12;
    }

    public jqc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, int i, char[] cArr) {
        this.m = i;
        this.c = tzxVar;
        this.g = tzxVar2;
        this.i = tzxVar3;
        this.d = tzxVar4;
        this.h = tzxVar5;
        this.a = tzxVar6;
        this.e = tzxVar7;
        this.l = tzxVar8;
        this.j = tzxVar9;
        this.b = tzxVar10;
        this.k = tzxVar11;
        this.f = tzxVar12;
    }

    public jqc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, int i, float[] fArr) {
        this.m = i;
        this.f = tzxVar;
        this.a = tzxVar2;
        this.j = tzxVar3;
        this.i = tzxVar4;
        this.k = tzxVar5;
        this.h = tzxVar6;
        this.g = tzxVar7;
        this.b = tzxVar8;
        this.c = tzxVar9;
        this.d = tzxVar10;
        this.e = tzxVar11;
        this.l = tzxVar12;
    }

    public jqc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, int i, int[] iArr) {
        this.m = i;
        this.a = tzxVar;
        this.g = tzxVar2;
        this.i = tzxVar3;
        this.d = tzxVar4;
        this.l = tzxVar5;
        this.b = tzxVar6;
        this.f = tzxVar7;
        this.k = tzxVar8;
        this.c = tzxVar9;
        this.j = tzxVar10;
        this.e = tzxVar11;
        this.h = tzxVar12;
    }

    public jqc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, int i, short[] sArr) {
        this.m = i;
        this.e = tzxVar;
        this.l = tzxVar2;
        this.k = tzxVar3;
        this.i = tzxVar4;
        this.f = tzxVar5;
        this.j = tzxVar6;
        this.b = tzxVar7;
        this.h = tzxVar8;
        this.c = tzxVar9;
        this.a = tzxVar10;
        this.d = tzxVar11;
        this.g = tzxVar12;
    }

    public jqc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, int i, boolean[] zArr) {
        this.m = i;
        this.j = tzxVar;
        this.l = tzxVar2;
        this.g = tzxVar3;
        this.d = tzxVar4;
        this.b = tzxVar5;
        this.c = tzxVar6;
        this.k = tzxVar7;
        this.a = tzxVar8;
        this.h = tzxVar9;
        this.e = tzxVar10;
        this.f = tzxVar11;
        this.i = tzxVar12;
    }

    public jqc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, int i, byte[][] bArr) {
        this.m = i;
        this.e = tzxVar;
        this.a = tzxVar2;
        this.d = tzxVar3;
        this.g = tzxVar4;
        this.f = tzxVar5;
        this.c = tzxVar6;
        this.i = tzxVar7;
        this.b = tzxVar8;
        this.j = tzxVar9;
        this.h = tzxVar10;
        this.l = tzxVar11;
        this.k = tzxVar12;
    }

    public jqc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, int i, char[][] cArr) {
        this.m = i;
        this.a = tzxVar;
        this.k = tzxVar2;
        this.c = tzxVar3;
        this.h = tzxVar4;
        this.g = tzxVar5;
        this.f = tzxVar6;
        this.e = tzxVar7;
        this.l = tzxVar8;
        this.j = tzxVar9;
        this.i = tzxVar10;
        this.b = tzxVar11;
        this.d = tzxVar12;
    }

    public jqc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, int i, short[][] sArr) {
        this.m = i;
        this.e = tzxVar;
        this.g = tzxVar2;
        this.h = tzxVar3;
        this.d = tzxVar4;
        this.c = tzxVar5;
        this.i = tzxVar6;
        this.j = tzxVar7;
        this.b = tzxVar8;
        this.a = tzxVar9;
        this.l = tzxVar10;
        this.f = tzxVar11;
        this.k = tzxVar12;
    }
}
