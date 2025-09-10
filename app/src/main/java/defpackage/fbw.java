package defpackage;

import com.google.android.apps.camera.moments.api.GroupPhotoUtils;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import j$.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbw implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;
    private final /* synthetic */ int g;

    public fbw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i) {
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
        Collection sfmVar;
        boolean z = false;
        switch (this.g) {
            case 0:
                tzx tzxVar = this.f;
                tzx tzxVar2 = this.e;
                tzx tzxVar3 = this.d;
                return new gtm(this.a, this.b, this.c, tzxVar3, tzxVar2, tzxVar);
            case 1:
                kfw kfwVar = (kfw) this.a.a();
                tzx tzxVar4 = this.e;
                tzx tzxVar5 = this.c;
                pfl pflVarA = ((kgf) this.f).a();
                fdd fddVarA = ((fde) tzxVar5).a();
                boolean zBooleanValue = ((hef) tzxVar4).b().booleanValue();
                return new fbk(kfwVar, pflVarA, fddVarA, zBooleanValue, ((kiv) this.d).a());
            case 2:
                mdy mdyVar = (mdy) this.f.a();
                tzx tzxVar6 = this.c;
                tzx tzxVar7 = this.b;
                return new fcr(mdyVar, ((hef) this.e).b(), ((kiv) tzxVar7).a(), (owf) tzxVar6.a(), ((nms) this.d.a()).g().j(), ((kid) this.a).a());
            case 3:
                return new fdt((hfr) this.d.a(), (qrh) this.b.a(), (CameraActivityTiming) this.a.a(), ((goe) this.c).a(), (hhc) this.f.a(), (Executor) this.e.a());
            case 4:
                return new ffq((mwq) this.a.a(), ((ffs) this.f).a(), ((hoa) this.e).b(), (mdy) this.c.a(), (owf) this.d.a(), (owf) this.b.a());
            case 5:
                fgn fgnVar = (fgn) this.a.a();
                pfu pfuVar = (pfu) this.b.a();
                rwc rwcVar = (rwc) this.f.a();
                rwc rwcVar2 = (rwc) this.c.a();
                nms nmsVar = (nms) this.d.a();
                boolean zBooleanValue2 = ((Boolean) this.e.a()).booleanValue();
                if (!rwcVar.h()) {
                    return sfc.a;
                }
                sbr sbrVar = new sbr();
                sbrVar.f(((peo) rwcVar.c()).d().a, pfuVar.d((peo) rwcVar.c()));
                if (fgnVar.a() && zBooleanValue2) {
                    z = true;
                }
                if (rwcVar2.h()) {
                    sbrVar.f(((peo) rwcVar2.c()).d().a, z ? pfuVar.d((peo) rwcVar.c()) : pfuVar.d((peo) rwcVar2.c()));
                } else if (nmsVar.f() != null) {
                    pjo pjoVarF = nmsVar.f();
                    pjoVarF.getClass();
                    sbrVar.f(((pjn) pjoVarF).a.a, pfuVar.d((peo) rwcVar.c()));
                }
                return sbrVar.b();
            case 6:
                return new hls(((kic) this.e).a(), (fgk) this.f.a(), (fft) this.d.a(), (fhj) this.b.a(), (kzo) this.a.a(), (sbv) this.c.a());
            case 7:
                final hpa hpaVar = (hpa) this.f.a();
                final owq owqVar = (owq) this.d.a();
                ocq ocqVar = (ocq) this.c.a();
                hbj hbjVar = (hbj) this.b.a();
                final Executor executor = (Executor) this.a.a();
                final our ourVar = (our) this.e.a();
                if (hbjVar.o(gyi.h) && hbjVar.o(gyi.o) && ocqVar.ai("suggestion_all_in_end_to_end_count") < 3) {
                    final float fFloatValue = ((Float) hbjVar.e(gyi.p).orElse(gyi.c)).floatValue();
                    owqVar.a(0);
                    sfmVar = new sfm(new frf(new Runnable() { // from class: fmc
                        @Override // java.lang.Runnable
                        public final void run() {
                            final owq owqVar2 = owqVar;
                            final float f = fFloatValue;
                            ourVar.d(hpaVar.c(new hpb() { // from class: fmb
                                @Override // defpackage.hpb
                                public final void ey(lnl lnlVar) {
                                    owqVar2.a(Integer.valueOf(GroupPhotoUtils.b(lnlVar, f)));
                                }
                            }, executor));
                        }
                    }, "allIn-suggestion-startup", 0));
                } else {
                    sfmVar = sfd.a;
                }
                sfmVar.getClass();
                return sfmVar;
            case 8:
                return new fmd((ScheduledExecutorService) this.d.a(), (ocq) this.c.a(), ((hoa) this.f).b(), (jtc) this.e.a(), (owf) this.b.a(), (owf) this.a.a());
            case 9:
                return new fra(((imm) this.d).b(), (hbj) this.e.a(), ((iyb) this.a).a(), (out) this.f.a(), (Executor) this.b.a(), (pbn) this.c.a());
            case 10:
                tzx tzxVar8 = this.f;
                tzx tzxVar9 = this.b;
                tzx tzxVar10 = this.a;
                return new gko(this.d, this.c, this.e, tzxVar10, tzxVar9, tzxVar8, null);
            case 11:
                tzx tzxVar11 = this.f;
                tzx tzxVar12 = this.a;
                tzx tzxVar13 = this.e;
                return new gko(this.b, this.c, this.d, tzxVar13, tzxVar12, tzxVar11);
            case 12:
                return new ghc((gdi) this.a.a(), (gav) this.b.a(), (naw) this.f.a(), (ggo) this.d.a(), (gnt) this.e.a(), ((ghi) this.c).a());
            case 13:
                tzx tzxVar14 = this.f;
                rwc rwcVarB = ((gad) this.e).b();
                owq owqVar2 = (owq) tzxVar14.a();
                ghx ghxVar = (ghx) this.c.a();
                hbj hbjVar2 = (hbj) this.d.a();
                tzx tzxVar15 = this.b;
                fdq fdqVarA = ((ixw) this.a).a();
                return new ghr(rwcVarB, owqVar2, ghxVar, hbjVar2, fdqVarA);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new gij((fvu) this.a.a(), (ndj) this.f.a(), (mzz) this.b.a(), ((gjz) this.c).a(), (gln) this.e.a(), (hbj) this.d.a());
            case 15:
                return new git((fvu) this.a.a(), (ndj) this.e.a(), (mts) this.d.a(), (mzz) this.b.a(), ((gjz) this.c).a(), (rwr) this.f.a());
            case 16:
                return new gix((fvu) this.a.a(), (ndj) this.f.a(), (mts) this.b.a(), (mzz) this.e.a(), ((gjz) this.c).a(), (gkv) this.d.a());
            case 17:
                return new glb((mni) this.a.a(), (mwq) this.b.a(), ((imm) this.d).b(), ((fry) this.f).b(), (ScheduledExecutorService) this.c.a(), (hbj) this.e.a());
            case 18:
                return new myt(((imm) this.a).b(), (mky) this.e.a(), (ovx) this.b.a(), (owq) this.f.a(), (owq) this.c.a(), (hbj) this.d.a());
            case 19:
                tzx tzxVar16 = this.a;
                return new gtm(((imm) this.b).b(), (feb) tzxVar16.a(), ((imn) this.d).a(), (mdy) this.c.a(), ((pba) this.f).a(), ((goe) this.e).a(), null);
            default:
                tzx tzxVar17 = this.a;
                return new gtm(((imm) this.b).b(), (feb) tzxVar17.a(), ((imn) this.d).a(), (mdy) this.c.a(), ((pba) this.f).a(), ((goe) this.e).a());
        }
    }

    public fbw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, byte[] bArr) {
        this.g = i;
        this.a = tzxVar;
        this.f = tzxVar2;
        this.c = tzxVar3;
        this.e = tzxVar4;
        this.b = tzxVar5;
        this.d = tzxVar6;
    }

    public fbw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, byte[] bArr, byte[] bArr2) {
        this.g = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.d = tzxVar3;
        this.c = tzxVar4;
        this.f = tzxVar5;
        this.e = tzxVar6;
    }

    public fbw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, char[] cArr) {
        this.g = i;
        this.f = tzxVar;
        this.e = tzxVar2;
        this.b = tzxVar3;
        this.c = tzxVar4;
        this.d = tzxVar5;
        this.a = tzxVar6;
    }

    public fbw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, float[] fArr) {
        this.g = i;
        this.e = tzxVar;
        this.f = tzxVar2;
        this.d = tzxVar3;
        this.b = tzxVar4;
        this.a = tzxVar5;
        this.c = tzxVar6;
    }

    public fbw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, int[] iArr) {
        this.g = i;
        this.a = tzxVar;
        this.f = tzxVar2;
        this.e = tzxVar3;
        this.c = tzxVar4;
        this.d = tzxVar5;
        this.b = tzxVar6;
    }

    public fbw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, short[] sArr) {
        this.g = i;
        this.d = tzxVar;
        this.b = tzxVar2;
        this.a = tzxVar3;
        this.c = tzxVar4;
        this.f = tzxVar5;
        this.e = tzxVar6;
    }

    public fbw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, boolean[] zArr) {
        this.g = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.f = tzxVar3;
        this.c = tzxVar4;
        this.d = tzxVar5;
        this.e = tzxVar6;
    }

    public fbw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, byte[][] bArr) {
        this.g = i;
        this.f = tzxVar;
        this.d = tzxVar2;
        this.c = tzxVar3;
        this.b = tzxVar4;
        this.a = tzxVar5;
        this.e = tzxVar6;
    }

    public fbw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, char[][] cArr) {
        this.g = i;
        this.d = tzxVar;
        this.c = tzxVar2;
        this.f = tzxVar3;
        this.e = tzxVar4;
        this.b = tzxVar5;
        this.a = tzxVar6;
    }

    public fbw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, float[][] fArr) {
        this.g = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.f = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.c = tzxVar6;
    }

    public fbw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, int[][] iArr) {
        this.g = i;
        this.d = tzxVar;
        this.c = tzxVar2;
        this.e = tzxVar3;
        this.a = tzxVar4;
        this.b = tzxVar5;
        this.f = tzxVar6;
    }

    public fbw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, short[][] sArr) {
        this.g = i;
        this.d = tzxVar;
        this.e = tzxVar2;
        this.a = tzxVar3;
        this.f = tzxVar4;
        this.b = tzxVar5;
        this.c = tzxVar6;
    }

    public fbw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, boolean[][] zArr) {
        this.g = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.d = tzxVar3;
        this.e = tzxVar4;
        this.a = tzxVar5;
        this.f = tzxVar6;
    }

    public fbw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, byte[][][] bArr) {
        this.g = i;
        this.e = tzxVar;
        this.f = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.a = tzxVar5;
        this.b = tzxVar6;
    }

    public fbw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, char[][][] cArr) {
        this.g = i;
        this.a = tzxVar;
        this.f = tzxVar2;
        this.b = tzxVar3;
        this.c = tzxVar4;
        this.e = tzxVar5;
        this.d = tzxVar6;
    }

    public fbw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, float[][][] fArr) {
        this.g = i;
        this.a = tzxVar;
        this.e = tzxVar2;
        this.b = tzxVar3;
        this.f = tzxVar4;
        this.c = tzxVar5;
        this.d = tzxVar6;
    }

    public fbw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, int[][][] iArr) {
        this.g = i;
        this.a = tzxVar;
        this.f = tzxVar2;
        this.b = tzxVar3;
        this.e = tzxVar4;
        this.c = tzxVar5;
        this.d = tzxVar6;
    }

    public fbw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, short[][][] sArr) {
        this.g = i;
        this.a = tzxVar;
        this.e = tzxVar2;
        this.d = tzxVar3;
        this.b = tzxVar4;
        this.c = tzxVar5;
        this.f = tzxVar6;
    }

    public fbw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, boolean[][][] zArr) {
        this.g = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.d = tzxVar3;
        this.f = tzxVar4;
        this.c = tzxVar5;
        this.e = tzxVar6;
    }
}
