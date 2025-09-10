package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frk extends sae implements List, paq {
    private final ArrayList a = new ArrayList();
    private boolean b;

    @Override // defpackage.sad, defpackage.sai
    /* renamed from: a */
    protected final /* synthetic */ Object b() {
        return this.a;
    }

    @Override // defpackage.sae, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        rnt.L(!this.b);
        this.a.add(i, (paq) obj);
    }

    @Override // defpackage.sae, java.util.List
    public final boolean addAll(int i, Collection collection) {
        rnt.L(!this.b);
        return this.a.addAll(i, collection);
    }

    @Override // defpackage.sae, defpackage.sad
    protected final /* synthetic */ Collection b() {
        return this.a;
    }

    @Override // defpackage.sae
    protected final List c() {
        return this.a;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((paq) arrayList.get(i)).close();
        }
        arrayList.clear();
    }

    @Override // defpackage.sae, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        rnt.L(!this.b);
        return (paq) this.a.get(i);
    }

    @Override // defpackage.sae, java.util.List
    public final int indexOf(Object obj) {
        rnt.L(!this.b);
        return this.a.indexOf(obj);
    }

    @Override // defpackage.sae, java.util.List
    public final int lastIndexOf(Object obj) {
        rnt.L(!this.b);
        return this.a.lastIndexOf(obj);
    }

    @Override // defpackage.sae, java.util.List
    public final ListIterator listIterator() {
        rnt.L(!this.b);
        return this.a.listIterator();
    }

    @Override // defpackage.sae, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        rnt.L(!this.b);
        return (paq) this.a.remove(i);
    }

    @Override // defpackage.sae, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        rnt.L(!this.b);
        return (paq) this.a.set(i, (paq) obj);
    }

    @Override // defpackage.sae, java.util.List
    public final List subList(int i, int i2) {
        rnt.L(!this.b);
        return this.a.subList(i, i2);
    }

    @Override // defpackage.sae, java.util.List
    public final ListIterator listIterator(int i) {
        rnt.L(!this.b);
        return this.a.listIterator(i);
    }
}
