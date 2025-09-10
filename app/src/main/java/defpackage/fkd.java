package defpackage;

import j$.util.Optional;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkd implements tzt {
    private final /* synthetic */ int a;

    public fkd(int i) {
        this.a = i;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.a) {
            case 0:
                return a.O();
            case 1:
                return a.O();
            case 2:
                return new ovx(Optional.empty());
            case 3:
                return a.P();
            case 4:
                return a.P();
            case 5:
                return new ovx(0);
            case 6:
                sgv sgvVar = fml.a;
                return new ovx(Optional.empty());
            case 7:
                sgv sgvVar2 = fml.a;
                return new ovx(fne.a);
            case 8:
                sgv sgvVar3 = fml.a;
                return sbv.o(fmh.FIRST_CAPTURE, fml.b, fmh.SECOND_CAPTURE, fml.c);
            case 9:
                sgv sgvVar4 = fml.a;
                return a.Q();
            case 10:
                sgv sgvVar5 = fml.a;
                return a.O();
            case 11:
                return new ovx(Optional.empty());
            case 12:
                return new ovx(fpa.UNKNOWN);
            case 13:
                return new szh();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new fqg();
            case 15:
                return new fql();
            case 16:
                return new fri();
            case 17:
                ScheduledExecutorService scheduledExecutorService = frp.a;
                ovc ovcVarA = ovd.a();
                ovcVarA.a = "CriticalPath";
                ovcVarA.b(-1);
                ovcVarA.c(1);
                return new fsd(ojl.ca(ovcVarA.a()));
            case 18:
                ScheduledExecutorService scheduledExecutorService2 = frp.a;
                scheduledExecutorService2.getClass();
                return scheduledExecutorService2;
            case 19:
                return new ojl();
            default:
                ScheduledExecutorService scheduledExecutorService3 = frp.b;
                scheduledExecutorService3.getClass();
                return scheduledExecutorService3;
        }
    }
}
