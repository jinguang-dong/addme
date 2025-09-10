package defpackage;

import com.google.android.apps.camera.bottombar.ThumbnailView;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ftb implements mcw {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ftb(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, mcw] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            Object obj = this.a;
            if (obj instanceof fsr) {
                ojl.ck(((fsr) obj).c(), new iyn(this.b, 1), sxo.a);
                return;
            }
            return;
        }
        if (i == 1) {
            this.b.a(Optional.of(Float.valueOf(((ThumbnailView) this.a).g)));
            return;
        }
        if (i == 2) {
            ((mns) this.b).c((kgt) this.a);
        } else if (i == 3) {
            ((lqp) this.a).e(this.b);
        } else if (((AtomicBoolean) this.b).compareAndSet(false, true)) {
            this.a.run();
        }
    }

    public /* synthetic */ ftb(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
