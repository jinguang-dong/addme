package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dvf extends dve {
    public final WindowLayoutComponent a;
    private final duf b;
    private final ReentrantLock c = new ReentrantLock();
    private final Map d = new LinkedHashMap();
    private final Map e = new LinkedHashMap();
    private final Map f = new LinkedHashMap();

    public dvf(WindowLayoutComponent windowLayoutComponent, duf dufVar) {
        this.a = windowLayoutComponent;
        this.b = dufVar;
    }

    @Override // defpackage.dve, defpackage.dvd
    public void a(Context context, Executor executor, cnh cnhVar) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            Map map = this.d;
            MulticastConsumer multicastConsumer = (MulticastConsumer) map.get(context);
            if (multicastConsumer != null) {
                multicastConsumer.a(cnhVar);
                this.e.put(cnhVar, context);
            } else {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                map.put(context, multicastConsumer2);
                this.e.put(cnhVar, context);
                multicastConsumer2.a(cnhVar);
                duf dufVar = this.b;
                WindowLayoutComponent windowLayoutComponent = this.a;
                int i = ukb.a;
                Object objNewProxyInstance = Proxy.newProxyInstance(dufVar.a, new Class[]{dufVar.a()}, new dud(new uji(WindowLayoutInfo.class), new nrr(multicastConsumer2, 1, (byte[]) null)));
                objNewProxyInstance.getClass();
                windowLayoutComponent.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, dufVar.a()).invoke(windowLayoutComponent, context, objNewProxyInstance);
                this.f.put(multicastConsumer2, new due(windowLayoutComponent.getClass().getMethod("removeWindowLayoutInfoListener", dufVar.a()), windowLayoutComponent, objNewProxyInstance));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.dve, defpackage.dvd
    public void b(cnh cnhVar) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            Context context = (Context) this.e.get(cnhVar);
            if (context == null) {
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) this.d.get(context);
            if (multicastConsumer != null) {
                ReentrantLock reentrantLock2 = multicastConsumer.a;
                reentrantLock2.lock();
                try {
                    multicastConsumer.b.remove(cnhVar);
                    reentrantLock2.unlock();
                    this.e.remove(cnhVar);
                    if (multicastConsumer.b.isEmpty()) {
                        this.d.remove(context);
                        due dueVar = (due) this.f.remove(multicastConsumer);
                        if (dueVar != null) {
                            Object[] objArr = {dueVar.b};
                            ((Method) dueVar.c).invoke(dueVar.a, objArr);
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
