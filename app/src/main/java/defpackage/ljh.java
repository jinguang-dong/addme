package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.SharedPreferences;
import android.util.Range;
import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;
import j$.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ljh implements tzt {
    private final tzx a;
    private final tzx b;
    private final /* synthetic */ int c;

    public ljh(tzx tzxVar, tzx tzxVar2, int i) {
        this.c = i;
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    public ljh(tzx tzxVar, tzx tzxVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = tzxVar;
        this.a = tzxVar2;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        boolean z = true;
        switch (this.c) {
            case 0:
                Object sfmVar = !((hbj) this.b.a()).o(hal.d) ? sfd.a : new sfm(((ljl) this.a).a());
                sfmVar.getClass();
                return sfmVar;
            case 1:
                return new ljd((noy) this.b.a(), (owq) this.a.a());
            case 2:
                Object obj = (lkg) this.a.a();
                if (!((hbj) this.b.a()).p(hba.v)) {
                    obj = new gwy() { // from class: ljs
                        @Override // defpackage.gwy
                        public final void a(int i) {
                        }
                    };
                }
                obj.getClass();
                return obj;
            case 3:
                tzx tzxVar = this.a;
                pjp pjpVarA = ((pab) this.b).a();
                hbj hbjVar = (hbj) tzxVar.a();
                if (!hbjVar.o(hal.e) || !hbjVar.o(hal.a)) {
                    return sfc.a;
                }
                sbr sbrVar = new sbr();
                sbr sbrVar2 = new sbr();
                for (pka pkaVar : pka.values()) {
                    Set<pjo> setF = kqn.f(pkaVar, pjpVarA);
                    sbp sbpVarD = kqn.d(setF);
                    if (!sbpVarD.isEmpty()) {
                        sbrVar.j((Map) smz.k(new smy(Collection.EL.stream(sbpVarD), Collection.EL.stream(sbpVarD).skip(1L)).d(new idg(new kqm(0), 2))).b(new jkv(16)).e());
                        pjo pjoVarA = pjpVarA.a((pjr) pjpVarA.h(pkaVar).get(0));
                        pjo pjoVar = (pjo) ujp.aQ(sbpVarD);
                        sbrVar.f(Double.valueOf(kqn.a(pjoVar)), kqn.c(pjoVar, pjoVarA, pjoVarA.c()));
                        sbv sbvVarB = sbrVar.b();
                        for (pjo pjoVar2 : setF) {
                            Range range = (Range) sbvVarB.get(Double.valueOf(kqn.a(pjoVar2)));
                            range.getClass();
                            sbrVar2.f(pjoVar2.j(), range);
                        }
                    }
                }
                return sbrVar2.e();
            case 4:
                return qpt.bR((lkk) this.a.a(), (nms) this.b.a(), false);
            case 5:
                Object sfmVar2 = !((hbj) this.b.a()).o(hal.c) ? sfd.a : new sfm(((lkq) this.a).a());
                sfmVar2.getClass();
                return sfmVar2;
            case 6:
                hbj hbjVar2 = (hbj) this.b.a();
                return (hbjVar2.o(hal.a) && hbjVar2.o(hal.d) && hbjVar2.o(hal.b) && hbjVar2.o(hal.c)) ? new jjy(this.a, 4) : nkm.r;
            case 7:
                return new llm(new lgc(((imm) this.b).b(), 17), (pbn) this.a.a());
            case 8:
                tzx tzxVar2 = this.a;
                Activity activityA = ((imn) this.b).a();
                KeyguardManager keyguardManagerA = ((ine) tzxVar2).a();
                if (!lqe.a(activityA.getIntent())) {
                    z = false;
                } else if ((!keyguardManagerA.isKeyguardLocked() || !keyguardManagerA.isDeviceLocked()) && !ActivityManager.isRunningInTestHarness()) {
                    ((sgt) lqe.a.c().M(4316)).s("Warning: Overriding the secure camera intent because the keyguard is not currently locked. The camera will open in normal mode.");
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                return new njm(this.b, this.a, 1);
            case 10:
                return new lrd(((inh) this.a).a(), (Executor) this.b.a());
            case 11:
                return new lrh(((inh) this.a).a(), (Executor) this.b.a());
            case 12:
                return new lat(((inh) this.a).a(), (Executor) this.b.a());
            case 13:
                return new obu(((tzz) this.a).a(), (krj) this.b.a());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new luj((hbj) this.b.a(), (SharedPreferences) this.a.a());
            case 15:
                return new lun(((imm) this.b).b(), (SharedPreferences) this.a.a());
            case 16:
                return ((luo) this.a).a().n("pref_mode_vesper_level", ((kbt) this.b).b().intValue());
            case 17:
                return ((hbj) this.b.a()).p(gzo.bm) ? ((luo) this.a).a().m("pref_camera_cd_indicator_enabled_key", true) : owp.a(Boolean.FALSE);
            case 18:
                hbj hbjVar3 = (hbj) this.b.a();
                return (hbjVar3.p(gzo.aY) || hbjVar3.p(gzo.aZ)) ? ((luo) this.a).a().m(OPuAVreQM.MkzNmBduPchY, false) : owp.a(Boolean.FALSE);
            case 19:
                return !((hbj) this.b.a()).p(gzb.b) ? owp.a(false) : ((luo) this.a).a().m("key_ff_opt_in", false);
            default:
                return ((hbj) this.b.a()).p(hac.T) ? ((luo) this.a).a().m("pref_camera_kepler_enabled_key", true) : owp.a(Boolean.FALSE);
        }
    }
}
