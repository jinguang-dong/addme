package defpackage;

import java.util.ArrayDeque;
import java.util.LinkedHashSet;
import java.util.concurrent.ExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpw implements tzt {
    private final /* synthetic */ int a;

    public gpw(int i) {
        this.a = i;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        int i = this.a;
        Float fValueOf = Float.valueOf(1.0f);
        switch (i) {
            case 0:
                ExecutorService executorServiceBZ = ojl.bZ("cvk-ex");
                executorServiceBZ.getClass();
                return executorServiceBZ;
            case 1:
                return true;
            case 2:
                return new gpn();
            case 3:
                return new szh();
            case 4:
                return new gqm();
            case 5:
                return new cxb((short[]) null, (byte[]) null);
            case 6:
                return new gsn();
            case 7:
                return new gsh();
            case 8:
                return a.Q();
            case 9:
                return new gty();
            case 10:
                return new gub();
            case 11:
                return a.O();
            case 12:
                return new ovx(fValueOf);
            case 13:
                return new ovx(fValueOf);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return a.Q();
            case 15:
                return new ArrayDeque();
            case 16:
                return new ovx(new gxi(null));
            case 17:
                return new LinkedHashSet();
            case 18:
                return new ovx(gxj.a);
            case 19:
                return new pay("Generic", new hcp());
            default:
                return new ezh(null, null, null, null);
        }
    }
}
