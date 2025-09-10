package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mdl implements mcw {
    public static final sgv a = sgv.g("mdl");
    public static final long b = TimeUnit.MILLISECONDS.toNanos(30);
    public final List c = new ArrayList();
    public final szh d = new szh();
    private final out e;

    public mdl(out outVar) {
        this.e = outVar;
    }

    public final void a() {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: mdj
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                mdl mdlVar = this.a;
                List list = mdlVar.c;
                list.add(Long.valueOf(j));
                if (list.size() > 100) {
                    ((sgt) mdl.a.c().M(4703)).v("%s", "Never reached the steady state.");
                    mdlVar.d.a(new TimeoutException("Never reached the steady state."));
                    return;
                }
                int i = 0;
                int i2 = 0;
                while (i < list.size() - 1) {
                    int i3 = i + 1;
                    i2 = ((Long) list.get(i3)).longValue() - ((Long) list.get(i)).longValue() < mdl.b ? i2 + 1 : 0;
                    i = i3;
                }
                if (i2 >= 10) {
                    mdlVar.d.e(null);
                } else {
                    mdlVar.a();
                }
            }
        });
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.execute(new Runnable() { // from class: mdk
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a();
            }
        });
    }
}
