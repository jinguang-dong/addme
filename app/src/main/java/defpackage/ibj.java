package defpackage;

import com.google.android.apps.camera.ui.gridlines.gBW.mNLbzhCxd;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ibj {
    public static final sgv a = sgv.g(mNLbzhCxd.WnkaLYai);
    public final pbn b;
    private final Executor c;

    public ibj(Executor executor, pbn pbnVar) {
        this.c = executor;
        this.b = pbnVar;
    }

    public final void a(ibi ibiVar, Consumer consumer, Runnable runnable, gga ggaVar, iea ieaVar) {
        this.c.execute(new ffz(this, ieaVar, ibiVar, ggaVar, consumer, runnable, 3));
    }
}
