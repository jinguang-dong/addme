package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class baw implements Iterable, bht, ukd {
    public int b;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public HashMap i;
    public yq j;
    public int[] a = new int[0];
    public Object[] c = new Object[0];
    public ArrayList h = new ArrayList();

    public final int a(axq axqVar) {
        if (this.f) {
            ayi.i("Use active SlotWriter to determine anchor location instead");
        }
        if (!axqVar.a()) {
            bad.a("Anchor refers to a group that was removed");
        }
        return axqVar.a;
    }

    public final bav b() {
        if (this.f) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.e++;
        return new bav(this);
    }

    public final baz c() {
        if (this.f) {
            ayi.i("Cannot start a writer when another writer is pending");
        }
        if (this.e > 0) {
            ayi.i("Cannot start a writer when a reader is pending");
        }
        this.f = true;
        this.g++;
        return new baz(this);
    }

    public final void d() {
        this.j = new yq((byte[]) null);
    }

    public final void e() {
        this.i = new HashMap();
    }

    public final boolean f(axq axqVar) {
        int iD;
        return axqVar.a() && (iD = bay.d(this.h, axqVar.a, this.b)) >= 0 && a.ao(this.h.get(iD), axqVar);
    }

    public final void g(int[] iArr, int i, Object[] objArr, int i2, ArrayList arrayList, HashMap map, yq yqVar) {
        this.a = iArr;
        this.b = i;
        this.c = objArr;
        this.d = i2;
        this.h = arrayList;
        this.i = map;
        this.j = yqVar;
    }

    public final bay h(int i) {
        int i2;
        HashMap map = this.i;
        if (map != null) {
            if (this.f) {
                ayi.i("use active SlotWriter to crate an anchor for location instead");
            }
            axq axqVarF = (i < 0 || i >= (i2 = this.b)) ? null : bay.f(this.h, i, i2);
            if (axqVarF != null) {
                return (bay) map.get(axqVarF);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new aze(this, 0, this.b);
    }
}
