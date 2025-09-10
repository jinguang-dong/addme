package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evr implements evg {
    private static final Set a = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));
    private final evq b;

    public evr(evq evqVar) {
        this.b = evqVar;
    }

    @Override // defpackage.evg
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return a.contains(((Uri) obj).getScheme());
    }

    @Override // defpackage.evg
    public final /* bridge */ /* synthetic */ tdy b(Object obj, int i, int i2, eqm eqmVar) {
        Uri uri = (Uri) obj;
        return new tdy(new fai(uri), this.b.a(uri));
    }
}
