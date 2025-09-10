package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.camera.autotimer.analysis.jni.wVCD.HHdu;
import com.google.ar.core.R;
import com.google.googlex.gcam.dirtylens.PrCd.SHXc;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.BiPredicate$CC;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.BiPredicate;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ksm implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;
    private final tzx g;
    private final /* synthetic */ int h;

    public ksm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i) {
        this.h = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
        this.g = tzxVar7;
    }

    public ksm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, byte[] bArr) {
        this.h = i;
        this.c = tzxVar;
        this.e = tzxVar2;
        this.a = tzxVar3;
        this.f = tzxVar4;
        this.b = tzxVar5;
        this.g = tzxVar6;
        this.d = tzxVar7;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() throws PackageManager.NameNotFoundException {
        Object owiVar;
        Object objB;
        Object sfmVar;
        Object sfmVar2;
        switch (this.h) {
            case 0:
                luj lujVar = (luj) this.a.a();
                tzx tzxVar = this.d;
                return new ksn(lujVar, ((hoa) this.b).b(), ((ngx) this.c).a(), (hbj) tzxVar.a(), (jug) this.e.a(), (owf) this.f.a(), (owf) this.g.a(), 1, null);
            case 1:
                gnt gntVarA = ((kif) this.c).a();
                owq owqVar = (owq) this.e.a();
                owq owqVar2 = (owq) this.a.a();
                owq owqVar3 = (owq) this.f.a();
                luj lujVar2 = (luj) this.b.a();
                our ourVar = (our) this.g.a();
                Executor executor = (Executor) this.d.a();
                sbp sbpVar = knm.a;
                if (gntVarA.j()) {
                    owiVar = owl.h(lujVar2.a(luf.x), new hve(owqVar3, owqVar2, 5));
                } else {
                    ourVar.d(owqVar.dK(new knl(0), executor));
                    owiVar = new owi(owqVar);
                }
                owiVar.getClass();
                return owiVar;
            case 2:
                luj lujVar3 = (luj) this.a.a();
                tzx tzxVar2 = this.d;
                return new ksn(lujVar3, ((hoa) this.b).b(), ((ngx) this.c).a(), (hbj) tzxVar2.a(), (jug) this.e.a(), (owf) this.f.a(), (owf) this.g.a(), 0);
            case 3:
                luj lujVar4 = (luj) this.a.a();
                hbj hbjVar = (hbj) this.d.a();
                tzx tzxVar3 = this.g;
                final owf owfVarB = ((ihb) this.c).b();
                owf owfVar = (owf) tzxVar3.a();
                final hie hieVar = (hie) this.e.a();
                final owf owfVar2 = (owf) this.b.a();
                final owf owfVar3 = (owf) this.f.a();
                sgv sgvVar = ktb.a;
                luu luuVar = luf.J;
                owq owqVarA = lujVar4.a(luuVar);
                String str = (String) luuVar.d(hbjVar);
                ksa ksaVar = ksa.VIDEO_FLASH_ON;
                ksa ksaVar2 = ksa.VIDEO_FLASH_OFF;
                krp krpVar = new krp(owqVarA, str, "torch", ksaVar, "off", ksaVar2);
                BiPredicate biPredicate = new BiPredicate() { // from class: ksz
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
                        sgv sgvVar2 = ktb.a;
                        if (!Objects.equals((ksa) obj2, ksa.VIDEO_FLASH_ON)) {
                            return true;
                        }
                        hie hieVar2 = hieVar;
                        boolean zBooleanValue = ((Boolean) owfVarB.dL()).booleanValue();
                        if (((Boolean) ((ovx) hieVar2.d).d).booleanValue()) {
                            owf owfVar4 = owfVar2;
                            return ((jjq) owfVar4.dL()).b.isEmpty() && ((jjq) owfVar4.dL()).e.isEmpty() && !zBooleanValue && !((Boolean) owfVar3.dL()).booleanValue();
                        }
                        return false;
                    }
                };
                fxu fxuVar = new fxu(owfVarB, krpVar, 20);
                ksh kshVarM = ksi.m();
                kshVarM.n(krs.NIGHT_FRONT_PHOTO_FLASH);
                kshVarM.h(R.string.illumination_desc);
                kshVarM.c(R.string.illumination_options_desc);
                kshVarM.b(ksaVar2, R.drawable.ic_lightbulb_off, R.string.illumination_off_option_desc, R.string.illumination_off_desc);
                kshVarM.b(ksaVar, R.drawable.ic_lightbulb_on, R.string.illumination_on_option_desc, R.string.illumination_on_desc);
                kshVarM.a = krpVar;
                kshVarM.d = biPredicate;
                kshVarM.e = fxuVar;
                kshVarM.b = new jjj(owfVar, 10);
                return kshVarM.a();
            case 4:
                boolean zBooleanValue = ((koh) this.d).b().booleanValue();
                lpm lpmVar = (lpm) this.f.a();
                hbj hbjVar2 = (hbj) this.e.a();
                pbn pbnVar = (pbn) this.a.a();
                pfl pflVarA = ((kme) this.g).a();
                if (zBooleanValue) {
                    tzx tzxVar4 = this.b;
                    tzx tzxVar5 = this.c;
                    ArrayList arrayList = new ArrayList();
                    int i = (hbjVar2.p(gzs.L) ? 1 : 0) + (hbjVar2.p(gzs.X) ? 1 : 0) + 1;
                    owf owfVarB2 = ((lcu) tzxVar5.a()).b();
                    pbr pbrVarB = pbnVar.b(HHdu.qLNeEZuQeGztY);
                    our ourVar2 = (our) tzxVar4.a();
                    fcd fcdVar = new fcd(lpmVar, pbrVarB, pflVarA, 9, (char[]) null);
                    sxo sxoVar = sxo.a;
                    ourVar2.d(owfVarB2.dK(fcdVar, sxoVar));
                    fsn fsnVar = new fsn(owfVarB2, new owi(1), new owi(Integer.valueOf(i + 1)));
                    arrayList.add(fsnVar);
                    gzi gziVar = gzo.a;
                    ((our) tzxVar4.a()).d(fsnVar.dK(new ksw(tzxVar5, owfVarB2, pbnVar.b(SHXc.NjI), lpmVar, 2), sxoVar));
                    objB = owl.b(arrayList);
                } else {
                    objB = new owi(false);
                }
                objB.getClass();
                return objB;
            case 5:
                return qpt.cw((Map) this.c.a(), (owf) this.e.a(), ((kme) this.g).a(), (our) this.f.a(), ((jho) this.a.a()).d(((Boolean) this.d.a()).booleanValue(), ((kid) this.b).a()));
            case 6:
                return qpt.cw((sbv) this.c.a(), (owf) this.e.a(), ((kme) this.g).a(), (our) this.f.a(), ((jho) this.a.a()).d(((Boolean) this.d.a()).booleanValue(), ((kid) this.b).a()));
            case 7:
                tzx tzxVar6 = this.b;
                tzx tzxVar7 = this.e;
                Object objA = this.d.a();
                pjo pjoVarA = ((kiu) tzxVar7).a();
                kfi kfiVar = (kfi) tzxVar6.a();
                nms nmsVar = (nms) this.c.a();
                int iIntValue = ((Integer) this.f.a()).intValue();
                ldd lddVar = (ldd) this.g.a();
                lcs lcsVarA = ((lct) this.a).a();
                sbr sbrVar = new sbr();
                if (pjoVarA.M() && pjoVarA.D()) {
                    pjoVarA = nmsVar.g();
                }
                lcl.c(lcz.PD, sbrVar, pjoVarA, iIntValue, kfiVar, lddVar);
                lcl.c(lcz.l, sbrVar, nmsVar.h(), iIntValue, kfiVar, lddVar);
                pjo pjoVarE = nmsVar.e();
                lcz lczVar = lcz.PD_TELE;
                if (lcsVarA.b(lczVar, pjoVarE)) {
                    lcl.c(lczVar, sbrVar, pjoVarE, iIntValue, kfiVar, lddVar);
                }
                return sbrVar.b();
            case 8:
                tzx tzxVar8 = this.d;
                tzx tzxVar9 = this.g;
                tzx tzxVar10 = this.f;
                tzj tzjVarB = tzs.b(this.c);
                pas pasVarA = ((kij) tzxVar10).a();
                hxv hxvVarA = ((hxw) tzxVar9).a();
                lat latVar = (lat) tzxVar8.a();
                ((iin) this.a).a();
                return new ldl(tzjVarB, pasVarA, hxvVarA, latVar, (Executor) this.e.a(), (iso) this.b.a(), new iob());
            case 9:
                tzx tzxVar11 = this.c;
                qqq qqqVarA = ((lew) this.f).a();
                hzs hzsVar = (hzs) tzxVar11.a();
                lat latVar2 = (lat) this.b.a();
                hbj hbjVar3 = (hbj) this.e.a();
                ((Boolean) this.d.a()).booleanValue();
                return new ley(qqqVarA, hzsVar, latVar2, hbjVar3, (our) this.g.a());
            case 10:
                pbn pbnVar2 = (pbn) this.a.a();
                tzx tzxVar12 = this.b;
                Context contextB = ((imm) this.c).b();
                hbj hbjVar4 = (hbj) tzxVar12.a();
                Executor executor2 = (Executor) this.d.a();
                out outVar = (out) this.f.a();
                jgj jgjVarA = ((jgo) this.e).a();
                lgd lgdVar = new lgd(pbnVar2, contextB, hbjVar4, this.g, executor2, hbjVar4.p(hak.r));
                ins.f(outVar, jgjVarA, lgdVar);
                return lgdVar;
            case 11:
                return new loa((lnt) this.e.a(), (lob) this.f.a(), (hpa) this.b.a(), (joc) this.a.a(), (owq) this.c.a(), (hbj) this.g.a(), this.d);
            case 12:
                loa loaVar = (loa) this.c.a();
                tzx tzxVar13 = this.f;
                rwc rwcVarB = ((fkh) this.d).b();
                lny lnyVar = (lny) tzxVar13.a();
                our ourVar3 = (our) this.g.a();
                if (((hfg) this.e).a().n()) {
                    tzx tzxVar14 = this.b;
                    tzx tzxVar15 = this.a;
                    lnyVar.c();
                    sfmVar = new sfm(new ffz(ourVar3, loaVar, tzxVar15, ojl.bZ("frame-quality-scorer"), tzxVar14, rwcVarB, 5));
                } else {
                    sfmVar = sfd.a;
                }
                sfmVar.getClass();
                return sfmVar;
            case 13:
                tzx tzxVar16 = this.e;
                return new lwk(((inj) this.a).a(), (hbj) tzxVar16.a(), (luj) this.d.a(), (luj) this.g.a(), (lwm) this.f.a(), this.b, ((nmz) this.c).a());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new lwx((owf) this.e.a(), (owf) this.g.a(), (owf) this.f.a(), (juv) this.c.a(), ((lwt) this.b).a(), (owf) this.a.a(), (kuj) this.d.a());
            case 15:
                tzx tzxVar17 = this.c;
                lyq lyqVarA = ((lxg) this.d).a();
                ((imm) tzxVar17).b();
                return new mns(lyqVarA, ((ngy) this.e).a(), (ktx) this.f.a(), (pbn) this.a.a(), (imi) this.g.a(), ((ims) this.b).b());
            case 16:
                our ourVar4 = (our) this.g.a();
                if (((Boolean) this.e.a()).booleanValue()) {
                    tzx tzxVar18 = this.f;
                    tzx tzxVar19 = this.b;
                    tzx tzxVar20 = this.d;
                    sfmVar2 = new sfm(new hym(ourVar4, tzxVar19, this.c, this.a, tzxVar18, tzxVar20, 5));
                } else {
                    sfmVar2 = sfd.a;
                }
                sfmVar2.getClass();
                return sfmVar2;
            case 17:
                tzx tzxVar21 = this.c;
                rwc rwcVarB2 = ((lzr) this.f).b();
                gay gayVar = (gay) this.a.a();
                qev qevVar = (qev) this.g.a();
                tzx tzxVar22 = this.b;
                fdq fdqVarA = ((ixw) this.e).a();
                hbj hbjVar5 = (hbj) tzxVar22.a();
                ((mcu) this.d).a();
                return new mcd(rwcVarB2, gayVar, qevVar, fdqVarA, hbjVar5);
            case 18:
                tzx tzxVar23 = this.c;
                Context contextB2 = ((imm) this.d).b();
                fvu fvuVar = (fvu) tzxVar23.a();
                lat latVar3 = (lat) this.f.a();
                tzx tzxVar24 = this.b;
                jgt jgtVarA = ((ixv) this.e).a();
                out outVar2 = (out) tzxVar24.a();
                mts mtsVar = new mts(contextB2, fvuVar, latVar3, (mdy) this.a.a(), (owf) this.g.a());
                ins.g(outVar2, jgtVarA, mtsVar);
                return mtsVar;
            case 19:
                tzx tzxVar25 = this.d;
                return new mud(((imn) this.e).a(), (hbj) tzxVar25.a(), (out) this.f.a(), (owq) this.a.a(), ((mxx) this.b).a(), (Optional) this.c.a(), (owf) this.g.a());
            default:
                return new mwp((hpa) this.b.a(), (joc) this.a.a(), (owq) this.f.a(), (owf) this.c.a(), this.d, (our) this.g.a(), (hbj) this.e.a());
        }
    }

    public ksm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, byte[] bArr, byte[] bArr2) {
        this.h = i;
        this.e = tzxVar;
        this.d = tzxVar2;
        this.f = tzxVar3;
        this.a = tzxVar4;
        this.b = tzxVar5;
        this.c = tzxVar6;
        this.g = tzxVar7;
    }

    public ksm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, char[] cArr, byte[] bArr) {
        this.h = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.f = tzxVar3;
        this.c = tzxVar4;
        this.d = tzxVar5;
        this.g = tzxVar6;
        this.e = tzxVar7;
    }

    public ksm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, float[] fArr) {
        this.h = i;
        this.c = tzxVar;
        this.e = tzxVar2;
        this.g = tzxVar3;
        this.f = tzxVar4;
        this.a = tzxVar5;
        this.d = tzxVar6;
        this.b = tzxVar7;
    }

    public ksm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, int[] iArr) {
        this.h = i;
        this.d = tzxVar;
        this.c = tzxVar2;
        this.f = tzxVar3;
        this.e = tzxVar4;
        this.b = tzxVar5;
        this.a = tzxVar6;
        this.g = tzxVar7;
    }

    public ksm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, short[] sArr) {
        this.h = i;
        this.a = tzxVar;
        this.d = tzxVar2;
        this.c = tzxVar3;
        this.g = tzxVar4;
        this.e = tzxVar5;
        this.b = tzxVar6;
        this.f = tzxVar7;
    }

    public ksm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, byte[][] bArr) {
        this.h = i;
        this.d = tzxVar;
        this.e = tzxVar2;
        this.b = tzxVar3;
        this.c = tzxVar4;
        this.f = tzxVar5;
        this.g = tzxVar6;
        this.a = tzxVar7;
    }

    public ksm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, char[][] cArr) {
        this.h = i;
        this.c = tzxVar;
        this.f = tzxVar2;
        this.g = tzxVar3;
        this.d = tzxVar4;
        this.a = tzxVar5;
        this.e = tzxVar6;
        this.b = tzxVar7;
    }

    public ksm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, float[][] fArr) {
        this.h = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.f = tzxVar5;
        this.g = tzxVar6;
        this.e = tzxVar7;
    }

    public ksm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, int[][] iArr) {
        this.h = i;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.b = tzxVar3;
        this.d = tzxVar4;
        this.g = tzxVar5;
        this.f = tzxVar6;
        this.e = tzxVar7;
    }

    public ksm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, short[][] sArr) {
        this.h = i;
        this.f = tzxVar;
        this.c = tzxVar2;
        this.b = tzxVar3;
        this.e = tzxVar4;
        this.a = tzxVar5;
        this.d = tzxVar6;
        this.g = tzxVar7;
    }

    public ksm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, boolean[][] zArr) {
        this.h = i;
        this.e = tzxVar;
        this.f = tzxVar2;
        this.b = tzxVar3;
        this.a = tzxVar4;
        this.c = tzxVar5;
        this.g = tzxVar6;
        this.d = tzxVar7;
    }

    public ksm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, byte[][][] bArr) {
        this.h = i;
        this.a = tzxVar;
        this.e = tzxVar2;
        this.d = tzxVar3;
        this.g = tzxVar4;
        this.f = tzxVar5;
        this.b = tzxVar6;
        this.c = tzxVar7;
    }

    public ksm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, char[][][] cArr) {
        this.h = i;
        this.e = tzxVar;
        this.g = tzxVar2;
        this.f = tzxVar3;
        this.c = tzxVar4;
        this.b = tzxVar5;
        this.a = tzxVar6;
        this.d = tzxVar7;
    }

    public ksm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, int[][][] iArr) {
        this.h = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.d = tzxVar3;
        this.b = tzxVar4;
        this.f = tzxVar5;
        this.g = tzxVar6;
        this.e = tzxVar7;
    }

    public ksm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, short[][][] sArr) {
        this.h = i;
        this.d = tzxVar;
        this.c = tzxVar2;
        this.e = tzxVar3;
        this.f = tzxVar4;
        this.a = tzxVar5;
        this.g = tzxVar6;
        this.b = tzxVar7;
    }

    public ksm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, boolean[][][] zArr) {
        this.h = i;
        this.f = tzxVar;
        this.c = tzxVar2;
        this.a = tzxVar3;
        this.g = tzxVar4;
        this.e = tzxVar5;
        this.b = tzxVar6;
        this.d = tzxVar7;
    }
}
