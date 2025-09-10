package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rzd extends ryd {
    final /* synthetic */ rzf a;
    private final Object b;
    private int c;

    public rzd(rzf rzfVar, int i) {
        this.a = rzfVar;
        this.b = rzfVar.e(i);
        this.c = i;
    }

    private final void a() {
        int i = this.c;
        if (i != -1) {
            rzf rzfVar = this.a;
            if (i < rzfVar.size() && a.K(this.b, rzfVar.e(this.c))) {
                return;
            }
        }
        this.c = this.a.d(this.b);
    }

    @Override // defpackage.ryd, java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.ryd, java.util.Map.Entry
    public final Object getValue() {
        rzf rzfVar = this.a;
        Map mapJ = rzfVar.j();
        if (mapJ != null) {
            return mapJ.get(this.b);
        }
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return rzfVar.h(i);
    }

    @Override // defpackage.ryd, java.util.Map.Entry
    public final Object setValue(Object obj) {
        rzf rzfVar = this.a;
        Map mapJ = rzfVar.j();
        if (mapJ != null) {
            return mapJ.put(this.b, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            rzfVar.put(this.b, obj);
            return null;
        }
        Object objH = rzfVar.h(i);
        rzfVar.n(this.c, obj);
        return objH;
    }
}
