package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eza {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public final Set b = new HashSet();
    public boolean c;

    public final boolean a(ezn eznVar) {
        boolean z = true;
        if (eznVar == null) {
            return true;
        }
        Set set = this.a;
        Set set2 = this.b;
        boolean zRemove = set.remove(eznVar);
        if (!set2.remove(eznVar) && !zRemove) {
            z = false;
        }
        if (z) {
            eznVar.c();
        }
        return z;
    }

    public final String toString() {
        Set set = this.a;
        return super.toString() + "{numRequests=" + set.size() + ", isPaused=" + this.c + "}";
    }
}
