package defpackage;

import android.hardware.HardwareBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ngh implements paq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ngh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ndj] */
    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        switch (this.b) {
            case 0:
                ((ngk) this.a).h();
                break;
            case 1:
                this.a.M(false);
                break;
            case 2:
                ((AtomicInteger) this.a).decrementAndGet();
                break;
            case 3:
                ((HardwareBuffer) this.a).close();
                break;
            case 4:
                ((mwq) this.a).K();
                break;
            case 5:
                ((pgk) this.a).cm();
                break;
            case 6:
                ((pgn) this.a).e();
                break;
            default:
                ((ReentrantLock) this.a).unlock();
                break;
        }
    }
}
