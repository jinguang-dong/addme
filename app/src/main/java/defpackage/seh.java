package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class seh extends sfj {
    public abstract sed a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        a().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof sec) {
            sec secVar = (sec) obj;
            if (secVar.a() > 0 && a().fw(secVar.b()) == secVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof sec)) {
            return false;
        }
        sec secVar = (sec) obj;
        Object objB = secVar.b();
        int iA = secVar.a();
        if (iA != 0) {
            return a().i(objB, iA);
        }
        return false;
    }
}
