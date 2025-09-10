package defpackage;

import j$.time.Duration;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsw implements tzt {
    private final /* synthetic */ int a;

    public hsw(int i) {
        this.a = i;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.a) {
            case 0:
                return new ezh((byte[]) null);
            case 1:
                return new ovx(lcy.WIDE);
            case 2:
                return a.O();
            case 3:
                return new ovx(Float.valueOf(0.0f));
            case 4:
                return new ovx(-1);
            case 5:
                return new htr();
            case 6:
                return new ovx(hvb.a);
            case 7:
                return new ggg((char[]) null, (byte[]) null);
            case 8:
                ExecutorService executorServiceBZ = ojl.bZ("squad-capture");
                executorServiceBZ.getClass();
                return executorServiceBZ;
            case 9:
                return new ovx(0);
            case 10:
                return new jea();
            case 11:
                return a.O();
            case 12:
                return a.O();
            case 13:
                return a.O();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new ovx(new HashSet());
            case 15:
                return a.O();
            case 16:
                ExecutorService executorServiceBZ2 = ojl.bZ("ois-exec");
                executorServiceBZ2.getClass();
                return executorServiceBZ2;
            case 17:
                return new hgc();
            case 18:
                Duration duration = hxf.a;
                return new ovx(hxf.a);
            case 19:
                Duration duration2 = hxf.a;
                return new ovx(hxf.a);
            default:
                return new hgc();
        }
    }
}
