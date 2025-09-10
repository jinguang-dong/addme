package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ufq extends AbstractMap implements Map, ukg {
    protected ufq() {
    }

    public /* bridge */ int b() {
        throw null;
    }

    public /* bridge */ Collection d() {
        throw null;
    }

    public abstract Set e();

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set entrySet() {
        return e();
    }

    public /* bridge */ Set f() {
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set keySet() {
        return f();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return b();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection values() {
        return d();
    }
}
