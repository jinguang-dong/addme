package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fql implements Iterable {
    public final List a = new ArrayList();

    public final synchronized paq a(fqk fqkVar) {
        this.a.add(fqkVar);
        return new ffx(this, fqkVar, 2, null);
    }

    @Override // java.lang.Iterable
    public final synchronized Iterator iterator() {
        return new ArrayList(this.a).iterator();
    }
}
