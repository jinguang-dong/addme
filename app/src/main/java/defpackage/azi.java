package defpackage;

import android.hardware.camera2.CameraManager;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azi implements uiq {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public azi(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, uiq] */
    @Override // defpackage.uiq
    public final /* synthetic */ Object a(Object obj) {
        int i = this.c;
        if (i == 0) {
            Object obj2 = this.b;
            Object obj3 = this.a;
            synchronized (((azj) obj3).a) {
                ((azj) obj3).b.remove(obj2);
            }
            return ufg.a;
        }
        if (i == 1) {
            ((CameraManager) this.a).unregisterAvailabilityCallback((CameraManager.AvailabilityCallback) this.b);
            return ufg.a;
        }
        if (i != 2) {
            return this.b.a(this.a.get(((Number) obj).intValue()));
        }
        return this.b.a(this.a.get(((Number) obj).intValue()));
    }

    public azi(uiq uiqVar, List list, int i) {
        this.c = i;
        this.b = uiqVar;
        this.a = list;
    }
}
