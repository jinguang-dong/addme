package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nki {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public nki(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final void a() {
        zu zuVar = (zu) this.a;
        Object obj = this.b;
        List list = (List) zuVar.g(obj);
        if (list != null) {
            list.remove(this.c);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        zuVar.j(obj, list);
    }
}
