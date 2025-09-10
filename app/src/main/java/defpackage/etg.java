package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class etg {
    final Object a;
    public List b;
    etg c;
    etg d;

    public etg(Object obj) {
        this.d = this;
        this.c = this;
        this.a = obj;
    }

    public final int a() {
        List list = this.b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final Object b() {
        int iA = a();
        if (iA > 0) {
            return this.b.remove(iA - 1);
        }
        return null;
    }

    etg() {
        this(null);
    }
}
