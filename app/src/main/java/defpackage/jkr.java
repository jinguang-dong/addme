package defpackage;

import android.support.v7.widget.RecyclerView;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jkr implements IntConsumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jkr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        int i2 = this.b;
        if (i2 == 0) {
            ((ki) this.a).f(i);
            return;
        }
        if (i2 == 1) {
            ((ki) this.a).f(i);
            return;
        }
        if (i2 == 2) {
            ((RecyclerView) this.a).af(i);
        } else if (i2 != 3) {
            ((ki) this.a).g(i, "");
        } else {
            ((ki) this.a).g(i, "");
        }
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? IntConsumer$CC.$default$andThen(this, intConsumer) : IntConsumer$CC.$default$andThen(this, intConsumer) : IntConsumer$CC.$default$andThen(this, intConsumer) : IntConsumer$CC.$default$andThen(this, intConsumer) : IntConsumer$CC.$default$andThen(this, intConsumer);
    }
}
