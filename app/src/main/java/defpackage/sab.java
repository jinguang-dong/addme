package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sab extends saj implements Serializable {
    private static final long serialVersionUID = 0;
    final int a;
    private final Queue b;

    public sab(int i) {
        rnt.D(i >= 0, "maxSize (%s) must >= 0", i);
        this.b = new ArrayDeque(i);
        this.a = i;
    }

    @Override // defpackage.sad, defpackage.sai
    protected final /* synthetic */ Object a() {
        return this.b;
    }

    @Override // defpackage.sad, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        int i = this.a;
        if (i == 0) {
            return true;
        }
        if (size() == i) {
            this.b.remove();
        }
        this.b.add(obj);
        return true;
    }

    @Override // defpackage.sad, java.util.Collection
    public final boolean addAll(Collection collection) {
        int size = collection.size();
        int i = this.a;
        if (size < i) {
            return ujp.aM(this, collection.iterator());
        }
        clear();
        collection.getClass();
        int i2 = size - i;
        rnt.B(i2 >= 0, "number to skip cannot be negative");
        return ujp.aT(this, new sdb(collection, i2));
    }

    @Override // defpackage.saj, defpackage.sad
    protected final /* synthetic */ Collection b() {
        return this.b;
    }

    @Override // defpackage.saj
    protected final Queue c() {
        return this.b;
    }

    @Override // defpackage.saj, java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }
}
