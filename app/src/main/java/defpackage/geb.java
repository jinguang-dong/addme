package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class geb implements Consumer {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ geb(long j, int i) {
        this.b = i;
        this.a = j;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.b;
        if (i == 0) {
            ((oyi) obj).i(this.a);
            return;
        }
        if (i == 1) {
            ((oyi) obj).m(this.a);
            return;
        }
        if (i == 2) {
            ((oyi) obj).i(this.a);
            return;
        }
        if (i == 3) {
            ((oyi) obj).m(this.a);
            return;
        }
        if (i == 4) {
            ((oyi) obj).k(this.a);
        } else if (i != 5) {
            ((lst) obj).e(this.a);
        } else {
            ((oyi) obj).k(this.a);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }
}
