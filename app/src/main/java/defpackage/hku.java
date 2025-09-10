package defpackage;

import android.view.accessibility.AccessibilityManager;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hku implements paq {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ hku(hkv hkvVar, Executor executor, pbn pbnVar, int i) {
        this.d = i;
        this.a = hkvVar;
        this.b = executor;
        this.c = pbnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, paq] */
    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        int i = this.d;
        if (i == 0) {
            this.b.execute(this.c.c("FaceMetadataExtractor.close", new hbv(this.a, 11)));
            return;
        }
        if (i == 1) {
            AccessibilityManager.AccessibilityServicesStateChangeListener accessibilityServicesStateChangeListener = (AccessibilityManager.AccessibilityServicesStateChangeListener) ((uka) this.b).a;
            Object obj = this.c;
            if (accessibilityServicesStateChangeListener != null) {
                ((AccessibilityManager) ((gwv) obj).W.a).removeAccessibilityServicesStateChangeListener(accessibilityServicesStateChangeListener);
            }
            ((gwv) obj).W.X(this.a);
            return;
        }
        if (i == 2) {
            ipv ipvVar = (ipv) this.a;
            if (((Boolean) ipvVar.c.dL()).booleanValue() && ipvVar.d.dL() == iqh.URANUS) {
                if (((AtomicBoolean) this.c).get() || ((AtomicBoolean) this.b).get()) {
                    ipvVar.a.f(pka.BACK);
                    return;
                }
                return;
            }
            return;
        }
        if (i != 3) {
            ((pci) this.c).b.b("Closed by ".concat((String) this.b));
            this.a.close();
            return;
        }
        boolean zCompareAndSet = ((AtomicBoolean) this.b).compareAndSet(false, true);
        Object obj2 = this.a;
        Object obj3 = this.c;
        if (zCompareAndSet) {
            synchronized (obj3) {
                if (((nph) obj3).h.remove(obj2)) {
                    ((ngn) obj2).close();
                } else {
                    ((sgt) nph.a.c().M(5478)).E("[%s] removeOutputSurface(%s) -  Not removing.", ((nph) obj3).c, obj2);
                }
            }
        }
    }

    public /* synthetic */ hku(ipv ipvVar, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, int i) {
        this.d = i;
        this.a = ipvVar;
        this.c = atomicBoolean;
        this.b = atomicBoolean2;
    }

    public /* synthetic */ hku(Object obj, Object obj2, paq paqVar, int i) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = paqVar;
    }

    public /* synthetic */ hku(uka ukaVar, gwv gwvVar, AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener, int i) {
        this.d = i;
        this.b = ukaVar;
        this.c = gwvVar;
        this.a = touchExplorationStateChangeListener;
    }
}
