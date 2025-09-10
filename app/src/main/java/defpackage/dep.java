package defpackage;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dep implements cwf {
    private final /* synthetic */ int a;
    private final Object b;

    public dep(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [deu, java.lang.Object] */
    @Override // defpackage.cwf
    public final void a(cwh cwhVar, cwa cwaVar) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.a != 0) {
            if (cwaVar != cwa.ON_CREATE) {
                Objects.toString(cwaVar);
                throw new IllegalStateException("Next event must be ON_CREATE, it was ".concat(cwaVar.toString()));
            }
            cwhVar.getLifecycle().c(this);
            ((cxg) this.b).b();
            return;
        }
        if (cwaVar != cwa.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        cwhVar.getLifecycle().c(this);
        ?? r4 = this.b;
        Bundle bundleA = r4.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (bundleA == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, dep.class.getClassLoader()).asSubclass(der.class);
                clsAsSubclass.getClass();
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        objNewInstance.getClass();
                        ((der) objNewInstance).a(r4);
                    } catch (Exception e) {
                        throw new RuntimeException("Failed to instantiate ".concat(String.valueOf(str)), e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(a.bw(str, "Class ", " wasn't found"), e3);
            }
        }
    }
}
