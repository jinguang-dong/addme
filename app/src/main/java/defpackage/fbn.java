package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.ArraySet;
import android.view.View;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbn implements tzt {
    private final tzx a;
    private final tzx b;
    private final /* synthetic */ int c;

    public fbn(tzx tzxVar, tzx tzxVar2, int i) {
        this.c = i;
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.c) {
            case 0:
                return new fbm((gox) this.a.a(), (fqg) this.b.a());
            case 1:
                Object sfmVar = !((kiu) this.a).a().F() ? sfd.a : new sfm(qpt.cm(CaptureRequest.CONTROL_AF_REGIONS, ((kft) this.b).a()));
                sfmVar.getClass();
                return sfmVar;
            case 2:
                Object fhmVar = ((nkv) this.a).a() != nkw.PHOTO ? new fhm(1) : (mcw) this.b.a();
                fhmVar.getClass();
                return fhmVar;
            case 3:
                return new gpu((pbn) this.a.a(), "lslogging", this.b, 4);
            case 4:
                return new fea((fdy) this.a.a(), (CameraActivityTiming) this.b.a());
            case 5:
                return new feb(((imu) this.b).a(), (out) this.a.a());
            case 6:
                return new jod((uem) this.a, (uem) this.b);
            case 7:
                ArraySet arraySet = new ArraySet();
                ffk ffkVar = (ffk) this.b.a();
                ffm ffmVar = ffkVar.a;
                ffkVar.g();
                arraySet.add(ffkVar);
                ffh ffhVar = (ffh) this.a.a();
                if (((ffg) ffhVar.b()).a) {
                    arraySet.add(ffhVar);
                }
                scn scnVarF = scn.F(arraySet);
                scnVarF.getClass();
                return scnVarF;
            case 8:
                gzi gziVar = gyg.a;
                ffq ffqVar = (ffq) this.a.a();
                Object sfmVar2 = ffqVar.b.c() ? new sfm(ffqVar) : sfd.a;
                sfmVar2.getClass();
                return sfmVar2;
            case 9:
                return new ffh((ffk) this.b.a(), (hbj) this.a.a());
            case 10:
                owf owfVar = (owf) this.a.a();
                fqg fqgVar = (fqg) this.b.a();
                ovx ovxVar = new ovx(false);
                fqgVar.b.d(owb.a(owl.h(owfVar, new fgb(2))).dK(ovxVar, sxo.a));
                return ovxVar;
            case 11:
                owf owfVar2 = (owf) this.a.a();
                fqg fqgVar2 = (fqg) this.b.a();
                ovx ovxVar2 = new ovx(false);
                fqgVar2.b.d(owb.a(owl.h(owfVar2, new fgb(1))).dK(ovxVar2, sxo.a));
                return ovxVar2;
            case 12:
                return new fgq((out) this.a.a(), (fft) this.b.a());
            case 13:
                return new pmg((fgq) this.b.a(), ((nlf) this.a).a());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new npo((fkm) this.b.a(), new owi(Boolean.valueOf(((hbj) this.a.a()).o(gyi.h))), npm.COTTAGE);
            case 15:
                owf owfVar3 = (owf) this.b.a();
                owq owqVar = (owq) this.a.a();
                sgv sgvVar = fml.a;
                owf owfVarC = owl.c(owl.h(owfVar3, new fgb(7)), owqVar);
                owfVarC.getClass();
                return owfVarC;
            case 16:
                return new jtl((View) ((mwq) this.a.a()).a, (mwq) this.b.a());
            case 17:
                return new fst((Executor) this.b.a(), (syu) this.a.a());
            case 18:
                return new fst(((fry) this.b).b(), (syu) this.a.a());
            case 19:
                tzx tzxVar = this.b;
                tzx tzxVar2 = this.a;
                Object objA = tzxVar.a();
                rnn rnnVar = (rnn) tzxVar2.a();
                syu syuVar = ((fsp) objA).e;
                syuVar.c(new fnf(rnnVar.c(), 4), sxo.a);
                return syuVar;
            default:
                return new fst(((fth) this.b).b(), (syu) this.a.a());
        }
    }

    public fbn(tzx tzxVar, tzx tzxVar2, int i, char[] cArr) {
        this.c = i;
        this.b = tzxVar;
        this.a = tzxVar2;
    }
}
