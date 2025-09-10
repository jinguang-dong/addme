package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class tzq implements tzt {
    public final Map a;

    public tzq(Map map) {
        this.a = DesugarCollections.unmodifiableMap(map);
    }
}
