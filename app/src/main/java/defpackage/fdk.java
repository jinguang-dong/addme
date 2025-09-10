package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdk implements fdj {
    private final Set a;

    public fdk(Set set) {
        this.a = set;
    }

    @Override // defpackage.fdj
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((fdj) it.next()).a();
        }
    }
}
