package defpackage;

import android.hardware.camera2.CaptureRequest;
import com.bumptech.glide.qd.MyBPCgKwEjJI;
import com.google.ar.core.R;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Supplier;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jxf implements tzt {
    private final tzx a;
    private final tzx b;
    private final /* synthetic */ int c;

    public jxf(tzx tzxVar, tzx tzxVar2, int i) {
        this.c = i;
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    public jxf(tzx tzxVar, tzx tzxVar2, int i, char[] cArr) {
        this.c = i;
        this.b = tzxVar;
        this.a = tzxVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        boolean z = false;
        switch (this.c) {
            case 0:
                jxi jxiVar = (jxi) this.a.a();
                if (((pkc) this.b.a()).k()) {
                    return jxiVar;
                }
                return null;
            case 1:
                hbj hbjVar = (hbj) this.a.a();
                final boolean zBooleanValue = ((Boolean) this.b.a()).booleanValue();
                return new ovx((oxh) hbjVar.a(gym.b).filter(new hsj(6)).map(new jkv(7)).orElseGet(new Supplier() { // from class: jxd
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return zBooleanValue ? oxh.FPS_240_HFR_8X : oxh.FPS_120_HFR_4X;
                    }
                }));
            case 2:
                Object sfmVar = ((hbj) this.a.a()).p(gym.aj) ? new sfm((jyb) this.b.a()) : sfd.a;
                sfmVar.getClass();
                return sfmVar;
            case 3:
                Object sfmVar2 = ((hbj) this.a.a()).p(gym.aj) ? new sfm(((jyb) this.b.a()).i) : sfd.a;
                sfmVar2.getClass();
                return sfmVar2;
            case 4:
                Object kawVar = ((hfg) this.a).a().n() ? (kbn) this.b.a() : new kaw();
                kawVar.getClass();
                return kawVar;
            case 5:
                tzx tzxVar = this.b;
                iso isoVarA = ((hfg) this.a).a();
                qyc qycVarA = ((kil) tzxVar).a();
                if (isoVarA.n() && qycVarA.a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                return ((iso) this.b.a()).g("mts-long".concat(qpt.cp((hbj) this.a.a())));
            case 7:
                return ((iso) this.b.a()).g("mts-top".concat(qpt.cp((hbj) this.a.a())));
            case 8:
                return ((iso) this.b.a()).g(MyBPCgKwEjJI.drRHbDyxomKD.concat(qpt.cp((hbj) this.a.a())));
            case 9:
                rwc rwcVar = (rwc) this.a.a();
                rwc rwcVar2 = (rwc) this.b.a();
                return (rwcVar2.h() && ((Boolean) rwcVar2.c()).booleanValue()) ? rwcVar.h() ? rwc.j((kan) ((uem) rwcVar.c()).a()) : rvk.a : rvk.a;
            case 10:
                rwc rwcVar3 = (rwc) this.a.a();
                rwc rwcVar4 = (rwc) this.b.a();
                return (rwcVar4.h() && ((Boolean) rwcVar4.c()).booleanValue() && rwcVar3.h()) ? rwc.j((kca) ((uem) rwcVar3.c()).a()) : rvk.a;
            case 11:
                return new obu((hbj) this.a.a(), (fuf) this.b.a());
            case 12:
                kdd kddVar = (kdd) this.b.a();
                owf owfVar = (owf) this.a.a();
                jjr jjrVarA = jju.a();
                jjrVarA.h(jjt.NIGHT_SIGHT);
                jjrVarA.g(jjs.NIGHT_SIGHT);
                jjrVarA.f(owfVar);
                jjrVarA.e(R.string.mode_cuttlefish);
                jjrVarA.c(R.id.cuttlefish_bone_slider);
                jjrVarA.d(kddVar);
                return jjrVarA.a();
            case 13:
                return new ntz(((ngy) this.b).a(), (kek) this.a.a(), 1);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                owf owfVarH = owl.h(owl.c(owl.h(((kfw) this.b.a()).a, new iop(2)), ((mwq) this.a.a()).a), new iop(3));
                owfVarH.getClass();
                return owfVarH;
            case 15:
                our ourVar = (our) this.b.a();
                our ourVar2 = (our) this.a.a();
                ScheduledExecutorService scheduledExecutorServiceCb = ojl.cb("SchCameraEx", 1);
                ourVar.d(new khc(scheduledExecutorServiceCb, 0));
                ourVar2.d(new khc(scheduledExecutorServiceCb, 2));
                return scheduledExecutorServiceCb;
            case 16:
                rwc rwcVarB = ((gad) this.b).b();
                boolean zH = rwcVarB.h();
                pjo pjoVarA = ((kiv) this.a).a();
                if (zH && ((mwq) rwcVarB.c()).A()) {
                    CaptureRequest.Key key = kgx.g;
                    if (kzz.j(key, pjoVarA)) {
                        return qpt.ci(key, true);
                    }
                }
                return qpt.cl();
            case 17:
                scl sclVar = new scl();
                gzg gzgVar = haz.a;
                scn scnVarG = sclVar.g();
                scnVarG.getClass();
                return scnVarG;
            case 18:
                gzi gziVar = hae.a;
                gzi gziVar2 = gzs.a;
                sfd sfdVar = sfd.a;
                sfdVar.getClass();
                return sfdVar;
            case 19:
                owf owfVarCm = qpt.cm(CaptureRequest.JPEG_ORIENTATION, ((fef) this.b).a().a(((kiv) this.a).a()));
                owfVarCm.getClass();
                return owfVarCm;
            default:
                kgk kgkVar = (kgk) this.b.a();
                rwc rwcVar5 = (rwc) this.a.a();
                if (rwcVar5.h()) {
                    kgkVar = (kgk) rwcVar5.c();
                }
                owf owfVarCm2 = qpt.cm(CaptureRequest.CONTROL_AWB_MODE, kgkVar.a);
                owfVarCm2.getClass();
                return owfVarCm2;
        }
    }
}
