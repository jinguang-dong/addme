package defpackage;

import androidx.window.extensions.area.WindowAreaComponent;
import androidx.window.reflection.Consumer2;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dtt implements Consumer2 {
    final /* synthetic */ dtw a;
    private final Executor b;
    private final dub c;
    private final WindowAreaComponent d;
    private dua e;

    public dtt(dtw dtwVar, Executor executor, dub dubVar, WindowAreaComponent windowAreaComponent) {
        executor.getClass();
        dubVar.getClass();
        windowAreaComponent.getClass();
        this.a = dtwVar;
        this.b = executor;
        this.c = dubVar;
        this.d = windowAreaComponent;
    }

    private final void a() {
        String str = dtw.b;
        this.a.f = false;
        this.e = null;
        this.b.execute(new mb(this, 18));
    }

    public void accept(int i) {
        if (i == 0) {
            a();
        } else {
            if (i != 1) {
                a();
                return;
            }
            dtn dtnVar = new dtn(this.d);
            this.e = dtnVar;
            this.b.execute(new at(this, dtnVar, 17, (byte[]) null));
        }
    }

    @Override // androidx.window.reflection.Consumer2, androidx.window.extensions.core.util.function.Consumer
    public /* bridge */ /* synthetic */ void accept(Object obj) {
        accept(((Number) obj).intValue());
    }
}
