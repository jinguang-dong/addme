package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class apj {
    public final List a;
    public final List[] b;
    public int c;
    public int d;
    public boolean e;
    final /* synthetic */ apk f;

    public apj(apk apkVar, List list) {
        this.f = apkVar;
        this.a = list;
        this.b = new List[list.size()];
        if (list.isEmpty()) {
            akg.b("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
