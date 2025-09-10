package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rxf extends sag {
    final /* synthetic */ rxk a;
    private final Map.Entry b;

    public rxf(rxk rxkVar, Map.Entry entry) {
        this.a = rxkVar;
        this.b = entry;
    }

    @Override // defpackage.sag, defpackage.sai
    /* renamed from: a */
    protected final /* synthetic */ Object b() {
        return this.b;
    }

    @Override // defpackage.sag
    protected final Map.Entry b() {
        return this.b;
    }

    @Override // defpackage.sag, java.util.Map.Entry
    public final Object setValue(Object obj) {
        rxk rxkVar = this.a;
        rxkVar.c(obj);
        rnt.M(rxkVar.entrySet().contains(this), "entry no longer in map");
        if (a.K(obj, getValue())) {
            return obj;
        }
        rnt.F(!rxkVar.containsValue(obj), "value already present: %s", obj);
        Object value = this.b.setValue(obj);
        rnt.M(a.K(obj, rxkVar.get(getKey())), "entry no longer in map");
        rxkVar.j(getKey(), true, value, obj);
        return value;
    }
}
