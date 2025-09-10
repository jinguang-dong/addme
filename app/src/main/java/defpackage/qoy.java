package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qoy extends qot {
    public final List b = new CopyOnWriteArrayList();

    @Override // defpackage.qot
    public final void i(qna qnaVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((qov) it.next()).i(qnaVar);
        }
    }

    @Override // defpackage.qot
    public final void j(qna qnaVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((qov) it.next()).j(qnaVar);
        }
    }
}
