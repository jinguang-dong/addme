package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class co {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public ck d;

    final Bundle a(String str, Bundle bundle) {
        HashMap map = this.c;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    final bm b(String str) {
        cn cnVar = (cn) this.b.get(str);
        if (cnVar != null) {
            return cnVar.a;
        }
        return null;
    }

    final bm c(String str) {
        for (cn cnVar : this.b.values()) {
            if (cnVar != null) {
                bm bmVarC = cnVar.a;
                if (!str.equals(bmVarC.k)) {
                    bmVarC = bmVarC.C.b.c(str);
                }
                if (bmVarC != null) {
                    return bmVarC;
                }
            }
        }
        return null;
    }

    final cn d(String str) {
        return (cn) this.b.get(str);
    }

    final List e() {
        ArrayList arrayList = new ArrayList();
        for (cn cnVar : this.b.values()) {
            if (cnVar != null) {
                arrayList.add(cnVar);
            }
        }
        return arrayList;
    }

    final List f() {
        ArrayList arrayList = new ArrayList();
        for (cn cnVar : this.b.values()) {
            if (cnVar != null) {
                arrayList.add(cnVar.a);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    final List g() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.a;
        if (arrayList2.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (arrayList2) {
            arrayList = new ArrayList(arrayList2);
        }
        return arrayList;
    }

    final void h(bm bmVar) {
        ArrayList arrayList = this.a;
        if (arrayList.contains(bmVar)) {
            Objects.toString(bmVar);
            throw new IllegalStateException("Fragment already added: ".concat(String.valueOf(bmVar)));
        }
        synchronized (arrayList) {
            arrayList.add(bmVar);
        }
        bmVar.q = true;
    }

    final void i() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    final void j(cn cnVar) {
        bm bmVar = cnVar.a;
        if (m(bmVar.k)) {
            return;
        }
        this.b.put(bmVar.k, cnVar);
        if (bmVar.K) {
            if (bmVar.J) {
                this.d.a(bmVar);
            } else {
                this.d.e(bmVar);
            }
            bmVar.K = false;
        }
        if (ch.X(2)) {
            Objects.toString(bmVar);
        }
    }

    final void k(cn cnVar) {
        bm bmVar = cnVar.a;
        if (bmVar.J) {
            this.d.e(bmVar);
        }
        HashMap map = this.b;
        if (map.get(bmVar.k) == cnVar && ((cn) map.put(bmVar.k, null)) != null && ch.X(2)) {
            Objects.toString(bmVar);
        }
    }

    final void l(bm bmVar) {
        ArrayList arrayList = this.a;
        synchronized (arrayList) {
            arrayList.remove(bmVar);
        }
        bmVar.q = false;
    }

    final boolean m(String str) {
        return this.b.get(str) != null;
    }
}
