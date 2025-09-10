package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class uvj implements uiq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ uvj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.uiq
    public final Object a(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        int i = this.b;
        if (i == 0) {
            int i2 = uvl.a;
            Object objNewInstance = ((Constructor) this.a).newInstance(null);
            objNewInstance.getClass();
            Throwable th = (Throwable) objNewInstance;
            th.initCause((Throwable) obj);
            return th;
        }
        if (i != 1) {
            ((uxa) this.a).d();
            return ufg.a;
        }
        int i3 = uvl.a;
        Object objNewInstance2 = ((Constructor) this.a).newInstance((Throwable) obj);
        objNewInstance2.getClass();
        return (Throwable) objNewInstance2;
    }
}
