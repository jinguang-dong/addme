package defpackage;

import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ish implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final /* synthetic */ int e;

    public ish(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i) {
        this.e = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        Object obj;
        final int i = 3;
        switch (this.e) {
            case 0:
                return new isg(((fry) this.a).b(), (hbp) this.b.a(), (lat) this.c.a(), (hbj) this.d.a());
            case 1:
                return new isa(((imm) this.c).b(), ((imo) this.b).a(), ((ixw) this.a).a(), ((imp) this.d).a());
            case 2:
                return new isn(((imw) this.a).a(), ((ind) this.d).a(), (hbj) this.c.a(), (pqn) this.b.a());
            case 3:
                hbj hbjVar = (hbj) this.d.a();
                owq owqVar = (owq) this.c.a();
                boolean zBooleanValue = ((Boolean) this.b.a()).booleanValue();
                if (!hbjVar.p(hac.T) || !((Boolean) owqVar.dL()).booleanValue()) {
                    obj = rvk.a;
                } else if (zBooleanValue) {
                    gzi gziVar = han.a;
                    obj = rvk.a;
                } else {
                    obj = (rwc) this.a.a();
                }
                obj.getClass();
                return obj;
            case 4:
                return new iux(((imm) this.c).b(), (mni) this.a.a(), (ocq) this.b.a(), (pnq) this.d.a());
            case 5:
                return new ixi((hbj) this.d.a(), (pjo) this.b.a(), (kow) this.c.a(), ((kid) this.a).a());
            case 6:
                pbn pbnVar = (pbn) this.b.a();
                Map map = ((tzq) this.c).a;
                map.getClass();
                tzx tzxVar = this.a;
                tzxVar.getClass();
                tzx tzxVar2 = this.d;
                tzxVar2.getClass();
                pbnVar.getClass();
                mwq mwqVar = new mwq(map, pbnVar);
                mwqVar.C(nkw.IMAX, tzxVar);
                mwqVar.C(nkw.SLOW_MOTION, tzxVar2);
                return mwqVar;
            case 7:
                tzx tzxVar3 = this.d;
                return ((jbo) this.c).a().a(nkw.ACTION_PAN, ((fkh) this.b).b(), ((hso) this.a).b(), ((jbg) tzxVar3).b());
            case 8:
                tzx tzxVar4 = this.d;
                return ((jbo) this.c).a().a(nkw.LANDSCAPE, ((fkh) this.b).b(), ((hso) this.a).b(), ((jbg) tzxVar4).b());
            case 9:
                return new pmv(this.c, this.d, this.b, ((nkv) this.a).a());
            case 10:
                tzx tzxVar5 = this.d;
                nca ncaVarA = ((ncb) this.b).a();
                out outVar = (out) tzxVar5.a();
                tzx tzxVar6 = this.a;
                fdq fdqVarA = ((ixw) this.c).a();
                ins.g(outVar, ((iyb) tzxVar6).a(), ncaVarA);
                fdqVarA.j().d(ncaVarA);
                return ncaVarA;
            case 11:
                hbj hbjVar2 = (hbj) this.c.a();
                luj lujVar = (luj) this.b.a();
                return new jho(hbjVar2, lujVar);
            case 12:
                syw sywVar = (syw) this.a.a();
                sbp sbpVar = (sbp) this.c.a();
                pvu pvuVar = (pvu) this.b.a();
                return new hbp(sywVar, sbpVar, pvuVar);
            case 13:
                return new gga((kfg) this.b.a(), ((kig) this.c).a(), ((kiu) this.a).a(), (out) this.d.a());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new mns(((imm) this.a).b(), (imi) this.c.a(), (jmw) this.d.a(), (owq) this.b.a());
            case 15:
                return new jnu(((imm) this.a).b(), ((mfx) this.d).a(), (hbj) this.c.a(), (mdy) this.b.a());
            case 16:
                hgm hgmVar = (hgm) this.a.a();
                gzi gziVar2 = gzz.a;
                hgmVar.getClass();
                return hgmVar;
            case 17:
                tzx tzxVar7 = this.d;
                qyc qycVarA = ((kil) this.b).a();
                ((Boolean) tzxVar7.a()).booleanValue();
                return (((Boolean) this.c.a()).booleanValue() && qycVarA.a) ? ((jaf) this.a).b() : rvk.a;
            case 18:
                Object sfmVar = ((hbj) this.c.a()).p(gzz.v) ? new sfm(new hrg((uem) this.d, (lsp) this.b.a(), ((ixw) this.a).a(), 3)) : sfd.a;
                sfmVar.getClass();
                return sfmVar;
            case 19:
                tzx tzxVar8 = this.c;
                Object objA = this.d.a();
                ((hmn) tzxVar8).b();
                tzx tzxVar9 = this.b;
                final hlf hlfVarB = ((hmn) this.a).b();
                hls hlsVar = new hls((hms) tzxVar9.a());
                hlsVar.c = new hlf() { // from class: jre
                    @Override // defpackage.hlf
                    public final boolean e() {
                        return ((hlh) hlfVarB).a;
                    }
                };
                hlsVar.c((jrd) objA);
                return hlsVar.a();
            default:
                final our ourVar = (our) this.c.a();
                final pfu pfuVar = (pfu) this.d.a();
                rwc rwcVar = (rwc) this.b.a();
                nkw nkwVarA = ((kid) this.a).a();
                if (nkwVarA == nkw.PHOTO || nkwVarA == nkw.PORTRAIT) {
                    i = 45;
                } else if (nkwVarA != nkw.NIGHT_SIGHT && !ixg.a(nkwVarA)) {
                    i = 0;
                }
                return i == 0 ? rvk.a : rwcVar.b(new rvu() { // from class: jrs
                    @Override // defpackage.rvu
                    public final Object apply(Object obj2) {
                        pdn pdnVarC = pfuVar.c((pdv) obj2, i);
                        ourVar.d(pdnVarC);
                        return pdnVarC;
                    }
                });
        }
    }

    public ish(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, byte[] bArr) {
        this.e = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.a = tzxVar3;
        this.d = tzxVar4;
    }

    public ish(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, byte[] bArr, byte[] bArr2) {
        this.e = i;
        this.d = tzxVar;
        this.c = tzxVar2;
        this.a = tzxVar3;
        this.b = tzxVar4;
    }

    public ish(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, char[] cArr) {
        this.e = i;
        this.a = tzxVar;
        this.d = tzxVar2;
        this.c = tzxVar3;
        this.b = tzxVar4;
    }

    public ish(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, float[] fArr) {
        this.e = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.d = tzxVar3;
        this.b = tzxVar4;
    }

    public ish(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, int[] iArr) {
        this.e = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.b = tzxVar3;
        this.d = tzxVar4;
    }

    public ish(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, boolean[] zArr) {
        this.e = i;
        this.d = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.a = tzxVar4;
    }

    public ish(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, float[][] fArr) {
        this.e = i;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.b = tzxVar3;
        this.d = tzxVar4;
    }

    public ish(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, int[][] iArr) {
        this.e = i;
        this.b = tzxVar;
        this.d = tzxVar2;
        this.c = tzxVar3;
        this.a = tzxVar4;
    }

    public ish(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, short[][] sArr) {
        this.e = i;
        this.c = tzxVar;
        this.d = tzxVar2;
        this.b = tzxVar3;
        this.a = tzxVar4;
    }

    public ish(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, boolean[][] zArr) {
        this.e = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.d = tzxVar3;
        this.a = tzxVar4;
    }

    public ish(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, byte[][][] bArr) {
        this.e = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.a = tzxVar3;
        this.d = tzxVar4;
    }

    public ish(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, char[][][] cArr) {
        this.e = i;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.d = tzxVar3;
        this.b = tzxVar4;
    }

    public ish(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, int[][][] iArr) {
        this.e = i;
        this.a = tzxVar;
        this.d = tzxVar2;
        this.b = tzxVar3;
        this.c = tzxVar4;
    }

    public ish(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, boolean[][][] zArr) {
        this.e = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.d = tzxVar3;
        this.c = tzxVar4;
    }
}
