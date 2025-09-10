package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.location.Location;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.Range;
import com.google.ar.core.R;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jql implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final /* synthetic */ int d;

    public jql(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i) {
        this.d = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        Object sfmVar;
        scn scnVarG;
        owf owiVar;
        switch (this.d) {
            case 0:
                hgm hgmVar = (hgm) this.a.a();
                Executor executor = (Executor) this.b.a();
                pbn pbnVar = (pbn) this.c.a();
                return new hws(hgmVar, new pbs(executor, pbnVar, "me-aeis"), pbnVar);
            case 1:
                return new hwt((plc) this.b.a(), (qqq) this.a.a(), (hwv) this.c.a(), 12, 1, 1);
            case 2:
                hbj hbjVar = (hbj) this.a.a();
                tzx tzxVar = this.c;
                String strA = ((jqt) this.b).a();
                pas pasVar = ((kqr) tzxVar).a().b;
                double dAbs = Math.abs(pasVar.d().a() - hpi.d.a());
                boolean z = hbjVar.p(haa.W) && !hbjVar.p(haa.X);
                boolean z2 = hbjVar.p(haa.aa) && !hbjVar.p(haa.X);
                boolean z3 = dAbs < 0.05d;
                boolean zP = hbjVar.p(gzo.S);
                boolean zP2 = hbjVar.p(haa.ab);
                boolean zP3 = hbjVar.p(haa.Y);
                pas pasVarB = jsw.b(z, z3, zP3);
                if (pasVar.j()) {
                    pasVarB = pasVarB.e();
                }
                MediaFormat mediaFormatA = jsw.a(pasVarB, jsw.c(hbjVar, z2, zP3), 3600.0f, strA, zP, zP2);
                mediaFormatA.getClass();
                return mediaFormatA;
            case 3:
                hbj hbjVar2 = (hbj) this.a.a();
                String strA2 = ((jqt) this.b).a();
                pas pasVar2 = ((kqr) this.c).a().b;
                double dAbs2 = Math.abs(pasVar2.d().a() - hpi.d.a());
                boolean zP4 = hbjVar2.p(gzo.S);
                boolean zP5 = hbjVar2.p(haa.ab);
                pas pasVarB2 = jsw.b(true, dAbs2 < 0.05d, true);
                if (pasVar2.j()) {
                    pasVarB2 = pasVarB2.e();
                }
                MediaFormat mediaFormatA2 = jsw.a(pasVarB2, jsw.c(hbjVar2, true, true), 3600.0f, strA2, zP4, zP5);
                if (hbjVar2.p(haa.y)) {
                    mediaFormatA2.setInteger("color-standard", 2);
                }
                mediaFormatA2.getClass();
                return mediaFormatA2;
            case 4:
                hbj hbjVar3 = (hbj) this.a.a();
                String strA3 = ((jqt) this.b).a();
                pas pasVar3 = ((kqr) this.c).a().b;
                double dAbs3 = Math.abs(pasVar3.d().a() - hpi.d.a());
                gzi gziVar = haa.a;
                boolean zP6 = hbjVar3.p(gzo.S);
                boolean zP7 = hbjVar3.p(haa.ab);
                pas pasVarB3 = jsw.b(false, dAbs3 < 0.05d, false);
                if (pasVar3.j()) {
                    pasVarB3 = pasVarB3.e();
                }
                MediaFormat mediaFormatA3 = jsw.a(pasVarB3, jsw.c(hbjVar3, false, false), 3600.0f, strA3, zP6, zP7);
                mediaFormatA3.getClass();
                return mediaFormatA3;
            case 5:
                return new jsf(((pba) this.c).a(), (jsb) this.b.a(), (hbj) this.a.a());
            case 6:
                return new jyj((pna) ((jyk) this.a).a().a, new kbh((kbf) this.c.a(), (Handler) this.b.a()));
            case 7:
                pfl pflVar = (pfl) this.c.a();
                our ourVar = (our) this.a.a();
                kan kanVar = (kan) this.b.a();
                kanVar.getClass();
                ourVar.d(pflVar.x(new rnu(kanVar, null)));
                return kanVar;
            case 8:
                Object objH = !((Boolean) this.a.a()).booleanValue() ? sfd.a : scn.H(new hwk(this.c, 2), new hwk(this.b, 3));
                objH.getClass();
                return objH;
            case 9:
                rwc rwcVar = (rwc) this.c.a();
                rwc rwcVar2 = (rwc) this.b.a();
                return (rwcVar.h() && ((Boolean) rwcVar.c()).booleanValue()) ? !rwcVar2.h() ? ske.M(rvk.a) : ske.Q(new kbs(rwcVar2, 0), (Executor) this.a.a()) : ske.M(rvk.a);
            case 10:
                ((iyb) this.a).a();
                ((ixr) this.b).b();
                sfd sfdVar = sfd.a;
                sfdVar.getClass();
                return sfdVar;
            case 11:
                return new hrg(((ixw) this.a).a(), (owq) this.b.a(), (fck) this.c.a(), 4);
            case 12:
                return new gpu(((ixw) this.a).a(), (owf) this.b.a(), (owq) this.c.a(), 3);
            case 13:
                return ((hbj) this.c.a()).p(hac.L) ? ((kec) this.b).a() : ((kdt) this.a).a();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return !((hbj) this.b.a()).p(hac.L) ? nkm.r : new fwe(this.a, (muu) this.c.a(), 4);
            case 15:
                kek kekVar = ((hbj) this.c.a()).p(hac.L) ? (kek) this.b.a() : (kek) this.a.a();
                kekVar.getClass();
                return kekVar;
            case 16:
                luj lujVar = (luj) this.c.a();
                hbj hbjVar4 = (hbj) this.b.a();
                rwc rwcVarB = ((gad) this.a).b();
                if (hbjVar4.p(hac.K)) {
                    lus lusVar = luf.aK;
                    owq owqVarA = lujVar.a(lusVar);
                    ksh kshVarM = ksi.m();
                    kshVarM.n(krs.ASTRO);
                    ksa ksaVar = ksa.ASTRO_OFF;
                    ksa ksaVar2 = ksa.P;
                    kshVarM.m(ksaVar, ksaVar2);
                    kshVarM.h(R.string.astro_desc);
                    kshVarM.c(R.string.astro_option_desc);
                    kshVarM.j(Integer.valueOf(R.string.astro_off_desc), Integer.valueOf(R.string.astro_auto_desc));
                    kshVarM.e(Integer.valueOf(R.string.astro_off_acc_desc), Integer.valueOf(R.string.astro_auto_acc_desc));
                    kshVarM.g(Integer.valueOf(R.drawable.gs_astrophotography_mode_off_fill1_vd_24), Integer.valueOf(R.drawable.gs_astrophotography_mode_auto_fill1_vd_24));
                    kshVarM.a = new krp(owqVarA, (Integer) lusVar.d(hbjVar4), Integer.valueOf(qpt.bG(1)), ksaVar, Integer.valueOf(qpt.bG(2)), ksaVar2);
                    kshVarM.b = new hsj(9);
                    if (hbjVar4.p(gzo.bJ)) {
                        kshVarM.g = rbb.d;
                    } else {
                        kshVarM.h = new kdj(rwcVarB, 0);
                    }
                    sfmVar = new sfm(kshVarM.a());
                } else {
                    sfmVar = sfd.a;
                }
                sfmVar.getClass();
                return sfmVar;
            case 17:
                return new khj(((kiu) this.a).a(), (kow) this.b.a(), ((ims) this.c).b());
            case 18:
                hbj hbjVar5 = (hbj) this.b.a();
                jwe jweVar = (jwe) this.a.a();
                syu syuVarA = ((kho) this.c).a();
                if (hbjVar5.p(hae.w)) {
                    scl sclVar = new scl();
                    Float fValueOf = Float.valueOf(0.0f);
                    final ovx ovxVar = new ovx(fValueOf);
                    Optional optional = jweVar.a;
                    if (optional.isPresent()) {
                        sclVar.d(qpt.cm((CaptureRequest.Key) optional.get(), ovxVar));
                    }
                    final ovx ovxVar2 = new ovx(new double[0]);
                    Optional optional2 = jweVar.b;
                    if (optional2.isPresent()) {
                        sclVar.d(qpt.cm((CaptureRequest.Key) optional2.get(), ovxVar2));
                    }
                    final ovx ovxVar3 = new ovx(fValueOf);
                    Optional optional3 = jweVar.c;
                    if (optional3.isPresent()) {
                        sclVar.d(qpt.cm((CaptureRequest.Key) optional3.get(), ovxVar3));
                    }
                    final ovx ovxVar4 = new ovx(Double.valueOf(0.0d));
                    Optional optional4 = jweVar.d;
                    if (optional4.isPresent()) {
                        sclVar.d(qpt.cm((CaptureRequest.Key) optional4.get(), ovxVar4));
                    }
                    ojl.cj(syuVarA, new paf() { // from class: khn
                        @Override // defpackage.paf
                        public final void a(Object obj) {
                            rwc rwcVar3 = (rwc) obj;
                            rwcVar3.getClass();
                            if (rwcVar3.h()) {
                                if (((Location) rwcVar3.c()).hasAccuracy()) {
                                    ovxVar.a(Float.valueOf(((Location) rwcVar3.c()).getAccuracy()));
                                }
                                ovxVar2.a(new double[]{((Location) rwcVar3.c()).getLatitude(), ((Location) rwcVar3.c()).getLongitude()});
                                if (((Location) rwcVar3.c()).hasMslAltitudeAccuracy()) {
                                    ovxVar3.a(Float.valueOf(((Location) rwcVar3.c()).getMslAltitudeAccuracyMeters()));
                                }
                                if (((Location) rwcVar3.c()).hasMslAltitude()) {
                                    ovxVar4.a(Double.valueOf(((Location) rwcVar3.c()).getMslAltitudeMeters()));
                                }
                            }
                        }
                    });
                    scnVarG = sclVar.g();
                } else {
                    scnVarG = sfd.a;
                }
                scnVarG.getClass();
                return scnVarG;
            case 19:
                kgw kgwVarA = ((kiu) this.a).a();
                boolean zBooleanValue = ((Boolean) this.c.a()).booleanValue();
                hbj hbjVar6 = (hbj) this.b.a();
                List listV = kgwVarA.v();
                gzi gziVar2 = gzs.a;
                return qpt.ci(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, hbjVar6.p(gzo.ah) ? zBooleanValue ? Range.create(24, 24) : ojl.be(listV, false) : zBooleanValue ? Range.create((Integer) ojl.be(listV, true).getLower(), 24) : ojl.be(listV, true));
            default:
                tzx tzxVar2 = this.c;
                rwc rwcVarB2 = ((lzr) this.b).b();
                our ourVar2 = (our) tzxVar2.a();
                if (((hbj) this.a.a()).o(gzo.bt) && rwcVarB2.h()) {
                    Float[] fArr = {Float.valueOf(-1.0f)};
                    ovx ovxVar5 = new ovx(fArr);
                    khv khvVar = new khv(ovxVar5, fArr);
                    ((mlw) rwcVarB2.c()).e(khvVar);
                    ourVar2.d(new ffx(rwcVarB2, khvVar, 20, null));
                    owiVar = qpt.cm(kgx.e, ovxVar5);
                } else {
                    owiVar = new owi(qpt.cl());
                }
                owiVar.getClass();
                return owiVar;
        }
    }

    public jql(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, byte[] bArr) {
        this.d = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.a = tzxVar3;
    }

    public jql(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, float[] fArr) {
        this.d = i;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.b = tzxVar3;
    }

    public jql(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, boolean[] zArr) {
        this.d = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.a = tzxVar3;
    }

    public jql(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, byte[][][] bArr) {
        this.d = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.b = tzxVar3;
    }

    public jql(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, float[][][] fArr) {
        this.d = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.c = tzxVar3;
    }
}
