package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sar extends sav {
    public sar(saw sawVar) {
        super(sawVar);
    }

    @Override // defpackage.sav
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new sao(this.b, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            saw sawVar = this.b;
            int iE = sawVar.e(key);
            if (iE != -1 && a.K(sawVar.a[iE], value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int iBb = ujp.bb(key);
        saw sawVar = this.b;
        int iF = sawVar.f(key, iBb);
        if (iF == -1 || !a.K(sawVar.a[iF], value)) {
            return false;
        }
        sawVar.j(iF, iBb);
        return true;
    }
}
