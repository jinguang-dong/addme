package defpackage;

import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.camera.stats.ViewfinderJankSession;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import j$.util.Optional;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lva implements tzt {
    private final tzx a;
    private final tzx b;
    private final /* synthetic */ int c;

    public lva(tzx tzxVar, tzx tzxVar2, int i) {
        this.c = i;
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.c) {
            case 0:
                return ((luo) this.a).a().m("pref_camera_selfie_mirror_key", ((hbj) this.b.a()).p(gzo.aI));
            case 1:
                hbj hbjVar = (hbj) this.b.a();
                return !hbjVar.p(hae.r) ? owp.a(Boolean.FALSE) : !hbjVar.o(gzo.bC) ? owp.a(Boolean.TRUE) : ((luo) this.a).a().m("pref_camera_raw_output_option_available_key", false);
            case 2:
                return new jit(new HashMap(), new jis(new jit(new iml(((imm) this.b).b()), (mdy) this.a.a(), 0), TimeUnit.MILLISECONDS), 1);
            case 3:
                tzx tzxVar = this.b;
                mwq mwqVarA = ((luo) this.a).a();
                hbj hbjVar2 = (hbj) tzxVar.a();
                HashSet hashSet = new HashSet(Arrays.asList(ltt.values()));
                if (!hbjVar2.o(gzo.aH)) {
                    hashSet.remove(ltt.FPS_60);
                }
                if (!hbjVar2.o(gzo.R)) {
                    hashSet.remove(ltt.FPS_AUTO);
                }
                if (!hbjVar2.p(gym.B)) {
                    hashSet.remove(ltt.FPS_24);
                }
                ltt lttVar = ltt.FPS_AUTO;
                if (!hashSet.contains(lttVar) || !hbjVar2.p(gzo.Q)) {
                    lttVar = ltt.FPS_30;
                    if (!hashSet.contains(lttVar)) {
                        ((sgt) luy.a.b().M(4438)).s("30 FPS is not available");
                    }
                }
                luv luvVar = new luv(mwqVarA.o("pref_video_fps_p2018_key", lttVar.name()));
                if (!hashSet.contains(luvVar.dL())) {
                    luvVar.dL();
                    luvVar.a(lttVar);
                }
                return luvVar;
            case 4:
                return new luw(((luo) this.a).a().o("pref_video_resolution", ((lty) this.b.a()).name()));
            case 5:
                return new gox(((imm) this.a).b(), ((hdo) this.b).a());
            case 6:
                return new ftb((lwz) this.a.a(), (owf) this.b.a(), 3, null);
            case 7:
                return ((lww) this.b.a()).a ? Optional.of((lxa) this.a.a()) : Optional.empty();
            case 8:
                Object sfmVar = ((lww) this.b.a()).a ? new sfm((lwy) this.a.a()) : sfd.a;
                sfmVar.getClass();
                return sfmVar;
            case 9:
                syu syuVar = (syu) this.a.a();
                ((hfg) this.b).a();
                iso.p();
                return new sfm(new lym(syuVar));
            case 10:
                pit pitVar = (pit) this.a.a();
                ((hfg) this.b).a();
                iso.p();
                return new sfm(new lxm(pitVar));
            case 11:
                return new mbk((mbj) this.b.a(), (pbn) this.a.a());
            case 12:
                owf owfVarH = owl.h(owl.a((owf) this.b.a(), ((luj) this.a.a()).a(luf.be)), new leb(14));
                owfVarH.getClass();
                return owfVarH;
            case 13:
                out outVar = (out) this.b.a();
                CameraActivityTiming cameraActivityTiming = (CameraActivityTiming) this.a.a();
                mdl mdlVar = new mdl(outVar);
                ojl.cj(mdlVar.d, new miz(cameraActivityTiming, 1));
                return mdlVar;
            default:
                final Instrumentation instrumentation = (Instrumentation) this.a.a();
                return new mes() { // from class: mdh
                    @Override // defpackage.mes
                    public final Object a() {
                        ViewfinderJankSession viewfinderJankSession = new ViewfinderJankSession();
                        instrumentation.f(viewfinderJankSession);
                        return viewfinderJankSession;
                    }
                };
        }
    }

    public lva(tzx tzxVar, tzx tzxVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = tzxVar;
        this.a = tzxVar2;
    }
}
