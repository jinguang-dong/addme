package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class iph implements Consumer {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ iph(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void d(Object obj) {
        int i = this.b;
        if (i == 0) {
            ((iou) obj).a(this.a);
            return;
        }
        if (i == 1) {
            ((isb) obj).g(this.a);
        } else if (i != 2) {
            ((qpt) obj).fq(this.a);
        } else {
            sbp sbpVar = iry.a;
            ((iou) obj).a(this.a);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }
}
