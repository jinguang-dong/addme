package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cui {
    public static final /* synthetic */ int a = 0;
    private static final cuh b = cuh.a;

    public static final void a(bm bmVar, String str) {
        bmVar.getClass();
        cuf cufVar = new cuf(bmVar, str);
        d(cufVar);
        cuh cuhVarB = b(bmVar);
        if (cuhVarB.b.contains(cug.c) && e(cuhVarB, bmVar.getClass(), cufVar.getClass())) {
            c(cuhVarB, cufVar);
        }
    }

    public static final cuh b(bm bmVar) {
        while (bmVar != null) {
            if (bmVar.isAdded()) {
                bmVar.getParentFragmentManager();
            }
            bmVar = bmVar.D;
        }
        return b;
    }

    public static final void c(cuh cuhVar, cus cusVar) {
        bm bmVar = cusVar.a;
        String name = bmVar.getClass().getName();
        cug cugVar = cug.a;
        Set set = cuhVar.b;
        set.contains(cugVar);
        if (set.contains(cug.b)) {
            at atVar = new at(name, cusVar, 14);
            if (!bmVar.isAdded()) {
                atVar.run();
                return;
            }
            Handler handler = bmVar.getParentFragmentManager().m.d;
            if (a.ao(handler.getLooper(), Looper.myLooper())) {
                atVar.run();
            } else {
                handler.post(atVar);
            }
        }
    }

    public static final void d(cus cusVar) {
        if (ch.X(3)) {
            cusVar.a.getClass().getName();
        }
    }

    public static final boolean e(cuh cuhVar, Class cls, Class cls2) {
        Set set = (Set) cuhVar.c.get(cls.getName());
        if (set == null) {
            return true;
        }
        return (a.ao(cls2.getSuperclass(), cus.class) || !ske.bR(set, cls2.getSuperclass())) && !set.contains(cls2);
    }
}
