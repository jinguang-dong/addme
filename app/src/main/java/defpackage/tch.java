package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class tch implements Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ tch(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((Runnable) obj).run();
                break;
            case 1:
                ((Runnable) obj).run();
                break;
            case 2:
                ((Runnable) obj).run();
                break;
            case 3:
                ((Runnable) obj).run();
                break;
            case 4:
                ((Runnable) obj).run();
                break;
            case 5:
                ((Runnable) obj).run();
                break;
            case 6:
                ((tej) obj).close();
                break;
            case 7:
                ((teq) obj).close();
                break;
            case 8:
                ((foi) obj).b();
                break;
            case 9:
                ((tel) obj).close();
                break;
            default:
                ((tek) obj).close();
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
