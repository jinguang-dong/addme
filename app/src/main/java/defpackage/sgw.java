package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sgw extends shl {
    public sgw(Class cls) {
        super("group_by", cls, true);
    }

    @Override // defpackage.shl
    public final void a(Iterator it, shk shkVar) {
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                shkVar.a(this.a, next);
                return;
            }
            StringBuilder sb = new StringBuilder("[");
            sb.append(next);
            do {
                sb.append(',');
                sb.append(it.next());
            } while (it.hasNext());
            String str = this.a;
            sb.append(']');
            shkVar.a(str, sb.toString());
        }
    }
}
