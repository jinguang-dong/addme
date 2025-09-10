package defpackage;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvg extends dvf {
    private final ReentrantLock b;
    private final Map c;
    private final Map d;

    public dvg(WindowLayoutComponent windowLayoutComponent, duf dufVar) {
        super(windowLayoutComponent, dufVar);
        this.b = new ReentrantLock();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    @Override // defpackage.dvf, defpackage.dve, defpackage.dvd
    public final void a(Context context, Executor executor, cnh cnhVar) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            Map map = this.c;
            dvh dvhVar = (dvh) map.get(context);
            if (dvhVar != null) {
                dvhVar.addListener(cnhVar);
                this.d.put(cnhVar, context);
            } else {
                dvh dvhVar2 = new dvh(context);
                map.put(context, dvhVar2);
                this.d.put(cnhVar, context);
                dvhVar2.addListener(cnhVar);
                this.a.addWindowLayoutInfoListener(context, dvhVar2);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.dvf, defpackage.dve, defpackage.dvd
    public final void b(cnh cnhVar) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            Map map = this.d;
            Context context = (Context) map.get(cnhVar);
            if (context == null) {
                return;
            }
            Map map2 = this.c;
            dvh dvhVar = (dvh) map2.get(context);
            if (dvhVar == null) {
                return;
            }
            dvhVar.removeListener(cnhVar);
            map.remove(cnhVar);
            if (dvhVar.isEmpty()) {
                map2.remove(context);
                this.a.removeWindowLayoutInfoListener(dvhVar);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
