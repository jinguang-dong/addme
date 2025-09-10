package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ezc implements eyq {
    final /* synthetic */ eze a;

    public ezc(eze ezeVar) {
        this.a = ezeVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.eyq
    public final void a(boolean z) {
        ArrayList arrayList;
        fax.g();
        eze ezeVar = this.a;
        synchronized (ezeVar) {
            arrayList = new ArrayList((Collection) ezeVar.a);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((eyq) arrayList.get(i)).a(z);
        }
    }
}
