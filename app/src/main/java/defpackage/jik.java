package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jik implements jiw {
    private final List a;

    public jik(List list) {
        this.a = list;
    }

    @Override // defpackage.jiw
    public final void a(sod sodVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((jiw) it.next()).a(sodVar);
        }
    }
}
