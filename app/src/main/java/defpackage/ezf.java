package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ezf implements eyu {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.eyu
    public final void f() {
        Iterator it = fax.f(this.a).iterator();
        while (it.hasNext()) {
            ((faa) it.next()).f();
        }
    }

    @Override // defpackage.eyu
    public final void g() {
        Iterator it = fax.f(this.a).iterator();
        while (it.hasNext()) {
            ((faa) it.next()).g();
        }
    }

    @Override // defpackage.eyu
    public final void h() {
        Iterator it = fax.f(this.a).iterator();
        while (it.hasNext()) {
            ((faa) it.next()).h();
        }
    }
}
