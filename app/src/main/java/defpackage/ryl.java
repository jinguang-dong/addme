package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ryl extends ryb implements sea {
    private static final long serialVersionUID = 7431625294878419160L;

    protected ryl(Map map) {
        super(map);
    }

    @Override // defpackage.ryb
    public /* bridge */ /* synthetic */ Collection a() {
        throw null;
    }

    @Override // defpackage.ryb
    public final Collection c(Object obj, Collection collection) {
        return new rya(this, obj, (Set) collection);
    }

    @Override // defpackage.ryb, defpackage.sea
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Set b(Object obj) {
        return (Set) super.b(obj);
    }

    @Override // defpackage.ryg, defpackage.sea
    public final /* bridge */ /* synthetic */ Collection p() {
        throw null;
    }
}
