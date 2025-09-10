package defpackage;

import android.animation.ValueAnimator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mpc implements paq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public mpc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, und] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.AutoCloseable, java.lang.Object] */
    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() throws Exception {
        switch (this.b) {
            case 0:
                ((mpe) this.a).b.k.a(false);
                return;
            case 1:
                mkr mkrVar = (mkr) this.a;
                mkrVar.m.g(mkrVar.v);
                return;
            case 2:
                ((mts) this.a).d(true);
                return;
            case 3:
                mud mudVar = (mud) this.a;
                if (((Boolean) mudVar.a.dL()).booleanValue()) {
                    mudVar.c.c();
                    return;
                }
                return;
            case 4:
                ((qqq) this.a).n(1);
                return;
            case 5:
                ((qqq) this.a).m(true);
                return;
            case 6:
                ((ValueAnimator) this.a).cancel();
                return;
            case 7:
                ((ndn) this.a).aH(true, false, true, new ndk(1));
                return;
            case 8:
                ((nfb) this.a).b(false);
                return;
            case 9:
                ((AtomicInteger) ((ggg) this.a).a).decrementAndGet();
                return;
            case 10:
            case 12:
                return;
            case 11:
                ung.k(this.a, null);
                return;
            default:
                ?? r3 = this.a;
                if (!(r3 instanceof AutoCloseable)) {
                    throw new IllegalArgumentException();
                }
                r3.close();
                return;
        }
    }

    public /* synthetic */ mpc(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }

    public mpc(ggg gggVar, int i) {
        this.b = i;
        this.a = gggVar;
        ((AtomicInteger) gggVar.a).incrementAndGet();
    }
}
