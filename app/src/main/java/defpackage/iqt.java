package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class iqt implements pau {
    final /* synthetic */ Object a;
    private final AtomicBoolean b = new AtomicBoolean(true);
    private muj c;
    private final /* synthetic */ int d;

    public iqt(iqu iquVar, int i, byte[] bArr) {
        this.d = i;
        this.a = iquVar;
    }

    @Override // defpackage.pau
    public final /* synthetic */ void a(Object obj) {
        if (this.d != 0) {
            muj mujVar = (muj) obj;
            if (this.b.compareAndSet(true, false)) {
                this.c = mujVar;
                return;
            } else {
                if (qpt.bo(this.c, mujVar)) {
                    ((ips) ((iqu) this.a).a).b.h();
                    return;
                }
                return;
            }
        }
        muj mujVar2 = (muj) obj;
        if (this.b.compareAndSet(true, false)) {
            this.c = mujVar2;
        } else if (qpt.bo(this.c, mujVar2)) {
            ((iqv) ((iqu) this.a).a).b.h();
        }
    }

    public iqt(iqu iquVar, int i) {
        this.d = i;
        this.a = iquVar;
    }
}
