package defpackage;

import android.app.Application;
import android.os.SystemClock;
import com.pairip.StartupLauncher;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jhm extends Application {
    protected static final long l;
    public final jgj m = new jgj();

    @Override // android.app.Application
    public void onCreate() {
        jgi jgiVar = new jgi(0);
        jgj jgjVar = this.m;
        jgjVar.f(jgiVar);
        jgjVar.d = jgiVar;
        super.onCreate();
    }

    @Override // android.app.Application
    public final void onTerminate() {
        jgj jgjVar = this.m;
        jgjVar.a(jgjVar.d);
        for (jhh jhhVar : jgjVar.a) {
            if (jhhVar instanceof jgn) {
                ((jgn) jhhVar).a();
            }
        }
        super.onTerminate();
    }

    static {
        StartupLauncher.launch();
        l = SystemClock.elapsedRealtimeNanos();
    }
}
