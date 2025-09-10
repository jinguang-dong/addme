package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
class rxm extends ryb implements sea {
    private static final long serialVersionUID = 6588350623831699109L;

    protected rxm(Map map) {
        super(map);
    }

    @Override // defpackage.ryb
    public /* bridge */ /* synthetic */ Collection a() {
        throw null;
    }

    @Override // defpackage.ryb
    public final Collection c(Object obj, Collection collection) {
        return i(obj, (List) collection, null);
    }

    @Override // defpackage.ryb, defpackage.sea
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final List b(Object obj) {
        return (List) super.b(obj);
    }
}
