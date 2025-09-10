package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xe {
    public static final uma a = new uma(0, umc.a);
    public final long b;
    public final xa c;
    public final List d;
    public final umb e;
    public final ulz f;
    public final CopyOnWriteArrayList g;
    private final long h;
    private final long i;
    private final sy j;

    public xe(sy syVar, long j, long j2, Set set) {
        set.getClass();
        this.j = syVar;
        this.b = j;
        this.h = j2;
        this.i = a.c();
        this.c = new xa(this);
        ugl uglVar = new ugl((byte[]) null);
        Iterator it = syVar.b().keySet().iterator();
        while (it.hasNext()) {
            int i = ((rh) it.next()).a;
            if (set.contains(new rh(i))) {
                uglVar.add(new xc(this, i));
            }
        }
        this.d = ske.bi(uglVar);
        xd xdVar = xd.a;
        umc umcVar = umc.a;
        this.e = new umb(xdVar, umcVar);
        this.f = new ulz(0, umcVar);
        this.g = new CopyOnWriteArrayList();
    }

    public final void a() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.g;
        int size = copyOnWriteArrayList.size();
        for (int i = 0; i < size; i++) {
            ((qa) copyOnWriteArrayList.get(i)).a();
        }
    }

    public final String toString() {
        return "Frame-" + ((Object) ("FrameId(value=" + this.i + ')')) + '(' + this.b + '@' + this.h + ')';
    }
}
