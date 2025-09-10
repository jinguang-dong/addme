package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
class sfy extends sfr implements Set {
    private static final long serialVersionUID = 0;

    public sfy(Set set, Object obj) {
        super(set, obj);
    }

    @Override // defpackage.sfr
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set a() {
        return (Set) super.a();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.h) {
            zEquals = a().equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int iHashCode;
        synchronized (this.h) {
            iHashCode = a().hashCode();
        }
        return iHashCode;
    }
}
