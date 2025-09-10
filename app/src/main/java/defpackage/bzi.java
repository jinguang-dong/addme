package defpackage;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzi {
    public static final /* synthetic */ int a = 0;
    private static final Class[] b = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean a(Object obj) {
        if (obj instanceof bgw) {
            bgw bgwVar = (bgw) obj;
            if (bgwVar.f() != bap.b && bgwVar.f() != bap.c && bgwVar.f() != bap.a) {
                return false;
            }
            Object objA = bgwVar.a();
            if (objA == null) {
                return true;
            }
            return a(objA);
        }
        if ((obj instanceof uep) && (obj instanceof Serializable)) {
            return false;
        }
        Class[] clsArr = b;
        for (int i = 0; i < 7; i++) {
            if (clsArr[i].isInstance(obj)) {
                return true;
            }
        }
        return false;
    }
}
