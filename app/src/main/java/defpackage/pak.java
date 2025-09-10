package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pak {
    private final ArrayDeque a = new ArrayDeque();
    private float b = 0.0f;

    public final synchronized void a(paj pajVar) {
        rnt.B(true, "Sample cannot be null");
        this.b += pajVar.b;
        ArrayDeque arrayDeque = this.a;
        arrayDeque.add(pajVar);
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            paj pajVar2 = (paj) it.next();
            if (pajVar2.a + 1000000 >= pajVar.a) {
                break;
            }
            it.remove();
            this.b -= pajVar2.b;
        }
    }
}
