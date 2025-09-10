package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sis implements sio {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sio
    public final /* synthetic */ void a(shl shlVar, Iterator it, Object obj) {
        ske.g(shlVar.b, "non repeating key");
        if (!shlVar.c || sjd.a() <= 20) {
            shlVar.a(it, obj);
        } else {
            while (it.hasNext()) {
                obj.a(shlVar.a, it.next());
            }
        }
    }
}
