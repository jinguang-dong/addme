package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fal extends yd {
    private int e;

    @Override // defpackage.aaa, java.util.Map
    public final void clear() {
        this.e = 0;
        super.clear();
    }

    @Override // defpackage.aaa
    public final Object e(int i) {
        this.e = 0;
        return super.e(i);
    }

    @Override // defpackage.aaa
    public final Object f(int i, Object obj) {
        this.e = 0;
        return super.f(i, obj);
    }

    @Override // defpackage.aaa, java.util.Map
    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode();
        this.e = iHashCode;
        return iHashCode;
    }

    @Override // defpackage.aaa
    public final void i(aaa aaaVar) {
        this.e = 0;
        super.i(aaaVar);
    }

    @Override // defpackage.aaa, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.e = 0;
        return super.put(obj, obj2);
    }
}
