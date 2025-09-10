package defpackage;

import com.google.android.apps.camera.logging.InstrumentationCameraEventLogger;
import j$.util.Optional;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class isr implements tzt {
    private final /* synthetic */ int a;

    public isr(int i) {
        this.a = i;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.a) {
            case 0:
                return new pqn();
            case 1:
                return new isc();
            case 2:
                return new ezh((byte[]) null);
            case 3:
                return new itw();
            case 4:
                return new tdi();
            case 5:
                return new ivt();
            case 6:
                return a.P();
            case 7:
                return a.O();
            case 8:
                return new ovx(iwt.LANDSCAPE);
            case 9:
                return new ovx(ixq.INACTIVE);
            case 10:
                return Optional.empty();
            case 11:
                return a.P();
            case 12:
                return new ovx(jhr.PSL);
            case 13:
                return a.N();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new InstrumentationCameraEventLogger();
            case 15:
                return new jiq();
            case 16:
                return a.O();
            case 17:
                return new ovx(new jjp(null));
            case 18:
                return new ovx(Optional.empty());
            case 19:
                return a.O();
            default:
                ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(2);
                scheduledExecutorServiceNewScheduledThreadPool.getClass();
                return scheduledExecutorServiceNewScheduledThreadPool;
        }
    }
}
