package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evt implements evg {
    private static final Set a = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    private final evg b;

    public evt(evg evgVar) {
        this.b = evgVar;
    }

    @Override // defpackage.evg
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return a.contains(((Uri) obj).getScheme());
    }

    @Override // defpackage.evg
    public final /* bridge */ /* synthetic */ tdy b(Object obj, int i, int i2, eqm eqmVar) {
        return this.b.b(new eux(((Uri) obj).toString()), i, i2, eqmVar);
    }
}
