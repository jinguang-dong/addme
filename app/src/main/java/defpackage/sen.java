package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sen extends sem implements Serializable {
    public static final sem a = new sen();
    private static final long serialVersionUID = 0;

    private sen() {
    }

    @Override // defpackage.sem, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        seo seoVar = (seo) obj;
        seo seoVar2 = (seo) obj2;
        return rzl.b.b(seoVar.b, seoVar2.b).b(seoVar.c, seoVar2.c).a();
    }
}
