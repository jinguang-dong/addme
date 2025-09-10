package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.libraries.performance.primes.metrics.crash.NativeCrashHandlerImpl;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pku implements tzt {
    private final tzx a;
    private final tzx b;
    private final /* synthetic */ int c;

    public pku(tzx tzxVar, tzx tzxVar2, int i) {
        this.c = i;
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    /* JADX WARN: Type inference failed for: r4v50, types: [java.lang.Object, prb] */
    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.c) {
            case 0:
                return new pkt(((inh) this.a).a(), ((pba) this.b).a());
            case 1:
                return new ojl(((pfm) this.b).b());
            case 2:
                return new pkv(((inh) this.a).a(), ((pba) this.b).a());
            case 3:
                rwc rwcVar = (rwc) this.b.a();
                plc plcVar = (plc) (rwcVar.h() ? rwcVar.c() : this.a.a());
                plcVar.getClass();
                return plcVar;
            case 4:
                rwc rwcVar2 = (rwc) this.b.a();
                plc plcVar2 = (plc) (rwcVar2.h() ? rwcVar2.c() : this.a.a());
                plcVar2.getClass();
                return plcVar2;
            case 5:
                boolean z = ((pnp) this.a.a()).c;
                Log.w("MediaFsQModule", "Returning Q MediaFs implementation");
                return ((pps) this.b).a();
            case 6:
                return new qdc((syw) this.a.a());
            case 7:
                ((imm) this.b).b();
                return new qdo();
            case 8:
                return new pxk((lat) this.a.a(), (ScheduledExecutorService) this.b.a(), 0);
            case 9:
                return new qat(((imm) this.b).b(), (ren) this.a.a());
            case 10:
                SharedPreferences sharedPreferences = (SharedPreferences) ((rww) ((ixr) this.a).b().e(new fvq(((imm) this.b).b(), 12))).fr();
                sharedPreferences.getClass();
                return sharedPreferences;
            case 11:
                if (!rcc.e()) {
                    qqn qqnVar = (qqn) this.b.a();
                    if (!qqn.b()) {
                        sgt sgtVar = (sgt) qnj.a.c().M(5676);
                        Object obj = qqnVar.a;
                        sgtVar.v("Primes init triggered from background in package: %s", obj);
                        if (!qqnVar.a()) {
                            throw new IllegalStateException(String.format("Primes init triggered from background in package: %s", obj));
                        }
                    }
                }
                return new qnc(((qnf) this.a).a());
            case 12:
                qnk qnkVar = (qnk) this.a.a();
                syx syxVarB = qnkVar.a;
                qpf qpfVarA = ((pra) this.b).a();
                if (syxVarB == null) {
                    int i = qnkVar.c;
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i, new qni(qnkVar.b), new qnh());
                    scheduledThreadPoolExecutor.setMaximumPoolSize(i);
                    syxVarB = ske.B(scheduledThreadPoolExecutor);
                    ?? r4 = qpfVarA.a;
                    if (r4 != 0) {
                        syxVarB = r4.a();
                    }
                }
                syxVarB.getClass();
                return syxVarB;
            case 13:
                return new qob(this.a);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new qpf(((imm) this.b).b(), (qqe) this.a.a());
            case 15:
                return new sjp(((qow) this.a).a(), ((imm) this.b).b());
            case 16:
                ((jaf) this.a).b();
                return new sfm((qqs) this.b.a());
            case 17:
                Object sfmVar = !((rwc) ((tzu) this.a).a).h() ? sfd.a : new sfm((qqs) this.b.a());
                sfmVar.getClass();
                return sfmVar;
            case 18:
                return new NativeCrashHandlerImpl((rwc) ((tzu) this.a).a, this.b);
            case 19:
                Set setQ = jsv.q(((jaf) this.a).b(), this.b);
                setQ.getClass();
                return setQ;
            default:
                Set setQ2 = jsv.q((rwc) ((tzu) this.a).a, this.b);
                setQ2.getClass();
                return setQ2;
        }
    }

    public pku(tzx tzxVar, tzx tzxVar2, int i, float[] fArr) {
        this.c = i;
        this.b = tzxVar;
        this.a = tzxVar2;
    }
}
