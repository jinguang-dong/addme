package defpackage;

import com.google.ar.core.R;
import java.util.Timer;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggs implements tzt {
    private final tzx a;
    private final tzx b;
    private final /* synthetic */ int c;

    public ggs(tzx tzxVar, tzx tzxVar2, int i) {
        this.c = i;
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        sbp sbpVarM;
        switch (this.c) {
            case 0:
                return new ggr((hbj) this.a.a(), (luv) this.b.a());
            case 1:
                return hax.c((hbj) this.b.a()) ? ((luj) this.a.a()).a(luf.W) : new ovx(false);
            case 2:
                return new ggt((hbj) this.a.a(), (luv) this.b.a());
            case 3:
                return new ghn((mny) this.b.a(), ((gad) this.a).b());
            case 4:
                ojl ojlVar = (ojl) this.a.a();
                fdq fdqVarA = ((ixw) this.b).a();
                gkf gkfVar = new gkf(ojlVar);
                fdqVarA.j().d(gkfVar);
                return gkfVar;
            case 5:
                return new gkt((lob) this.a.a(), ((lns) this.b).a());
            case 6:
                Object sfmVar = ((hbj) this.b.a()).p(gym.am) ? new sfm((gld) this.a.a()) : sfd.a;
                sfmVar.getClass();
                return sfmVar;
            case 7:
                Object sfmVar2 = ((Boolean) this.b.a()).booleanValue() ? new sfm((gmn) this.a.a()) : sfd.a;
                sfmVar2.getClass();
                return sfmVar2;
            case 8:
                return new gna((imi) this.a.a(), ((imm) this.b).b(), new Timer());
            case 9:
                hbj hbjVar = (hbj) this.b.a();
                gng gngVarA = ((gnh) this.a).a();
                if (hbjVar.p(gzo.by)) {
                    jjr jjrVarA = jju.a();
                    jjrVarA.h(jjt.VIDEO_SPEED_SLOWMOTION);
                    jjrVarA.g(jjs.VIDEO_SPEED_SLOWMOTION);
                    jjrVarA.i(R.drawable.quantum_gm_ic_slow_motion_video_white_24);
                    jjrVarA.e(R.string.manual_video_speed);
                    jjrVarA.c(R.id.video_speed_controls);
                    jjrVarA.d(gngVarA);
                    jju jjuVarA = jjrVarA.a();
                    jjr jjrVarA2 = jju.a();
                    jjrVarA2.h(jjt.VIDEO_SPEED_TIMELAPSE);
                    jjrVarA2.g(jjs.VIDEO_SPEED_TIMELAPSE);
                    jjrVarA2.i(R.drawable.quantum_gm_ic_fast_forward_white_24);
                    jjrVarA2.e(R.string.manual_video_speed);
                    jjrVarA2.c(R.id.video_speed_controls);
                    jjrVarA2.d(gngVarA);
                    sbpVarM = sbp.m(jjuVarA, jjrVarA2.a());
                } else {
                    int i = sbp.d;
                    sbpVarM = sex.a;
                }
                sbpVarM.getClass();
                return sbpVarM;
            case 10:
                return new jod((ngk) this.a.a(), ((gnj) this.b).a(), (byte[]) null);
            case 11:
                return new fwe((Object) this.b, (uem) this.a, 2);
            case 12:
                return new iso(((imm) this.b).b(), (iso) this.a.a());
            case 13:
                return new pbs(new szg((Executor) this.a.a()), (pbn) this.b.a(), "cvkTracingExecutor");
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                scn scnVarH = scn.H((gsm) this.a.a(), (gsk) this.b.a());
                scnVarH.getClass();
                return scnVarH;
            case 15:
                return new gqq((out) this.a.a(), (cxb) this.b.a());
            case 16:
                return new grd((ScheduledExecutorService) this.a.a(), (hbj) this.b.a());
            case 17:
                return new iso(((imm) this.b).b(), (out) this.a.a(), (byte[]) null);
            case 18:
                return new pmg((gsz) this.b.a(), (owf) this.a.a());
            case 19:
                return new pmg((owf) this.a.a(), (gsz) this.b.a());
            default:
                return new guh((gub) this.b.a(), (hbj) this.a.a());
        }
    }

    public ggs(tzx tzxVar, tzx tzxVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = tzxVar;
        this.a = tzxVar2;
    }
}
