package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sap extends sav {
    final /* synthetic */ saw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sap(saw sawVar) {
        super(sawVar);
        this.a = sawVar;
    }

    @Override // defpackage.sav
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new san(this.a, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            saw sawVar = this.a;
            int iB = sawVar.b(key);
            if (iB != -1 && a.K(value, sawVar.b[iB])) {
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
        saw sawVar = this.a;
        int iC = sawVar.c(key, iBb);
        if (iC == -1 || !a.K(value, sawVar.b[iC])) {
            return false;
        }
        sawVar.i(iC, iBb);
        return true;
    }
}
