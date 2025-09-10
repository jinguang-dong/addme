package defpackage;

import android.os.HandlerThread;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Consumer;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpg implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public fpg(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                owf owfVarA = owb.a((owq) this.a.a());
                owfVarA.getClass();
                return owfVarA;
            case 1:
                sbv sbvVar = (sbv) this.a.a();
                sgv sgvVar = fml.a;
                sbv sbvVar2 = (sbv) smz.j(sbvVar).c(new fik(14)).e();
                sbvVar2.getClass();
                return sbvVar2;
            case 2:
                owf owfVarA2 = owb.a((owq) this.a.a());
                owfVarA2.getClass();
                return owfVarA2;
            case 3:
                gzi gziVar = gyi.a;
                return new fpf();
            case 4:
                return ((hbj) this.a.a()).o(gyi.q) ? new fpt() : new fpf();
            case 5:
                return new fpw(((imm) this.a).b());
            case 6:
                Executor executor = (Executor) this.a.a();
                executor.getClass();
                return ujp.aa(executor);
            case 7:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.a.a();
                ScheduledExecutorService scheduledExecutorService2 = frp.a;
                return new ouy(scheduledExecutorService);
            case 8:
                ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) this.a.a();
                ScheduledExecutorService scheduledExecutorService4 = frp.a;
                syx syxVarB = ske.B(scheduledExecutorService3);
                syxVarB.getClass();
                return syxVarB;
            case 9:
                ExecutorService executorService = (ExecutorService) this.a.a();
                ScheduledExecutorService scheduledExecutorService5 = frp.a;
                return new ouy(executorService);
            case 10:
                ScheduledExecutorService scheduledExecutorService6 = (ScheduledExecutorService) this.a.a();
                ScheduledExecutorService scheduledExecutorService7 = frp.a;
                return new ovb(scheduledExecutorService6);
            case 11:
                ExecutorService executorServiceB = ((fru) this.a).b();
                ScheduledExecutorService scheduledExecutorService8 = frp.a;
                return executorServiceB;
            case 12:
                out outVar = (out) this.a.a();
                ScheduledExecutorService scheduledExecutorService9 = frp.a;
                return new ouv(new oux(outVar));
            case 13:
                Executor executor2 = (Executor) this.a.a();
                ScheduledExecutorService scheduledExecutorService10 = frp.a;
                return new szg(executor2);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new nmw((HandlerThread) this.a.a());
            case 15:
                return new ovv((pbn) this.a.a());
            case 16:
                return ((fsp) this.a.a()).d;
            case 17:
                final szh szhVar = ((fsp) this.a.a()).c;
                return new Consumer() { // from class: fsy
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void d(Object obj) {
                        szhVar.e((fsq) obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                };
            case 18:
                return new out(new fst(out.a, (syu) this.a.a()));
            case 19:
                return ((fsp) this.a.a()).b;
            default:
                pbp pbpVarA = ((pbn) this.a.a()).a("FirstUiFrameReadiness");
                szh szhVar2 = new szh();
                fta.a(szhVar2, "FirstUiFrameReadiness");
                szhVar2.c(new fnf(pbpVarA, 3), sxo.a);
                return szhVar2;
        }
    }
}
