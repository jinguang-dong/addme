package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxo extends cxq {
    public static cxo a;
    public static final cxx b = new cxe();
    private final Application d;

    public cxo(Application application) {
        this.d = application;
    }

    private static final cxm d(Class cls, Application application) {
        if (!cvp.class.isAssignableFrom(cls)) {
            return cpe.e(cls);
        }
        try {
            cxm cxmVar = (cxm) cls.getConstructor(Application.class).newInstance(application);
            cxmVar.getClass();
            return cxmVar;
        } catch (IllegalAccessException e) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e);
        } catch (InstantiationException e2) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e2);
        } catch (NoSuchMethodException e3) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e3);
        } catch (InvocationTargetException e4) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e4);
        }
    }

    @Override // defpackage.cxq, defpackage.cxp
    public final cxm a(Class cls) {
        Application application = this.d;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // defpackage.cxq, defpackage.cxp
    public final cxm b(Class cls, cxy cxyVar) {
        if (this.d != null) {
            return a(cls);
        }
        Application application = (Application) cxyVar.a(b);
        if (application != null) {
            return d(cls, application);
        }
        if (cvp.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return cpe.e(cls);
    }

    public cxo() {
        this(null);
    }
}
